package com.TcsProbs;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Problem Statement

Create class Medicine with below attributes: MedicineName - String batch - String disease - String price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. This method will take array of Medicine objects and a disease String as parameters. And will return another sorted array of Integer objects where the disease String matches with the original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" method and print the result.
Input

dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever

Output

100
200

 */

public class MedicineGPDSol {
	public static int[] getPriceByDisease(MedicineGPD[] mgpd,String disease)
	{
		int[] a=new int[0];
		for(int i=0;i<mgpd.length;i++)
		{
			if(mgpd[i].getDisease().equalsIgnoreCase(disease))	
			{
				a=Arrays.copyOf(a, a.length+1);
				a[a.length-1]=mgpd[i].getPrice();
			}
		}
		Arrays.sort(a);
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MedicineGPD[] mgpdarr=new MedicineGPD[4];
		for(int i=0;i<mgpdarr.length;i++)	mgpdarr[i]=new MedicineGPD(sc.next(),sc.next(),sc.next(),sc.nextInt());
		String disease=sc.next();
		int[] result=getPriceByDisease(mgpdarr,disease);
		for(int k:result)
		{
			System.out.println(k);
		}
		sc.close();
	}
}
