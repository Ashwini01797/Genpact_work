package com.org.genp.day1;

import java.util.Scanner;

public class Expected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number, sum = 0.0;
		Scanner sc = new Scanner(System.in);
		double epsilon = 1e-6;
		for (int i = 1; i < 6; i ++) {
			System.out.println("Enter number" + i +" :" );
			number = sc.nextDouble();
			
			// To avoid float point error use epsilon
			if (number - 0.0 > epsilon) {
				sum += number;
			}
		}
		System.out.println("Sum = " + sum);
		sc.close();

	}

}
