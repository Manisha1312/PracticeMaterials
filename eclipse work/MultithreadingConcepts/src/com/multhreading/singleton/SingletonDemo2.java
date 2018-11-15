package com.multhreading.singleton;

public class SingletonDemo2 {

	public static void main(String[] args) {
		
		// creating threads
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				Singleton s1 = Singleton.getInsatnce();
				System.out.println(s1.hashCode());
				
			}
			
		});
		
		
		
		Thread t2 = new Thread(new Runnable(){
			
			public void run(){
				Singleton s2 = Singleton.getInsatnce();
				System.out.println(s2.hashCode());
			}
			
		});
		
		t1.start();
		t2.start();

	}

}
