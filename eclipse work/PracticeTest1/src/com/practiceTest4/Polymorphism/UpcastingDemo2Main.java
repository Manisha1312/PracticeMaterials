package com.practiceTest4.Polymorphism;

public class UpcastingDemo2Main {

	public static void main(String[] args) {
		Animal a = new Dog(); // dynamic binding, the compiler doesnt know that a is the insatce of animal or dog class
		// Dog d = new Dog(); // static binding 
		a.eat();   // upcasting
		System.out.println(a.color); // parent class color will be called because upcasting 
		                             // not possible for data members
		
	    a = new Cat();
	    a.eat();

	}

}
