package com.collection.hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo2 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<Integer, String>(); 
		
		 map.put(102,"Let us C");  
		   map.put(103, "Operating System");  
		   map.put(101, "Data Communication and Networking");  
		   map.put(104, "java"); 
		   map.put(100, "pl1"); 
		   
		   // creating set
		   
		   Set m = map.entrySet();
		   System.out.println("set enteries:"+m);
		   
		   // crfeating ennumeratio
		   
		   Enumeration e = map.elements();
		   System.out.println("display values:"); 
		   while(e.hasMoreElements()){
			   System.out.println(e.nextElement());
			   
		   }

	}

}
