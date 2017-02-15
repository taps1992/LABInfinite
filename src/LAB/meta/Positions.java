package LAB.meta;

import java.awt.Point;

public class Positions {
	
	public static final int unit_x = 205;  
	public static final int unit_y = 9;  
	
	public static final int center_x = 248; 
	public static final int center_y = 350; 
		
	public static final Point POINT_CENTER = new Point(center_x,center_y); 
	public static final Point POINT_CENTER_UP = new Point(center_x,center_y - unit_x); 
	public static final Point POINT_CENTER_DOWN = new Point(center_x,center_y + unit_x);
	public static final Point POINT_CENTER_LEFT = new Point(center_x - unit_x,center_y); 
	public static final Point POINT_CENTER_RIGHT = new Point(center_x + unit_x,center_y); 
	
	public static final Point POINT_CENTER_UP_HALF = new Point(center_x,center_y - (unit_x/2)); 
	public static final Point POINT_CENTER_DOWN_HALF = new Point(center_x,center_y + (unit_x/2)); 
	public static final Point POINT_CENTER_LEFT_HALF = new Point(center_x - (unit_x/2),center_y); 
	public static final Point POINT_CENTER_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y); 
	
	public static final Point POINT_UP_LEFT = new Point(center_x - unit_x,center_y - unit_x); 
	public static final Point POINT_UP_RIGHT = new Point(center_x + unit_x,center_y - unit_x); 
	public static final Point POINT_DOWN_LEFT = new Point(center_x - unit_x,center_y + unit_x); 
	public static final Point POINT_DOWN_RIGHT = new Point(center_x + unit_x,center_y + unit_x); 
	
	public static final Point POINT_UP_LEFT_HALF = new Point(center_x - (unit_x/2),center_y - (unit_x/2)); 
	public static final Point POINT_UP_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y - (unit_x/2)); 
	public static final Point POINT_DOWN_LEFT_HALF = new Point(center_x - (unit_x/2),center_y + (unit_x/2)); 
	public static final Point POINT_DOWN_RIGHT_HALF = new Point(center_x + (unit_x/2),center_y + (unit_x/2)); 
}
