package com.org.genp.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class FetchDb {
  public static void main(String[] args) throws ClassNotFoundException {
    Connection con = null;

    String url = "jdbc:mysql://localhost:3306/testdb";
    String username = "Ashwini";
    String password = "Ashu@41298";

    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url, username, password);

      System.out.println("Connected!!!");
      System.out.println("ID"+" "+"Name"+" "+"Salary"+" "+"Address"+" "+"Email");
      Statement stmt=con.createStatement();
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