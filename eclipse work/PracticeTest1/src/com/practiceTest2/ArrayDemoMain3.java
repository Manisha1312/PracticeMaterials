package com.practiceTest2;

public class ArrayDemoMain3 {

	public static void main(String[] args) {
		
		ArrayDemo3 a = new ArrayDemo3(); // object created to call the methods
		int arr[] = a.get(); // assiging an array to method
		
       for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
