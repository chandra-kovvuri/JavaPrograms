package script;

import java.util.Scanner;

class ReverseStringInt{
	public static void main(String[] agrs) {
		String str = "abcd";
		int i =str.length();
		char[] chr = new char[i];
		for (int j = 0,k=i-1;j<i;j++,k--) {
			chr[j]=str.charAt(k);
		}
		System.out.println("String before reverse is: "+str + ", String after reverse is: "+str.valueOf(chr) + " and length of String is:"+str.length());
		ReverseInt rInt = new ReverseInt();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int revInt= s.nextInt() ;
		System.out.println("Integer before reverse is: "+revInt +" and Integer after reverse is: "+rInt.reverseInt(revInt));
		
	}
	
}
class ReverseInt{
	protected int reverseInt(int i) {
		int j=0;
		while(i>0){
			j = j*10 + i%10;
			System.out.println("The value of j is  :" +j);
			i = i/10;
			System.out.println("The value of i is  :" +i);
		}
		return j;
	}
}
