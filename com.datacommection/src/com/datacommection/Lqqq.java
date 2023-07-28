package com.datacommection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lqqq {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.jdbc.Driver");
Connection con = null;
Statement st = null;
ResultSet rs = null;
try {
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ college", "root", "Mahi@1997");
	st = con.createStatement();
	rs = st.executeQuery("select * from Adress" );
	while(true) {
		if(!rs.next()) break;
		System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getNString(3)+" "+rs.getInt(4));
	}
	con.close();
}catch(Exception e) {
	System.out.println(e);
}
	}
}
