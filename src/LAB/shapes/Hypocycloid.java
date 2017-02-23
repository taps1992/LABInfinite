package LAB.shapes;

import LAB.util.Point;

public class Hypocycloid extends AbstractShape implements Shape{
	
	double a;
	double b;
	double theta;
	double alpha;
	double points = 4; 
	
	public Hypocycloid() {
		name = "RealHypocycloid";
		period = Math.PI * 4;
	}
	
	public Hypocycloid(double pathRotation) {
		name = "RealHypocycloid";
		period = Math.PI * 4;
		
		specialPathRotation = pathRotation; 
	}
	
	public Point draw(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {
		double a = ((length/2)) * circleModifier; // -30
		double b = a / points; // number of points. 4 points
		double theta = circleAngle; // where we are around the circle. 
		double alpha = ((a - b) / b) * theta;
		
		x = ((a - b) * Math.cos(theta)) - (b * Math.cos(alpha));
		y = ((a - b) * Math.sin(theta)) + (b * Math.sin(alpha));
		
		// swapping initial sin and cos around makes an epicycloid. 
		// swapping both makes for turned hypocycloid. 
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 

	}
}
