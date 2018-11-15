package com.practice.october8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainStudent2 {

	public static void main(String[] args) {
		
		List<Student2> li = new ArrayList<>();
		
		li.add(new Student2(102,"neha",27));
		li.add(new Student2(101,"shweta",25));
		li.add(new Student2(100,"mou",28));
		li.add(new Student2(104,"nikita",30));
		
		System.out.println("before sorting");
		
		for(Student2 s1:li){
			System.out.println(s1.roll_no+" "+s1.name+" "+s1.age);
		}
		
		System.out.println("Sorting by age");
		Collections.sort(li,  new AgeComparator());
		for(Student2 s1:li){
			System.out.println(s1.roll_no+" "+s1.name+" "+s1.age);
		}
		
		System.out.println("Sorting by name");
		Collections.sort(li,  new NameComparator());
		for(Student2 s1:li){
			System.out.println(s1.roll_no+" "+s1.name+" "+s1.age);
		}
		
		
		

	}

}
