package LAB.shapes;

import LAB.util.Point;

public class HalfCircleVerticalRight extends AbstractShape implements Shape{
	
	public HalfCircleVerticalRight() {
		name = "HalfCircleVerticalRight"; 
		period = Math.PI * 2;
	}
	
	public Point draw(double length, double circleModifier, double circAngle,  double circleTurnModifier) {
		x=0;
        y=0;
        Point p = new Point();
        
        double circleAngle = Math.abs(circAngle % (Math.PI * 2.0));
		
		if(circleAngle <= (Math.PI / 2)) {
			y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
		}
		else if( (circleAngle > (Math.PI / 2)) && (circleAngle <= (Math.PI + (Math.PI / 2))) ) {
			y = ((length/2) * circleModifier) * Math.sin(((Math.PI + circleAngle) * -1)); 
			x = ((length/2) * circleModifier) * Math.cos(((Math.PI + circleAngle) * -1)); 
		}
		else if( circleAngle >= (Math.PI + (Math.PI / 2)) ) {
			y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
			x = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
		}
		//System.out.println("circle " + circleAngle); 
		//System.out.println("vert half right " + x + "," + y); 
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
