package com.multithreading.pool;

public class Worker2 implements Runnable {
	
	private int id;
	
	public Worker2(int id){
		this.id = id;
		
	}
	
	public void run(){
		try {
			System.out.println("Starting: " + id);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Complementing: " + id);
	}
 
}
