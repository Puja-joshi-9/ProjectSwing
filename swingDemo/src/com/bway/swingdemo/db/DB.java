package com.bway.swingdemo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	
	public static Connection getDb() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb" ,"root", "");
			
		} catch (Exception e) {
			
			e.printStackTrace();               //system.out.println(e);
		}
		
		return null;
	}

}
