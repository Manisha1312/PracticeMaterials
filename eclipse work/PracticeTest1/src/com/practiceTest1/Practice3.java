// intialization of object through constructor

package com.practiceTest1;

public class Practice3 {

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2(1,"mani",70000);
		Employee2 e2 = new Employee2(2,"nimmi",70000);
		e1.displayInformatio();
		e2.displayInformatio();

	}

}

class Employee2{
	
	int id;
	String name;
	float salary;
	
	Employee2(int id,String name,float salary){   // constructor
		
		this.id = id;
		this.name= name;
		this.salary = salary;
		
	}
	
	void displayInformatio(){
		System.out.println(id+" "+name+" "+salary);
	}
}
