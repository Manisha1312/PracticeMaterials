package com.practiceTest4.Polymorphism;

public class Dog extends Animal {
	
	String color = "brown";
	
	void eat(){
		super.eat();
		System.out.println("eating chocolates");
		
	}

}
