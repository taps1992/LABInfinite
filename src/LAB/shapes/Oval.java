package LAB.shapes;

import LAB.util.Point;

public class Oval extends AbstractShape implements Shape{

	public Oval() {
		name = "Oval"; 
		period = Math.PI * 2; 
	}
	
	public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
		y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
		x = ((length/2) * circleModifier * 2) * Math.cos((circleAngle)); 
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
