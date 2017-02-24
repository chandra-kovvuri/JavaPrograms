package script;

public class StaticDemo {
	int y;
	static int x;
	public void StaticInt(){
		x=x+1;
		y=y+1;
	}
	public void showValue(){
		System.out.println("The value of x is  "+x);
		System.out.println("The value of y is  "+y);
	}
	public static void main(String args[])throws Exception{
		StaticDemo s = new StaticDemo();
		StaticDemo s1 = new StaticDemo();
		s.StaticInt();
		s.showValue();
		System.out.println("For second object");
		s1.StaticInt();
		s1.showValue();
	}

}
