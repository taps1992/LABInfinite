package LAB.shapes;

import LAB.util.Point;

public class QuarterCircleTopLeft extends AbstractShape implements Shape{
	
	public QuarterCircleTopLeft() {
		name = "QuarterCircleTopLeft"; 
		period = Math.PI;
	}
	
	public Point draw(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {

		circleAngle = Math.abs (circleAngle % (Math.PI));
		
		if(circleAngle <= (Math.PI / 2 ) ) {
			y = ((length/2) * circleModifier) * Math.sin(((circleAngle + Math.PI))); 
			x = ((length/2) * circleModifier) * Math.cos(((circleAngle + Math.PI))); 
		}
		else if( (circleAngle > (Math.PI / 2 )) && (circleAngle <= (Math.PI + (Math.PI /2))) ) {
			y = ((length/2) * circleModifier) * Math.sin((((Math.PI - circleAngle) + Math.PI))); 
			x = ((length/2) * circleModifier) * Math.cos((((Math.PI - circleAngle) + Math.PI))); 
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
