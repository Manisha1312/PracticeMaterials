package com.practice.Wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		int a=20;  
		Integer i = Integer.valueOf(a);//converting int into Integer  
        Integer j = a;

       System.out.println(i+ " " +j); 
       
       // boxing
       
       Integer x = new Integer(3);
       int y = x.intValue();
      // y = x;
       System.out.println(y); 

	}

}
