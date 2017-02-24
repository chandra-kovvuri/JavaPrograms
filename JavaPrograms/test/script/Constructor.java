package script;

public class Constructor {
	int i =0;
	String s="Chandra";
	Constructor c1;
	
	
	Constructor(){
		System.out.println("in constructor not created the object");
	}
	static{
		System.out.println("In static block");
		
	}
	static int staticMethod(){
		System.out.println("in static method");
		int k=0;
		return k;
	
	}
	Constructor(int j,String ss){
		this.i=j;
		this.s=ss;
		
	}
	static void methodOverloading(int a,int b){
		System.out.println("Method overloading");
		
	}
	static void methodOverloading(double c, int b){
		
	}
	final void finalMethodOverloading(int a,int b){
		
	}
    final void finalMethodOverloading(double a,int b){
		
	}
	
	public static void main(String args[])throws Exception{
		Constructor c=new Constructor();
		//c.staticMethod();
		Constructor c1=new Constructor(10,"Chandra");
		System.out.println("The value of i is    "+c1.i);
		System.out.println("the value of s is    "+c1.s);
		int r=Constructor.staticMethod();
		System.out.println("The return value of r is    " +r);
	
	}
	

}
