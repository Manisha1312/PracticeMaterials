package com.practiceTest2;

public class MethodOverloadingMain {

	public static void main(String[] args) {
	System.out.println(MethodOverloadingDemo.add(0,10.0f));	
	System.out.println(MethodOverloadingDemo.add(10.0f,10L));
	
	MethodOverloadingDemo obj = new MethodOverloadingDemo();
	obj.add(30, 10);
	
	MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
	obj1.add(12l,13l,13);
	obj1.add(12,13,14);
	
	}

}
