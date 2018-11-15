package com.collection.oct;

import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		
		Map<String,Integer> map =  new TreeMap<>();
		map.put("manisha", 1000664);
		map.put("anita", 1000665);
		map.put("mou", 1000666);
		map.put("mona", 1000663);
		
		for(Map.Entry<String,Integer> map2:map.entrySet()){
			
			System.out.println(map2.getKey());
			
		}

	}

}
