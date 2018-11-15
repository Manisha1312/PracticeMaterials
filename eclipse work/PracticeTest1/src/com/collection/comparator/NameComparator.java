package com.collection.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student a=(Student)o1;  
		Student b=(Student)o2;  
		  
		return a.name.compareTo(b.name); 
	}

}
