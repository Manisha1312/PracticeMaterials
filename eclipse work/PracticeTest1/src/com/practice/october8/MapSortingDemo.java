package com.practice.october8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortingDemo {

	public static void main(String[] args) {

   Map<Integer,String> hmap = new HashMap<>();
   
   hmap.put(5, "A");
   hmap.put(11, "C");
   hmap.put(4, "Z");
   hmap.put(77, "Y");
   hmap.put(9, "P");
   hmap.put(66, "Q");
   hmap.put(0, "R");
   
// traverse the map
   System.out.println("before sorting");
   for(Map.Entry<Integer,String> map: hmap.entrySet()){
	   
	  
	   System.out.println(map.getKey()+" "+map.getValue());
	   
   }
   
   // treemap
   
    Map<Integer,String> t1 = new TreeMap<>();
    t1.putAll(hmap);
    System.out.println("after sorting");
    for(Map.Entry<Integer,String> map2: t1.entrySet()){
 	   
    	System.out.println(map2.getKey()+" "+map2.getValue());
 	   
    }
    
    
   
   
   

	}
	
	
	
	
}
