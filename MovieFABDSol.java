package com.TcsProbs;

import java.util.Scanner;
/*
 * Problem Statement

Create a class Movie with the below attributes: movieId - int director - String rating - int budget - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findAvgBudgetByDirector and getMovieByRatingBudget in Solution class.

findAvgBudgetByDirector method: This method will take two input parameters - array of Movie objects and string parameter director. The method will return the average of the budget attribute from Movie objects directed by the director passed as parameter. If no movie with the given director is present in the array of movie objects, then the method should return 0.

getMovieByRatingBudget method: This method will take two int parameters rating and budget, along with the array of movie objects. The method will return the movie object, if the input parameters rating and budget, matches with the rating and budget attribute of the movie object respectively.

Also check if rating is a factor of budget (eg: 3 is a factor of 12 because 3 divides 12 without leaving a remainder). If any of the conditions are not met, then the method should return null.

Note : No two movie object would have the same value for rating and budget attributes. All the searches should be case insensitive. The budget mentioned are in crores and in INR.

These above mentioned static methods should be called from the main method.

For findAvgBudgetByDirector method - The main method should print the average budget as it is if the returned value is greater than 0, or it should print "Sorry - The given director has not yet directed any movie".

For getMovieByRatingBudget method - The main method should print the movieId of the returned movie object. If the returned value is null then it should print "Sorry - No movie is available with the specified rating and budget requirement".

Before calling these static methods in main, use Scanner object to read the values of four Movie objects referring attributes in the above mentioned attribute sequence. Next, read the value for director, rating and budget.
Input

1101
GVM
4
100
1201
Shankar
5
500
1301
Shankar
3
50
1401
GVM
5
300
GVM
5
300

Output

200
1401

 */

public class MovieFABDSol {
	public static int findAvgBudgetByDirector(MovieFABD[] mfabd,String director)
	{
		int sum=0,count=0,avg;
		for(int i=0;i<mfabd.length;i++)
		{
			if(mfabd[i].getDirector().equalsIgnoreCase(director))	
			{
				sum+=mfabd[i].getBudget();
				count++;
			}
		}
		if(sum==0 && count==0)	return 0;
		else	return sum/count;
	}
	public static MovieFABD getMovieByRatingBudget(int rating,int budget,MovieFABD[] mfabd)
	{
			for (int i = 0; i < mfabd.length; i++)	
				if((mfabd[i].getRating()==rating && mfabd[i].getBudget()==budget) && mfabd[i].getBudget()%mfabd[i].getRating()==0)	return mfabd[i];	
			return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MovieFABD[] mfabdarr=new MovieFABD[4];
		for(int i=0;i<mfabdarr.length;i++)
			mfabdarr[i]=new MovieFABD(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
		String director=sc.next();sc.nextLine();
		int rating=sc.nextInt();sc.nextLine();
		int budget=sc.nextInt();
		sc.close();
		
		int k=findAvgBudgetByDirector(mfabdarr,director);
		if(k>0)	System.out.println(k);
		else	System.out.println("Sorry-The given director has not yet directed any movie");
		
		MovieFABD mfabd=getMovieByRatingBudget(rating,budget,mfabdarr);
		if(mfabd==null)	System.out.println("Sorry-no movie is available with the specified rating and budget requirement");
		else	System.out.println(mfabd.getMovieId());
		
	}
}
