package shiva;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Stack<String> alist= new Stack<String>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			alist.push(sc.next());
		}
        System.out.println(alist);
		alist.pop();
        System.out.println(alist);
        System.out.println(alist.peek());

        sc.close();
	}

}
