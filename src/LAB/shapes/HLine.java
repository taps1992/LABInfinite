package LAB.shapes;

import LAB.util.Point;

public class HLine extends AbstractShape implements Shape{
	
	//private double lineCircleModifier = 0; 
	
	public HLine() {
		name = "HLine"; 
		period = Math.PI * 4;
	}
	
	public HLine(double circleMod) {
		name = "VerticalHLine"; 
		period = Math.PI * 4;
		//lineCircleModifier = circleMod; 
		if(circleMod == Math.PI/2) name="VerticalHLine";
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {
		
		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 6)));
		
		// stateless draw method
		if(circleAngle <= (Math.PI * 2))
		{   // vert
            x = ((length/2) * circleModifier) * 1; 
            if (realCircleAngle < 0)
            	y = ((length/2) * circleModifier) * Math.sin((circleAngle )); 
            else 
            	y = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2))); 
		}
		else if(circleAngle > (Math.PI * 2) && circleAngle <= Math.PI + (Math.PI * 2))  
		{
			y = 0; 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
		}
		else if(circleAngle > (Math.PI * 3) && circleAngle <= (Math.PI * 5))  
		{    // vert
			 x = ((length/2) * circleModifier) * -1; 
			 if (realCircleAngle < 0)
			    y = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2))); 
	         else 
	        	y = ((length/2) * circleModifier) * Math.sin((circleAngle ));
			 
		}
		else
		{   
			y = 0; 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
		}
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
