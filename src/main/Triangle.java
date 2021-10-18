package main;

public class Triangle extends Polygon{ 
	
	// We assume that all triangles are equilateral
	
	public Triangle() {
		
		super();
		
	}
	
	public Triangle(double value) {
		
		super();
		side = value;
		
	}

	@Override
	public void calculatePerimeter() {
		 
		perimeter = side * 3;
		
	}

	@Override
	public void calculateArea() {

		area = ( Math.sqrt(3) / 4 ) * Math.pow( side, 2 );
		
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
