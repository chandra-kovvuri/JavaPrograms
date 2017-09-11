package script;

public class InheritanceClass extends ArraySorting {
	
	InheritanceClass(int c) {
		super(c);
		// TODO Auto-generated constructor stub
		System.out.println("In subclass constructor");
	}

	public static void main(String args[]) throws Exception{
		
		InheritanceClass in= new InheritanceClass(100);
		System.out.println("The value of b is  " +in.c);
		
	}

}
