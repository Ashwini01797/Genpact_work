package com.org.genp.day17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
  //  System.out.println("Hello World!");
    
   // ClassPathXmlApplicationContext con =new ClassPathXmlApplicationContext("appCon.xml");
    ApplicationContext applicat=new ClassPathXmlApplicationContext("appCon.xml");
   // HelloWorldService obj=con.getBean(HelloWorldService.class);
   // obj.sayHello();
    EmpInfo emp =(EmpInfo) applicat.getBean("bean2");
    System.out.println(emp);
    
  }
}
