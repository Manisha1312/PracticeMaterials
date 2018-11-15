package com.practice.october8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortingByValue {

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
        
        // traversing map
        
        System.out.println("without sort");
        for(Map.Entry<String,Integer> m1 :unsortMap.entrySet()){
        	System.out.println(m1.getKey()+" "+m1.getValue());
        	
        	
        	// sort by value
        	
        	Map<String, Integer> sortedMap = sortByValue(unsortMap);
        	System.out.println("sorted list");
        	print(sortedMap);
        	
        }
		
		

	}

	private static void print(Map<String, Integer> sortedMap) {
		for(Map.Entry<String,Integer > entry:sortedMap.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}

	private static Map<String,Integer> sortByValue(Map<String,Integer> unsortMap) {
		
		// convert map to list
		List<Map.Entry<String,Integer>> li = new LinkedList<>(unsortMap.entrySet());
		Collections.sort(li, new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> e1 : li) {
            sortedMap.put(e1.getKey(), e1.getValue());
            
        }
		
		return sortedMap;
			
		
	}

}
