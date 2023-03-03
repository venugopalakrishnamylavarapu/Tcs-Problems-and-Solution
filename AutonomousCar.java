package com.TcsProbs;

public class AutonomousCar {
	private int carId;
	private String brand;
	private int noOfTestsConducted;
	private int noOfTestsPassed;
	private String environment;
	private String grade;
	AutonomousCar(int carId,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment)
	{
		this.carId=carId;
		this.brand=brand;
		this.noOfTestsConducted=noOfTestsConducted;
		this.noOfTestsPassed=noOfTestsPassed;
		this.environment=environment;
	}
	public int getCarId() {
		return carId;
	}
	public String getBrand() {
		return brand;
	}
	public int getNoOfTestsConducted() {
		return noOfTestsConducted;
	}
	public int getNoOfTestsPassed() {
		return noOfTestsPassed;
	}
	public String getEnvironment() {
		return environment;
	}
	public String getGrade() {
		return grade;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setNoOfTestsConducted(int noOfTestsConducted) {
		this.noOfTestsConducted = noOfTestsConducted;
	}
	public void setNoOfTestsPassed(int noOfTestsPassed) {
		this.noOfTestsPassed = noOfTestsPassed;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
