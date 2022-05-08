package com.org.genp.day3;

import java.util.Scanner;

public class Stringten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter A String:- ");
	     String string = sc.nextLine();
	    
	    if(string.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")){
	      System.out.println("Valid number format");
	    }else{
	      System.out.println("Invalid number format!!");
	      System.out.println("Valid Format Is XXX-XXX-XXXX");
	    }
		}

	}

}
