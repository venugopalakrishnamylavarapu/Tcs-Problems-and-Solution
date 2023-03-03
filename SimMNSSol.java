package com.TcsProbs;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Problem Statement

Create class Sim with below attributes: id - int company - String balance - int ratePerSecond - double circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class. This method will take array of Sim objects, search_circle String and search_rate double as parameters. And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in main method to print the id's of the result obtained.
Input

1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4

Output

4
3
1
2

 */
public class SimMNSSol {
	public static SimMNS[] matchAndSort(SimMNS[] smns,String searchCircle,double searchRate)
	{
		SimMNS[] smarr=new SimMNS[0];
		for(int i=0;i<smns.length;i++)
		{
			if(smns[i].getCircle().equals(searchCircle) && smns[i].getRatePerSecond()<searchRate)
			{
				smarr=Arrays.copyOf(smarr, smarr.length+1);
				smarr[smarr.length-1]=smns[i];
			}
		}
		//need to understand this forloop 
		  for(int i=0;i<smarr.length-1;i++){
	            for(int j=0;j<smarr.length-i-1;j++){
	                if(smarr[j].getBalance()<smarr[j+1].getBalance()){
	                     SimMNS temp=smarr[j];
	                     smarr[j]=smarr[j+1];
	                     smarr[j+1]=temp;
	                }

	            }
	        }
		return smarr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SimMNS[] sarr=new SimMNS[4];
		for(int i=0;i<sarr.length;i++)	sarr[i]=new SimMNS(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
		
		String searchCircle=sc.next();
		double searchRate=sc.nextDouble();
		
		SimMNS[] n=matchAndSort(sarr,searchCircle,searchRate);
		for(int i=0;i<n.length;i++)
			System.out.println(n[i].getId());
	}
}
