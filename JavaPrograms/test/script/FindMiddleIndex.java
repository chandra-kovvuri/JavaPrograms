package script;

public class FindMiddleIndex {
	
	public static void main(String args[])throws Exception{
		int array []={1,4,4,5,6};
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < array.length; i++) {
		    if(i <= array.length/2){
		        sum1 += sum1 + array[i];
		        System.out.println("The sum2 value is  "+sum1);
		    }else{
		        sum2 += sum2 + array[i];
		        System.out.println("The sum2 value is  "+sum2);
		}

		if(sum1 == sum2) 
		    System.out.println("They are equal");
	}

}

}