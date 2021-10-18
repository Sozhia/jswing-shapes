package main;

public class Circle extends PlaneSection{
	
	private double radius;
	
	public Circle() {
		
		super();
		
	}
	
	public Circle(double value) {
		
		super();
		radius = value;
		
	}

	@Override
	public void calculatePerimeter() {
		
		perimeter = PI * radius *2;
		
	}

	@Override
	public void calculateArea() {
		
		area = PI * radius * radius;
		
	}

	@Override
	public double getArea() {
		
		return area;
		
	}

	@Override
	public double getPerimeter() {
		
		return perimeter;
		
	}
	
}
