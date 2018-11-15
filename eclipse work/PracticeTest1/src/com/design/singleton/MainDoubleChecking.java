package com.design.singleton;

public class MainDoubleChecking {

	public static void main(String[] args) {
	
		SingletonDoubleCheck  s1 = SingletonDoubleCheck.getInstance();
		SingletonDoubleCheck  s2 = SingletonDoubleCheck.getInstance();
		
		print("s1",s1);
		print("s2",s2);

	}

	private static void print(String string, SingletonDoubleCheck object) {
		System.out.println("hashcode of s1:" +object.hashCode());
		
		
	}
	
	
	
	
	
	

	
	
	
	

}
