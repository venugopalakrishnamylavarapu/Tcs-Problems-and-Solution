package com.TcsProbs;

import java.util.Scanner;
/*
 * Problem Statement

Write a Java program to count both vowels and consonants in a given string
Conditions

Only alphabets should be considered for counting
Input

Hello World!

Output

Vowels count - 3
Consonants count - 7

Explanation

    The vowels in the given string are e,o and o and so the vowels count is 3. Likewise, the consonants in the given string are h,l,l,w,r,l and d and so the count is 7.

 */
public class VowelsConsonantsCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vowels=0,consonants=0;
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{	
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				{
					vowels++;
				}
				else
					consonants++;
			}
		}
		System.out.println("Vowels count - "+vowels);
		System.out.println("Consonants count - "+consonants);
	}
}
