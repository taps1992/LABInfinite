package LAB.shapes;

import LAB.util.Point;

public class LissajousCurve extends AbstractShape implements Shape{
	
	double a = 0.5; // wide
	double b = 1; // tall
	double n = 2; // curve
	double c = 0; // centred
	
	public LissajousCurve() {
		name = "LissajousCurve"; 
		period = Math.PI * 4;
	}
	
	public LissajousCurve(double pathRotation) {
		name = "LissajousCurve"; 
		period = Math.PI * 4;
		specialPathRotation = pathRotation; 
	}
	
	public Point draw(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {

		x = (length * circleModifier ) * (a * Math.sin(n  * (circleAngle) + c));
		y = (length * circleModifier ) * (b * Math.sin((circleAngle))) ;
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
