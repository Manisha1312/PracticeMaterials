//Copying values with constructor

package com.practiceTest1;

public class StudentPractice7 {

	int roll_no;
	String name;
	
	
	
	StudentPractice7(){}
	
	StudentPractice7(int r, String n){
		
		this.roll_no = r;
		this.name = n;
		
	}
	/// copy constructor
	
	StudentPractice7(StudentPractice7 s){
		
		roll_no = s.roll_no;
		name = s.name;
		
			
		
	}
	void displayInformation(){
		System.out.println(roll_no+ " " + name);
	}
	
	
}
