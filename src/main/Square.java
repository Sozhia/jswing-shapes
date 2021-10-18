package main;

public class Square extends Polygon{
	
	private double side;
	
	public Square(){
		
		super();
	
	}
	
	public Square (double value) {
		
		super();
		side = value;
	}

	@Override
	public void calculatePerimeter() {

		perimeter = side * 4;
		
	}

	@Override
	public void calculateArea() {
		
		area = side * side;
		
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
