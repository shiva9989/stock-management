package shiva;

import java.util.*;
import java.util.Scanner;

public class teamrankings {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Stack<String> alist=new Stack<String>();
		
		for(int i=0;i<4;i++)
		{
			alist.add(sc.next());
		}
		int n=sc.nextInt();
		System.out.println(alist.get(n-1));

	}

}
