package LAB.directionchanges;

// will work equally well for staff direction. 
public class Change {
	
	public static double checkForChange(double angle, double direction, double modifier, double interval, double tolerance) { 
		if(interval == 0) return -10; 
		return checkForChangeValues(angle, direction, modifier, 0, interval, tolerance);
	}
	
	public static double checkForChange(double angle, double direction, double modifier, double secondMod, double interval, double tolerance) { 
		if(interval == 0) return -10; 
		return checkForChangeValues(angle, direction, modifier, secondMod, interval, tolerance);
	}
	
	public static double getToleranceGap(double angle, double direction, double modifier, double secondMod, double interval, double tolerance) {
		if(interval == 0) return 0;
		
		double newAngle = Math.abs((angle) % (Math.PI * 2));

		double remainder = (newAngle + secondMod) % interval; 
		
		return Change.getWithinToleranceMargin(remainder, 0, tolerance);
	}
	
	private static double checkForChangeValues(double angle, double direction, double modifier, double secondMod, double interval, double tolerance) { 
		
		
		double newAngle = Math.abs((angle) % (Math.PI * 2));

		double remainder = (newAngle + secondMod) % interval; 
		
		if(Math.abs(remainder) <= Math.abs(tolerance)) 
		{
			//double percent = tolerance / remainder;
			//System.out.println("remainder " + remainder); 
			//System.out.println("tolerance " + tolerance); 
			//System.out.println("pta - " + secondMod); 
			return remainder;
		}
		else return -10;

	}
	
	public static double checkForDirChange(double angle, double direction, double modifier, double changeInterval, double tolerance, double speed) {
		double angle1 = Math.abs((angle % (Math.PI * 2)) - Math.PI);
		double angle2 = angle + ((tolerance*direction) * speed);
        angle2 = Math.abs((angle2 % (Math.PI * 2)) - Math.PI);
        
        //System.out.println("angle " + angle1); 
       // System.out.println("interval " + changeInterval); 
        
		if(angle1 == changeInterval || (angle1 < changeInterval && angle2 > changeInterval)) {
			double remainder = (angle) % changeInterval; 
			//System.out.println("angle " + angle1); 
			//System.out.println("remainder " + remainder); 
			return remainder;
		}
		return -10;	
	}
	
	public static double getWithinToleranceMargin(double b, double a, double tolerance) {
		if ( b < (a + tolerance) && b > (a - tolerance)) return (tolerance - b);
		else if ( a > (b - tolerance) && a < (b + tolerance) ) return (tolerance - a - b); 
		return 0; 
	}
	
	public static boolean equalsWithinTolerance(double b, double a, double tolerance) {
		if (( a < (b + tolerance) && a > (b - tolerance)) ||
				( b > (a - tolerance) && b < (a + tolerance) )) return true; 
		return false; 
	}
	
}
