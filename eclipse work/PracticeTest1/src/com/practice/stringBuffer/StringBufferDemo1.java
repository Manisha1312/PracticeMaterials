package com.practice.stringBuffer;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		// append metho
		StringBuffer sb1 = new StringBuffer("manisha");
		sb1.append(" mandal");
		sb1.append(" works");
		System.out.println(sb1);
		
		// insert method
		
		StringBuffer sb2=new StringBuffer("Hello");  
		sb2.insert(1,"Java");//now original string is changed  
		System.out.println(sb2);//prints HJavaello
		System.out.println(sb2.length());
		
		// delete method
		
		StringBuffer sb3=new StringBuffer("Hello");  
		sb3.delete(1,3);  
		System.out.println(sb3);//prints Hlo 
		
		StringBuffer sb4 = new StringBuffer("manisha");
		sb4.delete(3, 5);
		System.out.println(sb4);
		StringBuffer sb5 = new StringBuffer("manisha");
		sb5.delete(3, 4);
		System.out.println(sb5);
	}

}
