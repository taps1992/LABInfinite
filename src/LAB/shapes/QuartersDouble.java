package LAB.shapes;

import LAB.util.Point;

public class QuartersDouble extends AbstractShape implements Shape{
	
	public QuartersDouble() {
		name = "QuartersDouble"; 
		period = (Math.PI * 10);
	}
	
	public Point draw(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {

		circleAngle = Math.abs (circleAngle % period);
		double fakeAngle = circleAngle % (Math.PI * 2);
		double fakeAngle2 = circleAngle % (Math.PI);
		
		if(circleAngle <= (1.0 * (Math.PI * 2)) + (Math.PI / 2)) {
			// 0 - 4
			if(fakeAngle <= (Math.PI / 2)) {
				// 0 -> 1
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 - (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 - (Math.PI / 2)))); 
			}
			else if( (fakeAngle > (Math.PI / 2)) && (fakeAngle <= Math.PI) ) {
				// 1 -> 2
				y = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) - (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) - (Math.PI / 2)))); 
			}
			else if( (fakeAngle > (Math.PI)) && (fakeAngle <= (Math.PI) + (Math.PI / 2)) ) {
				// 2 -> 3
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 - (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 - (Math.PI / 2)))); 
			}
			else if( (fakeAngle > (Math.PI) + (Math.PI / 2)) && (fakeAngle <= ((Math.PI * 2) + (Math.PI / 2))) ) {
				// 3 -> 5
				y = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) - (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) - (Math.PI / 2))));
			}
		}
		else if (circleAngle <= (2.0 * (Math.PI * 2)) + (Math.PI)) {
			// 4 - 8
			if(fakeAngle <= (Math.PI / 2 ) ) {
				y = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 - (Math.PI + (Math.PI))) )); 
				x = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 - (Math.PI + (Math.PI))) )); 
			}
			else if( (fakeAngle > (Math.PI / 2 )) && (fakeAngle <= (Math.PI)) ) {
				y = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) - (Math.PI * 2)) )); 
				x = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) - (Math.PI * 2)) )); 
			}
			else if( (fakeAngle > (Math.PI)) && (fakeAngle <= (Math.PI) + (Math.PI / 2)) ) {
				// 2 -> 3
				y = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 - (Math.PI + (Math.PI))) )); 
				x = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 - (Math.PI + (Math.PI))) )); 
			}
			else if( (fakeAngle > (Math.PI) + (Math.PI / 2)) && (fakeAngle <= ((Math.PI * 2) + (Math.PI / 2))) ) {
				// 3 -> 5
				y = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) - (Math.PI * 2)) )); 
				x = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) - (Math.PI * 2)) )); 
			}
		}
		else if(circleAngle <= (3.0 * (Math.PI * 2)) + (Math.PI / 2) + (Math.PI)) {
			// 9 - 12
			if(fakeAngle <= (Math.PI / 2 ) ) {
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 + (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 + (Math.PI / 2)))); 
			}
			else if( (fakeAngle > (Math.PI / 2 )) && (fakeAngle <= (Math.PI )) ) {
				y = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) + (Math.PI / 2)) )); 
				x = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) + (Math.PI / 2)) )); 
			}
			else if( (fakeAngle > (Math.PI)) && (fakeAngle <= (Math.PI) + (Math.PI / 2)) ) {
				// 2 -> 3
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 + (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 + (Math.PI / 2)))); 
			}
			else if( (fakeAngle > (Math.PI) + (Math.PI / 2)) && (fakeAngle <= ((Math.PI * 2) + (Math.PI / 2))) ) {
				// 3 -> 5
				y = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) + (Math.PI / 2)) )); 
				x = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) + (Math.PI / 2)) )); 
			}
		}
		else {
			// 1 - 3
			if(fakeAngle <= (Math.PI / 2 ) ) {
				y = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 + Math.PI))); 
				x = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 + Math.PI))); 
			}
			else if( (fakeAngle > (Math.PI / 2 )) && (fakeAngle <= (Math.PI)) ) {
				y = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) + Math.PI))); 
				x = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) + Math.PI))); 
			}
			else if( (fakeAngle > (Math.PI)) && (fakeAngle <= (Math.PI) + (Math.PI / 2)) ) {
				// 2 -> 3
				y = ((length/2) * circleModifier) * Math.cos(((fakeAngle2 + Math.PI))); 
				x = ((length/2) * circleModifier) * Math.sin(((fakeAngle2 + Math.PI))); 
			}
			else if( (fakeAngle > (Math.PI) + (Math.PI / 2)) && (fakeAngle <= ((Math.PI * 2) + (Math.PI / 2))) ) {
				// 3 -> 5
				y = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle2) + Math.PI))); 
				x = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle2) + Math.PI))); 
			}
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}