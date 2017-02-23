package LAB.shapes;

import LAB.util.Point;

public class FigureOfEight extends AbstractShape implements Shape{
	
	
	public FigureOfEight() {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
	}
	
	public FigureOfEight(double pathRotation) {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
		specialPathRotation = pathRotation; 
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 4.0)); // period is 2 circles. 
		
		if( circleAngle < (Math.PI * 2)) {
			if(realCircleAngle < 0) {
				y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + Math.PI) * -1)); 
				x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle + Math.PI) * -1));
			}
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + Math.PI))); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle + Math.PI)));
			
			x += (length / 2) * circleModifier; 
		}
		else {
			//handDirection *= -1;
			if(realCircleAngle < 0) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle)); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle)); 
			}
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle * -1)); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle * -1)); 
			
			x -= (length / 2) * circleModifier; 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
