package com.collection.oct;

import java.util.HashMap;
import java.util.Map;

public class NewDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		insertMap(map);
		// traversing map
		
		for(Map.Entry<Integer,String> model:map.entrySet()){
			System.out.println(model.getKey()+"  "+model.getValue());
			
		}

	}

	private static void insertMap(Map<Integer, String> map) {
		String[] arr = {"mani","ranbir","shweta","moumita"};
		
		for(String s: arr){
		map.put(s.length(),s);
			
		}
		
	}

}
