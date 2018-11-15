package com.practice.october8;

public class Student2 {
	
	int roll_no;
	String name;
	int age;
	
	Student2(int roll_no,String name,int age){
		this.roll_no= roll_no;
		this.name = name;
		this.age = age;
		
	}
	
	public String toString(){
		return roll_no+" "+name+" "+age;
		
	}

}
