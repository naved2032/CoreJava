package com.rays.basics;

public class PalindromNo {
	
	public static void main(String[] args) {
		
		int num= 900;
		
		int a= num%10; //rem= 1
		
		int b= (num/10)%10; //rem=2
				
		int c= num/100; // rem = 1
		
		
		if (a==c&& b==b&& c==a) {
			
			System.out.println("it is a palintrom number");
		}else 
			System.out.println("not a palintrom number");
		
		
		
		
	}

}
