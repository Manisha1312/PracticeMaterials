// first will prepare node of the linked list

package com.ds.linkedlist;

public class Node<T> implements Comparable<T> {

	public T data;
	public Node<T> next;

	// constructor

	public Node(T dataValue) {
		this(dataValue, null);

	}

	public Node(T dataValue, Node<T> nextValue) {

		this.data = dataValue;
		this.next = nextValue;

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public int compareTo(T o) {

		if (o == this.data) {
			return 0;
		} else {
			return -1;
		}

	}

}
