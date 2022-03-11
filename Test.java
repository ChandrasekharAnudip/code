package com.overloading.demo;

public class Test {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println("Sum = " + cal.add( 10,20));
		
		System.out.println("Sum = " + cal.add(10, 20, 30));
		
		System.out.println("Sum = " + cal.add(10.13, 20.54));
		
		Base b = new Base();
		
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("Sum = " + b.add( 10,20));
		
		//System.out.println("Sum = " + b.add(10.13, 20.54));
		System.out.println("+++++++++++++++++++++++++");
		
		Derived d = new Derived();
		System.out.println("Sum = " + d.add( 10,20));
		System.out.println("Sum = " + d.add(10.13, 20.54));
		
	}

}
