package com.org.genp.day18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");

		CustomerDao customerDao = (CustomerDao) context.getBean("CustomerDao");
		Customer customer = new Customer(4, "aaa", 28);
		
		customerDao.insert(customer);

		Customer customer1 = customerDao.findByCustomerId(1);
		System.out.println(customer1);
	}

}
