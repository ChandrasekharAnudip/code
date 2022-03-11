package com.overriding.demo;

public class FancyCalculator extends Calculator {
	@Override
	public int add(int n1, int n2) {
		return 100 + n1 + n2;
	}
}
