package LAB.shapes;

import LAB.util.Point;

public class FigureSquareDirChange extends AbstractShape implements Shape{
	
	
	public FigureSquareDirChange() {
		name = "DC-FigureSquare"; 
		period = Math.PI * 8.0;
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

		// short dc
		if(realCircleAngle > 0) {
		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 6.0)); // period is 4 circles. 
		
			if( circleAngle < ((Math.PI * 1) + (Math.PI / 2))) {
				y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + (Math.PI / 2)) * -1)); 
				x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle + (Math.PI / 2)) * -1));
				
				y += (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI * 1) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 3)) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI / 2)) * -1); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI / 2)) * -1); 
				
				y += (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
			else if( circleAngle >= (Math.PI * 3) &&  circleAngle < ((Math.PI * 4) + (Math.PI / 2))) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI / 2)) * -1); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2)) * -1); 
				
				y -= (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI * 4) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 6)) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI / 2)) * -1); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI / 2)) * -1); 

				y -= (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			
		} else { 
		// long dc	
		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 10.0)); // period is 4 circles. 
		
		if( circleAngle < ((Math.PI * 2) + (Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + (Math.PI / 2)))); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle + (Math.PI / 2))));
			
			y -= (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI * 2) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 5)) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle - (Math.PI / 2)) )); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle - (Math.PI / 2)) )); 
			
			y -= (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		else if( circleAngle >= (Math.PI * 5) &&  circleAngle < ((Math.PI * 7) + (Math.PI / 2))) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + (Math.PI / 2)) )); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle + (Math.PI / 2)) )); 
			
			y += (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI * 7) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 10)) {
			y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle - (Math.PI / 2)) )); 
			x = ((length/2) * circleModifier) * Math.cos(((realCircleAngle - (Math.PI / 2)) )); 
			
			y += (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
