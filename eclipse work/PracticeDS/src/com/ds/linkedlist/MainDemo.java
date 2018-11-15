package com.ds.linkedlist;

public class MainDemo {

	public static void main(String[] args) {
		LinkedList<Integer> s2 = new LinkedList<>();

		s2.addStart(20);
		s2.addStart(4);
		s2.addStart(15);
		s2.addStart(10);
		s2.addStart(10);
		s2.addStart(30);
		s2.traverse();

		// s2.detectLoop();
		// s2.head.next.next.next.next = s2.head;

		// s2.detectLoop();
		
		
		// removing  dublicate elements from the list
		LinkedListDemo<Integer> s3 = new LinkedListDemo<>();
		s3.addStart(15);
		s3.addStart(4);
		s3.addStart(15);
		s3.addStart(10);
		s3.addStart(10);
		s3.addStart(20);
		s3.traverse();
		
		// removing duplicates from the above list
		
		s3.removeDuplicates();
		s3.traverse();
		
		
 
	}

}
