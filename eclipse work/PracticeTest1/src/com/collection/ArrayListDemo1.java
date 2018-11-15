package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
		
		
		// adding elements in array
		
		list.add("mani");
		list.add("esha");
		list.add("nimmi");
		list.add("mani");
		
		// traversing elements in array by using for each loop
		
		for(String obj: list){
			System.out.println(obj);
		}
		
		// traversing throug iterator
		
		Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}

}
