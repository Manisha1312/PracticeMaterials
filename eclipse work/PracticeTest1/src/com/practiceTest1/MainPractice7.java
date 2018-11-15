package com.practiceTest1;

public class MainPractice7 {

	public static void main(String[] args) {
	
		StudentPractice7 e1 = new StudentPractice7(1,"mani");
		e1.displayInformation();
		
		StudentPractice7 e2 = new StudentPractice7(e1);
		e2.displayInformation();
		
		
		
		// Copying values without constructor
		StudentPractice7 e3 = new StudentPractice7();
		e3.roll_no = e2.roll_no;
		e3.name = e2.name;
		
		e3.displayInformation();
		
	}

}
