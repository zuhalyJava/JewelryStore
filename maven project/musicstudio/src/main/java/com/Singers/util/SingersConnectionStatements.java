package com.Singers.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingersConnectionStatements {
	
	
	
	public static Connection createConnection() {
		
		
		Connection ConnectionVar = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
						
								
														//mysql url								username/ password
			ConnectionVar=DriverManager.getConnection("jdbc:mysql://localhost:3306/singers", "root", "12345");
		
		System.out.println("connection successfull");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		 catch (SQLException e) {
			 
			 System.out.println(e.getMessage());
			 
		 }
			 
			 return ConnectionVar;
		
		 }

	public  static void closeConnection(Connection connection) {
		try {
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
		
		 

	
