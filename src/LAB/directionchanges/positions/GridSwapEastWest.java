package LAB.directionchanges.positions;

import LAB.meta.Positions;
import LAB.util.Point;

public class GridSwapEastWest extends AbstractPosition implements Position {

	public GridSwapEastWest() {
		name = "GridSwapEW"; 
		period = Math.PI * 6;
	}

	public Point process(double length, double circleModifier,
			double realCircleAngle, double circleTurnModifier, double xadj,
			double yadj, double newx, double newy) {
		
		xadj = Positions.POINT_CENTER_LEFT_HALF.x;
    	yadj = Positions.POINT_CENTER_LEFT_HALF.y;

    	double xcen = Positions.POINT_CENTER.x;
    	double ycen = Positions.POINT_CENTER.y;
    	
		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 6)));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI * 2)) 
		{   // 0 -> 1 pause
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI ))); 
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI ))); 
		    
		    x += xadj;
		    y += yadj;
		}
		else if(circleAngle > (Math.PI * 2) && circleAngle <= ((Math.PI * 3))) 
		{   // 1 -> 3 across
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI ))); 
			x = ((length/2) * circleModifier * 2) * Math.cos((realCircleAngle + (Math.PI ))); 
			
		    x += xcen;
		    y += ycen;
		}
		else if(circleAngle > (Math.PI * 3) && circleAngle <= ((Math.PI * 5) )) 
		{   // 3 -> 4 pause
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI )));  
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI ))); 
		    
		    x += newx;
		    y += newy;
		}
		else
		{   // 4 -> 6 back across
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI ))); 
			x = ((length/2) * circleModifier * 2) * Math.cos((realCircleAngle + (Math.PI ))); 
			
		    x += xcen;
		    y += ycen;
		}

		p.x = (int)x;
		p.y = (int)y; 
		
		System.out.println("p " + p.x + "," + p.y);
		
		return p; 
		
	}
}
