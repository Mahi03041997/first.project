import java.sql.*;

public class DataConnection {
	String jdbcdriver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/MRegistration";
	String uname = "root";
	String pass = "Mahi@1997";
public Connection Installing() throws Exception {
	Class.forName(jdbcdriver);
	Connection con = null;
	con = DriverManager.getConnection(url, uname, pass);
	return con;
	}
public String Insert(Details detail) {
	String result;
	try {
		Connection con = Installing();
		String insertion = "insert into Regdata values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertion);
		ps.setString(1, detail.getFirstname());
		ps.setString(2, detail.getLastname());
		ps.setString(3, detail.getFathername());
		ps.setString(4, detail.getMothername());
		ps.setString(5, detail.getGender());
		ps.setString(6, detail.getDob());
		ps.setString(7, detail.getEduclass());
		ps.setString(8, detail.getNumber());
		ps.setString(9, detail.getEmail());
		ps.setString(10, detail.getPaymentOption());
		ps.executeUpdate();
		result = "Registration Done Succesfully";
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result = "Registration Not Completed";
	}
	return result;
	
}
}
