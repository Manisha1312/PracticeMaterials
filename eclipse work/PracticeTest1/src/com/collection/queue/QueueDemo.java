package com.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue <String> queue = new PriorityQueue<String>();
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		
		System.out.println("first operation:" + queue.element()); // it will retrieve first element
		System.out.println("second operation" + queue.peek());
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		System.out.println("third operation"+ queue.remove());
		System.out.println("fourth operatio"+queue.poll());

	}

}
