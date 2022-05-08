package com.org.genp.day5;




class Parent{
	String name = "parent class";
	public static void sqaureroot(int num) {
		double val = Math.sqrt(num);
		System.out.println("The square root of "+num+" is "+num);
	}
	
	public void formula(int a, int b) {
		System.out.println("(A+B)^2 is: "+Math.pow((a+b),2));
	}

}


class Child extends Parent{
	String name ="Child class";
	public static void sqaureroot(int num) {
		System.out.println("The area of circle is: "+Math.PI*num*num);
	}
}


class newChild extends Child{
	String name="new child class";
	public static void sqaureroot(int num) {
		System.out.println("The area of square is: "+num*num);
	}
	
	
}






public class MethodHide {

	public static void main(String[] args) {
		Parent p = new newChild();
		
		System.out.println("Parent Class Ref With Child Class Object");
		System.out.println(p.name);
		p.sqaureroot(49);
		p.formula(15, 25);
		System.out.println("------------------------------------------");
		System.out.println("Parent Class Ref With Parent Class Object");
		Parent p1 = new Parent();
		System.out.println(p1.name);
		p.sqaureroot(49);
		p.formula(15, 25);
		System.out.println("------------------------------------------");
		
		System.out.println("Child Class Ref with child Class Object");
		Child c = new Child();
		System.out.println(c.name);
		c.sqaureroot(25);
		
		System.out.println("------------------------------------------");
		System.out.println("New Child Class Ref With New Class Object");
		newChild n = new newChild();
		System.out.println(n.name);
		n.sqaureroot(19);
		

	}

}
