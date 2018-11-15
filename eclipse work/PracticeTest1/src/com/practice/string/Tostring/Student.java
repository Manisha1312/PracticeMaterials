package com.practice.string.Tostring;

public class Student {
	int rollno;
	String name;
	String city;

	Student(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;

	}

	public String toString() {

		return rollno + " " + name + " " + city;

	}
}
