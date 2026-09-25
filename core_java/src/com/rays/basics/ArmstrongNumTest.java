package com.rays.basics;

public class ArmstrongNumTest {
	
	public static void main(String[] args) {
		
		int num= 1634;
		
		int rem= 0;
		
		int sum=0;
		
		int n= num;
		
		while (n>0) {
			
			rem=n%10; 
			
			sum= sum+(rem*rem*rem*rem);
			
			n=n/10;
			
			}
		
		
		if(sum==num) {
			System.out.println("Armstrong Number");
			
		}else {
			System.out.println("Not a Armstrong Number");
			
		}
		
	}

}
