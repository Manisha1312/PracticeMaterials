package com.practiceTest2;

public class PersonClass {
	int id;
	String name;
	
	PersonClass(int id,String name){     
		
		this.id = id;
		this.name = name;
		
	}
	
	
	void displayInfo(){
		System.out.println(id+ "  " +name);
	}

}
