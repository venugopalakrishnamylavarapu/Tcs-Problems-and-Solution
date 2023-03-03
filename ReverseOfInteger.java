package com.TcsProbs;

import java.util.Scanner;

public class ReverseOfInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		//the below logic is written by me
//		int reverse=0;
//		while(number!=0)
//		{	
//			int last=number%10;
//			reverse=(reverse*10)+last;
//			number/=10;
//		}
//		System.out.println(reverse);
		 
		
	//the below logic is just so good i loved it it also reverse the integer
//		 if(number == 0)
//	            System.out.print(0);
//	        else {
//	            while(number!=0){
//	                System.out.print(number%10);
//	                number /= 10;
//	            }
//	        }
		
	//the below is another logic that does the trick in 3 lines
		StringBuffer str=new StringBuffer();
        str=str.append(number);
        System.out.print("The Reverse of the number is "+ str.reverse());
	}
}
