package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(90);
		list.add(40);
		list.add(100);
		list.add(30);
		list.add(40);
		list.add(20);
		
		System.out.println("printing duplicates");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
		Set<Integer> s1 = new HashSet<>(list);
		System.out.println(s1);
	
		List<Integer> list2 = new ArrayList<>(s1);
		System.out.println("size:"+list2.size());
		
		for(Integer s: list2){
			System.out.println(s);
			
			
		}
		
		Collections.reverse(list2);
		System.out.println("after reverse of the list:"+list2);

	}

}
