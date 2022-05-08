package com.org.genp.day8;

public class MyThreads extends Thread{

	String task;
	
	public MyThreads(String task) {
		super();
		this.task = task;
	}
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Task "+i);
			try {
				Thread.sleep(1500);
				}catch(Exception e){
					
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreads m1= new MyThreads("Cut the Ticket");
		MyThreads m2= new MyThreads("Show The Seat Number");
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		m1.start();
		m2.start();
		
		
		
	}

}
