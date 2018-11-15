package com.collection.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {

		// create and populate hash map
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// adding elements in HashMap
		map.put(101, "Let us C");
		map.put(102, "Operating System");
		map.put(103, "Data Communication and Networking");
		map.put(104, "java");
		map.put(105, "Alogorithm");

		System.out.println("Values before remove: " + map);
		// Remove value for key 102
		map.remove(102);
		System.out.println("Values after remove: " + map);

		// to check if the map contain key

		boolean hasKey = map.containsKey(102);
		System.out.println(hasKey);

		// to check if the map contain value

		boolean hasValue = map.containsValue("Operating System");
		System.out.println(hasValue);

		System.out.println("The required key is" + "  " + map.get(103));
		System.out.println("The value of the map" + "  " + map.values());

		// traversing map

		System.out.println("The content of the map:");

		for (Map.Entry m1 : map.entrySet()) {

			System.out.println(m1.getKey() + "    " + m1.getValue());

			HashMap<Integer, String> map1 = new HashMap<Integer, String>();

			map1.put(107, "PL1");
			map1.put(108, "db2");
			map1.put(109, "egl");
			map1.put(110, "jcl");

			// adding one map to another
			map1.putAll(map);

			// traversing map
			System.out.println("The content of the map1:");

			for (Map.Entry m2 : map1.entrySet()) {

				System.out.println(m2.getKey() + "    " + m2.getValue());

			}

		}

	}

}
