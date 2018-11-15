package com.collection.hashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();           
		   map.put(102,"Let us C");  
		   map.put(103, "Operating System");  
		   map.put(101, "Data Communication and Networking");  
		   map.put(104, "java"); 
		   map.put(100, "pl1"); 
		   
		   
		   
		   System.out.println("Values before remove: "+ map);    
		   // Remove value for key 102  
		   map.remove(102);  
		   System.out.println("Values after remove: "+ map); 
		   System.out.println(map.containsKey(104));
		   System.out.println(map.containsValue("Let us C"));
		   System.out.println(map.containsValue("Java"));
		   
		   System.out.println(map.clone());
		   System.out.println(map.contains("java"));
		   
		   
		   
		   
		   
		   System.out.println("The content of the map");
		   
		   for(Map.Entry m1 :map.entrySet()){
			   
			   System.out.println(m1.getKey()+"  "+m1.getValue());
			   
		   }

	}

}
