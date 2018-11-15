package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student1Main {

	public static void main(String[] args) {
		
		
		List<Student1> al = new ArrayList<Student1>();
		
		Student1 s1 = new Student1(1,"rahul",33);
		Student1 s2 = new Student1(2,"john",39);
		Student1 s3 = new Student1(3,"ranbir",30);
		Student1 s4 = new Student1(4,"ronak",25);
		Student1 s5 = new Student1(5,"roggers",28);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		//al.add(s1);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());  
			
		}
		
		// sorting
		
		Collections.sort(al);
				
		
		System.out.println("The required list after sorting");
		
		
		for(Student1 bl : al){
			
			System.out.println(bl.rollno+" "+bl.name+" "+bl.age);  
			
		}
		
		
	}

}
