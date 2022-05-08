package com.org.genp.day15;

import java.io.DataOutputStream;
import java.net.Socket;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket so=new Socket("localhost",3333);
			System.out.println("Connected");
			DataOutputStream dout=new DataOutputStream(so.getOutputStream());
			dout.writeUTF("Server Responding");
			dout.close();
		}catch(Exception e) {
			
		}

	}

}
