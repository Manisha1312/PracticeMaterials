package com.collection;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin");
		al.add(4,"manisha");
		System.out.println("Element at 2nd position: "+al.get(0) +" "+al.get(4));  
		for(String s:al){  
		 System.out.println(s);  
		}  

	}

}
