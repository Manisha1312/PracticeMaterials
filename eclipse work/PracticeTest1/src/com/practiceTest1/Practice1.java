// object intialization through reference variable
package com.practiceTest1;

public class Practice1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // s1 : called reference variable
		
		s1.id = 23;
		s1.name = "mani";		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.id+" "+s1.name);
		
	}

}

class Student{
	
	int id;         // non static varaible
	String name;
		
	
}