package com.org.genp.day7;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {
	static void strim(List<String> str1) {
		for(String i:str1){
			System.out.println("");
			System.out.println("Before Trim"+"   "+":- "+i);
			System.out.println("After Trim"+"     "+":-"+i.trim());
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<String> str1=new ArrayList<>();
			str1.add("Ashwini     ");
			str1.add("           Kumar");
			str1.add("  .....Banglore   ");
			StringDemo.strim(str1);
		
	}
	

}
