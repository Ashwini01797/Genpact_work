package com.org.genp.day15;
import java.io.DataInputStream;
import java.net.*;

public class DemoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket s1=new ServerSocket(3333);
			Socket s=s1.accept();
			System.out.println("Server Started");
			System.out.println("waiting for client......");
			DataInputStream ds=new DataInputStream(s.getInputStream());
			String st =ds.readUTF();
			System.out.println("Data="+st);
			s1.close();
		}catch(Exception e) {
			
		}
		
		
		
	}

}
