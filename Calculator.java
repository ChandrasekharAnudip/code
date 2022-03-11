package com.overloading.demo;

public class Calculator {
	public int add(int n1, int n2) { // 2 parameters
		return n1 + n2;
	}
	
	public int add(int n1, int n2, int n3) { // 3 parameters
		return n1 + n2 + n3;
	}
	
	public double add(double n1, double n2) { // 2 parameters , type is double
		return n1 + n2;
	}
}
