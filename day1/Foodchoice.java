package com.org.genp.day1;

import java.util.Scanner;

public class Foodchoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To BhartiyaTasteBuds.com");
		System.out.println("1. South Indian Dish");
		System.out.println("2. North Indian Dish");
		System.out.println("3. Rajsthani Dish");
		System.out.println("4. Gujrati Dish");
		System.out.println("5. Bengali Dish");
		System.out.println("6. Desserts");
		System.out.println("7. Exit!!");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("------------------------------------------------------------------");
		System.out.print("Enter Choice of your Dish:- ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("------------------------------------------------------------------");
			System.out.println("Welcome To South Indian Food Court"+'\n'+"You Get:-");
			System.out.println("Dosa : 1 Piece");
			System.out.println("Idli : 2 Piece");
			break;
		case 2:
			System.out.println("------------------------------------------------------------------");
			System.out.println("Welcome To North Indian Food Court"+'\n'+"You Get:-");
			System.out.println("Litti Chokha : 2 Piece");
			System.out.println("Chhole Bhature : 2 Piece");
			break;
		case 3:
			System.out.println("------------------------------------------------------------------");
			System.out.println("Welcome To Rajsthani Food Court"+'\n'+"You Get:-");
			System.out.println("Moong Dal kachori : 2 Piece");
			System.out.println("Palak Kadhi : 1 Plate");
			break;
		case 4:
			System.out.println("------------------------------------------------------------------");
			System.out.println("Welcome To Gujrati Food Court"+'\n'+"You Get:-");
			System.out.println("Dhokla : 2 Piece");
			System.out.println("Dabeli : 2 Piece");
			break;
		case 5:
			System.out.println("------------------------------------------------------------------");
			System.out.println("Welcome To Bengali Food Court"+'\n'+"You Get:-");
			System.out.println("Begun Bhaja : 4 Piece");
			System.out.println("Alu Bhaja : 1 Plate");
			break;
		case 6:
			System.out.println("------------------------------------------------------------------");
			System.out.println("Welcome To Desserts Food Court"+'\n'+"You Get:-");
			System.out.println("Gulab Jamun : 2 Piece");
			System.out.println("Rasmalai : 2 Piece");
			break;
		case 7:
			System.exit(0);
		default:
			System.out.println("No Choice of  Any Dish");
			
			
			
		}
		}

	}

}
