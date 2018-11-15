
// multiple inherit
package com.practiceTest5.abstractDemo;

public class Test implements Printable , Showable {
	
	public void print(){
		System.out.println("PRINTABLE");
		
	}
	
	public void show(){
		System.out.println("showable");
	}

}
