package com.overriding.demo;

public class Test {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println("Sum: " + cal.add(10,10));

		FancyCalculator fcal = new FancyCalculator();
		
		System.out.println("Sum: " + fcal.add(10,10));

	}
	

}
