package com.TcsProbs;

import java.util.Scanner;
import java.lang.StringBuilder;

/*
 * Write a Java program to print the characters at the odd position of a given string
Input

Hey there!

Output

e hr!

Explanation

    All the characters (including whitespace) at the odd position of the string Hey there! are printed.

 */
public class CharsAtOddPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String input=sc.nextLine();
//		char[] arr=input.toCharArray();//read the question he said to print the characters(ikr i was dumb too..)
//		for(int i=1;i<arr.length;i+=2)	System.out.print(arr[i]);
		for(int i=1;i<input.length();i+=2)	System.out.print(input.charAt(i));
	}
}
