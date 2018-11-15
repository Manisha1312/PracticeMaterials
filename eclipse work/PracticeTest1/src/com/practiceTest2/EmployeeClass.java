// employeeclass inherits person class but constructor will not be inherited so we have to use super key to acess parent custructor
//

package com.practiceTest2;

public class EmployeeClass extends PersonClass {
	float salary;
	EmployeeClass(int id,String name, float salary){
		super(id,name); // already in parent call this values are intialized
		this.salary = salary;
		
	}
	
	void displayInfo(){
		System.out.println(id+"  "+name+"  "+salary);
	}
	
	

}
