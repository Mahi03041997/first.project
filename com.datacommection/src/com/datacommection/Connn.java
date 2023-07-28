package com.datacommection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connn {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = null;
Statement st = null;
ResultSet rs = null;
try {
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/career","root","Mahi@1997");
	st = con.createStatement();
	rs = st.executeQuery("select * from student ");
	while(true) {
		if(!rs.next()) break;
			System.out.println(rs.getString("Email"));
		
	}
	con.close();
	
}catch(Exception e) {
	System.out.println(e);
}
	}

}
