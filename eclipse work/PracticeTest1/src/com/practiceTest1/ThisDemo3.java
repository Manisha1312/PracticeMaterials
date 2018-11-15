
// this is passing as parameter for method but hwn it can be used
package com.practiceTest1;

public class ThisDemo3 {
	
		
	void m(ThisDemo3 obj){

	System.out.println("hello world");	
		
	}

	
	void display(int r){
		
		m(this);
		System.out.println("the value of r:" +r);	
		
	}
}
