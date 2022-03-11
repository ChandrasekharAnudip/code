package com.encap.demo;

public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account("C0001002", "Ramesh", 35000);
		
		//System.out.println("ID: " + acc1.getId() + "\nName: " 
			//		+ acc1.getName() + "\nBalance: " + acc1.getBalance());
		
		System.out.println(acc1);
		
		
		acc1.setName("Ramesh Naik");
		
		System.out.println("++++++++++++++++++++++");
		
		System.out.println(acc1);
		
		acc1.deposit(12500);
		
		System.out.println("++++++++++++++++++++++");
		
		System.out.println(acc1);
		
		if(acc1.withdraw(40000))
			System.out.println("Success");
		else
			System.out.println("Failed");
		
		System.out.println(acc1.getBalance());
	
	}

}
