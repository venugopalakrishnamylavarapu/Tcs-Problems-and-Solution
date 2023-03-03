package com.TcsProbs;

import java.util.Scanner;

/*
 * Problem Statement

Write a Java program to check whether a given number is a perfect square or not
Condition

Input will only be a positive interger and will not have any decimal or special characters
Input

9

Output

TRUE

Explanation

    A positive integer is a perfect square if it is the product of some integer with itself. As 9 is a square of 3 (ie., 3 * 3 = 9).

 */
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int value=sc.nextInt();
		int mid=Math.round(value/2);
		for(int i=1;i<=mid;i++)	if(i*i==value)	flag=true;
		System.out.println(flag);
	}

}
