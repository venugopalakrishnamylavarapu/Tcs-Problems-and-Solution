package com.TcsProbs;
/*
 Problem Statement

Create class Player with below attributes: id - int name - String iccRank - int matchesPlayed - int runsScored - int

Create class Solution and implement static method "findAverageOfRuns" in the Solution class. This method will take array of Player objects and a target int as parameters. And will return another double array where the target int is lesser than or equal to the original array of Player object's matchesPlayed attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling "findAverageOfRuns" method in the main method, read values for four Player objects referring the attributes in above sequence along with a int target. Then call the "findAverageOfRuns" method and write logic in main method to print "Grade A",if the calculated averageRun value is 80 to 100. Else if the averageRun value is between 50 and 79 then print "Grade B". Else print "Grade C"
Input

100
Sachin
5
150
13000
101
Sehwag
4
120
10000
103
Dhoni
7
110
7000
104
Kohli
15
57
4400
100

Output

Grade A
Grade A
Grade B

 */
import java.util.Arrays;
import java.util.Scanner;

public class PlayerGAORSol {
	public static double[] findAverageOfRuns(PlayerGAOR[] pgaor,int target)
	{
		int avg;
		double[] a=new double[0];
		for(int i=0;i<pgaor.length;i++) {
			if(pgaor[i].getMatchesPlayed()>=target)
			{
				avg=pgaor[i].getRunsScored()/pgaor[i].getMatchesPlayed();
				a=Arrays.copyOf(a, a.length+1);
				a[a.length-1]=avg;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PlayerGAOR[] pgarr=new PlayerGAOR[4];
		for(int i=0;i<pgarr.length;i++)
			pgarr[i]=new PlayerGAOR(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		int target=sc.nextInt();
		sc.close();
		double[] result=findAverageOfRuns(pgarr,target);
		for(double r:result)
		{
			if(r>80 && r<100)	System.out.println("Grade A");
			else if(r>50 && r<79)	System.out.println("Grade B");
			else	System.out.println("Grade C");
		}
	}
}
