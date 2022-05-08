package com.org.genp.day3;
abstract class motorBike{
	
	String color;
	int model;
	
	public motorBike(String color, int model) {
		super();
		this.color = color;
		this.model = model;
	}
	
	abstract public void speed(int speed);
	abstract public void breaks(String breaks);
	abstract public void gear(int gears);
	
	public void bikeCompanyName(String companyname) {
		System.out.println("The Company Name: "+companyname);
	}
}


class SportsBike extends motorBike{

	public SportsBike(String color, int model) {
		super(color, model);
		
	}

	@Override
	public void speed(int speed) {
		System.out.println("The Sports Bike At Speed:- "+speed);
		
	}

	@Override
	public void breaks(String breaks) {
		System.out.println("The Sports Bike Breaks Through:- "+breaks);
		
	}

	@Override
	public void gear(int gears) {
		System.out.println("The Sports Bike At Gear:- "+gears);
		
	}
	
}



class MountainBike extends motorBike{

	public MountainBike(String color, int model) {
		super(color, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speed(int speed) {
		System.out.println("The Sports Bike At Speed:- "+speed);
		
	}

	@Override
	public void breaks(String breaks) {
		System.out.println("The Sports Bike Breaks Through:- "+breaks);
		
	}

	@Override
	public void gear(int gears) {
		System.out.println("The Sports Bike At Gear:- "+gears);
		
	}
	
}



class Waterbike extends motorBike{

	public Waterbike(String color, int model) {
		super(color, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speed(int speed) {
		System.out.println("The Sports Bike At Speed: "+speed);
		
	}

	@Override
	public void breaks(String breaks) {
		System.out.println("The Sports Bike Breaks Through:- "+breaks);
		
	}

	@Override
	public void gear(int gears) {
		System.out.println("The Sports Bike At Gear:- "+gears);
		
	}	
}


public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------");
		SportsBike sb = new SportsBike("Red", 2012);
		sb.speed(100);
		sb.breaks("Right Brake");
		sb.gear(6);
		sb.bikeCompanyName("Honda");
		
		
		System.out.println("-------------------------");
		MountainBike mb = new MountainBike("Blue", 2022);
		mb.speed(80);
		mb.breaks("Left Brake");
		mb.gear(6);
		mb.bikeCompanyName("Ninja");
		
		System.out.println("-------------------------");
		Waterbike wb = new Waterbike("Green", 2020);
		wb.speed(20);
		wb.breaks("Right Brake");
		wb.gear(6);
		wb.bikeCompanyName("Water Land");
		
		
		
	}

}
