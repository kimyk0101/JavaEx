//11.25
package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	static final String dburl = "jdbc:mysql://localhost:3306/hrdb";
	static final String dbuser = "hrdb";		
	static final String dbpass = "hrdb";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			String sql = "SELECT " +
					"e.first_name, e.last_name, m.first_name " +
					"FROM employees e JOIN employees m " +
					"ON e.manager_id = m.employee_id " +
					"ORDER BY e.first_name";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String managerName = rs.getString(3);
				
				System.out.printf("%s, %s, %s%n", firstName, lastName, managerName);
			}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn !=null) conn.close();
		} catch (Exception e) {
			
		}
	}
	}
}
