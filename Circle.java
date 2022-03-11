package com.abstraction.bll;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/*
	public double getRadius() {
		return radius;
	}
	*/
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void findArea() {
		double area = Math.PI * radius * radius;
		setArea(area);
	}
	
	@Override
	public void findCircumference() {
		double circumference = 2 * Math.PI * radius;
		setCircumference(circumference);
		
	}
}
