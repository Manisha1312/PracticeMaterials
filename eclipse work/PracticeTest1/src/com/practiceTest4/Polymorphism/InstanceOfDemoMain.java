package com.practiceTest4.Polymorphism;

public class InstanceOfDemoMain {

	public static void main(String[] args) {
		Ganga g = new Ganga();
		System.out.println(g instanceof Ganga);
		System.out.println(g instanceof River);
		
		River r = new River(); // static binding
		System.out.println(r instanceof Ganga);
		
		River t = new Ganga(); // upcasting or dynamic binding
		System.out.println(t instanceof River);
		System.out.println(t instanceof Ganga);
		
		River t1 = null;
		System.out.println(t1 instanceof Ganga);
		System.out.println(t1 instanceof River);
		
		
	}

}
