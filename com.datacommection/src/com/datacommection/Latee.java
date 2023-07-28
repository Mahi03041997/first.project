package com.datacommection;

import java.sql.*;
public class Latee {
	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = null;
Statement st = null;
ResultSet rs = null;

try {
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Mahi@1997");
	st = con.createStatement();
	rs = st.executeQuery("select * from faculty");
//	   rrs =  st.executeQuery("select * from Adress");
	while(true) {
		if(!rs.next()) break;
		System.out.println(rs.getInt(1)+" "+rs.getNString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
	}
	con.close();
	
}catch(Exception e) {
	System.out.println(e.getMessage());
}
	}

}
