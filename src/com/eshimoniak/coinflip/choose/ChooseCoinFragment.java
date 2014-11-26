package com.eshimoniak.coinflip.choose;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import android.widget.Toast;

import com.eshimoniak.coinflip.MainActivity;
import com.eshimoniak.coinflip.R;
import com.eshimoniak.coinflip.coins.Coins;

public class ChooseCoinFragment extends PreferenceFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		addPreferencesFromResource(R.xml.choose_coin);

		
		Preference us_penny = (Preference) findPreference("choose_us_penny");
		Preference us_nickel = (Preference) findPreference("choose_us_nickel");
		Preference us_dime = (Preference) findPreference("choose_us_dime");
		Preference us_quarter = (Preference) findPreference("choose_us_quarter");
		final Context context = getActivity().getApplicationContext();
		final CharSequence coinMessage = "Coin set to ";
		
		us_penny.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick(Preference preference) {
				MainActivity.setCoin(Coins.US_PENNY);
				
				Toast toast = Toast.makeText(
					context,
					coinMessage + "\"US Penny\"",
					Toast.LENGTH_SHORT
				);
				toast.show();
				
				
				return true;
			}
		});
		us_nickel.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick(Preference preference) {
				MainActivity.setCoin(Coins.US_NICKEL);
				
				Toast toast = Toast.makeText(
					context,
					coinMessage + "\"US Nickel\"",
					Toast.LENGTH_SHORT
				);
				toast.show();
				
				
				return true;
			}
		});
		us_dime.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick(Preference preference) {
				MainActivity.setCoin(Coins.US_DIME);
				
				Toast toast = Toast.makeText(
					context,
					coinMessage + "\"US Dime\"",
					Toast.LENGTH_SHORT
				);
				toast.show();
				
				
				return true;
			}
		});
		us_quarter.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick(Preference preference) {
				MainActivity.setCoin(Coins.US_QUARTER);
				
				Toast toast = Toast.makeText(
					context,
					coinMessage + "\"US Quarter\"",
					Toast.LENGTH_SHORT
				);
				toast.show();
				
				
				return true;
			}
		});
	}
}