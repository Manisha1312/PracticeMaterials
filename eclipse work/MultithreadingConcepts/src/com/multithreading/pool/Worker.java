package com.multithreading.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker implements Runnable {
	
	private Random random = new Random();
	
	List<Integer> l1 = new ArrayList<Integer>();
	List<Integer> l2 = new ArrayList<Integer>();
	
	private final Object lock1 = new Object();
	private final Object lock2 = new Object();
 	

	@Override
	public void run() {
		process();
		
		
	}

	public void process() {
		for(int i = 0;i<1000;i++){
			stagOne();
			stageTwo();
			
		}
		
	}

	public  void stageTwo() {

      synchronized(lock1){
    	  try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  l1.add(random.nextInt(100));
    	 // System.out.println(l1);
      }
		
	}
    public  void stagOne() {
		synchronized(lock2){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l2.add(random.nextInt(100));
		}
		
	}

}
