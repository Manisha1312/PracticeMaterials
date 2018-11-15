package com.practiceTest1;

public class Rectangle {
	 int length;
	 int breadth;
	 
	 Rectangle (int length,int breadth){
		 
		 this.length = length;
		 this.breadth = breadth;
		 
	 }
	 
	 int calculateArea(){                    // method 
		 int s;
		 s = (length* breadth);
		 System.out.println("The area:" +s);
		 return s;
		 
		 
	 }

}
