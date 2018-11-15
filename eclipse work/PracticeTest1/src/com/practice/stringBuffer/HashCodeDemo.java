package com.practice.stringBuffer;

public class HashCodeDemo {

	public static void main(String[] args) {
		System.out.println("Hashcode test of String:");  
        String str="java"; 
        System.out.println(str.hashCode());  
        str=str+"tpoint"; // here the main string is not distrubed so the main object is refrence to another rfefrence
        
        System.out.println(str.hashCode());  
       // System.out.println(str);
        
        String str1 = "java";
        System.out.println("The refrence varible  points to the same object which is created by str"+" "+ str1.hashCode());  
        System.out.println(str1);
        
        
        
        
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());  

	}

}
