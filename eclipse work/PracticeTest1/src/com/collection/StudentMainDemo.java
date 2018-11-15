package com.collection;

import java.util.ArrayList;

import java.util.Iterator;

public class StudentMainDemo {

	public static void main(String[] args) {
		// create object of student class

		Student s1 = new Student(12, "ranbir", 33);
		Student s2 = new Student(13, "esgha", 33);
		Student s3 = new Student(14, "rahul", 33);
		Student s4 = new Student(15, "ranbir", 32);

		// create a ArrayList collection

		ArrayList<Student> a1 = new ArrayList<Student>();

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);

		// traversing

		for (Student a2 : a1) {
			System.out.println(a2);

		}

		// getting iterator

		Iterator itr = a1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		
		
	
	}
}
