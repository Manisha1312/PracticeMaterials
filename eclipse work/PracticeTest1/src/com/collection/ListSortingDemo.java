package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSortingDemo {

	public static void main(String[] args) {
		
		List <String> al = new ArrayList<String>();
		
		List<Integer>a2 = new ArrayList<Integer>();
		
		al.add("manisha");
		al.add("arpita");
		al.add("ardhendu");
		al.add("archana");
		
		a2.add(100);
		a2.add(800);
		a2.add(300);
		a2.add(700);
		
	//	System.out.println("The required list before sorting"+" "+al);
		System.out.println("The required list before sorting"+" "+a2);
		
		// sorting
		
		Collections.sort(al);  
		Collections.sort(a2);
		System.out.println("The required list before sorting"+" "+a2);
		
//	Iterator itr = al.iterator();
//	
//	System.out.println("The rquired list after sorting");
//	
//	while(itr.hasNext()){
//		
//		System.out.println(itr.next());
//		
//		
//	}
	
		

	}

}
