package com.collection.oct;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String>m1 = new HashMap<>();
		
		m1.put("cofee", "12");
		m1.put("tea", "12");
		m1.put("nescafe", "18");
		m1.put("cofee", "12");
		m1.put("lemon tea", "17");
		
		for(Map.Entry m2:m1.entrySet()){
			
			System.out.println(m2.getKey()+"  "+m2.getValue());
			
		}
		
		System.out.println("new map");
		
		Map<String,Integer>map = new HashMap<>();
		map.put("manisha", 1);
		map.put("isa", 2);
		map.put("arpita", 3);
		map.put("preet", 4);
		map.put("rithik", 5);
		
		for(Map.Entry map2:map.entrySet()){
			
			boolean key = map.containsKey("manisha");
			System.out.println(key);
			System.out.println(map2.getValue());
			
		
		
		
	}
	
	
	
		
	}
	
}
