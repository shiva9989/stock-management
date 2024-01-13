package shiva;
interface  abstraction
{
	int a=1;
	abstract void display();
	
	
}
class child extends abstraction
{
	public void display() {
		System.out.println(a);
	}
}
public class abstractionclass {

	public static void main(String[] args) {

	}

}
