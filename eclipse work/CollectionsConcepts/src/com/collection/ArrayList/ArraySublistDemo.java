package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraySublistDemo {

	public static void main(String[] args) {
		
		
		List<String> li = new ArrayList<>();
		
		li.add("manisha");
		li.add("ahmad");
		li.add("namrata");
		li.add("priyanka");
		li.add("moumita");
		li.add("mona");
		
		
		List<String> l2 = new ArrayList<>(li.subList(0, 2));
		Iterator itr = l2.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
		

	}

}
