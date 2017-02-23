package LAB.shapes;

import LAB.util.Point;

public class QuartersByThreeReversed extends AbstractShape implements Shape{
	
	public QuartersByThreeReversed() {
		name = "QuartersByThreeReversed"; 
		period = Math.PI * 6;
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {

		double circleAngle = Math.abs( realCircleAngle % ((Math.PI * 6)));
		double fakeAngle = ( realCircleAngle % ((Math.PI * 6))) % Math.PI;
		
		
		
		if(circleAngle <= (Math.PI + (Math.PI / 2))) {
			if(fakeAngle <= (Math.PI / 2 ) ) {
				y = ((length/2) * circleModifier) * Math.cos(((fakeAngle + Math.PI))); 
				x = ((length/2) * circleModifier) * Math.sin(((fakeAngle + Math.PI))); 
			}
			else if( (fakeAngle > (Math.PI / 2 )) && (fakeAngle <= (Math.PI + (Math.PI /2))) ) {
				y = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle) + Math.PI))); 
				x = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle) + Math.PI))); 
			}
		}
		else if (circleAngle <= 2.0 * (Math.PI + (Math.PI / 2))) {
			if(fakeAngle <= (Math.PI / 2 ) ) {
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle + (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle + (Math.PI / 2)))); 
			}
			else if( (fakeAngle > (Math.PI / 2 )) && (fakeAngle <= (Math.PI + (Math.PI /2))) ) {
				y = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle) + (Math.PI / 2)) )); 
				x = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle) + (Math.PI / 2)) )); 
			}
		}
		else if(circleAngle <= 3.0 * (Math.PI + (Math.PI / 2))) {
			if(fakeAngle <= (Math.PI / 2 ) ) {
				y = ((length/2) * circleModifier) * Math.cos(((fakeAngle - (Math.PI + (Math.PI))) )); 
				x = ((length/2) * circleModifier) * Math.sin(((fakeAngle - (Math.PI + (Math.PI))) )); 
			}
			else if( (fakeAngle > (Math.PI / 2 )) && (fakeAngle <= (Math.PI + (Math.PI /2))) ) {
				y = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle) - (Math.PI+ (Math.PI))) )); 
				x = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle) - (Math.PI+ (Math.PI))) )); 
			}
		}
		else {
			if(fakeAngle <= (Math.PI / 2 ) ) {
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle - (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle - (Math.PI / 2)))); 
			}
			else if( (fakeAngle > (Math.PI / 2 )) && (fakeAngle <= (Math.PI + (Math.PI /2))) ) {
				y = ((length/2) * circleModifier) * Math.sin((((Math.PI - fakeAngle) - (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos((((Math.PI - fakeAngle) - (Math.PI / 2)))); 
			}
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
