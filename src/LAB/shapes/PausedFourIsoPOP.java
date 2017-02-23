package LAB.shapes;

import LAB.util.Point;

public class PausedFourIsoPOP extends AbstractShape implements Shape {

	public PausedFourIsoPOP() {
		name = "PausedQuarter"; 
		period = Math.PI * 4;
	}
	
	public Point draw(double length, double circleModifier, double rCircleAngle,  double circleTurnModifier) {

		double circleAngle = Math.abs (rCircleAngle % ((Math.PI * 10)));
		
		double circleAngle2 = rCircleAngle % ((Math.PI * 2));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI * 2)) 
		{   // 0 -> 1 pause 1 
			x = ((length/2) * circleModifier) * Math.cos((0)); 
		    y = ((length/2) * circleModifier) * Math.sin((0)); 
		}
		else if(circleAngle > (Math.PI * 2) && circleAngle <= ((Math.PI * 2) + (Math.PI / 2))) 
		{   // 1 -> 2 move 1
			x = ((length/2) * circleModifier) * Math.cos((circleAngle2 - (Math.PI * 2)));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle2 - (Math.PI * 2))); 
		}
		else if(circleAngle > (Math.PI * 2) + (Math.PI / 2) && circleAngle <= ((Math.PI * 4) + (Math.PI / 2) )) 
		{   // 2 -> 3 pause 2 
			x = ((length/2) * circleModifier) * Math.cos((Math.PI / 2));  
			if (circleAngle2 < 0)  y = ((length/2) * circleModifier) * -1 * Math.sin((Math.PI / 2)); 
			else y = ((length/2) * circleModifier) * Math.sin((Math.PI / 2)); 
		}
		else if(circleAngle > (Math.PI * 4) + (Math.PI / 2) && circleAngle <= ((Math.PI * 4) + (Math.PI))) 
		{   // 3 -> 4 move 2
			x = ((length/2) * circleModifier) * Math.cos((circleAngle2 - ((Math.PI * 4) )));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle2 - ((Math.PI * 4) ))); 
		}
		else if(circleAngle > (Math.PI * 4) + (Math.PI) && circleAngle <= ((Math.PI * 6) + (Math.PI) )) 
		{   // 4 -> 5 pause 3
			x = ((length/2) * circleModifier) * Math.cos((Math.PI));  
		    y = ((length/2) * circleModifier) * Math.sin((Math.PI)); 
		}
		else if(circleAngle > (Math.PI * 6) + (Math.PI) && circleAngle <= ((Math.PI * 7) + (Math.PI / 2))) 
		{   // 5 -> 6 move 3 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle2 - ((Math.PI * 6) ) ));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle2 - ((Math.PI * 6) ) )); 
		}
		else if(circleAngle > (Math.PI * 7) + (Math.PI / 2) && circleAngle <= ((Math.PI * 9) + (Math.PI / 2))) 
		{   // 4 -> 5 pause 4
			x = ((length/2) * circleModifier) * Math.cos((Math.PI / 2));  
			if (circleAngle2 < 0)  y = ((length/2) * circleModifier) * Math.sin((Math.PI / 2)); 
			else y = ((length/2) * circleModifier) * -1 * Math.sin((Math.PI / 2)); 
		}
		else if(circleAngle > (Math.PI * 9)+ (Math.PI / 2) && circleAngle <= ((Math.PI * 10))) 
		{   // 5 -> 6 move 4 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle2 - ((Math.PI * 8) )));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle2 - ((Math.PI * 8) ))); 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
