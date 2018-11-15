package com.practice.october8;

import java.util.ArrayList;
import java.util.Collections;

public class MainMovie {

	public static void main(String[] args) {

		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list, Collections.reverseOrder());

		System.out.println("movies names after sorting by year in descending order");

		for (Movie m : list) {

			System.out.println(m.getName() + "  " + m.getRating() + "  " + m.getYear());

		}

		System.out.println("sorting by rating ");
		
		Collections.sort(list,new RatingComparator());
		for (Movie m2 : list) {

			System.out.println(m2.getName() + "  " + m2.getRating() + "  " + m2.getYear());

		}
		
		
System.out.println("sorting by name ");
		
		Collections.sort(list,new MovieNameComparator());
		for (Movie m3 : list) {

			System.out.println(m3.getName() + "  " + m3.getRating() + "  " + m3.getYear());

		}

		
		
		
		
	}

}
