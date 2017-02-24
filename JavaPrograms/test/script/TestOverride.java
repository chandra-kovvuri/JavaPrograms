package script;

 class TestOverride1 {
	 int z=10;
	final void methodOverriding(int a, int b){
		System.out.println("Overriding final method");
	}
	
	void methodOverriding(double a,char c){
		
		System.out.println("printing a and b value from supper class  "+a+" "+c);
	}
	TestOverride1(){
		System.out.println("In super class constructor");
	}

}
 class Override extends TestOverride1{
	 int z=20;
	 void methodOverriding(double a,char c){
		 
		 System.out.println("printing a and b value from child class  "+a+" "+c);
			
	 }
	 Override(){
		 System.out.println("In child class constructor");
	 }
	 
 }
 
 class TestOverride {
	 public static void main(String args[]){
		 Override or = new Override();
		 //or.methodOverriding(450.67, 'c');
		 //TestOverride1.methodOverriding(230.5,'c');
		 TestOverride1 to;
		 to=new Override();
		 to.methodOverriding(450.67, 'c');
		 TestOverride1 t1;
		 t1=or;
		 t1.methodOverriding(450.67, 'c');
		 System.out.println("value of z is  " +t1.z);
		 System.out.println("value of z is  " +or.z);
			 
	 }
 }
