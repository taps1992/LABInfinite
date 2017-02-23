package LAB.speeds;

public class HalfHalfStill extends AbstractSpeedChange{

	public double process(double angle, double circleangle, double mod, double direction, double speed) {
		double circleAngle = Math.abs(circleangle % ((Math.PI * 2)) );
		if(circleAngle <=  Math.PI ) {
			// pause 
			return mod;
		}
		else {
			return angle;
		}
	}

}
