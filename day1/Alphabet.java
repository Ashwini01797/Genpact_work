package com.org.genp.day1;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++) {
			for(int j=7;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				if(i==4 || k==0 || k==i) {
					System.out.print(" "+"*");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
