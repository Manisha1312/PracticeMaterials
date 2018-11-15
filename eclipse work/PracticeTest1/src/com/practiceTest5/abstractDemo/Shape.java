
// abstract class - specification providsed by other user 
package com.practiceTest5.abstractDemo;

abstract public class Shape {
	
	Shape(){                                 // it cant be inherited to subclass but it is innoked when the 
		                                     // instance of the inherited class is created
	System.out.println("unique shape will be created");	
	}
	
	abstract void draw();    // abstract method it can be overidden in subclass
	
	void changeShape(){      // concrete method
		System.out.println("shape changed");
	}
	
	
	double getArea(int r){
		double area ;
		area = (3.14*r*r);
		return area;
		
		
		
	}
	
 
}
