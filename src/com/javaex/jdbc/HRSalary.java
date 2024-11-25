//11.25
package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSalary {

	static final String dburl = "jdbc:mysql://localhost:3306/hrdb";
	static final String dbuser = "hrdb";		
	static final String dbpass = "hrdb";
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			System.out.print("검색어 입력:");
			String salary = scanner.next();
			
			String sql = "SELECT MIN(salary), MAX(salary), employee_id " + 
					"FROM employees GROUP BY employee_id, salary " +
					"HAVING salary >= (SELECT MIN(salary) FROM employees) " +
					"AND salary <= (SELECT MAX(salary) FROM employees)ORDER BY salary"; 
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s, %s, %s%n", 
						rs.getString(1), 
						rs.getString(2), 
						rs.getString(3)); 
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		scanner.close();

	}

}
