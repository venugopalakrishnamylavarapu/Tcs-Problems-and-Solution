package com.TcsProbs;

public class SimMNS {
	int id;
	String company;
	int balance;
	double ratePerSecond;
	String circle;
	SimMNS(int id,String com,int bal,double rps,String cir)
	{
		this.id=id;
		this.company=com;
		this.balance=bal;
		this.ratePerSecond=rps;
		this.circle=cir;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getRatePerSecond() {
		return ratePerSecond;
	}
	public void setRatePerSecond(double ratePerSecond) {
		this.ratePerSecond = ratePerSecond;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	

}
