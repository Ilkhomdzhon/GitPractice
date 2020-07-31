package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Task {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
//jdbc: driver type:hostname:port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void listTask() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employees");

		List<String> jobTitles = new ArrayList<>();

		while (rs.next()) {
			jobTitles.add(rs.getObject("job_title").toString());
			
		}
		System.out.println(jobTitles);
		
		for (String string : jobTitles) {
			System.out.println(string);
			
		}
		
		
	}
}