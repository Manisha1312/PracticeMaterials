package com.practiceTest3.inheritance;

public class Dog extends Animal{
	void bark(){
		System.out.println("barking");
	}
	
	void eat(){                   // this method is overriding from parent class called Animalr
		super.eat();              // accessing the method of parent class
		System.out.println("he eats only green vegetables"); 
	}

	void setColor(){
		super.color = "green";   // accessing the variable of parent class
		System.out.println("THe color is:" +color);
	}
	
	void setNumber(){
		super.setNumber(10);
		System.out.println(number);
	}
}
