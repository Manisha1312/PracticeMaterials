package com.practiceTest1;

public class ThisDemo4ClassA {
	
	int data = 10;
	
	
	
	ThisDemo4ClassA(){
		ThisDemo4ClassB s2 = new ThisDemo4ClassB(this);	
		s2.display();
	}
	

}
