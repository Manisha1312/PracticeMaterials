package com.practiceTest1;

public class StaicMethodDemoEmployee {

	static int emp_id = 0;
    String employee_name;
    private float salary;
    static String departName ;
    
    static String company_name = "JP Morgan";
    
    
    static{                              // STATIC BLOCK always executed when class is loaded
    	
    	
    	departName = "FIIT";
    	    	
    }
    
    StaicMethodDemoEmployee(String employee_name,float s){   // Constructors
    	
    	
   
    	this.employee_name = employee_name;
    		this.salary = s;
    	emp_id ++;
    	    	
    	displaySalary();
    	
    }
    
    private void displaySalary(){   // normal method
    	
    	System.out.println("The required salary is:" + salary);
    	
    }
    
    
    void displayInformation(){
    	System.out.println(company_name+" " + emp_id+ " "+ employee_name+" "+salary+" "+departName);
    }
    
    
//    static void teamName(){              // static method
//    	
//    	departName = "FIIT";
//    	
//     	
//    	    	
//    	
//    	
//    }
    
    
    
}
