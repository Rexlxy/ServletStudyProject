package com.java1234.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbUtil {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/mydb";
	private String dbUsername = "root";
	private String dbPassword = "l1x2y3456";
	private String jdbcName = "com.mysql.jdbc.Driver";
	
	public Connection getConnection() throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		return con;
	}
	
	public void closeConnection(Connection con)throws Exception{
		if( con!= null){
			con.close();
		}
	}
	
	public static void main(String[] args){
		DbUtil util = new DbUtil();
		try {
			util.getConnection();
			System.out.println("Successfully Connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
