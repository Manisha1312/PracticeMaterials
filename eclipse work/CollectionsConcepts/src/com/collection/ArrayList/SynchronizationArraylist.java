package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizationArraylist {

	public static void main(String[] args) {
		List<Integer> li = Collections.synchronizedList(new ArrayList<Integer>());
		
		li.add(22);
		li.add(56);
		li.add(88);
		li.add(90);
		li.add(90);
		li.add(90);
		
		
		synchronized(li){
			
			Iterator itr = li.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
				
				
				
			}
			
			System.out.println(li.size());
			
			
		}

	}

}
