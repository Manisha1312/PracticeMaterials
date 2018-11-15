package com.practiceTest1;

public class ThisDemo4ClassB {
	ThisDemo4ClassA obj;
	//ThisDemo4ClassB obj;
	ThisDemo4ClassB(ThisDemo4ClassA obj){
		
	//	this.obj = obj;
		
	}
	void display(){
		System.out.println("the value is:" + obj.data);
		//System.out.println("the value is:" + obj);
	}

}
