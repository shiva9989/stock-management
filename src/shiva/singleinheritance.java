package shiva;
import java.util.*;
class grandparent
{
	int balance=20000;
	void displaygrandparent(){
		System.out.println(balance);
	}

}
class parent extends grandparent
{   int balance1=balance/2;
	
	void displayparent()
	{
		System.out.println(balance1);
	}
}
class child extends grandparent
{
	
	int balance2=balance/2;
	void displaychild() {
		System.out.println(balance2);
	}
	
}
public class singleinheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        child c=new child();
        parent p=new parent();
        c.displaygrandparent();
        int amt;
        for(int i=0;i<2;i++)
        {
        	amt=sc.nextInt();
        	p.balance1=p.balance1-amt;
        }
        p.displayparent();
        for(int i=0;i<2;i++)
        {
        	amt=sc.nextInt();
        	c.balance2=c.balance2-amt;
        }
        c.displaychild();

        if(p.balance1>c.balance2)
    		System.out.println("parent is rich");
        else
    		System.out.println("child is rich");


        sc.close();
	}

}
