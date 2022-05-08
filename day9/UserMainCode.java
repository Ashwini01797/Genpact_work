package com.org.genp.day9;  
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserMainCode {
	private static final String Pwd =
	        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
	 
	    private static final Pattern Pwdptrn =Pattern.compile(Pwd);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		while(true) {			
		System.out.println("Enter Password:- ");
		String str=sc.nextLine();
		if (Pwdptrn.matcher(str).matches()) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }

		}

	}

}
