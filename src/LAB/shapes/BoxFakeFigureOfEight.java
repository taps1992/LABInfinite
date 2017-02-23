package LAB.shapes;

import LAB.util.Point;


public class BoxFakeFigureOfEight extends AbstractShape implements Shape{
	public Shape base; 
	
	public BoxFakeFigureOfEight() {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
		base = new HypocycloidFake();
	}
	
	public BoxFakeFigureOfEight(Shape baseShape) {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
		base = baseShape; 
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 4.0)); // period is 2 circles. 
		
		if( circleAngle < (Math.PI * 2)) {
			if(realCircleAngle < 0) {
				Point t = base.draw(length, circleModifier, ((realCircleAngle + Math.PI) * -1), circleTurnModifier);
				y = t.y; 
				x = t.x; 
				
				x -= (length / 2) * circleModifier; 
			}
			else {
				Point t = base.draw(length, circleModifier, ((realCircleAngle)), circleTurnModifier);
				y = t.y; 
				x = t.x; 
			
				x += (length / 2) * circleModifier; 
			}
		}
		else {
			//handDirection *= -1;
			if(realCircleAngle < 0) {
				Point t = base.draw(length, circleModifier, ((realCircleAngle + Math.PI)), circleTurnModifier); 
				y = t.y; 
				x = t.x; 
				
				x += (length / 2) * circleModifier; 
			} 
			else {
				Point t = base.draw(length, circleModifier, ((realCircleAngle ) * -1), circleTurnModifier); 
				y = t.y; 
				x = t.x; 
			
				x -= (length / 2) * circleModifier; 
			}
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
