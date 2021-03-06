package com.org.genp.day2;

import java.util.Scanner;



public class EmpInfo {
	
	int empid, salary,experience; 
	String name,skillset;
	static String company="genpact"; 
	Scanner sc = new Scanner(System.in);
	int size = 3;
	EmpInfo employee[] = new EmpInfo[size];
	
	public void getdata() {
		for(int i=0;i<size;i++) {
			employee[i] = new EmpInfo();
			System.out.println("Enter the employee id: ");
			this.employee[i].empid = sc.nextInt();
			System.out.println("Enter the employee name: ");
			this.employee[i].name = sc.next();
			System.out.println("Enter the employee salary: ");
			this.employee[i].salary = sc.nextInt();
			System.out.println("Enter the employee Experience: ");
			this.employee[i].experience = sc.nextInt();
			System.out.println("Enter the employee skillset: ");
			this.employee[i].skillset = sc.next();
			System.out.println("one record inserted !!");
		}
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println("****************************Employee Details*************************************");
			System.out.println("Employee id: "+employee[i].empid+"\nEmployee name "+employee[i].name+"\nEmployee salary "+employee[i].salary+"\nEmployee Experience "+employee[i].experience+"\nEmployee skillset "+employee[i].skillset+"\nCompany "+EmpInfo.company);
		}
	}
	
	public int salaryCal() {
		int max = employee[0].salary;
		for(int i=1;i<size;i++) {
			if(employee[i].salary > max ) {
				max = employee[i].salary;
			}
		}
		return max;
	}
	
	
	public void skillcheck() {
		System.out.println("************************Skill*******************************");
		for(int i=0;i<size;i++) {
			if(employee[i].skillset.equals("java")) {
				System.out.println("Employee id: "+employee[i].empid+"\nEmployee name "+employee[i].name+"\nEmployee salary "+employee[i].salary+"\nEmployee Experience "+employee[i].experience+"\nEmployee skillset "+employee[i].skillset+"\nCompany "+EmpInfo.company);
			}
		}	
	}
	
	public void increment() {
		System.out.println("**********************Increment******************************");
		for(int i=0;i<size;i++) {
			if(employee[i].experience>=15 && employee[i].skillset.equals("java")) {
				int updatessalary = (int) (0.1*employee[i].salary);
				employee[i].salary += updatessalary;
				System.out.println("Employee id: "+employee[i].empid+"\nEmployee name "+employee[i].name+"\nEmployee salary "+employee[i].salary+"\nEmployee Experience "+employee[i].experience+"\nEmployee skillset "+employee[i].skillset+"\nCompany "+EmpInfo.company);
			}
		}
	}
	
	public void updateSkill() {
		System.out.println("*********************New Update Skill***********************");
		for(int i=0;i<size;i++) {
			if(employee[i].experience>=10) {
				System.out.println("kindly please update the skill......");
				String updateskill = sc.next();
				employee[i].skillset = updateskill;
				System.out.println("Employee id: "+employee[i].empid+"\nEmployee name "+employee[i].name+"\nEmployee salary "+employee[i].salary+"\nEmployee Experience "+employee[i].experience+"\nEmployee skillset "+employee[i].skillset+"\nCompany "+EmpInfo.company);
				System.out.println("updated successfully !!!!!!!!!");
			}
		}
	}

	public static void main(String[] args) {
		EmpInfo e1 = new EmpInfo();
		e1.getdata();
		e1.display();
		int result = e1.salaryCal();
		System.out.println("Max salary :"+result);
		e1.skillcheck();
		e1.increment();
		e1.updateSkill();
		

	}

}
