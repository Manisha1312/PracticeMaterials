package com.practice.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// Create a pattern to be searched 
				Pattern pattern = Pattern.compile("geeks"); 

				// Search above pattern in "geeksforgeeks.org" 
				Matcher m = pattern.matcher("geeksforgeeks.org"); 

				// Print starting and ending indexes of the pattern 
				// in text 
//		 		boolean t = m.find();
//		 		System.out.println(t);
				
				while (m.find()) 
					
					System.out.println("Pattern found from " + m.start() + 
									" to " + (m.end()-1)); 
	}

}
