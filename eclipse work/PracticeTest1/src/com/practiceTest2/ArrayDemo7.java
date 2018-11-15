package com.practiceTest2;

public class ArrayDemo7 {

	void operation(int arr1[][], int rowLength, int colLength) {

		int even[] = new int[rowLength * colLength];
		int odd[] = new int[rowLength * colLength];
		int count = 0;
		int count1 = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				if ((arr1[i][j] % 2) == 0)
					// System.out.println("Even number " + arr1[i][j]);
					even[count++] = arr1[i][j];

				else
					// System.out.println("Odd number " + arr1[i][j]);
					odd[count1++] = arr1[i][j];

			}

		}
		for(int k =0;k<even.length;k++){
			System.out.println("even number is:"+even[k]);
			
		}
		for(int m=0;m<even.length;m++){
			System.out.println("od number:"+odd[m]);
			
		}
		
		

	}
}
