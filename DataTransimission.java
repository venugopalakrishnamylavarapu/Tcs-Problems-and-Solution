package com.TcsProbs;
import java.util.Arrays;
import java.util.Scanner;

/*
 Problem Statement

When data is transmitted over network, it is important to check its validity on the receiving side. This would ensure that data is not altered or corrupted. One of the known approach for validity check is to suffix the data with additional details generated from original data itself.

As original data is always characters, it can be represented as number sequence (ASCII / UTF 8 etc). Hence, data like - ABCDcan be represented as 65666768referring ASCII codes. Hence, some additional data generated out of 65666768 can be suffixed while transmitting this sequence.

One of the similar approach can be to build a logic where given number sequence is separated by certain digits each. Next, it is identified how many prime numbers are there in those separated numbers. Next, add this total number of prime numbers with second largest prime number in the separated sequence. This new number can be suffixed with #.

E.g, if we want to to transmit the number sequence - 122423314766053.

Separating two digits each would generate: 12 24 23 31 47 6605 3. There are total 5 prime numbers and 31 is second largest. Hence, we can suffix 36 with original sequence. The final sequence transmitted will be122423314766053#36

You need to build a code for this logic. The input will be set of numbers already separated by space.

The submitted code should return the summation of total no. of prime numbers and second largest prime number.

Consider below example:

Input (input numbers separated by space. The number sequence ends with ; character):

1 0 34 56 76 112 111 17 71 112 113 139;

Answer is: 117 as there are total 4 prime numbers (17, 71, 113, 139) and second largest number is 113 (So in this case, Ans = 4 + 113 = 117)

The code should print the final answer as 117 in this case. (Just print the answer value. Do not print anything else).

Consider the limit on input no. as: 0 = Input number = 2,147,483,647. Also, assume that prime number will not be repeated in the input list and each list will have two or more prime numbers.
Input

233 2435 1123 109 103 4434 2347 993 880 1117 1801 991;

Output

1809

 */
public class DataTransimission {

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String input=sc.nextLine();
//		input=input.replace(";","");
//		String[] strarr=input.split(" ");
//		for(int i=0;i<strarr.length;i++)
//		{
//			if(Prime(Integer.parseInt(strarr[i])==1)
//					
//		}
		 static int primeCount;
		    public static void main(String args[] ) throws Exception {
		        Scanner sc = new Scanner(System.in);
		        String input = sc.nextLine();
		        sc.close();
		        input = input.replace(";", "");
		        String[] inputArray = input.split(" ");
		        int[] resultArray = new int[0];
		        for(int i=0;i<inputArray.length;i++){
		            boolean result = isPrimeNumber(Integer.parseInt(inputArray[i]));
		            if(result == true){
		                resultArray = Arrays.copyOf(resultArray, resultArray.length+1);
		                resultArray[resultArray.length-1] = Integer.parseInt(inputArray[i]);
		                primeCount++;
		            }
		        }
		        Arrays.sort(resultArray);
		        System.out.println(resultArray[resultArray.length-2]+primeCount);
		        }
		    public static boolean isPrimeNumber(int number){
		        if(number<=1){
		            return false;
		        }
		        for(int i=2;i<Math.sqrt(number);i++){
		            if(number%i==0){
		                return false;
		            }
		        }
		        return true;
		    }
	}
