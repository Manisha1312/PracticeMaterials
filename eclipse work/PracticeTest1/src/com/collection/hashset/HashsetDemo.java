package com.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetDemo {

	public static void main(String[] args) {
		
		// creating a hashset
		
		HashSet <String> set = new HashSet<String>();
		
		// ading elements
		
		set.add("manisha");
		set.add("ankita");
		set.add("rahul");
		set.add("ranbir");
		set.add("manisha"); // dublicate elemetns wont be aded
		 
		
		
		Iterator  itr = set.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
		
		
	

	}

}
