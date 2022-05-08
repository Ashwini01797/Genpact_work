package com.org.genp.day5;

import java.util.Scanner;

class salarygreaterexp extends Exception {
	public salarygreaterexp(int salary) {
		final int standard_salary = 50000; 
		if(salary >= standard_salary) {
			System.out.println("you are eligible for the 8LPA scheme");
			int installment = (int) (0.15*salary);
			System.out.println("One year installment is :"+installment);
		}
		else {
			System.out.println("you are eligible for the 3LPA scheme");
			int installment = (int) (0.15*salary);
			System.out.println("One year installment is :"+installment);
		}
	}
}



class EmpGenp{
	String name;
	int salary;
	
	public EmpGenp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void salaryvalidate(int salary) throws salarygreaterexp
	{
			if(salary > 70000)
			{
				System.out.println("The salary is > 70,000/-");
				throw new salarygreaterexp(salary);
			}
			else {
				System.out.println("The salary is < 70,000/-");
				throw new salarygreaterexp(salary);
			}
	}
}



public class EmployeeSal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
		try {
			
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		System.out.println("Enter Your Salary :");
		int salary = sc.nextInt();
		EmpGenp e1 = new EmpGenp(name,salary);
		
		
			e1.salaryvalidate(salary);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
	
}
