package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.junit.Test;

public class storingData {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getAndStoreData() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id,name,country_code from ohrm_location");

		List<Map<String, String>> listOfData = new ArrayList<>();
		 Map<String , String> mapData = new LinkedHashMap<>();;
		 
		  while(rs.next()) {
			  //mapData = new LinkedHashMap<>();
			  mapData.put("Location id", rs.getObject("id").toString());
			  mapData.put("Office name", rs.getObject("name").toString());
			  mapData.put("Country code", rs.getObject("country_code").toString());
			  listOfData.add(mapData);
			  
		  }
		   System.out.println(listOfData);
		

	}

}
