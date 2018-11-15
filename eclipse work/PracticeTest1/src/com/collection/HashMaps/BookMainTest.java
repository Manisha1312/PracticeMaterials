package com.collection.HashMaps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookMainTest {
	@Before
	public void setUp(){
		System.out.println("Before Test");
	}
	
	
	@After
	public void tearDown(){
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void setUp1(){
		System.out.println("Before Test class");
	}
	
	
	@AfterClass
	public static void tearDown1(){
		System.out.println("After Test class");
	}

	@Test
	public void TestCreateMethod_Positive() {
		 Map<Integer,Book> map=new HashMap<Integer,Book>(); 
		BookMain.createMap(map);
		assertTrue("Map should not be empty",map.size()>0);
		assertNotNull((map.get(1)));
	}


	@Test
	public void TestCreateMethod_Positive1() {
		 Map<Integer,Book> map=new HashMap<Integer,Book>(); 
		BookMain.createMap(map);
		Book b = map.get(1);
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		assertEquals(b1, b);
		
	}
}
