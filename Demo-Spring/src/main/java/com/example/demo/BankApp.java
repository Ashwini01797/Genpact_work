package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Manager m1 =app.getBean(Manager.class);
		m1.dowork();
		Accountant ac= app.getBean(Accountant.class);
		ac.dowork();
		app.close();
	}

}
