package com.practice.october8;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

	
	@Override
	public int compare(Movie s1, Movie s2) {
		if(s1.getRating()==s2.getRating())
		return 0;
		else if(s1.getRating()>s2.getRating())
			return 1;
			else
		return -1;		
	}

}
