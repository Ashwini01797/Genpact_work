package com.org.genp.day11;
import java.sql.Connection;
import java.sql.DriverManager;
// Global connection Class
public class DbConnection {
	static Connection con; // Global Connection Object
	public static Connection getConnection()
	{
		try {
			
			
			String mysqlJDBCDriver
				= "com.mysql.cj.jdbc.Driver"; //jdbc driver
			String url
				= "jdbc:mysql://localhost:3306/bank"; //mysql url
			String user = "Ashwini";	 //mysql username
			String pass = "Ashu@41298"; //mysql passcode
			Class.forName(mysqlJDBCDriver);
			con = DriverManager.getConnection(url, user,
											pass);
		}
		catch (Exception e) {
			System.out.println("Connection Failed!");
		}

		return con;
	}
}
