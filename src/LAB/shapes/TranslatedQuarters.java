package LAB.shapes;

import LAB.util.Point;

public class TranslatedQuarters extends AbstractShape implements Shape {

	public TranslatedQuarters() {
		name = "TranslatedQuarter"; 
		period = Math.PI * 4;
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 6) + (0)));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI)) 
		{   // 0 -> 1 slide 1 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle)); 
		    y = ((length/2) * circleModifier) * Math.sin((0)); 
		}
		else if(circleAngle > (Math.PI) && circleAngle <= ((Math.PI) + (Math.PI / 2))) 
		{   // 1 -> 2 move 1
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle));  
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle)); 
		}
		else if(circleAngle > (Math.PI) + (Math.PI / 2) && circleAngle <= ((Math.PI * 2) + (Math.PI / 2) )) 
		{   // 2 -> 3 pause 2 
			x = ((length/2) * circleModifier) * Math.cos(Math.PI / 2);  
			if (realCircleAngle < 0)  y = ((length/2) * circleModifier) * Math.sin(realCircleAngle); 
			else y = ((length/2) * circleModifier) * Math.sin(realCircleAngle); 
		}
		else if(circleAngle > (Math.PI * 2) + (Math.PI / 2) && circleAngle <= ((Math.PI * 2) + (Math.PI))) 
		{   // 3 -> 4 move 2
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - ((0) )));  
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - ((0) ))); 
		}
		else if(circleAngle > (Math.PI * 3) + (0) && circleAngle <= ((Math.PI * 3) + (Math.PI) )) 
		{   // 4 -> 5 pause 3
			x = ((length/2) * circleModifier) * Math.cos(realCircleAngle);  
		    y = ((length/2) * circleModifier) * Math.sin(0); 
		}
		else if(circleAngle > (Math.PI * 4) && circleAngle <= ((Math.PI * 4) + (Math.PI / 2))) 
		{   // 5 -> 6 move 3 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (0) ));  
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (0) )); 
		}
		else if(circleAngle > (Math.PI * 4) + (Math.PI / 2) && circleAngle <= ((Math.PI * 5) + (Math.PI / 2))) 
		{   // 4 -> 5 pause 4
			x = ((length/2) * circleModifier) * Math.cos(Math.PI / 2);  
			if (realCircleAngle < 0)  y = ((length/2) * circleModifier) * Math.sin(realCircleAngle); 
			else y = ((length/2) * circleModifier) * Math.sin(realCircleAngle); 
		}
		else if(circleAngle > (Math.PI * 5) + (Math.PI / 2) && circleAngle <= ((Math.PI * 6))) 
		{   // 5 -> 6 move 4 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - ((0))));  
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - ((0)))); 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
	// not the right amount of pause
	public Point drawQuarterPause(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {

		circleAngle = Math.abs (circleAngle % ((Math.PI * 3) + (Math.PI)));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI / 2)) 
		{   // 0 -> 1 pause 1 
			x = ((length/2) * circleModifier) * Math.cos((0)); 
		    y = ((length/2) * circleModifier) * Math.sin((0)); 
		}
		else if(circleAngle > (Math.PI / 2) && circleAngle <= ((Math.PI / 2) + (Math.PI / 2))) 
		{   // 1 -> 2 move 1
			x = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2)));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI / 2))); 
		}
		else if(circleAngle > (Math.PI / 2) + (Math.PI / 2) && circleAngle <= ((Math.PI) + (Math.PI / 2) )) 
		{   // 2 -> 3 pause 2 
			x = ((length/2) * circleModifier) * Math.cos((Math.PI / 2));  
		    y = ((length/2) * circleModifier) * Math.sin((Math.PI / 2)); 
		}
		else if(circleAngle > (Math.PI) + (Math.PI / 2) && circleAngle <= ((Math.PI) + (Math.PI))) 
		{   // 3 -> 4 move 2
			x = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI)));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI))); 
		}
		else if(circleAngle > (Math.PI) + (Math.PI) && circleAngle <= ((Math.PI * 2) + (Math.PI / 2) )) 
		{   // 4 -> 5 pause 3
			x = ((length/2) * circleModifier) * Math.cos((Math.PI));  
		    y = ((length/2) * circleModifier) * Math.sin((Math.PI)); 
		}
		else if(circleAngle > (Math.PI * 2) + (Math.PI / 2) && circleAngle <= ((Math.PI * 2) + (Math.PI))) 
		{   // 5 -> 6 move 3 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2) - Math.PI));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI / 2) - Math.PI)); 
		}
		else if(circleAngle > (Math.PI * 2) + (Math.PI) && circleAngle <= ((Math.PI * 3) + (Math.PI / 2))) 
		{   // 4 -> 5 pause 4
			x = ((length/2) * circleModifier) * Math.cos((Math.PI / 2));  
		    y = ((length/2) * circleModifier) * -1 * Math.sin((Math.PI / 2)); 
		}
		else if(circleAngle > (Math.PI * 3) + (Math.PI / 2) && circleAngle <= ((Math.PI * 4))) 
		{   // 5 -> 6 move 4 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI) - Math.PI));  
			y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI) - Math.PI)); 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
	
}
