package LAB.speeds;

public class ComplexQuarter extends AbstractSpeedChange {

	public double process(double angle, double circleangle, double mod, double direction, double speed) {
		double circleAngle = circleangle % ((Math.PI * 6));
		double a  = angle % ((Math.PI * 6));
		
		if(circleAngle <= (Math.PI)) {
			// translate 1 
			a = Math.PI;
			return a + mod; 
		}
		else if(circleAngle <= (Math.PI + (Math.PI / 2))) { // 180 -> 270
			return angle;
		}
		else if(circleAngle <= ((Math.PI * 2) + (Math.PI / 2))) { // 270 -> 450
			a = Math.PI / 2;
			return a + mod;
		}
		else if(circleAngle <= ((Math.PI * 3))) { // 450 -> 540
			return angle;
		}
		else if(circleAngle <= ((Math.PI * 4))) { // 540 -> 720
			a = Math.PI;
			return a + mod;
		}
		else if(circleAngle <= ((Math.PI * 4) + (Math.PI / 2))) { // 720 -> 810
			return angle;
		}
		else if(circleAngle <= ((Math.PI * 5) + (Math.PI/2))) { // 810 -> 990
			a = Math.PI / 2;
			return a + mod;
		}
		else if(circleAngle <= ((Math.PI * 6))) { // 990 -> 1080
			return angle;
		}
		
		return angle;
	}
}

