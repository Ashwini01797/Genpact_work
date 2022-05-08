package com.org.genp.day17;

import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee {
	@Override
	public void doWork() {
		
		System.out.println("Manage the branch and office");
	}

}
