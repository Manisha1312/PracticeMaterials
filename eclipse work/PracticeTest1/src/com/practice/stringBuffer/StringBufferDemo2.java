
// capacity
package com.practice.stringBuffer;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.append("but it is like pacific ocean");
		System.out.println(sb.capacity());
		
		
		// ensure capacity
		
		
		StringBuffer sb1=new StringBuffer();  
		System.out.println(sb1.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb1.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		
		// ensure capacity
		sb1.ensureCapacity(10);//now no change  
		System.out.println(sb1.capacity());//now 34  
		sb1.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb1.capacity());//now 70 

	}

}
