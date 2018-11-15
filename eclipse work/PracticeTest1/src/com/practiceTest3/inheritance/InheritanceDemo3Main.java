package com.practiceTest3.inheritance;

public class InheritanceDemo3Main {

	public static void main(String[] args) {
		DuetcheBank d = new DuetcheBank();
		SbiBank s = new SbiBank();
		HdfcBank h = new HdfcBank();
		System.out.println("Duetche Rate of Interest:"+" "+ d.rateOfInterest());
		System.out.println("SBI Rate of interest:"+" "+s.rateOfInterest());
		System.out.println("HDFC Rtae of interest:"+" "+h.rateOfInterest());
		
		
		
	}

}
