package PassParameter;

public class Parameter1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
Parameter1 obj1=new Parameter1();
d=obj1.add(100, 200);
System.out.println("Addition of no.is"+d);

}
 int add(int a, int b)
{
	 int c;
	c=a+b; 
	return c;
}
}
