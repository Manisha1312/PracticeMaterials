package com.collection.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet <Book> t1 = new TreeSet<>();
		
		// creating objects of book
		Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
	    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
	    
	    // adding all books objects in set
	    
	    t1.add(b1);
	    t1.add(b3);
	    t1.add(b2);
	    
	    Iterator itr = t1.iterator();
	    while(itr.hasNext()){
	    	
	    	System.out.println(itr.next());
	    	
	    }

	}

}
