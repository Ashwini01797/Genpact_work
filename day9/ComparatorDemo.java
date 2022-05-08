package com.org.genp.day9;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar=new ArrayList<>();
		System.out.println("Enter Number of Employess:- ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Employess Details:- ");
			String name1=sc.next();
			String dep1=sc.next();
			String doj1=sc.next();
			int age1=sc.nextInt();
			int sal1=sc.nextInt();
			ar.add(new Employee(i+1,name1,dep1,doj1,age1,sal1));			
		}
		while(true) {
		System.out.println("1-> Sort employees by salary!!");
		System.out.println("2-> Sort employees by age and by date of joining");
		System.out.println("3-> Exit!! ");
		System.out.println("Kindly Enter Your Choice:- ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(ar,(emp1,emp2)->emp2.getSalary()-emp1.getSalary());
			ar.forEach(System.out::println);
			break;
		case 2:
			Collections.sort(ar,(emp1,emp2)->emp2.getAge()-emp1.getAge());
			Collections.sort(ar,(emp1,emp2)->emp2.getDoj().compareTo(emp1.getDoj()));
			ar.forEach(System.out::println);
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Bad Choice!! Try Agian!!");
			break;
			
				
		}
		
		}
	}

}
