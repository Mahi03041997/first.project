package com.datacommection;

import java.sql.*;

public class JdbcSeee {
public static void main(String[] args) throws ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/career","root","Mahi@1997");
		st = con.createStatement();
		rs = st.executeQuery("select * from student");
		while(true) {
			if(!rs.next()) break;
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		con.close();
	}catch (Exception e) {
		System.out.println(e);
	}
}
	

}
