package shiva;

import java.util.Scanner;
import java.util.*;

public class csk {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> alist=new ArrayList<Integer>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			alist.add(sc.nextInt());
		}
        int total_runs=0;
        for(int i=0;i<n;i++) {
        	total_runs+=alist.get(i);
        }
        float average=total_runs/n;
        System.out.println(total_runs);
        System.out.println(average);

sc.close();
	}

}
