package com.practice.october8;

public class Movie implements Comparable<Movie>{
	private String name;
	private double rating;
	private int year;
	
	Movie(String name,double rating,int year){
		this.name = name;
		this.rating = rating;
		this.year = year;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	public double  getRating(){
		return rating;
		
	}
	
	public int getYear(){
		return year;
	}

	@Override
	public int compareTo(Movie s1) {
		if(this.year == s1.year)
		return 0;
		else if (this.year>s1.year)
			return 1;
		else
			return -1;
	}

}
