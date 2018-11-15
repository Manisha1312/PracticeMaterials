package com.practiceTest2;

import com.practiceTest3.inheritance.ClassA;

public class ClassB extends ClassA {
	
	public void displayFees(){
		super.display();
		super.setFees(200.f);
	}

}
