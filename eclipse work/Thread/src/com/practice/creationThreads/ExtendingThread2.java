package com.practice.creationThreads;

public class ExtendingThread2 extends Thread{
	
	
	 public void run(){
		 
		 for(int i=0;i<7;i++){
			 
			 System.out.println(Thread.currentThread().getName()+"    "+i);
			 
			 try{
				 Thread.sleep(10000);
			 }catch(InterruptedException e){
				
				 e.printStackTrace();
			 }
		 }
		 
	 }

}
