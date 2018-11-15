package com.collection.tree;

public class Book implements Comparable<Book>  {
	
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	} 
	
	public String toString(){
		return id+" "+name+" "+author+" "+publisher+" "+quantity;
	}
	
	public int compareTo(Book b){
		
		if(this.id>b.id || this.quantity > b.quantity){  
	        return 1;  
	    }else if(this.id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}

}
