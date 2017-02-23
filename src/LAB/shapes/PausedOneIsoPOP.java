package LAB.shapes;

import LAB.util.Point;

public class PausedOneIsoPOP extends AbstractShape implements Shape {

	public PausedOneIsoPOP() {
		name = "OneIsoPOP"; 
		period = Math.PI * 4;
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI * 2)) 
		{   // 0 -> 1 pause
			x = ((length/2) * circleModifier) * Math.cos((0)); 
		    y = ((length/2) * circleModifier) * Math.sin((0)); 
		}
		else if(circleAngle > (Math.PI * 2) && circleAngle <= ((Math.PI * 3) + Math.PI)) 
		{   // 1 -> 3 down
			x = ((length/2) * circleModifier) * Math.cos((circleAngle));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
