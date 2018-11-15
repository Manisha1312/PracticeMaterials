package com.practiceTest3.inheritance;

public class InheritanceDemo1Main {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();   // creating object and reference variable is class Dog Type
		d1.eat();
		d1.setColor();
		d1.display();
		d1.setNumber();
		
		Animal a1 = new Animal();
		a1.setNumber(5);
		d1.setLegs(8);  // how it is allowing as d is the object of subclass and here i am calling set method 

	}

}
