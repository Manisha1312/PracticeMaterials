
// as it is child class so first intilizer block of parent will execute then stament inside parent custructor 
package com.practiceTest2;

public class TableClass extends FurnitureClass {
	
	
	
	TableClass(){
		System.out.println("table");
	}
	{System.out.println("quality is not good");}
	
	
	TableClass(String color){
		
		System.out.println(color);
		//{System.out.println("quality is not up to the mark");}	
		
	}
	{System.out.println("quality is not up to the mark");}

}
