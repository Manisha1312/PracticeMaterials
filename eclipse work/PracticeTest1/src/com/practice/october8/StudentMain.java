package com.practice.october8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		List<Student> li = new ArrayList<>();
		li.add(new Student(102,"neha",27));
		li.add(new Student(101,"shweta",25));
		li.add(new Student(100,"mou",28));
		li.add(new Student(104,"nikita",30));
		
		Iterator itr = li.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
		System.out.println("after sorting");
		Collections.sort(li,Collections.reverseOrder());
		
		for(Student s1:li){
			System.out.println(s1.rollno+" "+s1.name+" "+s1.age);
			
		}
		
		

	}

}
