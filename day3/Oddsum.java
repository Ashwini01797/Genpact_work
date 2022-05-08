package com.org.genp.day3;

import java.util.Scanner;

class UserMainCode {
	
	public static int checksum(long n) {
		long sum = 0;
		long rem = 0;
		while(n > 0) {
			rem = n % 10;
			n /= 100;
			sum += rem;
		}
		if (sum % 2 == 1) {
			return 1;
		} else {
			return -1;
		}
	}
}
public class Oddsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter a Number:- ");
		long n = sc.nextLong();
		int ans = UserMainCode.checksum(n);
		System.out.println(ans);
	}
	}

}