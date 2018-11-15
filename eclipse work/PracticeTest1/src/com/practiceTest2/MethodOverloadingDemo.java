//overloading with type promotion 

package com.practiceTest2;

public class MethodOverloadingDemo {
	
	static float add(int a,float b){
		
		return (a+b);
		
	
	
		
	}
	
	static float add(float a,long b){
		return(a+b);
	}

	 void add(int a, long b){
      System.out.println(a- b);
		
	}
	 
	 void add(long a ,float b,int c){
		 System.out.println(a+b+c);
	 }
	 
	 
}
