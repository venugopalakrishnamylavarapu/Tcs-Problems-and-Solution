package com.TcsProbs;

import java.util.Iterator;
import java.util.Scanner;
/*
 * Problem Statement

Write a Java program to print the unique characters present in the given string in the same sequence as they appear(the first occurrence) in the input.
Condition

All the characters should be in lowercase only.
Input

xperience

Output

xperinc

 */
public class UniqueCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String newStr="";
		for(int i=0;i<str.length();i++)
			if(!newStr.contains(Character.toString(str.charAt(i))))	newStr+=str.charAt(i);
		System.out.println(newStr);
	}
}
