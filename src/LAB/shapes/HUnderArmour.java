package LAB.shapes;

import LAB.util.Point;

public class HUnderArmour extends AbstractShape implements Shape{
	
	//private double lineCircleModifier = 0; 
	
	public HUnderArmour() {
		name = "HUnderArmour"; 
		period = Math.PI * 2;
	}
	
	public HUnderArmour(double circleMod) {
		name = "VertHUnderArmour"; 
		period = Math.PI * 2;
		//lineCircleModifier = circleMod; 
		if(circleMod == Math.PI/2) name="VertHUnderArmour";
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {
		
		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));
		
		// stateless draw method
		if(circleAngle < (Math.PI))
		{   
			if (realCircleAngle < 0) {
				x = ((length/2) * circleModifier) * Math.cos((circleAngle));  
			    y = (((length/2) * circleModifier) * Math.sin((circleAngle))) - ((length/2) * circleModifier); 
			}
			else {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle));  
		        y = ((length/2) * circleModifier) - (((length/2) * circleModifier) * Math.sin((circleAngle))); 
			}
		}
		else if(circleAngle > (Math.PI) && circleAngle <= (Math.PI * 2))  
		{   // vert
            x = ((length/2) * circleModifier) * -1; 
            if (realCircleAngle < 0)
            	y = ((length/2) * circleModifier) * Math.sin((circleAngle  + (Math.PI / 2))); 
            else 
            	y = ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI))); 
		}
		else if(circleAngle > (Math.PI * 2) && circleAngle <= (Math.PI * 3))  
		{    
			if (realCircleAngle < 0) {
				x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle));  
			    y = ((length/2) * circleModifier) - (((length/2) * circleModifier) * Math.sin((circleAngle)));
				 
			}
			else {
			    x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle));  
			    y = (((length/2) * circleModifier) * Math.sin((circleAngle))) - ((length/2) * circleModifier); 
			}
		}
		else
		{   
			// vert
			 x = ((length/2) * circleModifier) * 1; 
			 if (realCircleAngle < 0)
			    y = ((length/2) * circleModifier) * Math.cos((circleAngle  + (Math.PI))); 
	         else 
	        	y = ((length/2) * circleModifier) * Math.sin((circleAngle  + (Math.PI / 2)));
		}
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
