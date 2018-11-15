package com.collection.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapemo1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  hm.put(104, null);
		//  hm.put(null, null); it doesnt accept null key 
		  
		  System.out.println("Lat key of the map:"+" "+hm.lastKey());
		  System.out.println("content key:"+" "+hm.containsKey(104));
		  System.out.println("The vale presenrt at 104 is:"+" "+hm.get(104));
		  System.out.println("size:"+"  "+hm.size());
		  hm.remove(103);
		  System.out.println("after removing size:"+"  "+hm.size());
		  
		  System.out.println("Checking if the map is empty or not?"+" "+hm.isEmpty());
		  
		  
		  System.out.println("content value"+" "+hm.containsValue("Rahul"));
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
