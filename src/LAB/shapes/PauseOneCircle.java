package LAB.shapes;

import LAB.util.Point;

public class PauseOneCircle extends AbstractShape implements Shape {

	public PauseOneCircle() {
		name = "PauseCircle"; 
		period = Math.PI * 4;
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 3)));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI)) 
		{   // 0 -> 1 pause
			x = ((length/2) * circleModifier) * Math.cos((Math.PI)); 
		    y = ((length/2) * circleModifier) * Math.sin((Math.PI)); 
		}
		else if(circleAngle > (Math.PI) && circleAngle <= ((Math.PI * 2) + Math.PI)) 
		{   // 1 -> 3 down
			x = ((length/2) * circleModifier) * Math.cos((circleAngle));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}

}
