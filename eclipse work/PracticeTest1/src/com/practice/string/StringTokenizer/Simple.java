package com.practice.string.StringTokenizer;

import java.util.StringTokenizer;

public class Simple {

	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("my name is manisha");
		
		StringTokenizer str1 = new StringTokenizer("my name is manisha,working in jp morgan");
		
		while(str.hasMoreTokens()){  // checks if there is more tokens available.
			System.out.println(str.nextToken()); // returns the next token from the StringTokenizer object.
			System.out.println("printinh with elimeter" +" "+str.nextToken(""));
		}

	}

}
