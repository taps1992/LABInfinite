package LAB.shapes;

import LAB.util.Point;

public class PausedTwoIsoPOP extends AbstractShape implements Shape {

	public PausedTwoIsoPOP() {
		name = "PausedCircle"; 
		period = Math.PI * 6;
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI)) 
		{   // 0 -> 1 pause
			x = ((length/2) * circleModifier) * Math.cos((Math.PI)); 
		    y = ((length/2) * circleModifier) * Math.sin((Math.PI)); 
		}
		else if(circleAngle > (Math.PI) && circleAngle <= ((Math.PI) + Math.PI)) 
		{   // 1 -> 3 down
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle));  
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle)); 
		}
		else if(circleAngle > (Math.PI) + Math.PI && circleAngle <= ((Math.PI * 3) )) 
		{   // 3 -> 4 pause
			x = ((length/2) * circleModifier) * Math.cos((0));  
		    y = ((length/2) * circleModifier) * Math.sin((0)); 
		}
		else
		{   // 4 -> 6 
		    x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + Math.PI));  
		    y = ((length/2) * circleModifier) * Math.sin(((realCircleAngle + Math.PI))); 
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
