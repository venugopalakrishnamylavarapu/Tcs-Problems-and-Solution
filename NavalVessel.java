package com.TcsProbs;

public class NavalVessel {
	private int vesselId;
	private String vesselName;
	private int noOfVoyagesPlanned;
	private int noOfVoyagesCompleted;
	private String purpose;
	private String classification;
	
	public NavalVessel(int vi,String vn,int novp,int novc,String prp)
	{
		this.vesselId=vi;
		this.vesselName=vn;
		this.noOfVoyagesCompleted=novc;
		this.noOfVoyagesPlanned=novp;
		this.purpose=prp;
	}

	public int getVesselId() {
		return vesselId;
	}

	public void setVesselId(int vesselId) {
		this.vesselId = vesselId;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public int getNoOfVoyagesPlanned() {
		return noOfVoyagesPlanned;
	}

	public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
	}

	public int getNoOfVoyagesCompleted() {
		return noOfVoyagesCompleted;
	}

	public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
		this.noOfVoyagesCompleted = noOfVoyagesCompleted;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}
}