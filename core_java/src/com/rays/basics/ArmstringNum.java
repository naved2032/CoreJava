package com.rays.basics;

public class ArmstringNum {
	
	public static void main(String[] args) {
		
		int num=153;
		
		int a = num % 10; // last digit
		int b = (num / 10) % 10; // middle digit
		int c = num / 100;       // first digit
		
		int sum= a*a*a+b*b*b+c*c*c;
		
		if(num==sum) {
			
			System.out.println("num is armstrong number");
			
		}else {
			System.out.println("num is not armstrong number");
		}
		
		
	}

}

