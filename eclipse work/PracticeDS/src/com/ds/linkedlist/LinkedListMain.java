package com.ds.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList<Integer> s1 = new LinkedList<>();
		
		s1.addStart(25);
		s1.addStart(30);
		s1.addStart(10);
		s1.addStart(10);
		s1.addStart(11);
		s1.addStart(35);
		s1.addStart(40);
		s1.addStart(10);
		s1.addStart(32);
		s1.addStart(10);
		s1.addStart(33);
		
		
		s1.traverse();
		//finding the middle element of the linked list
		s1.findMiddle();
		
		//find the length of the linked list
		
		System.out.println(s1.size());
		
		// find the occurence of pariticular element
	//	s1.countoccurence(10);
		System.out.println("occurence " + s1.countoccurence(10));
		
		
		
		
		

	}

}
