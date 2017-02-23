package LAB.shapes;

import LAB.util.Point;
import LAB.util.Rotate;

public class BoxFigureOfEight extends AbstractShape implements Shape{
	public Shape base; 
	
	public BoxFigureOfEight() {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
		base = new Hypocycloid();
	}
	
	public BoxFigureOfEight(Shape baseShape) {
		name = "FigureOfEight"; 
		period = Math.PI * 4.0;
		base = baseShape; 
	}
	
	public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 4.0)); // period is 2 circles. 
		
		if( circleAngle < (Math.PI * 2)) {
			if(realCircleAngle < 0) {
				Point t = base.draw(length, circleModifier, ((realCircleAngle + Math.PI - (Math.PI / 4)) * -1), circleTurnModifier);
				Rotate.rotate(t, (Math.PI / 4));
				y = t.y; 
				x = t.x; 
			}
			Point t = base.draw(length, circleModifier, ((realCircleAngle + Math.PI - (Math.PI / 4))), circleTurnModifier);
			Rotate.rotate(t, (Math.PI / 4));
			y = t.y; 
			x = t.x; 
			
			x += (length / 2) * circleModifier; 
		}
		else {
			//handDirection *= -1;
			if(realCircleAngle < 0) {
				Point t = base.draw(length, circleModifier, ((realCircleAngle + (Math.PI / 4))), circleTurnModifier); 
				Rotate.rotate(t, (Math.PI / 4));
				y = t.y; 
				x = t.x; 
				
			}
			Point t = base.draw(length, circleModifier, ((realCircleAngle + (Math.PI / 4)) * -1), circleTurnModifier); 
			Rotate.rotate(t, (Math.PI / 4));
			y = t.y; 
			x = t.x; 
			
			x -= (length / 2) * circleModifier; 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
