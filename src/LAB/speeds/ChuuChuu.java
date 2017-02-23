package LAB.speeds;

public class ChuuChuu extends AbstractSpeedChange{

	public double process(double angle, double circleangle, double mod, double direction, double speed) {
		double circleAngle = Math.abs(circleangle % ((Math.PI * 4) + (Math.PI)) );
		//System.out.println("a - " + circleAngle + " s- " + angleSpeedChangeMod);
		if(circleAngle <=  Math.PI * 2) {
			// pause 
			return mod;
		}
		else if (circleAngle >  Math.PI * 2 && circleAngle <=  (Math.PI * 2) + (Math.PI / 2)){
			return angle;
		}
		else if (circleAngle >  (Math.PI * 2) + (Math.PI / 2) && circleAngle <=  (Math.PI * 4) + (Math.PI / 2)) {
			// pause 
			return mod + (Math.PI / 2);
		}
		else {
			return angle;
		}
	}

}
