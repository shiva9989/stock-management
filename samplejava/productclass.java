package samplejava;
import java.util.*;
public class productclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice,a,product;
		String username;
		String password;
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
				if(username.equals("admin")&&password.equals("Admin@123"))
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
					 System.out.println("Product added successfully");
				 
				 }
					}while(product!=3);
				}
				else
					System.out.println("admin login is unsuccessfull");
				
				break;
			case 2:
				System.out.println("agent login");
				System.out.println("admin login");
				System.out.println("enter the username");
                username=sc.next();
				System.out.println("enter the password");
				password=sc.next();
				if(username.equals("admin")&&password.equals("admin@123"))
				{
				 
				 do {
					 System.out.println("agent login successfull");
					 System.out.println("1.Display product\n2.logout");
					 System.out.println("***********************************************************************************************************************************");
					 product = sc.nextInt();
					 switch(product) {
					 case 1:
						 System.out.println("Display product");	 
						 System.out.println("**************************************************************************");
						 System.out.println("product details are below");
						break;
					 
					 }
					 
						}while(product!=2);

				}
				else
					System.out.println("agent login is unsuccessfull");
				
				break;
			
			
			}
		}while(choice!=3);
	}
}
