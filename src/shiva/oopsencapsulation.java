package shiva;
import java.util.*;
public class oopsencapsulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String acc_no=sc.nextLine();
		Encapsulation ep=new Encapsulation();
		ep.setnum(acc_num);
		System.out.Println(acc_num);
		
		

	}

}
class Encapsulation
{
	private String acc_num;
	void setnum() {
		this.acc_num=acc_num;
	}
	String getnum() {
		for(int i=0;i<16;i++)
		if(i<12) {
			acc_no+='x';
			
		}
		else {
			return acc_no=temp.char(i);
		}
		return acc_no;
		
	}
}
