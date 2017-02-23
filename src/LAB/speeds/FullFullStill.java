package LAB.speeds;

public class FullFullStill extends AbstractSpeedChange{

	public double process(double angle, double circleangle, double mod, double direction, double speed) {
		double circleAngle = Math.abs(circleangle % ((Math.PI * 4)) );
		if(circleAngle <=  (Math.PI * 2) ) {
			// pause 
			return mod;
		}
		else {
			return angle;
		}
	}

}
