package EarlyPoly;

public class PolyDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolyDemo1 Obj1=new PolyDemo1();
Obj1.add(10, 20);
Obj1.add(10, 20, 30);
Obj1.add(10.23, 40.5, 40);

	}
public void add(int a ,int b){
	int c=a+b;
	System.out.println("The sum is" +c);
}
public void add(int a ,int b, int d){
	int c=a+b+d;
	System.out.println("The sum is" +c);
}
public void add(double a ,int b, int d){
	double c=a+b+d;
	System.out.println("The sum is" +c);
}
}