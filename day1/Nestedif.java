package com.org.genp.day1;
import java.util.*;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:- ");
		int num1 =sc.nextInt();
		System.out.println("Enter num2:- ");
		int num2 =sc.nextInt();
		System.out.println("Enter num3:- ");
		int num3 =sc.nextInt();
		if(num1>num2 && num1>num3)
			System.out.println("Num1 is max");
		else if(num2>num1 && num2 >num3)
			System.out.println("Num2 is max");
		else
			System.out.println("Num3 is max");
		

	}

}
