package Contoller;
import java.sql.*;
import java.util.*;
import model.Login;
import model.Product;
import dao.LoginDAO;
import dao.ProductDao;
public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		int choice,a,product;
		String username;
		String password;
		Login l=new Login();
		LoginDAO ldao=new LoginDAO();
		Product p=new Product();
		ProductDao pdao=new ProductDao();
		do {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("***********************************************************************************************************************************");
			System.out.println("1.ADMIIN");
			System.out.println("2.AGENT");
			System.out.println("3.EXIT");
			choice=sc.nextInt();
			System.out.println("***********************************************************************************************************************************");

			switch(choice) {
			case 1:
				System.out.println("admin login");
				System.out.println("enter the username");
                username=sc.next();
				System.out.println("enter the password");
				password=sc.next();
				l.setusername(username);
				l.setpassword(password);
				if(ldao.LoginValidation(l))
				{
					do {
				 System.out.println("admin login successfull");
				 System.out.println("1.Add product\n2.Display product\n3.logout");
				 System.out.println("***********************************************************************************************************************************");
				 product = sc.nextInt();
				 switch(product) {
				 case 1:
					 System.out.println("Add product");
					 System.out.println("enter productid");
					 int productid=sc.nextInt();
					 
					 System.out.println("enter the product name");
					 String productname=sc.next();
					 System.out.println("enter the product minsale");
					 int minsale=sc.nextInt();
					 System.out.println("enter the price");
					 int price=sc.nextInt();
					 System.out.println("enter the quantity");
					 int quantity=sc.nextInt();
					 System.out.println("**************************************************************************");
					 p.setproductid(productid);
					 p.setproductname(productname);
					 p.setminsale(minsale);
					 p.setprice(price);
					 p.setquantity(quantity);
					 pdao.addProduct(p);
					 System.out.println("Product added successfully");
				 case 2:
					 System.out.println("Display product");	 
					 System.out.println("**************************************************************************");
					 System.out.println("product details are below");
					 pdao.display();
					 break;
				 }
					}while(product!=3);
				}
				else
					System.out.println("admin login is unsuccessfull");
				
				break;
			case 2:
				System.out.println("agent login");
				System.out.println("enter the username");
                username=sc.next();
				System.out.println("enter the password");
				password=sc.next();
				l.setusername(username);
				l.setpassword(password);
				if(ldao.LoginValidation(l))
				{
				 
				 do {
					 System.out.println("agent login successfull");
					 System.out.println("1.Display product\n2.logout");
					 System.out.println("***********************************************************************************************************************************");
					 a = sc.nextInt();
					 switch(a) {
					 case 1:
						 System.out.println("Display product");	 
						 System.out.println("**************************************************************************");
						 System.out.println("product details are below");
						 pdao.display();
						break;
					 
					 }
					 
				}while(a!=2);

				}
				else
					System.out.println("agent login is unsuccessfull");
				
				break;
			
			
			}
		}while(choice!=3);
	}
}





