package com.practiceTest3.inheritance;

public class Employee extends Person {
	
	static int i = 0;
	String profile;
	int level;
	
	void employeeid(){
		i++;
		System.out.println("The employee_id:"+i);
	}
	
	
	void work(){
		System.out.println("Working in Danske bank");
	}
	
	void SetInfo(){
		super.country = "India";
		super.place = "bangalore";
		super.displayInfo();
	}
	
	

}
