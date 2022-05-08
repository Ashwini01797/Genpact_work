package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class Accountant implements Employee {
	@Override
	public void dowork() {
		
		System.out.println("Auditing Accounts.......");
	}


}