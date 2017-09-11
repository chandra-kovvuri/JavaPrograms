
public class StringReverse {

	public static void main(String[] args) {
		String actual ="Chandra";
		char []reversestr=actual.toCharArray();
		int left=0;
		int right=reversestr.length-1;
		for (left=0;left<right;left++,right--){
			char temp=reversestr[left];
			reversestr[left]=reversestr[right];
			reversestr[right]=temp;
			
		}
		for (int i=0;i<reversestr.length;i++){
			System.out.println("Reverse string is  "+reversestr[i]);
			
		}

	}

}
