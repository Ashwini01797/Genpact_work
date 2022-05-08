package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee {
	@Override
	public void dowork() {
		
		System.out.println("Manage the branch and office");
	}

}