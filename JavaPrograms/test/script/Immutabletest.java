package script;

 final class Immutabletest{  
	 final int speedlimit;//final variable  
	 final static int test;
	 Immutabletest(int speed){
		 this.speedlimit=speed; 
	 	 
	 }
	 static{
		 test =10;
	 }
	 void run(){  
	    
	 }  
	 public static void main(String args[]){  
		 Immutabletest obj=new  Immutabletest(400);  
	 obj.run();  
	 }  
	}//end of class  
