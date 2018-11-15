package com.practice.creationThreads;

public class MyThread extends Thread{
	
	public void run(){
		for(int i=1;i<5;i++){
			
			System.out.println(Thread.currentThread().getName()+ " "+i);
			try{
				Thread.sleep(1000);// in order to check output
				
			}catch(InterruptedException e){
				  e.printStackTrace();
				
			}
			
		}
	}

}
