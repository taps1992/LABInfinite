package LAB.directionchanges;

import java.awt.Point;



public class PositionChange {
	
	public static Point process(double angleincr, double pathangle, double mod, double direction, double speed, double xadj, double yadj, double newx, double newy) {
		
		Point p = new Point();
		p.x = 0;
		p.y = 0;
		// not going anywhere
		//if(newx == xadj && newy == yadj) return null;  
		
		double path1angle = Math.abs (pathangle % ((Math.PI * 2)));
		
		if(path1angle > 0 && path1angle <= (Math.PI)) 
		{ 
			double a = Math.abs( pathangle % Math.PI);
			
			//if(a < Math.PI / 2) return p;
			
			double pc = a / Math.PI;
			//System.out.println("pc " + pc + "," + a);
			
			double xchange = newx - xadj;
			double ychange = newy - yadj;
			//System.out.println("change " + newx + "," + newy);
			
			double positionIncrX = (xchange * pc) * 1;
			double positionIncrY = (ychange * pc) * 1;
			
			//System.out.println("po " + positionIncrX + "," + positionIncrY);
			
			if (xchange == 0) {
				positionIncrX = 0;
			}
			else if (xchange < 0 && positionIncrX <= (xchange + 2)) {
				positionIncrX = 0;
			}
			else if (xchange > 0 && positionIncrX >= (xchange - 2)) positionIncrX = 0;
			
			if (ychange == 0) {
				positionIncrY = 0;
			}
			else if (ychange < 0 && positionIncrY <= (ychange + 2)) {
				positionIncrY = 0;
			}
			else if (ychange > 0 && positionIncrY >= (ychange - 2)) positionIncrY = 0;
			
			//System.out.println("incr " + positionIncrX + "," + positionIncrY);
			
			if(positionIncrX == 0 && positionIncrY == 0) {
				//System.out.println("RETURN" );
				return null;
			}
			
			p.x = (int) positionIncrX;
		    p.y = (int) positionIncrY;
		    //System.out.println("point1 " + p.x + "," + p.y);
		    
			return p;
		}
		else {
            double a = Math.abs( pathangle % Math.PI);
			
			//if(a < Math.PI / 2) return p;
			
			double pc = a / Math.PI;
			//System.out.println("pc " + pc + "," + a);
			
			double xchange = xadj - newx;
			double ychange = yadj - newy;
			//System.out.println("change " + newx + "," + newy);
			
			double positionIncrX = (xchange * pc) * 1;
			double positionIncrY = (ychange * pc) * 1;
			
			//System.out.println("po " + positionIncrX + "," + positionIncrY);
			
			if (xchange == 0) {
				positionIncrX = 0;
			}
			else if (xchange < 0 && positionIncrX <= (xchange + 2)) {
				positionIncrX = 0;
			}
			else if (xchange > 0 && positionIncrX >= (xchange - 2)) positionIncrX = 0;
			
			if (ychange == 0) {
				positionIncrY = 0;
			}
			else if (ychange < 0 && positionIncrY <= (ychange + 2)) {
				positionIncrY = 0;
			}
			else if (ychange > 0 && positionIncrY >= (ychange - 2)) positionIncrY = 0;
			
			//System.out.println("incr " + positionIncrX + "," + positionIncrY);
			
			if(positionIncrX == 0 && positionIncrY == 0) {
				//System.out.println("RETURN" );
				return null;
			}
			
			p.x = (int) (positionIncrX - xchange);
		    p.y = (int) (positionIncrY + ychange);
		    //System.out.println("point1 " + p.x + "," + p.y);
		    
			return p;
		}
		
		//return p;
		
	}
}
