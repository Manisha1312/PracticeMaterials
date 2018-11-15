package com.practice.october8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValueDemo2 {

	public static void main(String[] args) {

   Map<String,Integer> unsortMap = new HashMap<>();
   unsortMap.put("z", 10);
   unsortMap.put("b", 5);
   unsortMap.put("a", 6);
   unsortMap.put("c", 20);
   unsortMap.put("d", 1);
   unsortMap.put("e", 7);
   unsortMap.put("y", 8);
   unsortMap.put("n", 99);
   unsortMap.put("j", 50);
   unsortMap.put("m", 2);
   unsortMap.put("f", 9);
   
   
   // sort by value:
   
   
   Map<String,Integer> sorted = sortMap(unsortMap);

	}

	private static Map<String, Integer> sortMap(Map<String, Integer> unsortMap) {
		// convert the map into list
		
		List<Map.Entry<String,Integer>> li = new ArrayList<>(unsortMap.entrySet());
		Collections.sort(li, new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		
		Map<String,Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String,Integer>hmap:li){
			
		}
		
		return null;
	}

}
