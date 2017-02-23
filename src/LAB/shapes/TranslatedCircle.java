package LAB.shapes;

import LAB.util.Point;

public class TranslatedCircle extends AbstractShape implements Shape{
	
	public static final int TRANSLATED_HALF_CIRCLE = 0; 
	public static final int TRANSLATED_QUARTER_CIRCLE = 1; 
	public static final int TRANSLATED_COMPLEX_QUARTER_CIRCLE = 2; 
	public static final int TRANSLATED_COMPLEX_THREE_QUARTER_CIRCLE = 3; 
	
	private int type = 0; 
	
	public TranslatedCircle() {
		name = "TranslatedCircle"; 
	}
	
	public TranslatedCircle(int type) {
		name = "TranslatedCircle"; 
		this.type = type; 
	}
	
	public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
		
		if(type == TRANSLATED_COMPLEX_QUARTER_CIRCLE) return drawComplexQuarter(length, circleModifier, circleAngle, circleTurnModifier); 
		
		y = ((length/2) * circleModifier) * Math.sin((circleAngle)); 
		x = ((length/2) * circleModifier) * Math.cos((circleAngle)); 
		
        double fakeAngle = Math.abs( circleAngle % ((Math.PI * 2)));
        
        double y1 = ((length/2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2))); 
		double x1 = ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI / 2))); 
		
        if(fakeAngle <= Math.PI) { 
			y = x;
			x = 0;
		}
		else {
			y = y1;
			x = x1;	
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	}
	
	public Point drawComplexQuarter(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
		
		circleAngle = circleAngle % ((Math.PI * 6)); // period 3 circles
		

		
		if(circleAngle <= (Math.PI)) {
			// translate 1 
			y = ((length/2) * circleModifier) * Math.cos((circleAngle  )); 
			x = 0;
		}
		else if(circleAngle <= (Math.PI + (Math.PI / 2))) { // 180 -> 270
			// turn 1
			double fakeAngle = circleAngle + ((Math.PI / 2));
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle  )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle  )); 
		}
		else if(circleAngle <= ((Math.PI * 2) + (Math.PI / 2))) { // 270 -> 450
			// translate 2
			double fakeAngle = circleAngle + ((Math.PI / 2));
			y = 0; 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle  ));
		}
		else if(circleAngle <= ((Math.PI * 3))) { // 450 -> 540
			// turn 2
			double fakeAngle = circleAngle + (Math.PI / 2);
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle  )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle  )); 
		}
		else if(circleAngle <= ((Math.PI * 4))) { // 540 -> 720
			// translate 3
			double fakeAngle = circleAngle + (Math.PI / 2);
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle  )); 
			x = 0; 
		}
		else if(circleAngle <= ((Math.PI * 4) + (Math.PI / 2))) { // 720 -> 810
			// turn 3
			double fakeAngle = circleAngle + (Math.PI / 2);
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle  )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle  )); 
		}
		else if(circleAngle <= ((Math.PI * 5) + (Math.PI/2))) { // 810 -> 990
			// translate 4
			double fakeAngle = circleAngle + (Math.PI / 2);
			y = 0; 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle  )); 
		}
		else if(circleAngle <= ((Math.PI * 6))) { // 990 -> 1080
			// turn 4
			double fakeAngle = circleAngle + (Math.PI / 2);
			y = ((length/2) * circleModifier) * Math.sin((fakeAngle  )); 
			x = ((length/2) * circleModifier) * Math.cos((fakeAngle  )); 
		}
		
		p.x = (int)x;
		p.y = (int)y; 
		
		return p; 
	
	}
}