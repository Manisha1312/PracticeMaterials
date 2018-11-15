package com.collection;

public class Student1 implements Comparable<Student1> {

	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	

//	public int comapreTo(Student1 st) {
//		if (this.age == st.age)
//			return 0; // if age equal
//		else if (age > st.age)
//			return 1;
//		else
//			return -1;
//
//	}
	
	public String toString(){
		 return rollno+" "+name+" "+age;
		
	}


	@Override
	public int compareTo(Student1 st) {
		if (this.age == st.age)
			return 0; // if age equal
		else if (age > st.age)
			return 1;
		else
			return -1;

	}
	}


