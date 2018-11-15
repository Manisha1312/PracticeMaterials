package com.practice.regularexpression;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		String text = "manisha2mandal";
		  
        // Specifies the string pattern which is to be searched 
        String delimiter =  "\\d"; 
        Pattern pattern = Pattern.compile(delimiter, 
                                        Pattern.CASE_INSENSITIVE); 
  
        // Used to perform case insensitive search of the string 
        String[] result = pattern.split(text); 
  
  
        for (String temp: result) 
            System.out.println(temp); 

	}

}
