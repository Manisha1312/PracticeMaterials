package com.practice.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerachingDemo {

	public static void main(String[] args) {
		 // Create a pattern to be searched 
        Pattern pattern = Pattern.compile("ma*"); 
  
        // Search above pattern in "" 
        Matcher m = pattern.matcher("himahimahima"); 
  
        // Print starting and ending indexes of the pattern 
        // in text 
        while (m.find()){ 
            System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1)); 
        	
        	
        }

	}

}
