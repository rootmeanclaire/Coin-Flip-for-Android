package com.eshimoniak.coinflip.coins;

import com.eshimoniak.coinflip.R;

public class Coins {
	public static final Coin US_NICKEL = new Coin(
		"nickel",
		R.drawable.us_nickel_head,
		R.drawable.us_nickel_tail,
		21.21f,
		"United States",
		true
	);
	public static final Coin US_PENNY = new Coin(
		"penny",
		R.drawable.us_penny_head,
		R.drawable.us_penny_tail,
		19.05f,
		"United States",
		true
	);
	public static final Coin US_DIME = new Coin(
		"dime",
		R.drawable.us_dime_head,
		R.drawable.us_dime_tail,
		17.91f,
		"United States",
		true
	);
	public static final Coin US_QUARTER = new Coin(
		"quarter",
		R.drawable.us_quarter_head,
		R.drawable.us_quarter_tail,
		24.26f,
		"United States",
		true
);
}