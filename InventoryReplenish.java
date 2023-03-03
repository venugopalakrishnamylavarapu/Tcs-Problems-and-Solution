package com.TcsProbs;

public class InventoryReplenish {
	String inventoryId;
	int maximumQuality;
	int currentQuantity;
	int threshold;
	InventoryReplenish(String iId,int maxQ,int currentQ,int tHold)
	{
		this.inventoryId=iId;
		this.maximumQuality=maxQ;
		this.currentQuantity=currentQ;
		this.threshold=tHold;
	}
	public String getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
	public int getMaximumQuality() {
		return maximumQuality;
	}
	public void setMaximumQuality(int maximumQuality) {
		this.maximumQuality = maximumQuality;
	}
	public int getCurrentQuantity() {
		return currentQuantity;
	}
	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
}
