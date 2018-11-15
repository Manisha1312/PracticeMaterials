
// string concatataion
package com.practice.string;

public class StringDemo4 {

	public static void main(String[] args) {
		String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar  
		   String s1=(new StringBuilder()).append("Sachin").append(" Tendulkar").toString(); 
		   System.out.println(s1);//Sachin Tendulkar 
		   
		   String m1 = (new StringBuilder()).append("manisha").append(" mandal").toString();
		   System.out.println(m1);

		   // substring
		   
		   String s2="SachinTendulkar";  
		   System.out.println(s.substring(6));//Tendulkar  
		   System.out.println(s.substring(4,6));//Sachin  
		   
	}

}
