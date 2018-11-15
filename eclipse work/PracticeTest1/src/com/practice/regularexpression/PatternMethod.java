package com.practice.regularexpression;

import java.util.regex.Pattern;

public class PatternMethod {

	public static void main(String[] args) {
		// Following line prints "true" because the whole 
        // text "geeksforgeeks" matches pattern "geeksforge*ks" 
        System.out.println (Pattern.matches("..s", 
                                            "aas")); 
        
        System.out.println (Pattern.matches("...s", 
                "aaas")); 
  
        System.out.println (Pattern.matches("mani*sha", 
                "manisha")); 
        // Following line prints "false" because the whole 
        // text "geeksfor" doesn't match pattern "g*geeks*" 
        System.out.println (Pattern.matches("g*geeks*", 
                                            "geeksfor")); 

	}

}
