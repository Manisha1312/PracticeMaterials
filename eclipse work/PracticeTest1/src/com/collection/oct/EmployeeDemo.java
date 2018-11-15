package com.collection.oct;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDemo {

	public static void main(String[] args) {
	
		Map<Integer,Employee> m1= new HashMap<>();
		m1.put(11, new Employee(1,"manisha",70000));
		m1.put(21, new Employee(2,"mona",30000));
		m1.put(31, new Employee(3,"manisha",40000));
		m1.put(41, new Employee(4,"manisha",400000));
		
		
		// traversing
		
		for(Map.Entry<Integer,Employee> m2:m1.entrySet()){
			
			System.out.println(m2.getKey()+"   "+m2.getValue());
			 
		}
		
		
		Map<Integer,Employee>map= new HashMap<>();
		Employee e1= new Employee(1,"rohit",70000);
		Employee e2= new Employee(2,"rahul",70000);
		Employee e3= new Employee(3,"eswar",70000);
		Employee e4= new Employee(4,"kamla",70000);
		
		map.put(101, e1);
		map.put(102, e2);
		map.put(103, e3);
		map.put(104, e4);
		
		
		
		for(Map.Entry<Integer,Employee> map2: map.entrySet()){
			
			System.out.println(map2.getKey()+""+map2.getValue());
			
		}
		
	}

}
