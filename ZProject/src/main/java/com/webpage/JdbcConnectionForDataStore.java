package com.webpage;

import java.sql.*;

public class JdbcConnectionForDataStore {
	private String jdbcCon = "com.mysql.jdbc.Driver";
	private String jdbcurl = "jdbc:mysql://localhost:3306/blackworld";
	private String uname = "root";
	private String pass = "Mahi@1997";
protected Connection SendData() throws ClassNotFoundException {
	Connection con = null;
	Class.forName(jdbcCon);
	
	return con;
	}
public String data(DataForRegistration detail) throws ClassNotFoundException {
	Connection con = SendData();
	String result;
	try {
		PreparedStatement ps = con.prepareStatement("insert into registerdata values (?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, detail.getFirstname());
		ps.setString(2, detail.getLastname());
		ps.setString(3, detail.getFathername());
		ps.setNString(4, detail.getMothername());
		ps.setString(5, detail.getGender());
		ps.setString(6, detail.getDob());
		ps.setString(7, detail.getNumber());
		ps.setString(8, detail.getEmail());
		ps.setString(9, detail.getAdhar());
		ps.setString(10, detail.getPayment());
		ps.setString(11, detail.getPassword());
		ps.executeUpdate();
		result = "Registration Succesful";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result = "Registration not Successfully Completed";
	}
	return result;
	
}
}
