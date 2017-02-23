package LAB.shapes;

import LAB.util.Point;

public class HalfCircleVerticalLeft extends AbstractShape implements Shape{
	
	public HalfCircleVerticalLeft() {
		name = "HalfCircleVerticalLeft"; 
		period = Math.PI * 2;
	}
	
	public Point draw(double length, double circleModifier, double circAngle,  double circleTurnModifier) {
		x=0;
        y=0;
        Point p = new Point();
        
        double circleAngle = Math.abs(circAngle % (Math.PI * 2.0));

		if(circleAngle <= (Math.PI / 2) ) {
			y = ((length/2) * circleModifier) * Math.sin(((circleAngle + Math.PI) )); 
			x = ((length/2) * circleModifier) * Math.cos(((circleAngle + Math.PI) ));
			//System.out.println("1 " + circleAngle); 
		}
		else if( (circleAngle > (Math.PI / 2)) && (circleAngle <= (Math.PI + (Math.PI / 2))) ) {
			y = ((length/2) * circleModifier) * Math.sin((((circleAngle) * -1) )); 
			x = ((length/2) * circleModifier) * Math.cos((((circleAngle) * -1) )); 
			//System.out.println("2 " + circleAngle); 
		}
		else if( circleAngle >= (Math.PI + (Math.PI / 2)) ) {	
			y = ((length/2) * circleModifier) * Math.sin(((circleAngle + Math.PI) )); 
			x = ((length/2) * circleModifier) * Math.cos(((circleAngle + Math.PI) )); 
			//System.out.println("3 " + circleAngle); 
		}
		else System.out.println("4 " + circleAngle); 
		
		//System.out.println("circle " + circleAngle); 
		//System.out.println("vert half right " + x + "," + y); 
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
}
