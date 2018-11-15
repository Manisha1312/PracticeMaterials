package com.design.singleton;

public class MainSingletonythread {

	public static void main(String[] args) {
		
		Singletonythread s1 = Singletonythread.getInstance();
		Singletonythread s2 = Singletonythread.getInstance();
		s1.main();
		s2.main();
	}
}
