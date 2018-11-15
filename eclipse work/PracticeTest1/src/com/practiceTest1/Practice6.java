package com.practiceTest1;

public class Practice6 {

	public static void main(String[] args) {
		
		BankDemo b1 = new BankDemo(9874443,"rekka",10000);
		// copying the value of 1 object into another variable
		BankDemo b2 = b1;
		
	//	System.out.println("Current Blanace:" +b1.displayInformation));
		
		b1.displayInformation();
		b1.checkBalance();
		b1.moneyDeposit(60000);
		b1.checkBalance();
		b1.moneyWithdrwal(2000);
		b1.checkBalance();
		
		b2.displayInformation();
		b2.checkBalance();
		b2.moneyDeposit(60000);
		b2.checkBalance();
		b2.moneyWithdrwal(3000);
		b2.checkBalance();
		

	}

}
