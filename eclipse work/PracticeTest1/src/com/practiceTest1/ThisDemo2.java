
// this keyword is used to call constructor
package com.practiceTest1;

public class ThisDemo2 {
	int roll_no;
	String name;
	String course;
	float fees;
	
	ThisDemo2(int r,String s){
				
		roll_no = r;
		name = s;
		
	}
	
	
	ThisDemo2(int r,String s,String course){
		this(r,s);
		this.course = course;
		
		
	}
	
	ThisDemo2(int r,String s,String course,float fees){
		this(r,s,"java");
		this.fees = fees;
		
		
	}
	
	ThisDemo2(int r,String s,String course,float fees,int serial){
		this(r,s,course,fees);
		
		
	}
	
	
	
	
	
	void dispalyInformation(){
		System.out.println(roll_no+" "+name+" "+course+" "+fees);
	}

}
