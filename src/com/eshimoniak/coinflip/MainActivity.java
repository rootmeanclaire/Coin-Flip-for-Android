package com.eshimoniak.coinflip;

import java.util.Random;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.eshimoniak.coinflip.choose.ChooseCoinActivity;
import com.eshimoniak.coinflip.coins.Coin;
import com.eshimoniak.coinflip.coins.Coins;

public class MainActivity extends ActionBarActivity {
	static ImageButton button;
	static TextView resultLabel;
	static Coin coin;
	static MediaPlayer mp;
	static boolean heads;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (ImageButton)findViewById(R.id.coin_button);
		button.setOnClickListener(imgButtonHandler);
		button.setBackgroundColor(Color.TRANSPARENT);
		resultLabel = (TextView) findViewById(R.id.result_label);
		coin = Coins.US_NICKEL;
		
		mp = MediaPlayer.create(getApplicationContext(), R.raw.spinning_coin);
		
		try {
			if (mp.isPlaying()) {
				mp.stop();
				mp.release();
				mp = MediaPlayer.create(getApplicationContext(), R.raw.spinning_coin);
			}
		} catch (Exception e) {
			
		}
		
		flipCoin();
	}
	
	View.OnClickListener imgButtonHandler = new View.OnClickListener() {
		public void onClick(View v) {
			flipCoin();
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
		if (id == R.id.choose_coin) {
			Intent intent = new Intent(this, ChooseCoinActivity.class);
			startActivity(intent);
		}
		
		
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	public static void setCoin(Coin newCoin) {
		if (newCoin != null) {
			coin = newCoin;
		}
		refreshOutcome();
	}
	
	public void flipCoin() {
		Random gen = new Random();
		
		mp.start();
		Vibrator v = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
		v.vibrate(100);
		
		heads = gen.nextBoolean();
		refreshOutcome();
	}
	
	public static void refreshOutcome() {
		if (heads) {
			button.setImageResource(coin.getHeadImgID());
			resultLabel.setText(R.string.heads);
		} else {
			button.setImageResource(coin.getTailImgID());
			resultLabel.setText(R.string.tails);
		}
	}
}