package com.practice.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("mani");
		Matcher m = pattern.matcher("my name is mani why mani");

		// we can also write this

		Matcher m1 = Pattern.compile("ma").matcher("manishamani");
		boolean b2=Pattern.compile("mani*sha").matcher("manisha").matches(); 
		System.out.println(b2);

		while (m.find()) {

			System.out.println("pattern found:" + "  " + m.start() + "  " + (m.end() - 1)+" "+m.groupCount());
			

		}

		while (m1.find()) {

			System.out.println("pattern found:" + "  " + m1.start() + "  " + (m1.end() - 1));

		}

	}

}
