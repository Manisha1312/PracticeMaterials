package com.array;

import java.io.IOException;
import java.util.Scanner;
 
public class NoOfPathsInMatrix {
 
    int m,n;
    int arr[][]=null;
     
    public static void main(String[] args)throws IOException {
 
        NoOfPathsInMatrix obj=new NoOfPathsInMatrix();
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of rows in matrix : ");
        obj.m = in.nextInt();
        System.out.println("Enter the no of cols in matrix : ");
        obj.n = in.nextInt();
         
        obj.arr = new int[obj.m][obj.n];
        for(int i=0; i< obj.m;i++)
        {
            System.out.println("Enter "+(i+1)+"th row : ");
            for(int j=0;j<obj.n;j++)
            {
                obj.arr[i][j] = in.nextInt();
            }
        }
         
        System.out.println("No of paths : "+obj.numberOfPaths(obj.arr,obj.m,obj.n));
    }
 
    private int numberOfPaths(int[][] arr2, int M, int N) {
		return noOfPaths(arr2,0,0,M,N);
	}

	int noOfPaths(int a[][], int i,int j,int m,int n)
    {   
        if(i==m-1 && j==n-1)
            return a[i][j];
        else if (i==m-1 && a[i][j]==1)
            return a[i][j+1];
        else if (j==n-1 && a[i][j]==1)
            return a[i+1][j];
        else if(a[i][j]==1)
            return noOfPaths(a,i+1,j,m,n) + noOfPaths(a,i,j+1,m,n);
        else
            return 0;
    }
}


/*static int numberOfPaths(int [][]a,int M,int N) {
    return noOfPaths(a,0,0,M,N);
}

	static int noOfPaths(int a[][], int i,int j,int m,int n)
    {   
        if(i==m-1 && j==n-1)
            return a[i][j];
        else if (i==m-1 && a[i][j]==1)
            return a[i][j+1];
        else if (j==n-1 && a[i][j]==1)
            return a[i+1][j];
        else if(a[i][j]==1)
            return noOfPaths(a,i+1,j,m,n) + noOfPaths(a,i,j+1,m,n);
        else
            return 0;
    }*/