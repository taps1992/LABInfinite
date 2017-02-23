package LAB.shapes;

import LAB.util.Point;

public class Circle extends AbstractShape implements Shape{

	public Circle() {
		name = "Circle"; 
		period = Math.PI * 2; 
	}
	
	public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
		y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
		x = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
