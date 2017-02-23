package LAB.shapes;

import LAB.util.Point;

public class FigureSquare extends AbstractShape implements Shape{
	
	
	public FigureSquare() {
		name = "FigureSquare"; 
		period = Math.PI * 8.0;
	}
	
	
	public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 8.0)); // period is 4 circles. 
		
		if(realCircleAngle < 0) {
			if( circleAngle < ((Math.PI * 2) + (Math.PI / 2))) {
				y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + (Math.PI / 2)) * -1)); 
				x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle + (Math.PI / 2)) * -1));
				
				y += (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI * 2) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 4)) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI / 2))); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI / 2))); 
				
				y += (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
			else if( circleAngle >= (Math.PI * 4) &&  circleAngle < ((Math.PI * 6) + (Math.PI / 2))) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI / 2)) * -1); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI / 2)) * -1); 
				
				y -= (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI * 6) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 8)) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI) - (Math.PI / 2))); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI) - (Math.PI / 2))); 

				y -= (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			
		} else {
			
		if( circleAngle < ((Math.PI * 2) + (Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + (Math.PI / 2)))); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle + (Math.PI / 2))));
			
			y -= (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI * 2) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 4)) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle - (Math.PI / 2)) * -1)); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle - (Math.PI / 2)) * -1)); 
			
			y -= (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		else if( circleAngle >= (Math.PI * 4) &&  circleAngle < ((Math.PI * 6) + (Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle - (Math.PI / 2)) )); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle - (Math.PI / 2)) )); 
			
			y += (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI * 6) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 8)) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle - (Math.PI) - (Math.PI / 2)) * -1)); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle - (Math.PI) - (Math.PI / 2)) * -1)); 
			
			y += (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		}
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
