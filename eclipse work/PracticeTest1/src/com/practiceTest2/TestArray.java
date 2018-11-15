package com.practiceTest2;

public class TestArray {

	public static void main(String[] args) {
	
		int a[] = new int[5];
		int []b = new int[] {12,13,14,90,66}; // declaration and intialization
		
		
		a[0] = 3;
		a[1] = 4;
		a[2] = 8;
		a[3] = 9;
		a[4] = 10;
		
		int length = a.length;
		System.out.println(a.length);
		
// traversing an array by using normal for loop
		
		for(int i=0;i<a.length;i++){
						
			System.out.println(a[i]);
			
		}
		
// traversing of an array by suing for each loop
		
		for(int b1: b){
			System.out.println(b1);
			
		}
		

	}

}
