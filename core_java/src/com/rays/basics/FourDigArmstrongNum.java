package com.rays.basics;

public class FourDigArmstrongNum {
	
	public static void main(String[] args) {
		
		int number= 1634;
		
		int a= number%10; // value=1
		
		int b= (number/10)%10; //value=4
		
		int c= (number/100)%10; //value =6
		
		int d= number/1000; //value = 1
		
		int sum = a*a*a*a + b*b*b*b + c*c*c*c + d*d*d*d;
		
		if(sum==number) {
			System.out.println("Armstrong Number");
			
			
		}else {
			System.out.println("Not Armstrong Number");
		}
	}

}
