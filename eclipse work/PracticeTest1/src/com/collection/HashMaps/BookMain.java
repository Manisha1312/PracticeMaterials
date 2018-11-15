package com.collection.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class BookMain {

	public static void main(String[] args) {
		//Creating map of Books    
		 Map<Integer,Book> map=new HashMap<Integer,Book>();  
	    
	   createMap(map);
	    
	    
	    
//	    System.out.println("Tthe value of specified object "+ map.get(1));
//	    System.out.println("Tthe value of specified object "+ map.get(4));
//	   
//	    
	    
	    // traversing map:
	    
//	    for(Map.Entry<Integer,Book> m1:map.entrySet()){
//	    	
//	    	Book b = m1.getValue();  
//	    	
//	    	System.out.println(m1.getKey());
//	    	System.out.println(m1.getValue());
//	    	
//	    	
//	    	
//	    }
	   
	      
	}

	public static void createMap(Map<Integer, Book> map) {
		//Creating Books    
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    Book b4= new Book(104,"Operating System","Galvin","Wiley",6);
	    		
	    		
	    
	  //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);
	    map.put(4,b4);
	}

}
