package com.multithreading.deadlockScenario;

public class Thread2 extends Thread{
	
	SharedObject s1;
	SharedObject s2;
	
	Thread2(SharedObject s1,SharedObject s2){
		
		this.s1 = s1;
		this.s2 = s2;
		
	}
	
	// run method
	
	public void run(){
		s2.test2(s1);
		
		
	}

}
