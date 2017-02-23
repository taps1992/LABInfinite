package LAB.shapes;

import LAB.util.Point;

public class LinePoints extends AbstractShape implements Shape{
	
	private double lineCircleModifier = 0; 
	
	public LinePoints() {
		name = "LinePoints"; 
		period = Math.PI * 2;
	}
	
	public LinePoints(double circleMod) {
		name = "LinePoints"; 
		period = Math.PI * 2;
		lineCircleModifier = circleMod; 
		if(circleMod == Math.PI/2) name="VerticalLinePoints";
	}
	
	public Point draw(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {
		
		// stateless draw method
		if(lineCircleModifier != 0 && lineCircleModifier == (Math.PI / 2))
		{ // vertical
			circleAngle = Math.abs (circleAngle % ((Math.PI * 3) + (Math.PI)));
			
			if(circleAngle > 0 && circleAngle <= (Math.PI)) 
			{   // 0 -> 1 pause
				x = 0; 
			    y = ((length/2) * circleModifier) * Math.cos((Math.PI)); 
			}
			else if(circleAngle > (Math.PI) && circleAngle <= ((Math.PI) + Math.PI)) 
			{   // 1 -> 3 down
				x = 0; 
				y = ((length/2) * circleModifier) * Math.cos(((circleAngle))); 
			}
			else if(circleAngle > (Math.PI) + Math.PI && circleAngle <= ((Math.PI * 3) )) 
			{   // 3 -> 4 pause
				x = 0; 
			    y = ((length/2) * circleModifier) * Math.cos((0)); 
			}
			else
			{   // 4 -> 6 
			    x = 0; 
			    y = ((length/2) * circleModifier) * Math.cos(((circleAngle + Math.PI))); 
			}
		}
		else 
		{ // horizontal
            circleAngle = circleAngle % ((Math.PI * 3) );
			
			if(circleAngle > 0 && circleAngle <= (Math.PI / 2)) 
			{   // 0 -> 1 pause
				y = 0; 
			    x = ((length/2) * circleModifier) * Math.cos((Math.PI)); 
			}
			else if(circleAngle > (Math.PI / 2) && circleAngle <= ((Math.PI / 2) + Math.PI)) 
			{   // 1 -> 3 down
				y = 0; 
				x = ((length/2) * circleModifier) * Math.cos(((circleAngle + (Math.PI/2)))); 
			}
			else if(circleAngle > (Math.PI / 2) + Math.PI && circleAngle <= ((Math.PI * 2) )) 
			{   // 3 -> 4 pause
				y = 0; 
			    x = ((length/2) * circleModifier) * Math.cos((0)); 
			}
			else
			{   // 4 -> 6 
			    y = 0; 
			    x = ((length/2) * circleModifier) * Math.cos(((circleAngle))); 
			}
		}
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
