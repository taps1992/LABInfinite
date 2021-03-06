package LAB.speeds;

public class QuarterQuarterStill extends AbstractSpeedChange{

	public double process(double angle, double circleangle, double mod, double direction, double speed) {
		double circleAngle = Math.abs(circleangle % ((Math.PI * 2)) );
		if(circleAngle <=  (Math.PI / 2)) {
			// pause 
			return mod;
		}
		else if(circleAngle >  (Math.PI / 2) && circleAngle <=  (Math.PI)) {
			// go
			return angle;
		}
		else if(circleAngle >  (Math.PI) && circleAngle <=  (Math.PI + (Math.PI / 2))) {
			// pause
			return mod + (Math.PI / 2);
		}
		else {
			return angle;
		}
	}

}
