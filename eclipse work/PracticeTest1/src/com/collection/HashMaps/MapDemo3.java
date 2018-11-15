package com.collection.HashMaps;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
	
	
	// This function prints ordering of all elements 
    static void insertAndPrint(AbstractMap<Integer, String> map) 
    {  
        int[] array= {12, -13, 21, 23,-23}; 
        for (int x: array)  
        {  
            map.put(x, Integer.toString(x));  
        }  
//        for (int k: map.keySet()) 
//        { 
//            System.out.print(k + ", ");  
//        } 
        
        
        for(Map.Entry m1 : map.entrySet()){
        	
        	System.out.println(m1.getKey()+"  "+m1.getValue());
        	
        }
        
        
        
        
    }  
  
    // Driver method to test above method 
	
	
	
	

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
        insertAndPrint(map); 

	}

}
