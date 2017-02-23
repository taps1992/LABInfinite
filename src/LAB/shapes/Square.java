package LAB.shapes;

import LAB.util.Point;

public class Square extends AbstractShape implements Shape{
	
	public Square() {
		name = "Square";
		period = Math.PI * 2;
	}
	
	public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
		circleAngle = circleAngle % (Math.PI * 2.0);
		
		if(circleAngle <= (Math.PI/2)) {
			y = ((length) * circleModifier) * Math.sin((circleAngle )); 
			x = 0;
		}
		if(circleAngle > (Math.PI/2) && circleAngle <= Math.PI) {
			y = ((length) * circleModifier);  
			x = ((length) * circleModifier) * Math.cos((circleAngle ));
		}
		if(circleAngle > (Math.PI) && circleAngle <= (Math.PI + (Math.PI/2))) {
			y = ((length * circleModifier) ) + (((length) * circleModifier) * Math.sin((circleAngle ))); 
			x = -1 * ((length) * circleModifier);
		}
		if(circleAngle > (Math.PI + (Math.PI/2))) {
			y = 0; 
			x = (((length) * circleModifier) * Math.cos((circleAngle ))) - ((length * circleModifier) ) ;
		}
		
		
		
		p.x = (int)x;
		p.y = (int)y;
		
		return p;
	}
}
