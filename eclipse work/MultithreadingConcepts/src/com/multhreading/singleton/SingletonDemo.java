package com.multhreading.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

     Singleton s1 = Singleton.getInsatnce();
     Singleton s2 = Singleton.getInsatnce();
     
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    
    
  
    
    
     

	}

}
