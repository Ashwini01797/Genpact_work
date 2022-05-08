package com.org.genp.day2;

import java.util.ArrayList;

class PersonMan{
	
	String name, address; 
	
	
	public PersonMan(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		
	}
	
	public void display() {
		System.out.println("Name: "+name+"\nAddress: "+address);
	}	
	
	public void displayPersonMan(ArrayList<PersonMan> PersonMan){
		
		for(PersonMan list: PersonMan) {
			System.out.println("name: "+list.name+" address: "+list.address);
		}
		
		
	}
}


class SBI{
	String bankname;
	ArrayList<PersonMan> man;
	
	
	public SBI(String bankname, ArrayList<PersonMan> man) {
		super();
		this.bankname = bankname;
		this.man = man;
	}
	
	
	public void displaySBIBank(ArrayList<PersonMan> peronman) {
		for(PersonMan list: peronman) {
			System.out.println("Bank Name: "+this.bankname);
			list.display();
			System.out.println("---------------------------------");
		}
	}
}


class AXIS{
	String bankname;
	ArrayList<PersonMan> man;
	
	
	public AXIS(String bankname, ArrayList<PersonMan> man) {
		super();
		this.bankname = bankname;
		this.man = man;
	}
	
	
	public void displayAXISBank(ArrayList<PersonMan> peronman) {
		for(PersonMan list: peronman) {
			System.out.println("Bank Name: "+this.bankname);
			list.display();
			System.out.println("---------------------------------");
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		PersonMan p2 = new PersonMan("Ashwini Ashish", "Patna");
		PersonMan p3 = new PersonMan("Mohan Raj", "Gaya");
		PersonMan p4 = new PersonMan("Abhishek Kumar", "Bhopal");
		
		ArrayList<PersonMan> PersonMan = new ArrayList<PersonMan>();
		PersonMan.add(p2);
		PersonMan.add(p3);
		PersonMan.add(p4);
		
		SBI sbi = new SBI("SBI", PersonMan);
		sbi.displaySBIBank(PersonMan);
		
		AXIS axis = new AXIS("AXIS", PersonMan);
		axis.displayAXISBank(PersonMan);
		

	}

}
