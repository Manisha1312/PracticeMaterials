package com.practiceTest1;

public class StaticVariableDemoStudent {
	
	static int roll_no = 0;
	
	String name;
	static  String college_name = "NIT";
	
	
	StaticVariableDemoStudent(String s){
		
		name = s;
		roll_no ++;   // static variable  
		displayInformation();
	
		
	}
	void displayInformation(){
		System.out.println(roll_no+" "+name+" " +college_name);
	}

}
