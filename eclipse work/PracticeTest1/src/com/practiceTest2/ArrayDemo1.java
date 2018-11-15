package com.practiceTest2;

public class ArrayDemo1 {
	
	void min(int arr[]){
		int min = arr[0];
		for(int i= 1 ;i<arr.length;i++){
					
			if(min>arr[i]){
				min = arr[i];
				
				
			}
		}
		System.out.println(min);
		
	}
	
	void max(int arr1[]){
		int max = arr1[0];
		
		for(int j= 1; j<arr1.length ;j++){
			if (max <arr1[j]){
				max = arr1[j];
			}
			
			
			
		}
		System.out.println(max);
		
	}

}
