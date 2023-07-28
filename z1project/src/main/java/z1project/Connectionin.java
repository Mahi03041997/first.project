package z1project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class Connectionin {
protected Connection name() throws ClassNotFoundException {
	Connection con = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Datareg","root","Mahi@1997");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
public int Register(Encap en) throws ClassNotFoundException {
	Connection con = name();
	int result = 0;
	try {
		PreparedStatement ps= con.prepareStatement("insert into data values(?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, en.getFirstname());
		ps.setString(2, en.getLastname());
		ps.setString(3, en.getFathername());
		ps.setString(4, en.getMothername());
		ps.setString(5, en.getGender());
		ps.setString(6, en.getDob());
		ps.setString(7, en.getNumber());
		ps.setString(8, en.getEmail());
		ps.setString(9, en.getAdhar());
		ps.setString(10, en.getAdress());
		ps.setString(11, en.getPassword());
		ps.setString(12, en.getPayment());
		result = ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
	
}
public boolean validate(Encap een ) throws ClassNotFoundException {
	boolean status = false;
	Connection con = name();
	try {
		PreparedStatement ps = con.prepareStatement("select*from data where Email = ? and pasword = ?");
		ps.setString(1, een.getEmail());
		ps.setString(2, een.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
	
}
public boolean get(Encap ee) throws ClassNotFoundException {
	boolean status = false;
	Connection con = name();
	try {
		PreparedStatement ps = con.prepareStatement("select * from data");
		ps.setString(1, ee.getFirstname());
		ps.setString(2, ee.getLastname());
		ps.setString(3, ee.getFathername());
		ps.setString(4, ee.getMothername());
		ps.setString(5, ee.getGender());
		ps.setString(6, ee.getDob());
		ps.setString(7, ee.getNumber());
		ps.setString(8, ee.getEmail());
		ps.setString(9, ee.getAdhar());
		ps.setString(10, ee.getAdress());
		ps.setString(11, ee.getPassword());
		ps.setString(12, ee.getPayment());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
	
}

}
