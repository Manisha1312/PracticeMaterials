package com.practice.string;

public class StringDemo3 {

	public static void main(String[] args) {
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   String s5 = "SAURAV";
		   String s6 = "zebra";
		   System.out.println(s1.equals(s2));
		   System.out.println(s2.equals(s4));
		   System.out.println(s4.equals(s5));
		   System.out.println(s4.equalsIgnoreCase(s5));
		   
		   
		   // comparaison by === operator
		   
		   System.out.println(s1==s2);// because same refence which is store in string pool constant

		   System.out.println(s1==s3);// not same refrence , s3 store in heap not pool
		   
		   // compareTo metho
		   
		   System.out.println(s1.compareTo(s2));
		   System.out.println(s1.compareTo(s6)); // returns negative because smaller
		   System.out.println(s6.compareTo(s1)); // retruns positive because greater
		   
	}

}
