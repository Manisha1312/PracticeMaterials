package com.practiceTest1;

public class BankDemo {
	
	int account_no;                            // non-static variable
	String name;
	private float amount;
	

	BankDemo(int a,String n,float amt){               // constructor in order to pass values
		this.account_no = a;
		this.name = n;
		this.amount = amt;}
	
	void checkBalance(){
		System.out.println("The current balance is:" + amount);
	}
	
	
	void displayInformation(){
		System.out.println(account_no +" " +"name"+ " " +amount);
	}
	 			
		
	// money deposit
	void moneyDeposit(float amt){
		
		amount = amount + amt;
		System.out.println("Deposited amount:" +amt);
		System.out.println("Total amount after deposit:" +amount);}
	
		 // money withdrawn
	void moneyWithdrwal(float amt){
		
		if (amt > amount){
		
		System.out.println("insufficent balance:" + amount);	
		
		}else{
		amount = amount - amt;	
		System.out.println("money wthdrwan:" +amount);}	
			
	}
 
	
	
}








