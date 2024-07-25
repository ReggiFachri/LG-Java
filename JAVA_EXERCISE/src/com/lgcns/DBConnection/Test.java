package com.lgcns.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	String oracleURL = "jdbc:oracle:thin:@localhost:1521/xe";
	String mysqlURL = "jdbc:mysql:root@localhost:3306/humanresource";
	String username = "SYSTEM";
	String password = "root";
	
	public static void main (String[] args) {
		Test test = new Test();		
		
		try {
			Connection con = DriverManager.getConnection(test.oracleURL, test.username, test.password);
			//Connection conn = DriverManager.getConnection(test.mysqlURL);
			System.out.println(con.isClosed());
			System.out.println(con.getAutoCommit());
			
			con.setAutoCommit(false);
			System.out.println(con.getAutoCommit());
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM employee");
			
			while(rs.next()) {
				String empID = rs.getString(1);
				String empName = rs.getString(2);
				
				System.out.println(empID + ", " + empName);
			}
			
			rs.close();
			st.close(); // saat close connection akan terjadi commit
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
}
