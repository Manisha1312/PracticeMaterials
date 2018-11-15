package com.ds.linkedlist;

public class LinkedListDemo<T> {

	public Node<T> head;
	private Node<T> tail;
	private static int counter;

	// public static int getCounter() {
	// return counter;
	//
	// }

	public static int incrementCounter() {
		return counter++;

	}

	public int decrementCounter() {
		return counter--;
	}

	// adding a element at starting position
	public void addStart(T element) {
		// creating a new node

		Node<T> newNode = new Node<T>(element);

		if (head == null) {

			head = newNode;
			tail = newNode;

		} else {
			newNode.setNext(head);
			head = newNode;
		}
		incrementCounter();

	}

	// traversing element in linked list

	public void traverse() {

		String output = "";
		Node<T> tempNode = head;

		while (true) {
			if (tempNode == null) {
				break;
			}

			output += "[" + tempNode.getData().toString() + "]";
			tempNode = tempNode.getNext();
		}
		System.out.println(output);

	}

	public void detectLoop() {
		// head.next.next.next.next = head;

		Node slow_ptr = head;
		Node fast_ptr = head;

		while (slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {

			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;

			if (slow_ptr == fast_ptr) {
				System.out.println("Found loop");
			}

		}
		
		

	}
	
	public void removeDuplicates() {
		
		Node<T> tempNode = head;
		
        Node<T> next_next;
        
        if(head!=null){
        	while(tempNode!=null&&tempNode.next!=null){
        		if(tempNode.data==tempNode.next.data){
        			next_next = tempNode.next.next;
        			tempNode.next = next_next ;
        			
        		}else{
        			
        			tempNode = tempNode.next;
        			
        		}
        	}
        }
        
		
	}

}
