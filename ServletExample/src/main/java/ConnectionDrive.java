import java.sql.*;

public class ConnectionDrive {
	public Connection intilizeConnection() throws ClassNotFoundException {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "Mahi@1997");

			return con;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;

	}

	public String insert(Details details) throws ClassNotFoundException {
		Connection con = intilizeConnection();
		String result = "data entered succesfully";
		String sql = "insert into student values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, details.getFirstName());
			ps.setString(2, details.getLastName());
			ps.setString(3, details.getGender());
			ps.setString(4, details.getAdress());
			ps.setString(5, details.getMobileNumber());
			ps.setString(6, details.getQualification());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = "not entered";
		}
		return result;

	}
}
