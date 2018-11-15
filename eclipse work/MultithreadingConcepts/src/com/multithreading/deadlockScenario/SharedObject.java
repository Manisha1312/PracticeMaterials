package com.multithreading.deadlockScenario;

public class SharedObject {

	 synchronized public void test1(SharedObject s2) {

		 System.out.println("test1-begin"); 
		 try {
			Thread.sleep(1000);
			s2.test2(this); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		 System.out.println("test1-end"); 
		
	}

	 synchronized public void test2(SharedObject s1) {
		 System.out.println("test2-begin");
		 try {
			Thread.sleep(1000);
			s1.test1(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("test1-end"); 
		
	}

}
