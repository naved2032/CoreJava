package com.rays.basics;

public class AarmstrongNNUmber {
	
	public static void main(String[] args) {
		
		int number= 370;
		
		int rem=0;
		
		int sum=0;
		
		int n= number;
		
		while(n>0) {
			
			rem= n%10;
			
			sum= sum+(rem*rem*rem);
			
			n=n/10;
			
		}
	       if (number==sum) {
	    	   System.out.println("Armstrong Number");
	    	   
	       }else {
	    	   System.out.println("not armstrong number");
	    	   
	       }
	}
	

}
