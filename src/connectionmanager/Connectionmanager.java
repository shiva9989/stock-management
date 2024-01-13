package connectionmanager;
import java.sql.*;
public class Connectionmanager {
	Connection con = null;
	public Connection establishConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","root");
		return con;

	}
	public void closeConnection() throws SQLException {
		con.close();	}

}
