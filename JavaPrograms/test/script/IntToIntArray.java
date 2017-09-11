package script;

public class IntToIntArray {

	public static void main(String[] args) {
		int number = 125678;
		int arr[]=new int[6];
		int y=0;
		do { 
			arr[y] = number % 10; 
			number /= 10; 
			y++; 
			} while (number != 0); 
      for(int i=0;i<arr.length;i++){
	     System.out.println(+arr[i]);
	}

}
}
