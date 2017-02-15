package LAB.directionchanges.positions;

import LAB.meta.Positions;
import LAB.util.Point;

public class GridSwapNorthSouth extends AbstractPosition implements Position {

	public GridSwapNorthSouth() {
		name = "GridSwapNS"; 
		period = Math.PI * 6;
	}

	public Point process(double length, double circleModifier,
			double realCircleAngle, double circleTurnModifier, double xadj,
			double yadj, double newx, double newy) {
		
		xadj = Positions.POINT_CENTER.x;
    	yadj = Positions.POINT_CENTER.y;
    	
    	newx = Positions.POINT_CENTER_UP.x;
    	newy = Positions.POINT_CENTER_UP.y;

    	double xcen = Positions.POINT_CENTER_UP_HALF.x;
    	double ycen = Positions.POINT_CENTER_UP_HALF.y;
    	
		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 6)));
		
		if(circleAngle > 0 && circleAngle <= (Math.PI * 2)) 
		{   // 0 -> 1 pause
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI ) - (Math.PI  / 2))); 
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI ) - (Math.PI  / 2))); 
		    
		    x += xadj;
		    y += yadj;
		}
		else if(circleAngle > (Math.PI * 2) && circleAngle <= ((Math.PI * 3))) 
		{   // 1 -> 3 across
			y = ((length/2) * circleModifier * 2) * Math.sin((realCircleAngle + (Math.PI / 2))); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2))); 
			
		    x += xcen;
		    y += ycen;
		}
		else if(circleAngle > (Math.PI * 3) && circleAngle <= ((Math.PI * 5) )) 
		{   // 3 -> 4 pause
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2)));  
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI / 2))); 
		    
		    x += newx;
		    y += newy;
		}
		else
		{   // 4 -> 6 back across
			y = ((length/2) * circleModifier * 2) * Math.sin((realCircleAngle + (Math.PI / 2))); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI / 2))); 
			
		    x += xcen;
		    y += ycen;
		}

		p.x = (int)x;
		p.y = (int)y; 
		
		System.out.println("p " + p.x + "," + p.y);
		
		return p; 
		
	}
}
