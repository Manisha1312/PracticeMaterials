package com.design.singleton;

public class SingletonDoubleCheck {

	// static variable
	private volatile static SingletonDoubleCheck instance;

	// private constructor
	private SingletonDoubleCheck(){
		
	}
	
	// double checking mechanism
	public static SingletonDoubleCheck getInstance(){
		if (instance == null){
			synchronized(SingletonDoubleCheck.class){
				if(instance==null){
					instance = new SingletonDoubleCheck();
					
				}
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		return instance;
		
	}

}
