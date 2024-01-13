package shiva;

import java.util.Scanner;
import java.util.*;

public class player {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		TreeSet<String> ts=new TreeSet<String>();
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++)
		{
			
			ts.add(sc.nextLine());
			
		}
		
		System.out.print(ts);
		sc.close();
	}

}
