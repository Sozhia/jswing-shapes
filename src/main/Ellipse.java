package main;

public class Ellipse extends PlaneSection{
	
	protected double semiMajorAxis, semiMinorAxis;
	
	public Ellipse(){
		
		super();
		
	}
	
	public Ellipse(double major, double minor) {
		
		super();
		semiMajorAxis = major / 2;
		semiMinorAxis = minor / 2;
		
	}
	
	
	@Override
	public void calculatePerimeter() {
		
		double h, numerator, denominator, thirdterm;
		
		// Ramanujan approx
		
		numerator = Math.pow(semiMajorAxis - semiMinorAxis, 2);
		
		denominator = Math.pow(semiMajorAxis + semiMinorAxis, 2);
		
		h =  numerator / denominator;
		
		thirdterm = (1 + ((3 * h) / 10 + Math.sqrt(4 - 3 * h)));
		
		perimeter = PI * denominator * thirdterm;
		
	}

	@Override
	public void calculateArea() {

		area = PI * semiMajorAxis * semiMinorAxis;
		
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
