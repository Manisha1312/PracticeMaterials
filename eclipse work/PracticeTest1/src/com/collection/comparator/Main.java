package com.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.collection.Student1;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList <Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(1,"rahul",33);
		Student s2 = new Student(2,"john",39);
		Student s3 = new Student(3,"ranbir",30);
		Student s4 = new Student(4,"ronak",25);
		Student s5 = new Student(5,"roggers",28);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		System.out.println("The required normal List");
		
Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			Student st=(Student)itr.next(); 
			
			System.out.println(st.rollno+" "+st.name+" "+st.age); 
			
		}
		
		System.out.println("sorting by age...");  
		
		
		Collections.sort(al,new AgeComparator()); 
		
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Student st2=(Student)itr2.next();  
		System.out.println(st2.rollno+" "+st2.name+" "+st2.age);  
		}  
		
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator itr3=al.iterator();  
		while(itr3.hasNext()){  
		Student st3=(Student)itr3.next();  
		System.out.println(st3.rollno+" "+st3.name+" "+st3.age);  
		}  

	}

}
