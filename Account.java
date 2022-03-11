package com.encap.demo;

public class Account {
	private String id;
	private String name;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(String id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
		
	// we are not going to define setter for balance.
	
	// deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	// withdraw
	
	/*
	public void withdraw(double amount) {
		balance = balance - amount;
	}*/
	
	
	
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			return true;
		}
		else
			return false;
	}
	
	
	@Override
	public String toString() {
		return "\nID: " + id + "\nName: " + name + "\nBalance: " + balance;
	}
	
	
}
