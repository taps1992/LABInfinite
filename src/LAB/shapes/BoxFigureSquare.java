package LAB.shapes;

import LAB.util.Point;
import LAB.util.Rotate;

public class BoxFigureSquare extends AbstractShape implements Shape{
	public Shape base; 
	
	public BoxFigureSquare() {
		name = "FigureSquareBox"; 
		period = Math.PI * 8.0;
		base = new HypocycloidFake();
	}
	
	
	public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

		double circleAngle = Math.abs (realCircleAngle % (Math.PI * 8.0)); // period is 4 circles. 
		
		if(realCircleAngle < 0) {
			if( circleAngle < ((Math.PI * 1) + (Math.PI / 2))) {
				Point t = base.draw(length, circleModifier, ((realCircleAngle + (Math.PI / 2)) * -1), circleTurnModifier);
				y = t.y; 
				x = t.x; 
				
				y += (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI * 1) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 4)) {
				Point t = base.draw(length, circleModifier, (realCircleAngle + (Math.PI / 2) ), circleTurnModifier);
				y = t.y; 
				x = t.x; 
				
				y += (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
			else if( circleAngle >= (Math.PI * 4) &&  circleAngle < ((Math.PI * 5) + (Math.PI / 2))) {
				Point t = base.draw(length, circleModifier, ((realCircleAngle - (Math.PI / 2) ) * -1), circleTurnModifier);
				y = t.y; 
				x = t.x; 
				
				y -= (length / 2) * circleModifier; 
				x += (length / 2) * circleModifier; 
			}
			else if( circleAngle >= ((Math.PI * 5) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 8)) {
				Point t = base.draw(length, circleModifier, (realCircleAngle - (Math.PI / 2)), circleTurnModifier);
				y = t.y; 
				x = t.x; 
				
				y -= (length / 2) * circleModifier; 
				x -= (length / 2) * circleModifier; 
			}
			
		} else {
			
		if( circleAngle < ((Math.PI * 1) + (Math.PI / 2))) {
			Point t = base.draw(length, circleModifier, (realCircleAngle - (Math.PI / 2) - (Math.PI)), circleTurnModifier);
			y = t.y; 
			x = t.x; 
			
			y -= (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI * 1) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 4)) {
			Point t = base.draw(length, circleModifier, (((realCircleAngle + (Math.PI / 2)) * -1)), circleTurnModifier);
			y = t.y; 
			x = t.x; 
			
			y -= (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		else if( circleAngle >= (Math.PI * 4) &&  circleAngle < ((Math.PI * 5) + (Math.PI / 2))) {
			Point t = base.draw(length, circleModifier, ((realCircleAngle - (Math.PI / 2))), circleTurnModifier);
			y = t.y; 
			x = t.x; 
			
			y += (length / 2) * circleModifier; 
			x -= (length / 2) * circleModifier; 
		}
		else if( circleAngle >= ((Math.PI * 5) + (Math.PI / 2)) &&  circleAngle < (Math.PI * 8)) {
			Point t = base.draw(length, circleModifier, (((realCircleAngle - (Math.PI / 2)) * -1)), circleTurnModifier);
			y = t.y; 
			x = t.x; 
			
			y += (length / 2) * circleModifier; 
			x += (length / 2) * circleModifier; 
		}
		}
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
}
