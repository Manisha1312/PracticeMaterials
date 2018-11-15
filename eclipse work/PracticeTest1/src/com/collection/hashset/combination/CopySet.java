package com.collection.hashset.combination;

import java.util.LinkedHashSet;
import java.util.Set;

public class CopySet {
	
	public static <T> Set<T> copy(Set<T> source){
        return new LinkedHashSet<T>(source);
 }


}
