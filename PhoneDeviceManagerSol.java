package com.TcsProbs;
import java.util.Scanner;
/*
 Problem Statement

Create a class Phone with below attributes: phoneId - int os - String brand - String price - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with main method.

Implement two static methods - findPriceForGivenBrand and getPhoneIdBasedOnOs in Solution class.

findPriceForGivenBrand method: This method will take two input parameters - array of Phone objects and string parameter brand. The method will return the sum of the price attribute from phone objects for the brand passed as parameter. If no phones with the given brand is present in the array of phone objects, then the method should return 0.

getPhoneIdBasedOnOs method: This method will take a String parameter os, along with the array of Phone objects. The method will return the phone object, if the input String parameter matches with the os attribute of the phone object and its price attribute is greater than or equal to 50000. If any of the conditions are not met, then the method should return null.

Note : No phone object would have the same value for os attribute. All phone object would have the price greater than 0. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPriceForGivenBrand method - The main method should print the price as it is if the returned price is greater than 0, or it should print "The given Brand is not available".

For getPhoneIdBasedOnOs method - The main method should print the phoneId of the returned phone object. If the returned value is null then it should print "No phones are available with specified os and price range".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence. Next, read the value for brand and os.
Input

111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid

Output

The given Brand is not available
222

Starter Code

public class Solution
{

public static void main(String[] args)
{
//code to read values
//code to call required method
//code to display the result
}

public static int findPriceForGivenBrand(Phone[] phone, String brand)
{
//method logic
}

public static Phone getPhoneIdBasedOnOs(Phone[] phone, String os)
{
//method logic
}
}

class Phone
{
//code to build Phone class
}

 */

public class PhoneDeviceManagerSol {
	public static int findPriceForGivenBrand(PhoneDeviceManager[] pdm,String brand)
	{
		int sum=0;
		for(int i=0;i<pdm.length;i++)
		{
			if(pdm[i].getBrand().equals(brand))	sum+=pdm[i].getPrice();
		}
		return sum;
	}
	public static PhoneDeviceManager getPhoneIdBasedOnOs(String os,PhoneDeviceManager[] pdmarr)
	{
		for(int i=0;i<pdmarr.length;i++)
		{
			if(pdmarr[i].getOs().equalsIgnoreCase(os) && pdmarr[i].getPrice()>=50000)	return pdmarr[i];	
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PhoneDeviceManager[] pdm1=new PhoneDeviceManager[4];
		for(int i=0;i<4;i++)	pdm1[i]=new PhoneDeviceManager(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		String brand=sc.next();
		String os=sc.next();
		int price=findPriceForGivenBrand(pdm1,brand);
		if(price>0)	System.out.println(price);
		else	System.out.println("The given Brand is not available");
		PhoneDeviceManager phoneId=getPhoneIdBasedOnOs(os,pdm1);
		if(phoneId==null)	System.out.println("No phones are available with the specified os and price range");
		else	System.out.println(phoneId.getPhoneId());
	}
	
}
