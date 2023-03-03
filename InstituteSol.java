package com.TcsProbs;
/*
 Problem Statement

Create a class Institution with below attributes:

institutionId - int institutionName - String noOfStudentsPlaced - String noOfStudentsCleared- int location - String grade - String

Write getters, setters for the above attributes. Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method. Implement two static methods - findNumClearancedByLoc and updateInstitutionGrade in Solution class.

findNumClearancedByLoc method: This method will take two input parameters - array of Institution objects and string parameter location. The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as parameter. If no institution with the given location is present in the array of institution objects, then the method should return 0.

updateInstitutionGrade method: This method will take a String parameter institutionName, along with the array of Institution objects. The method will return the institution object, if the input String parameter matches with the institutionName attribute of the institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return null.

The grade attribute should be calculated as follows: rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared If the rating &gt= 80 , then grade should be 'A'. Else, then grade should be 'B'

Note: No institution object would have the same value for institutionName attribute. All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is greater than 0, or it should print "There are no cleared students in this particular location".

For updateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the institution name and A is the grade. If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence (except grade attribute). Next, read the value for location and institutionName.
Input

111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

Output

22000
Karunya::A

Starter Code

import java.util.Scanner
public class Solution
{

public static void main(String[] args)
{
//code to read values
//code to call required method
//code to display the result
}

public static int findNumClearancedByLoc(Institution[] instArray, String location)
{
//method logic
}

public static Institution updateInstitutionGrade(Institution[] instArray, String instName)
{
//method logic
}
}
class Institution
{
//code to build Institution class
}

 */
import java.util.Scanner;

public class InstituteSol {
	public static int findNumClearancedByLoc(Institute[] iobj,String location)
	{
		int sum=0;
		for(int i=0;i<iobj.length;i++)
			if(iobj[i].getLocation().equalsIgnoreCase(location))	sum+=iobj[i].getNoOfStudentsCleared();
		return sum;
	}
	public static Institute updateInstitutionGrade(Institute[] iobj,String institutionName)
	{
		for(int i=0;i<iobj.length;i++)
		{
			if(iobj[i].getInstitutionName().equalsIgnoreCase(institutionName))	
			{
				int rating=((Integer.parseInt(iobj[i].getNoOfStudentsPlaced())*100)/iobj[i].getNoOfStudentsCleared());
				if(rating>=80)	iobj[i].setGrade("A");
				else	iobj[i].setGrade("B");
				return iobj[i];
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Institute[] iarr=new Institute[4];
		for(int i=0;i<iarr.length;i++)	iarr[i]=new Institute(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
		String location=sc.next();
		int noOfClearance=findNumClearancedByLoc(iarr,location);
		String institutionName=sc.next();
		sc.close();
		Institute inobj1=updateInstitutionGrade(iarr,institutionName);
		if(noOfClearance>0)	System.out.println(noOfClearance);
		else	System.out.println("There are no cleared students in this particular location");
		
		if(inobj1==null)	System.out.println("No Institute is available with the specified name");
		else	System.out.println(inobj1.getInstitutionName()+"::"+inobj1.getGrade());
		
		
	}
}
