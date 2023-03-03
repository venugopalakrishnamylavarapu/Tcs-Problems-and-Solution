package com.TcsProbs;

public class MedicineGPD {
	 String MedicineName;
	 String batch;
	 String disease;
	 int price;
	 MedicineGPD(String MN,String b,String d,int p)
	 {
		 this.MedicineName=MN;
		 this.batch=b;
		 this.disease=d;
		 this.price=p;
	 }
	 public void setMedicineName(String MN)
	 {
		 this.MedicineName=MN;
	 }
	 public String getMedicineName()
	 {
		 return this.MedicineName;
	 }
	 public void setBatch(String b)
	 {
		 this.batch=b;
	 }
	 public String getBatch() {
		 return this.batch;
	 }
	 public void setDisease(String d)
	 {
		 this.disease=d;
	 }
	 public String getDisease() {
		 return this.disease;
	 }
	 public void setPrice(int p)
	 {
		 this.price=p;
	 }
	 public int getPrice() {
		 return this.price;
	 }
}
