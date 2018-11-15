package com.multithreading.deadlockScenario;

public class Deadlok {

	public static void main(String[] args) {
		// creating objects
		
		SharedObject s1 = new SharedObject();
		SharedObject s2= new SharedObject();
		
		Thread1 t1 = new Thread1(s1, s2);
		t1.start();
		
		
		Thread2 t2 = new Thread2(s1, s2); 
        t2.start(); 
		

	}

}
