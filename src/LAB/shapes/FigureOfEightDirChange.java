package LAB.shapes;

import LAB.util.Point;

public class FigureOfEightDirChange extends AbstractShape implements Shape{
	
	
	public FigureOfEightDirChange() {
		name = "DirChangeFigEight"; 
		period = Math.PI * 4.0;
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
			if(realCircleAngle < 0) {
				y = ((length/2) * circleModifier) * Math.sin((realCircleAngle) * -1); 
				x = ((length/2) * circleModifier) * Math.cos((realCircleAngle) * -1); 
			}
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle)); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle)); 
			
			x -= (length / 2) * circleModifier; 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
