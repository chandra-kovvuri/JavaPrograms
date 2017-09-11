package script;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class FibonacciSeries {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Chandra");
		a1.add("Vikranth");
		a1.add("Siddhu");
		a1.add("Bujji");
		
		ListIterator l =a1.listIterator();
		while(l.hasNext()){
			System.out.println("the values of arraylist is  "+l.next());
		}
		HashMap hm=new HashMap();
		hm.put("1", "Chandu");
		hm.put("2", "Siddu");
		hm.put("3", "tinku");
		hm.put("4", "Suji");
		
		int i,j,k;
		i=0;
		j=1;
		for (int a=1;a<=100;a++){
			
		k=i+j;
		i=j;
		j=k;
		if (k<500){
			System.out.print(","+k);
		}
		else{
			System.out.println("   " +(a+1));
			break;
		}
		
		}

	}

}
