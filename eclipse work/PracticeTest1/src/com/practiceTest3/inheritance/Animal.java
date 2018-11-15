package com.practiceTest3.inheritance;

public class Animal {
	String color;  
	int number;
	int legs;
	
	void eat(){
		System.out.println("eating:");
	}
	
	void display(){
		System.out.println("able to run");
	}
	
	void setNumber(int i){
		
		number = i;
		
	}
	
	void setLegs(int legs){
		this.legs = legs;
		System.out.println(legs);
	}
	
	
}
