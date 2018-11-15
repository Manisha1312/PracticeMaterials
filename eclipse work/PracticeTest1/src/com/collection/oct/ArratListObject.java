package com.collection.oct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArratListObject {

	public static void main(String[] args) {
		
		List<BookD> lis =  new ArrayList<>();
		BookD b1 = new BookD(1,"manisha",89.00F,"ranbir");
		BookD b2 = new BookD(2,"mani",109.00F,"ranbir");
		
		lis.add(b1);
		lis.add(b2);
		lis.add(new BookD(3,"arpita",109.00F,"ranbir"));
		lis.add(new BookD(4,"nimmmi",109.00F,"ranbir"));
		lis.add(new BookD(9,"simar",109.00F,"ranbir"));
		lis.add(new BookD(7,"mou",109.00F,"ranbir"));
		lis.add(new BookD(6,"sayani",109.00F,"ranbir"));
		lis.add(new BookD(7,"priyanka",109.00F,"ranbir"));
		
		
		// traverse
		Iterator<BookD> itr = lis.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			itr.remove();
			
			System.out.println("the list after removal"+itr.next());
			
			
		}
		
	}
	
	

}
