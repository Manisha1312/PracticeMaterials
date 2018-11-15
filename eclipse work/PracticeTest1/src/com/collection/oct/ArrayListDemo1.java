package com.collection.oct;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<>();

		li.add("mani");
		li.add("manis");
		li.add("manish");
		li.add("manisha");
		li.add("manisham");
		li.add("manishami");

		System.out.println("traversing using for each");

		for (String a : li) {
			System.out.println(a);

		}
		System.out.println("traversing using iterator");
		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
