package com.TcsProbs;

import java.util.Scanner;

/*
 * Problem Statement

Write a Java program to compute the number of spaces and characters in a given string
Condition

Ignore all the digits
Input

Hello This is ABCD from XYZ city

Output

No of spaces : 6 and characters : 26

Explanation

    The total number of spaces and all the characters excluding numbers/digits are computed and printed.

 */

public class SpaceCharacterCount {

	public static void main(String[] args) throws Exception {
		int characters=0,spaces=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isWhitespace(str.charAt(i)))	spaces++;
			else if(!Character.isDigit(str.charAt(i)))	characters++;
		}
		System.out.println("no of spaces : "+spaces+" and characters : "+characters);
	}

}
