package com.TcsProbs;

public class PhoneDeviceManager {
	private int phoneId;
	private String os;
	private String brand;
	private int price;
	public int getPhoneId() {
		return phoneId;
	}
	public String getOs() {
		return os;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	PhoneDeviceManager(int phoneId,String os,String brand,int price)
	{
		this.phoneId=phoneId;
		this.os=os;
		this.brand=brand;
		this.price=price;
	}
}
