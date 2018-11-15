
// nested catch blocks
package com.practice.exceptionalhanling;

public class ExceptionalHandlingDemo1 {

	public static void main(String[] args) {
		
		
		try{
			int data = 50/0;
		}catch(ArithmeticException e){System.out.println(e);
			
		}
		
		int a[]= {1,2,3,4};
		for(int i = 0 ;i<a.length; i++){
			System.out.println(a[i]);
			
		}
		
		
		try{
			String s1 = null; //null value 
            System.out.println(s1.charAt(0));
		}
		
		
		catch(ArithmeticException e){System.out.println(e);}
		catch(NumberFormatException  e){System.out.println(e);}
		catch(NullPointerException e){System.out.println(e);}
		catch(Exception e){System.out.println("common task completed");}  
		
		
		
	}

}

 