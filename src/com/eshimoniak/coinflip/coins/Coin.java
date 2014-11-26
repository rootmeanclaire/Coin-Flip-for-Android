package com.eshimoniak.coinflip.coins;

public class Coin {
	String name;
	int headID;
	int tailID;
	float diameter;
	String country;
	boolean circulating;

	public Coin(int headImgRes, int tailImgRes) {
		headID = headImgRes;
		tailID = tailImgRes;
	}
	public Coin(int headImgRes, int tailImgRes, float diameter) {
		headID = headImgRes;
		tailID = tailImgRes;
		this.diameter = diameter;
	}
	public Coin(String name, int headImgRes, int tailImgRes) {
		this.name = name;
		headID = headImgRes;
		tailID = tailImgRes;
	}
	public Coin(String name, int headImgRes, int tailImgRes, float diameter) {
		this.name = name;
		headID = headImgRes;
		tailID = tailImgRes;
		this.diameter = diameter;
	}
	public Coin(String name, int headImgRes, int tailImgRes, float diameter, String country, boolean inCirculation) {
		headID = headImgRes;
		tailID = tailImgRes;
		this.diameter = diameter;
		this.country = country;
		circulating = inCirculation;
	}
	
	public int getHeadImgID() {
		return headID;
	}
	public int getTailImgID() {
		return tailID;
	}
}