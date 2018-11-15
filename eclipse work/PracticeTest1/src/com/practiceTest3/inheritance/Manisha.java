package com.practiceTest3.inheritance;

public class Manisha extends Employee {
	

	
	void work(){
		super.employeeid();
		
		System.out.println("working in JP Morgan");
	}
	
	void setProfile(){
		work();
		
		super.profile = "Software engineer";
		
	System.out.println(profile);
	}

}
