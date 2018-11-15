package com.practice.creationThreads;

public class ThreadRunnableDemo3 extends Thread implements Runnable {

	public static void main(String[] args) {
		
		ThreadRunnableDemo3 t2 = new ThreadRunnableDemo3();
	//	ThreadRunnableDemo3 t4 = new ThreadRunnableDemo3();
		
		Thread t1 = new Thread(t2);
		
		Thread t3 = new Thread(t2);
		
		
		t1.setName("arpi");
		t3.setName("mani");
		t1.start();
		t3.start();

	}

	@Override
	public void run() {
		
						
		for(int i = 0;i<=6;i++){
			
			System.out.println(Thread.currentThread().getName()+"  "+i);
			
			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
			
		}
		
	}

}
