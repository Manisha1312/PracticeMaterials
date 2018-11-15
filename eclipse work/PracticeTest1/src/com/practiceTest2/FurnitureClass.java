// intilizer block will first execute then statement inside custructor

package com.practiceTest2;

public class FurnitureClass {
	
	FurnitureClass(){
		System.out.println("woods");
		
	}
	
	{System.out.println("quality is good");} 

}
