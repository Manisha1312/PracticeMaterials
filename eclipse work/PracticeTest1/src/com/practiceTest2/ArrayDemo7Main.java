package com.practiceTest2;

public class ArrayDemo7Main {

	public static void main(String[] args) {
		int arr[][] = new int[][]{{2,3,4},{3,7,8}};
		int row=arr.length;
		int column=arr[0].length;
		
		ArrayDemo7 a = new ArrayDemo7();
		
		a.operation(arr,row, column);
	
		//operation(arr,n); // calling method and passin

	}

}
