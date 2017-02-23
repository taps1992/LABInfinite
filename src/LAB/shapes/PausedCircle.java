package LAB.shapes;

import LAB.util.Point;

public class PausedCircle extends AbstractShape implements Shape {

	public PausedCircle() {
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
	
	public Point draw2(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {

		double mod = circleTurnModifier % (Math.PI * 2);
		circleAngle = circleAngle % ((Math.PI * 4));
		
		// full turn pause 
		if(mod >= (Math.PI - 0.025)) {
			if((circleAngle <= mod)) {
				// mod  to 180 + mod
				double fakeAngle = circleAngle + Math.abs(mod);
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle - mod) )); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle - mod) )); 
			}
			else if((circleAngle > mod) && (circleAngle <= ((Math.PI * 2) + mod))) {
				//pause
				y = ((length/2) * circleModifier) * Math.sin(mod ); 
				x = ((length/2) * circleModifier) * Math.cos(mod );
			}
			else 
			{	// go 180 + mod  to 720
				double fakeAngle = circleAngle - Math.abs((Math.PI * 2) - mod);
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle + mod) )); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle + mod) )); 
			}
		}
		else {
		if((circleAngle <= mod)) {
			// mod  to 180 + mod
			double fakeAngle = circleAngle - ((Math.PI * 2) - mod);
			y = ((length/2) * circleModifier)* Math.sin(((mod + fakeAngle) )); 
			x = ((length/2) * circleModifier)* Math.cos(((mod + fakeAngle) )); 
		}
		else if((circleAngle > mod) && (circleAngle <= ((Math.PI * 2) + mod))) {
			// pause
			y = ((length/2) * circleModifier) * Math.sin(mod ); 
			x = ((length/2) * circleModifier) * Math.cos(mod );
		}
		else {
			double fakeAngle = circleAngle - ((Math.PI * 2) - mod);
			y = ((length/2) * circleModifier) * Math.sin(((fakeAngle - mod) )); 
			x = ((length/2) * circleModifier) * Math.cos(((fakeAngle - mod) )); 
		}
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
	
	public Point draw1(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {
		//double mod = Math.PI / 2; // 90
		
		
		//double fakeAngle = circleAngle % (Math.PI * 2);

		double mod = circleTurnModifier % (Math.PI * 2);
		circleAngle = circleAngle % ((Math.PI * 3));
		
		// half turn pause 
		if(mod >= (Math.PI - 0.025)) {
			if((circleAngle <= mod)) {
				// mod  to 180 + mod
				double fakeAngle = circleAngle + Math.abs(mod);
				//double fakeAngle = circleAngle;
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle - mod) )); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle - mod) )); 
			}
			else if((circleAngle > mod) && (circleAngle <= (Math.PI + mod))) {
				// mod  to 180 + mod
				// pause
				y = ((length/2) * circleModifier) * Math.sin(mod ); 
				x = ((length/2) * circleModifier) * Math.cos(mod );
			}
			else //if(circleAngle <= (Math.PI * 3)) 
			{	// go 580-720
				// go 180 + mod  to 720
				double fakeAngle = circleAngle - Math.abs(Math.PI - mod);
				//double fakeAngle = circleAngle;
				y = ((length/2) * circleModifier) * Math.sin(((fakeAngle + mod) )); 
				x = ((length/2) * circleModifier) * Math.cos(((fakeAngle + mod) )); 
			}
		}
		else {
		if((circleAngle <= mod)) {
			// mod  to 180 + mod
			double fakeAngle = circleAngle - (Math.PI - mod);
			//double fakeAngle = circleAngle;
			y = ((length/2) * circleModifier)* Math.sin(((mod + fakeAngle) )); 
			x = ((length/2) * circleModifier)* Math.cos(((mod + fakeAngle) )); 
		}
		else if((circleAngle > mod) && (circleAngle <= (Math.PI + mod))) {
			// mod  to 180 + mod
			// pause
			y = ((length/2) * circleModifier) * Math.sin(mod ); 
			x = ((length/2) * circleModifier) * Math.cos(mod );
		}
		// I need these back in for 2.
		/*else if(circleAngle <= Math.PI * 2) {
			// go 180-360
			double fakeAngle = circleAngle  - (Math.PI );
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle )); 	
		}
		else if (circleAngle <= (Math.PI * 3)) {
			// pause 360-580
			y = ((length/2) * circleModifier) * Math.sin(Math.PI); 
			x = ((length/2) * circleModifier) * Math.cos(Math.PI);
		}/**/
		else //if(circleAngle <= (Math.PI * 3)) 
		{	// go 580-720
			// go 180 + mod  to 720
			double fakeAngle = circleAngle - (Math.PI - mod);
			//double fakeAngle = circleAngle;
			y = ((length/2) * circleModifier) * Math.sin(((fakeAngle - mod) )); 
			x = ((length/2) * circleModifier) * Math.cos(((fakeAngle - mod) )); 
		}
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
