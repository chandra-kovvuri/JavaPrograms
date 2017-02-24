package script;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		boolean prime =true;
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
		Date d = new Date();
		int i;
		String start =sdf.format(d);
		for (i=2;i<a;i++){
			for (int j=2;j<i;j++){
				if (i%j==0){
					prime=false;
					break;
				}
				
			}
			
		
			if (prime){
				System.out.println(i+" is a prime number");
			}
			/*else{
				System.out.println(j+"is not prime number");
				
			}*/
			prime =true;
		}
		System.out.println(start);
		SimpleDateFormat sdf1 = new SimpleDateFormat("ddMMyyyy hhmmss");
		Date d1 = new Date();
		System.out.println(sdf1.format(d1));
		
	}

}
