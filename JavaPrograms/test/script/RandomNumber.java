package script;

	import java.util.Random;
	public class RandomNumber {

	 /**
	  * @Website: www.instanceofjava.com
	  * @category: how to generate random numbers in java within range
	  */
	 public static void main(String[] args) {
	  
	  Random randomNumGenerator = new Random();
	 
	           for (int idx = 1; idx <= 10; ++idx){
	              int randomInt = randomNumGenerator.nextInt(100);
	              System.out.println("Random Number= "+randomInt);
	 
	} 
	           //Changing string to char array
	           String ss ="Sekhar";
	           char arr[]=ss.toCharArray();
	           for (int i=0;i<arr.length;i++){
	        	   System.out.println(arr[i]);
	           }
	           //Changing char arry to String
	           char arr1[]={'c','h','a','n','d','r','a'};
	           String s= new String (arr1);
	           System.out.println(s);
	           
	           //changing string to int
	           String sn="5";
	           int i= Integer.parseInt(sn);
	           System.out.println(i);
	           //Changing into string
	           int m=10456;
	           String sss="";
	           sss= String.valueOf(m);
	           System.out.println(sss);
	           System.out.println(sss.substring(1,5));
	           

	 }
	           
	          

	}


