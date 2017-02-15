package LAB.directionchanges.positions;

import LAB.util.Point;

public class AbstractPosition {
	double x; 
	double y; 
	double period = Math.PI * 2; 
	Point p = new Point(); 
	String name;
	double specialPathRotation;
	
	public double getPathRotation() {
		return specialPathRotation; 
	}
	
	public double getPeriod() {
		return period; 
	}
	
	public String getName() {
		return name; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Position)) return false; 
		return equals((Position)obj); 
	}
	
	public boolean equals(Position shape) {
		if(shape.getName().equalsIgnoreCase(this.name)) return true; 
		return false; 
	}
}
