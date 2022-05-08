package com.org.genp.day17;
import org.springframework.stereotype.Component;
@Component
public class Accountant implements Employee {
	@Override
	public void doWork() {
		
		System.out.println("Auditing Accounts.......");
	}


}
