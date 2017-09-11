package script;

import java.text.SimpleDateFormat;
import java.util.Date;

class ArrayDescding{  
	public static void main(String args[]){ 
		Date d =new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
		Primenumber p=new Primenumber();
		p.sampleMethod();
		System.out.println(sdf.format(d));
		int a[]={1,3,4,5,33,2,3,2};   
        for(int i=0;i<a.length-1;i++){
        	for (int j=i+1;j<a.length;j++){
        		if (a[i]<a[j]){
        			int temp = a[i];
        			a[i]=a[j];
        			a[j]=temp;
			
		        }
		
	       }
	
	
      }
      for (int k=0;k<a.length;k++){
    	  System.out.print("  " +a[k]);
    	  }
	}
	
}
	

  
