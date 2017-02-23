package LAB.shapes;

import LAB.util.Point;

public class Line extends AbstractShape implements Shape{
	
	private double lineCircleModifier = 0; 
	
	public Line() {
		name = "Line"; 
		period = Math.PI * 2;
	}
	
	public Line(double circleMod) {
		name = "Line"; 
		period = Math.PI * 2;
		lineCircleModifier = circleMod; 
		if(circleMod == Math.PI/2) name="VerticalLine";
	}
	
	public Point draw(double length, double circleModifier, double circleAngle,  double circleTurnModifier) {
		
		
		// stateless draw method
		if(lineCircleModifier != 0 && lineCircleModifier == (Math.PI / 2))
		{   
            x = 0; 
		    y = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
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
