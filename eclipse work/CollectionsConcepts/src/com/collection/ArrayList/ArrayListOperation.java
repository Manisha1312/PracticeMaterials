package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOperation {

	public static void main(String[] args) {
		
		List<String> readableList = new ArrayList<>();
		
		readableList.add("Jeffrey Archer");
        readableList.add("Khalid Hussain");
        
        List<String> unmodifiableList = Collections.unmodifiableList(readableList);
        // fixed length
        
        List fixedLengthList = Arrays.asList("Mark" , "Twen");
        fixedLengthList.set(0, "J.K. Rowling");
        System.out.println(fixedLengthList.get(0));
        

	}

}
