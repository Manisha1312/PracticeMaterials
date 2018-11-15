package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoversionToArray {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("mani");
		li.add("ahmad");
		li.add("zaidi");
		li.add("mandal");
		
		// convert
		
		String[] frame = li.toArray(new String[li.size()]);
		
		for(String f : frame){
			System.out.println(f);
			
		}
		
		
		String[] geeks = {"mani","moni"};
		
		List<String>l2 = Arrays.asList(geeks);
		System.out.println(li);
		

	}

}
