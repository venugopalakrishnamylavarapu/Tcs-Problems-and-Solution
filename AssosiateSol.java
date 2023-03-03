package com.TcsProbs;

import java.util.Arrays;
import java.util.Scanner;

public class AssosiateSol {
	
	 static Scanner sc=new Scanner(System.in);
	 public static Associate[] associatesForGivenTechnology(Associate[] ass,String searchTechnology) {
	  Associate[] result=new Associate[0]; 
	  for (int i= 0; i <ass.length; i++) 
	  { 
		  if(ass[i].getTechnology().equals(searchTechnology) && ass[i].getExperienceInYears()%5==0) 
		  {
			  result=Arrays.copyOf(result, result.length+1);
			  result[result.length-1]=ass[i];
		  }
	  }
	  return result;
	 }
	public static void main(String[] args) {
	  Associate[] arr=new Associate[5];
	  for(int i=0;i<arr.length;i++) 
		  arr[i]=new Associate(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
	  String str=sc.next(); 
	  sc.close();
	  Associate[] result=associatesForGivenTechnology(arr, str); 
	  for (Associate k : result) {
		System.out.println(k.getId());
	}
}
}
	 
	/*    public static void main(String[] args) {
	        Associate[] associates = new Associate[5];
	        Scanner sc = new Scanner(System.in);
	        for(int i = 0;i < 5;i++) {
	            associates[i] = new Associate(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
	        }
	        String searchTechnology = sc.next();
	        sc.close();
	        Associate[] result= associatesForGivenTechnology(associates,searchTechnology);
	        for(int i=0;i<result.length;i++)
	            System.out.println(result[i].getId());
	    }

	    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
	        Associate[] refined = new Associate[0];
	        for(int i=0;i<associates.length;i++) {
	            if(associates[i].getTechnology().equals(searchTechnology) && associates[i].getExperienceInYears()%5==0){
	                refined=Arrays.copyOf(refined,refined.length+1);
	                refined[refined.length-1] = associates[i];
	            }
	        }
	        return refined;
	    }
	}*/
