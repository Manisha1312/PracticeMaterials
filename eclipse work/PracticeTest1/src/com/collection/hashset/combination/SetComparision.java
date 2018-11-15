package com.collection.hashset.combination;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetComparision {

	public static void main(String[] args) {
		
		// created three sets 
		
		HashSet <String> h1 = new HashSet<String>();
		LinkedHashSet <String> l1 = new LinkedHashSet<String>();
		TreeSet <String>  t1 = new TreeSet<String>();
		
		
		// adding elements in sets
		for(String fruits : Arrays.asList("mango", "apple", "banana")){
			
			h1.add(fruits);
			l1.add(fruits);
			t1.add(fruits);
			
		}
		 System.out.println("Ordering in HashSet :" + h1);
		 System.out.println("Order of objects in LinkedHashSet :" + l1);
		 System.out.println("Order of objects in TreeSet :" + t1);

	}

}
