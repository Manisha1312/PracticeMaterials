
// intialization through method
package com.practiceTest1;

public class Practice2 {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2(); // here s1 and s2 are called reference variable
		Student2 s2 = new Student2();
		
		s1.insertRecord(1, "mani");
		s2.insertRecord(2,"immi");
		
		s1.displayInformatio();
		s2.displayInformatio();
		
	

	}

}


class Student2{
	
	int roll_no;   // non-static variable
	String name;  // non static variable
	
	
	void insertRecord(int r,String n){
		
		this.roll_no = r;   // here r and n are called local varaible
		this.name = n;
		
	}
	void displayInformatio(){
		System.out.println(roll_no+" "+name); // through method you can access the non-static variable
	}
}
