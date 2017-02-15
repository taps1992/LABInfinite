package LAB.directionchanges.positions;

import LAB.meta.Positions;
import LAB.util.Point;

public class GridSwapSquare extends AbstractPosition implements Position {

	public GridSwapSquare() {
		name = "GridSwapSquare"; 
		period = Math.PI * 6;
	}

	public Point process(double length, double circleModifier,
			double realCircleAngle, double circleTurnModifier, double xadj,
			double yadj, double newx, double newy) {
		
		xadj = Positions.POINT_CENTER_LEFT_HALF.x;
    	yadj = Positions.POINT_CENTER_LEFT_HALF.y;
    	
    	double xupleft = Positions.POINT_CENTER_LEFT_HALF.x;
    	double yupleft = Positions.POINT_UP_LEFT.y;
    	
    	double xupright = Positions.POINT_CENTER_RIGHT_HALF.x;
    	double yupright = Positions.POINT_UP_RIGHT.y;

    	double xcen = Positions.POINT_CENTER.x;
    	double ycen = Positions.POINT_CENTER.y;
    	
		double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 14)));
		
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
		else if(circleAngle > (Math.PI * 3) && circleAngle <= ((Math.PI * 5) + (Math.PI / 2))) 
		{   // 3 -> 4 pause
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI)));  
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI))); 
		    
		    x += newx;
		    y += newy;
		}
		else if(circleAngle > (Math.PI * 5)  + (Math.PI / 2) && circleAngle <= ((Math.PI * 6) + (Math.PI / 2))) 
		{   // 4 -> 6 up
			y = ((length/2) * circleModifier * 2) * Math.sin((realCircleAngle - (Math.PI ))); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI ))); 
			
		    x += xupright;
		    y += Positions.POINT_CENTER_UP_HALF.y;
		}
		else if(circleAngle > (Math.PI * 6) + (Math.PI / 2) && circleAngle <= ((Math.PI * 9) )) 
		{   // pause 
			
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI )));  
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI ))); 
		    
		    x += xupright;
		    y += yupright;
		}
		
		else if(circleAngle > (Math.PI * 9) && circleAngle <= ((Math.PI * 10) )) 
		{   // back across
			
			y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI ))); 
			x = ((length/2) * circleModifier * 2) * Math.cos((realCircleAngle + (Math.PI ))); 
			
		    x += xcen;
		    y += Positions.POINT_CENTER_UP.y;
		}
		else if(circleAngle > (Math.PI * 10) && circleAngle <= ((Math.PI * 12) + (Math.PI / 2))) 
		{   // pause
			
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI )));  
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle + (Math.PI ))); 
		    
		    x += xupleft;
		    y += yupleft;
		}
		else if(circleAngle > (Math.PI * 12) + (Math.PI / 2) && circleAngle <= ((Math.PI * 13) + (Math.PI / 2))) 
		{   // down
			
			y = ((length/2) * circleModifier * 2) * Math.sin((realCircleAngle + (Math.PI ))); 
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle + (Math.PI ))); 
			
		    x += xupleft;
		    y += Positions.POINT_CENTER_UP_HALF.y;
		}
		else  
		{   // 0 -> 1 pause
			x = ((length/2) * circleModifier) * Math.cos((realCircleAngle - (Math.PI ))); 
		    y = ((length/2) * circleModifier) * Math.sin((realCircleAngle - (Math.PI ))); 
		    
		    x += xadj;
		    y += yadj;
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		System.out.println("p " + p.x + "," + p.y);
		
		return p; 
		
	}
}
