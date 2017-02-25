package script;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		int x[]={10,20,30,40};
		ArrayList al =new ArrayList();
		for (int i=0;i<x.length;i++){
			al.add(new Integer(x[i]));
			
		}
		Iterator it=al.iterator();
		while (it.hasNext()){
			System.out.println("Retreiving the items using Iterator interface  " +it.next()+"\t");
		}
		ListIterator lit=al.listIterator();
		while (lit.hasNext()){
			System.out.println("Retreiving the items using ListIterator interface   "+lit.next());
		}
		while(lit.hasPrevious()){
			System.out.println("The previous value of the arraylist is  :" +lit.previous());
		}
		
		

	}

}
