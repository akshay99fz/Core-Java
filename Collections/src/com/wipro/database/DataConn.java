package com.wipro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConn {
	
	public static Connection getConn() throws SQLException, ClassNotFoundException {
		
		
		Connection con = null;
		try {
			String driverClassName = "sun.jdbc.odbc.JdbcOdbcDriver";
			String url = "jdbc:mysql://127.0.0.1:3306/ecommerce_record";
			String username = "root";
			String Pass = "Akshay123";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, username, Pass);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return con;
	}
}
