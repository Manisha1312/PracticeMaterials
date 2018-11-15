// final key demo
// when method is final we can inherited but can't override the final method
// final blank variable - it will be intialized through constructor and if having
// more than 1 custructor then in every constructor final blank variable has to be assigned value


package com.practiceTest2;

public class VehicleClass {
	final int speed;
	
	VehicleClass(){
		speed = 110;
		System.out.println(speed);
	}
	
	VehicleClass(int serialNumber){
		
		speed = 120;
		
	}
	
	
	final void run(){
		
		System.out.println("Running ");
		
	}

}
