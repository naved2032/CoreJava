package com.rays.basics;

public class TestArmstrongNumber {

	public static void main(String[] args) {

		int number = 153;

		int rem = 0;

		int sum = 0;

		int n = number; // n = 153;

		while (n > 0) { // 153 > 0, 15 > 0, 1 > 0, 0 > 0 (false)

			rem = n % 10; // rem = 153 % 10 = 3, rem = 15 % 10 = 5, rem = 1 % 10 = 1

			sum = sum + (rem * rem * rem); // sum = 0 + (3 * 3 * 3) = 27, sum = 27 + (5 * 5 * 5) = 152, sum = 152 + (1 * 1 * 1) = 153

			n = n / 10; // n = 153 / 10 = 15, n = 15 / 10 = 1, n = 1 / 10 = 0

		}

		if (sum == number) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("not Armstrong Number");
		}

	}

}
