package LAB.util;

import LAB.util.Point;

public class Rotate {
	public static Point rotate (Point p, double angle) {
		double x = p.x;
		double y = p.y;
		
		x = (p.x * Math.cos(angle)) - (p.y * Math.sin(angle));
		y = (p.x * Math.sin(angle)) + (p.y * Math.cos(angle));
		
		p.x = (int) x; 
		p.y = (int) y;
		
		return p; 
	}
	
	public static int toDegrees (double radian) {
		radian = radian / Math.PI; 
		radian = radian * 180; 
		return Math.abs((int) radian); 
	}
}
