package com.abstraction.pll;

import com.abstraction.bll.Circle;
import com.abstraction.bll.Rectangle;
import com.abstraction.bll.Shape;

public class TestShape {

	public static void main(String[] args) {
		Shape s = null;
		
		
		s = new Circle(1);
		
		s.findArea();
		s.findCircumference();
		
		System.out.println("Area of circle: " + s.getArea());
		
		System.out.println("Circumference of circle: " + s.getCircumference());
		
		s = new Rectangle(1,1);
		
		s.findArea();
		s.findCircumference();
		
		System.out.println("Area of rectangle: " + s.getArea());
		
		System.out.println("Circumference of rectangle: " + s.getCircumference());
		
		
		//s.setRadius(1); // setRadius() method is not defined in Shape class.
		
		
		/*
		Circle c = new Circle();
		c.setRadius(1);
		
		s = c;
		*/
		
		
		
		
		

	}

}
