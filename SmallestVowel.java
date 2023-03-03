package com.TcsProbs;
/*
 * Problem Statement

Write a program to print the smallest vowel in a given string
Input

matrix

Output

a

Explanation

    The vowels in the given string are a and i. And the alphabetically smallest between them is a.

 */
import java.util.Arrays;
import java.util.Scanner;

public class SmallestVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		//my own method
		char[] c=str.toCharArray();
		char[] d=new char[0];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
			{
				d=Arrays.copyOf(d, d.length+1);
				d[d.length-1]=c[i];
			}
		}
		Arrays.sort(d);
		System.out.println(d[0]);
		
		//2nd method simple yet elegant
		 	String []vowels={"a","e","i","o","u"};
	        for(int i=0;i<vowels.length;i++){
	            if(str.contains(vowels[i])){
	                System.out.println(vowels[i]);
	                break;
	            }
	        } 
		
	}
}
