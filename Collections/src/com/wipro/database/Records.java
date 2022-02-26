package com.wipro.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Records {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection connection = DataConn.getConn();
		Statement st = connection.createStatement();
		String query = "SELECT * FROM ITEMS";
		ResultSet count = st.executeQuery(query);
		System.out.println(count);
		ResultSetMetaData rsmd = count.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (count.next()) {
		    for (int i = 1; i <= columnsNumber; i++) {
		        if (i > 1) System.out.print(",  ");
		        String columnValue = count.getString(i);
		        System.out.print(columnValue + " " + rsmd.getColumnName(i));
		    }
		    System.out.println("");
		}
	}

}
