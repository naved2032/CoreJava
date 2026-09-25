package com.rays.basics;

public class OtpProblem {
	
	public static void main(String[] args) {
		
		int num=14;
		
		
		int steps = 0;
		
		
		
		while(num>0) {
			
			if(num%2==0) {
				num= num/2;
				steps++;
				
				
			}else if(num%2!=0) {
				num=num-1;
				steps++;
				
				
				
			}
			
		}
		System.out.println(steps);
		
		
		
		
		
		
			} 
		
		
}
