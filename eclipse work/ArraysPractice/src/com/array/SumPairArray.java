package com.array;
/*
 * Given an array and a number, check for pair in sum a*/

import java.util.HashSet;
import java.util.Scanner;

public class SumPairArray {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		printpairs(arr,sum);
	}

	private static void printpairs(int[] arr,int sum) {
		int count =0 ;
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			h.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++){
			if(h.contains(arr[i]-sum)){
				count++;
			}
		}
		System.out.println(""+count);
		
	}
}
