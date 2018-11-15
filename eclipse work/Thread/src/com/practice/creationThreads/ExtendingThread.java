package com.practice.creationThreads;

public class ExtendingThread extends Thread{
	
	public void run(){
		
		for(int i = 0;i<=5;i++){
			
			System.out.println("The name of the thread:" +Thread.currentThread().getName()+" "+i);
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
				e.printStackTrace();
			}
			
			//System.out.println("The value :" +i);
			
		}
		
	}

}
