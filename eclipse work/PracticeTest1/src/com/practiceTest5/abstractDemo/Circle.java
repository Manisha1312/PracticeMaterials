package com.practiceTest5.abstractDemo;

public class Circle extends Shape {

	void draw(){
		System.out.println("draws circle");
	}
	void changeShape(){
		System.out.println("circle is changed");
		super.getArea(10); // calling non abstarct method
	}
	

}
