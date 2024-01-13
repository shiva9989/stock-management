package dao;
import java.sql.*;
import model.Login;
import connectionmanager.Connectionmanager;
public class LoginDAO {
	public boolean LoginValidation(Login l) throws ClassNotFoundException, SQLException
	{
		String username=l.getusername();
		String password=l.getpassword();
		Connectionmanager conm=new Connectionmanager();
		Connection con=conm.establishConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from login");
		while(rs.next()) {
			if(username.equals(rs.getString("username"))&&password.equals(rs.getString("password"))) {
				conm.closeConnection();
				return true;
			}
		}
		return false;
		
	}

}
