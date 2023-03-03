package com.TcsProbs;

import java.util.Scanner;
/*
 * Problem Statement

Write a Java program to reverse a given string
Condition

The reverse string should be printed in lowercase only.
Input

WelCome

Output

emoclew

 */

public class ReverseOfString {
	public static void main(String... heavens)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
//		StringBuilder sb=new StringBuilder();
		//the below logic is one of 4 basic logics to reverse a string
		//the remaining 3 are using StringBuilder class,itterating new String and by using a 
		//built in method called reverse() which is present in StringBuffer and StringBuilder.
	//1st method & 2nd mehthod same but different class used
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)	sb.append(str.charAt(i));
		System.out.println(sb);
	//3nd method
		StringBuilder sb1=new StringBuilder(str);
		System.out.println(sb1.reverse());
	//4rd method
		String newStr="";
		for(int i=str.length()-1;i>=0;i--)	newStr+=str.charAt(i);
		System.out.println(newStr);
	//the below is one more facinating method
	        char[] inputArray = str.toCharArray();
	        for (int i = inputArray.length - 1; i >= 0; i--) {
	            System.out.print(inputArray[i]);
	        }
		
	}
}
