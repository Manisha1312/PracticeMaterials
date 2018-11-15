package com.collection.HashMaps;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {

	static void insertAndPrint(AbstractMap<Integer, String> map) {
		String[] array = { "mani","shweta","rumi","manma" };
		for (String x : array) {
			map.put(x.length(),x);
		}
		

		for (Map.Entry m2 : map.entrySet()) {

			System.out.println(m2.getKey() + "  " + m2.getValue());

		}

	}

	// Driver method to test above method

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		insertAndPrint(map);

	}

}
