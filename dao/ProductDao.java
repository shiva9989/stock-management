package dao;
import java.sql.*;

import model.*;
import connectionmanager.*;

public class ProductDao {
	public void addProduct(Product p) throws ClassNotFoundException, SQLException {
	int productid = p.getproductid();
	String productname=p.getproductname();
	int minsale=p.getminsale();
	int price =p.getprice();
	int quantity=p.getquantity();
	Connectionmanager conm=new Connectionmanager();
	Connection con=conm.establishConnection();
	String query ="insert into product values (?,?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(query);
	ps.setInt(1,productid);
	ps.setString(2,productname);
	ps.setInt(3,minsale);
	ps.setInt(4,price);
	ps.setInt(5,quantity);
	ps.executeUpdate();
	con.close();
	
	}
	public void display() throws ClassNotFoundException, SQLException {
		Connectionmanager conm=new Connectionmanager();
		Connection con=conm.establishConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from product");
		while(rs.next()) {
			System.out.println(rs.getInt("productid")+" | "+rs.getString("productname")+" | "+rs.getInt("minsale")+" | "+rs.getInt("price")+" | "+rs.getInt("quantity"));                                                    
		}
	}
	

}
