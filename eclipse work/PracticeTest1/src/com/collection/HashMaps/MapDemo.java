// ITERATION A MAP THRU FOR EACH LOOP BY USING ENTRY SET
package com.collection.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map <Integer,String> m1 = new HashMap <Integer,String>();
		
		m1.put(101,"mani");
		m1.put(102,"manis");
		m1.put(103,"manish");
		m1.put(104,"manisha");
		
		//System.out.println(m1);
		
		//traversing map
		
		for(Map.Entry M :m1.entrySet()){
			
			//System.out.println(M);
			//System.out.println(M.getValue());
		     //	System.out.println(M.getKey());
		 	System.out.println(M.getKey()+" "+M.getValue());  
			
			
		}

	}

}
