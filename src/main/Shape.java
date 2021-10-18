package main;

public abstract class Shape {

	protected double area, perimeter;
	
	public Shape() {}
	
	public abstract void calculatePerimeter();
	
	public abstract void calculateArea();

	public abstract double getArea();
	
	public abstract double getPerimeter();

}
