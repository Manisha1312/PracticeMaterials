package com.collection.ArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> li = new CopyOnWriteArrayList<>();
		
		li.add("mani");
		li.add("mani");
		li.add("ranveer");
		li.add("ranbir");
		li.add("ahmad");
		li.add("mou");
		 System.out.println("Displaying synchronized ArrayList Elements:");
		 
		 Iterator itr = li.iterator();
		 
		 while(itr.hasNext()){
			// System.out.println(itr.next());
			 if(li.contains("mani")){
				 li.remove("mani");
				 li.add("zaidi");
				 
				 System.out.println(li); 
				 
			 }
			 
			 
			
			 
		 }
		 
	
		 

	}

}
