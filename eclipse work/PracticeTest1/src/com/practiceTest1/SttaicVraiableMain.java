package com.practiceTest1;

public class SttaicVraiableMain {

	public static void main(String[] args) {
		
		StaticVariableDemoStudent s1 = new StaticVariableDemoStudent("mani");
		
		StaticVariableDemoStudent s2 = new StaticVariableDemoStudent("esha");
		
		// STATIC Variable so needs the class names
		
		StaticVariableDemoStudent.college_name = "IIT";
		
		StaticVariableDemoStudent s3 = new StaticVariableDemoStudent("NISHA");

	}

}
