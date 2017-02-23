package LAB.shapes;

import LAB.util.Point;

public class HypocycloidFake extends AbstractShape implements Shape{
	
	public HypocycloidFake() {
		name = "Hypocycloid";
		period = Math.PI * 4;
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {
		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 2.0)); // period is 1 circles. 
		
		if(realCircleAngle > 0) {
		if( circleAngle < ((Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle - (Math.PI / 2)))); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle - (Math.PI / 2))));
			
			y += (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI / 2)) &&  circleAngle < (Math.PI)) {
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI / 2))); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2))); 
			
			y += (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		else if( circleAngle >= (Math.PI) &&  circleAngle < ((Math.PI) + (Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI / 2))); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI / 2))); 
			
			y -= (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 2)) {
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI / 2))); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2))); 

			y -= (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		}
		else {
			if( circleAngle < ((Math.PI / 2))) {
				y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle - (Math.PI / 2)))); 
				x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle - (Math.PI / 2))));
				
				y += (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI / 2)) &&  circleAngle < (Math.PI)) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI / 2))); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2))); 
				
				y += (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			else if( circleAngle >= (Math.PI) &&  circleAngle < ((Math.PI) + (Math.PI / 2))) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI / 2))); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI / 2))); 
				
				y -= (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 2)) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI / 2))); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2))); 

				y -= (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
		}
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 

	}
}
