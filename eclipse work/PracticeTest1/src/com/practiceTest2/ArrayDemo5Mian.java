
// 2d array with differnt array
package com.practiceTest2;

public class ArrayDemo5Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[3][]; // it means there are 3 arrays present
		int arr1[] = new int[]{1, 2, 4 ,5};
		int arr2[][] = new int[][]{{1, 2, 4 ,5},{6,7},{8,9,10}};
		
		arr[0] = new int[3]; // tells that in one array there are 3 elements
		arr[1] = new int[4];
		arr[2] = new int[5]; 
		
		
		// intialization of array
		
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j =0;j<arr[i].length;j++){
				
				arr[i][j]=count++;
				
				//System.out.println(count);
				
			}
		}
		// traversing an 2d array
		
		for(int i = 0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				
				System.out.println(arr[i][j]);
				
			}
			System.out.println();//new line
			
		}
		

	}

}
