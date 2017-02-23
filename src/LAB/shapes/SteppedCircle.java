package LAB.shapes;

import LAB.util.Point;

public class SteppedCircle extends AbstractShape implements Shape{
	
	public SteppedCircle() {
		name = "SteppedCircle"; 
		period = Math.PI * 6;
	}
	
	public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

		circleAngle = circleAngle % ((Math.PI * 6));
		//double fakeAngle = circleAngle % (Math.PI * 2);
		
		if(circleAngle <= (Math.PI)) {
			y = ((length/2) * circleModifier) * Math.sin((Math.PI / 2) ); 
			x = ((length/2) * circleModifier) * Math.cos((Math.PI / 2) );
		}
		else if(circleAngle <= Math.PI + (Math.PI / 2)) {
			double fakeAngle = circleAngle - (Math.PI /2 );
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle )); 	
		}
		else if (circleAngle <= (Math.PI * 2 + (Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin(Math.PI); 
			x = ((length/2) * circleModifier) * Math.cos(Math.PI);
		}
		else if(circleAngle <= (Math.PI * 3)) {
			double fakeAngle = circleAngle - (Math.PI + (Math.PI / 2));
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle )); 
		}
		else if(circleAngle <= ((Math.PI * 4) )) {
			y = ((length/2) * circleModifier) * Math.sin(((Math.PI) + (Math.PI / 2)) ); 
			x = ((length/2) * circleModifier) * Math.cos(((Math.PI) + (Math.PI / 2)) );
		}
		else if(circleAngle <= (Math.PI * 4) + (Math.PI / 2)) {
			double fakeAngle = circleAngle - ((Math.PI * 2) + (Math.PI / 2));
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle )); 	
		}
		else if(circleAngle <= ((Math.PI * 5) + (Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin((Math.PI * 2) ); 
			x = ((length/2) * circleModifier) * Math.cos((Math.PI * 2) );
		}
		else {
			double fakeAngle = circleAngle - ((Math.PI * 3) + (Math.PI / 2));
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle )); 
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
