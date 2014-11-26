package com.eshimoniak.coinflip.choose;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ChooseCoinActivity extends PreferenceActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getFragmentManager().beginTransaction()
			.replace(android.R.id.content, new ChooseCoinFragment())
			.commit();
	}
}