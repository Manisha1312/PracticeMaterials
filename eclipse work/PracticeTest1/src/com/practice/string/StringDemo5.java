package com.practice.string;

public class StringDemo5 {

	public static void main(String[] args) {
		String s="Manisha";  
		System.out.println(s.toUpperCase());//  
		System.out.println(s.toLowerCase());// 
		System.out.println(s);//(no change in original) 
		
		
		// trim
		
		String s1="  Manis";  
		System.out.println(s1);//    
		System.out.println(s1.trim());// // after triming also original string will be same
		System.out.println(s1);
		
		System.out.println(s1.startsWith("Ma"));//true  or falsi " space is dere so false
		 System.out.println(s1.endsWith("s"));//true  
		 System.out.println(s1.endsWith("S"));
		 
		 // POSITION
		 System.out.println(s1.charAt(2));
		 System.out.println(s1.charAt(0));
		 // LENGTH
		 System.out.println(s1.length());
		 // INTERN METHOD
		 
		 String s3=new String("rAHUL");  
		 String s2=s3.intern();  
		 System.out.println(s2);
		 
		 //VALUE OF
		 int a=10;  
		 String s4=String.valueOf(a);  
		 System.out.println(s4+10);  
		 
		 double b = 15.2;
		   String s5 = String.valueOf(b);
		   System.out.println(s5+20);
		 
		
	}

}
