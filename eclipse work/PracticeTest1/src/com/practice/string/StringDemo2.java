package com.practice.string;

public class StringDemo2 {

	public static void main(String[] args) {
		String s="Sachin";  
		s.concat(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(s);//will print Sachin because strings are immutable objects
		
		String s1 = s.concat(" Tendulkar");
		System.out.println(s1);
		
		String s2 = "manisha"; // here instance is created
		String s3 = "manisha"; // here only refrece varible s3 points to the object 
		

	}

}
