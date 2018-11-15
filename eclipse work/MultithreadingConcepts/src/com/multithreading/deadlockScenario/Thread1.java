package com.multithreading.deadlockScenario;

public class Thread1 extends Thread{
	
	SharedObject s1;
	SharedObject s2;
	
	Thread1(SharedObject s1,SharedObject s2){
		
		this.s1 = s1;
		this.s2 = s2;
		
	}
	
	// run method
	
	public void run(){
		s1.test1(s2);
		
	}
	
	

}
