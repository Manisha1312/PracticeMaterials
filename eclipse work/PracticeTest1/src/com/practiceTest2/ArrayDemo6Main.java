// in order to get class name and get name
// of an array
package com.practiceTest2;

public class ArrayDemo6Main {

	public static void main(String[] args) {
		int arr[] = new int[]{67,8,10};
		ArrayDemo6 a1 = new ArrayDemo6();
		a1.printArray(arr);
		
		 Class c = arr.getClass(); // as we know array itself is a class in java
		 System.out.println(c);
		 
		 String name = c.getName();
		// System.out.println(name);

	}

}
