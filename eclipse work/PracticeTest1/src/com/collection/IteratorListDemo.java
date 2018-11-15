package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin");  
		al.add(2,"manisha");
		al.add(3,"rahul");
		System.out.println("element at 2nd position: "+al.get(2)); 
		

		
		
		ListIterator <String> itr = al.listIterator(); // ListIterao iterface
		
		System.out.println("traversing elements in forward direction..."); 
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("traversing elements in backward direction...");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());  
			
		}
		
		
		

	}

}
