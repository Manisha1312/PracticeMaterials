package com.ds.linkedlist;

public class LinkedList<T> {

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

	public int size() {

		Node<T> tempNode = head;
		int count = 0;
		while (tempNode != null) {

			count++;
			tempNode = tempNode.getNext();

		}

		return count;

	}

	public void findMiddle() {

		Node<T> slow_ptr = head;
		Node<T> fast_ptr = head;

		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;

			}
			System.out.println("The middle of the linked lists");
			System.out.println("The slow pointer is:" + slow_ptr.data);

		}

	}

	public int countoccurence(T searchNode) {
		Node<T> tempNode = head;
		int count = 0;
		while (tempNode != null) {
			if (tempNode.compareTo(searchNode)==0) {
				count++;
			}
			tempNode = tempNode.getNext();
		}
		return count;
	}

}
