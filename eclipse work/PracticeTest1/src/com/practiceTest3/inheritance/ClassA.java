package com.practiceTest3.inheritance;

public class ClassA {
	
	protected float fees;
	
	protected void display(){
		System.out.println("hello");
	}
	
	
	public void setFees(float fees){  // if we keep as a default then in class B which is in different
		                              //  Package can't access
		this.fees = fees;
		
		System.out.println("The requirec fees:" +fees);
		
	}

}
