package com.org.genp.day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {

	 public static void main(String[] args) throws ClassNotFoundException {
		    Connection con = null;

		    String url = "jdbc:mysql://localhost:3306/testdb";
		    String username = "Ashwini";
		    String password = "Ashu@41298";

		    try {
		      Class.forName("com.mysql.jdbc.Driver");
		      con = DriverManager.getConnection(url, username, password);
		      Statement stmt=con.createStatement();
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Enter Employee Id:- ");
		      int empid=sc.nextInt();
		      System.out.println("Enter Employee Name:- ");
		      String name=sc.next();
		      System.out.println("Enter Employee Salary:- ");
		      int salary=sc.nextInt();
		      System.out.println("Enter Employee Address:- ");
		      String address=sc.next();
		      System.out.println("Enter Employee Email:- ");
		      String email=sc.next();
		      String insertQuery ="insert into Emp_info values ('"+empid+"','"+name+"','"+salary+"','"+address+"','"+email+"')";
		      int result=stmt.executeUpdate(insertQuery);
		      if(result==0) {
		    	  System.out.println("Record Inserted Failed");
		    	 
		      }else {
		    	  System.out.println(result+ " "+"Record Inserted ");
		    	  
		      }
		      
		      
		      
		      System.out.println("ID"+" "+"Name"+" "+"Salary"+" "+"Address"+" "+"Email");
		      
		      ResultSet rs=stmt.executeQuery("select * from Emp_info");
		      while(rs.next()) {
		      System.out.println(rs.getString(1)+" "+ rs.getString(2)+ " " +rs.getString(3) +" " +rs.getString(4)+" "+rs.getString(5));
		      }
		      } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		      }
		    }
		  
		}