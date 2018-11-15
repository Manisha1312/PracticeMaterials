package com.practice.october8;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie s1, Movie s2) {
		
		return s1.getName().compareTo(s2.getName());
	}

}
