package com.collection.oct;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List <Integer> li = new LinkedList<>();
		
		li.add(23);
		li.add(67);
		li.add(89);
		li.add(100);
		li.add(11);
		li.add(5);
		
		Collections.sort(li);
		System.out.println("Sorting in reverse order");
		Collections.sort(li,Collections.reverseOrder());
		
		
	Iterator itr  = li.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		
	}
	
		
	}

}
