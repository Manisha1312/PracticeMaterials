
package com.collection.enumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
	
	public enum Days{
		Monday, Tuesday, Wednesday, Thursday 	
		
	};
	
	
	

	public static void main(String[] args) {
		
		EnumMap<Days,String> map = new EnumMap<Days,String>(Days.class);
		
		map.put(Days.Monday,"1");
		map.put(Days.Tuesday,"2");
		map.put(Days.Wednesday, "3");  
		map.put(Days.Thursday, "4");  
		
		// traversing:
		System.out.println(map.containsValue("1"));
		System.out.println("size of the enumMap:"+ map.size());
	   map.remove(Days.Thursday);
	   System.out.println("size of the enumMap after removal :"+ map.size());
	   
	   System.out.println(map.containsValue("4"));
	   
		
		for(Map.Entry m1: map.entrySet()){
			
			System.out.println(m1.getKey()+" "+m1.getValue());  
			
		}
		
		

	}

}
