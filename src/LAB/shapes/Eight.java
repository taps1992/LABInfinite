package LAB.shapes;

import LAB.util.Point;

public class Eight extends AbstractShape implements Shape{
	
	
	public Eight() {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
	}
	
	public Eight(double pathRotation) {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
		specialPathRotation = pathRotation; 
	}
	
	public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

		circleAngle = circleAngle % (Math.PI * 4.0); // period is 2 circles. 
		
		if( circleAngle < (Math.PI * 2)) {
			y = ((length/2) * circleModifier) * Math.sin(((circleAngle + Math.PI))); 
			x = ((length/2) * circleModifier) * Math.cos(((circleAngle + Math.PI)));
			
			x += (length / 2) * circleModifier; 
		}
		else {
			//handDirection *= -1;
			y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
			
			x -= (length / 2) * circleModifier; 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
