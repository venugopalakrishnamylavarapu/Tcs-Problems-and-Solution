package com.TcsProbs;
/*
 Problem Statement

Create a class NavalVessel with the below attributes:
vesselld – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String
classification – String

Write getters, setters for the above attributes. Create constructor which takes parameter in the above sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement as mentioned below.The percentage for each navalVessel is calculated as percentage .(noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object. Before returning the object, the classification should be derived as mentioned below. This classification value should be assigned to the object before returning. If any of the above conditions are not met, then the method should return null. The classification attribute should be calculated based on the percentage calculation mentioned above. If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer otherwise the classification should be ‘Striver’ If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for percentage and purpose.
Input

111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army

Output

300
Yashwin%Inspirer

 */
import java.util.Scanner;

public class NavalVesselSol {
	public static int findAvgVoyagesByPct(NavalVessel[] nvarr,int parameterPercentage)
	{int avg = 0, count = 0;
	  for (int i = 0; i < nvarr.length; i++) {
		   int percent = (nvarr[i].getNoOfVoyagesCompleted() * 100) / nvarr[i].getNoOfVoyagesPlanned();
		   if (percent >= parameterPercentage) {
		    avg += nvarr[i].getNoOfVoyagesCompleted();
		    count++;
		   }
		  }
		  if (avg == 0)
		   return 0;
		  else
		   return avg / count;
	}
	public static NavalVessel findVesselByGrade(String purpose,NavalVessel[] nvarr)
	{
		for(int i=0;i<nvarr.length;i++)
		{
			if(nvarr[i].getPurpose().equals(purpose))	
				{
						int condperc=(nvarr[i].getNoOfVoyagesCompleted()*100)/nvarr[i].getNoOfVoyagesPlanned();
						if(condperc==100)	nvarr[i].setClassification("Star");
						else if(condperc<=99 && condperc>=80)	nvarr[i].setClassification("Leader");
						else if(condperc<=79 && condperc>=55)	nvarr[i].setClassification("inspirer");
						else	nvarr[i].setClassification("Striver");
					return nvarr[i];
				}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NavalVessel[] nv=new NavalVessel[4];
		for(int i=0;i<4;i++)
		{
			nv[i]=new NavalVessel(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
		}
		int Percentage=sc.nextInt();sc.nextLine();
		String purpose=sc.next();
		int avgPct=findAvgVoyagesByPct(nv,Percentage);
		if(avgPct>0) {
			System.out.println(avgPct);
		}
		else
		{
			System.out.println("There are no voyages completed with this percentage");
		}
		NavalVessel grade=findVesselByGrade(purpose,nv);
		if(grade==null)	System.out.println("No NavalVessel is available with the specific purpose");
		else
		{
			System.out.println(grade.getVesselName()+"%"+grade.getClassification());
		}
	}
}