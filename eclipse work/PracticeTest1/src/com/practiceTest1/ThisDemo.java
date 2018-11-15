package com.practiceTest1;

public class ThisDemo {
	ThisDemo(){    // default constructor
		System.out.println("hello manisha");
	}
	
	ThisDemo(int y){
		this();
		
		System.out.println("The value is:" +y);

	}
	
	ThisDemo(int y , int z ){
		this(10);  // while calling another custructor pass the parameter
		
		System.out.println("The value are:" +y+ " "+z);	
		
	}
	
	ThisDemo(int y,int z,int r){
		this(y,z);
		System.out.println("The value are:" +y+ " "+z+" "+r);	
		
	}

}
