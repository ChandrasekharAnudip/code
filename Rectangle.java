package com.abstraction.bll;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public void findArea() {
		double area = length * width;
		setArea(area);
		
	}

	@Override
	public void findCircumference() {
		double circum = 2 * (length + width);
		setCircumference(circum);
	}

}
