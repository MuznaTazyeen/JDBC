package com.tnsif.JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("driver loaded");
		
		//Get connection
		Connection con = DriverManager.getConnection("jdbc:postgresql:"
				+ "//localhost:5432/TNSIF", "postgres", "Muzna");
		
		System.out.println("Connection established");
		
		//create statement
		Statement stmt = con.createStatement();
		
		//write the query
		String sql = "select * FROM stud";
		
		//read the data
		ResultSet rs = stmt.executeQuery(sql);
		
		//traverse through the table
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
		}
		
		//close statement
		stmt.close();
		
		//close connection
		con.close();
		
		
		
		
	}

}
