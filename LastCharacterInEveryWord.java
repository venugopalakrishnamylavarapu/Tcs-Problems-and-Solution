package com.TcsProbs;

import java.util.Scanner;

public class LastCharacterInEveryWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String newStr="";
		int k=27;
		char[] charr=str.toCharArray();
		for(int i=0;i<charr.length;i++)
		{
			if((Character.isWhitespace(charr[i]) && !Character.isWhitespace(charr[i-1]) && !Character.isDigit(charr[i-1])))	System.out.print(charr[i-1]);
			else if(i==charr.length-1 && !Character.isDigit(charr[i]))	System.out.print(charr[i]);
		}
		System.out.println(newStr);
	}
}
