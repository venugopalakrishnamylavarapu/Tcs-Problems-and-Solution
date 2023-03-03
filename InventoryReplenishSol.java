package com.TcsProbs;
/*
 * Problem Statement

Create class Inventory with below attributes: inventoryId - String maximumQuantity - int currentQuantity - int threshold - int

Create class Solution and implement static method "replenish" in the Solution class. This method will take array of Inventory objects and a limit int as parameters. And will return another array of Inventory objects where the limit int is lesser than or equal to the original array of Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "replenish" method in the main method, read values for four Inventory objects referring the attributes in above sequence along with a int limit. Then call the "replenish" method and write logic in main method to print "Critical Filling",if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print "Moderate Filling". Else print "Non-Critical Filling"
Input

1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output

2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling

 */
import java.util.Arrays;
import java.util.Scanner;

public class InventoryReplenishSol {
	public static InventoryReplenish[] replenish(InventoryReplenish[] iobj,int limit)
	{
		InventoryReplenish[] irarr=new InventoryReplenish[0];
		for(int i=0;i<iobj.length;i++)
		{
			if(iobj[i].getThreshold()>=limit)	
			{
				irarr=Arrays.copyOf(irarr, irarr.length+1);
				irarr[irarr.length-1]=iobj[i];
			}
		}
		return irarr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InventoryReplenish[] n=new InventoryReplenish[4];
		for(int i=0;i<n.length;i++)	n[i]=new InventoryReplenish(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		int limit=sc.nextInt();
		sc.close();
		InventoryReplenish[] irobj=replenish(n,limit);
		for (InventoryReplenish ir : irobj) {
			if(ir.getThreshold()>=75)	System.out.println("Critical Filling");
			else if(ir.getThreshold()>50 && ir.getThreshold()<75)	System.out.println("Moderate Filling");
			else	System.out.println("Non-Critical Filling");
		}
	}
}
