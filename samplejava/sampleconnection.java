package samplejava;
import java.sql.*;
public class sampleconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva","root","root");
		if(con!=null)
			System.out.println("Connection is Successfull");
		else
			System.out.println("Connection failed");
		
	}

}
