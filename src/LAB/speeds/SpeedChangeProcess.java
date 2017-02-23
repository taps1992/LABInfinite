package LAB.speeds;


public class SpeedChangeProcess implements Speed {
	
	public static double process(double angle, double circleangle, double mod, double direction, double speed, int type, double angleSpeedChangeMod, double angleSpeedChangeMod2) {
		if(type == COMPLEX_QUARTER_CIRCLE) return (new ComplexQuarter()).process(angle, circleangle, mod, direction, speed); 
		else if(type == CHUU_CIRCLE) return (new ChuuChuu()).process(angle, circleangle, mod, direction, speed); 
		else if(type == HALF_CIRCLE) return (new HalfHalfStill()).process(angle, circleangle, mod, direction, speed); 
		else if(type == QUARTER_CIRCLE) return (new QuarterQuarterStill()).process(angle, circleangle, mod, direction, speed); 
		else if(type == FULL_CIRCLE) return (new FullFullStill()).process(angle, circleangle, mod, direction, speed); 
		
		else return angle;
		
		
		/*
		if(angleSpeedChangeMod2 != 0) {
			double circleAngle = Math.abs(circleangle % ((angleSpeedChangeMod + angleSpeedChangeMod2) * 2));
			//System.out.println("a - " + circleAngle + " s- " + angleSpeedChangeMod);
			if(circleAngle <=  angleSpeedChangeMod) {
				// pause 
				return mod;
			}
			else if(circleAngle >  angleSpeedChangeMod && circleAngle <= angleSpeedChangeMod+angleSpeedChangeMod2) {
				// run
				return angle;
			}
			else 
			if(circleAngle >  angleSpeedChangeMod+angleSpeedChangeMod2 && circleAngle <= angleSpeedChangeMod+angleSpeedChangeMod2+angleSpeedChangeMod) {
				// pause 
				return mod + (Math.PI / 2);
			}
			else return angle;
		}	
		else {
			double circleAngle = Math.abs(circleangle % ((Math.PI * 2)));

			if(circleAngle > angleSpeedChangeMod && circleAngle <= (Math.PI + angleSpeedChangeMod)) {
				// pause 0-180
				return mod;
			}
			
			return angle;
			/**/
		}

}
