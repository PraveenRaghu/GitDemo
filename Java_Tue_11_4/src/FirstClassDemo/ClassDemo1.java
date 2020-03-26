package FirstClassDemo;

public class ClassDemo1 {

	/**
	 * @param args
	 */
	int x=100;
	int y=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassDemo1 obj1= new ClassDemo1();
System.out.println("Program Started");
obj1.sum();
System.out.println("Program Ends");
System.out.println("The Value of x in class is: "+obj1.x);
System.out.println("The Value of y in class is: "+obj1.y);	}
public void sum()
{
	int y=20;
	int x=10;
	int z=x+y;
	System.out.println("Addition of two no's"+z);
}
}
