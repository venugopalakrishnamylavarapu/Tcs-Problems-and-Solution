package com.TcsProbs;

/*
 * Problem Statement

Create class Movie with below attributes: movieName - String company - String genre - String budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie objects where the searchGenre String matches with the original array of Movie object's genre attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else print "Low Budget Movie".
Input

aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output

High Budget Movie
High Budget Movie

 */
import java.util.Arrays;
import java.util.Scanner;

public class MovieGMGSol {
	public static MovieGMG[] getMovieByGenre(MovieGMG[] mgmg,String searchGenre)
	{
		MovieGMG[] mgobj=new MovieGMG[0];
		for(int i=0;i<mgmg.length;i++)
		{
			if(mgmg[i].getGenre().equalsIgnoreCase(searchGenre))
			{
				mgobj=Arrays.copyOf(mgobj, mgobj.length+1);
				mgobj[mgobj.length-1]=mgmg[i];
			}
		}
		return mgobj;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MovieGMG[] mgobj=new MovieGMG[4];
		for(int i=0;i<mgobj.length;i++)
			mgobj[i]=new MovieGMG(sc.next(),sc.next(),sc.next(),sc.nextInt());
		String searchGenre=sc.next();sc.nextLine();
		MovieGMG[] result=getMovieByGenre(mgobj,searchGenre);
		for(MovieGMG mg:result)
		{
			if(mg.getBudget()>80000000)	System.out.println("High Budget Movie");
			else if(mg.getBudget()<80000000 &&mg.getBudget()>0)	System.out.println("Low Budget Movie");		}
	}
}
