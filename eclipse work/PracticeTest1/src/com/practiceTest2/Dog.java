package com.practiceTest2;

public class Dog extends Animal {
	int legs;
	
	Dog(int legs){
	//	super();  implicitly declared by the compiler 
		this.legs = legs;
		System.out.println("Dog is created");
	}

}
