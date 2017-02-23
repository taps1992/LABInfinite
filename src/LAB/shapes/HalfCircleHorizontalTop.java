package LAB.shapes;

import LAB.util.Point;

public class HalfCircleHorizontalTop extends AbstractShape implements Shape{
	
	public HalfCircleHorizontalTop() {
		name = "HalfCircleHorizontalTop"; 
		period = Math.PI * 2;
	}
	
	public Point draw(double length, double circleModifier, double circAngle,  double circleTurnModifier) {
		x=0;
        y=0;
        Point p = new Point();
        
        double circleAngle = Math.abs(circAngle % (Math.PI * 2.0));
		
		if(circleAngle >= Math.PI) {
			y = ((length/2) * circleModifier) * Math.sin((circleAngle )); 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle )); 
		}
		else {
			y = ((length/2) * circleModifier) * Math.sin((circleAngle * -1)); 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle * -1)); 
		}
		
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
