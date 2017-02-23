package LAB.shapes;

import LAB.util.Point;

public class AbstractShape {
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
		if(!(obj instanceof Shape)) return false; 
		return equals((Shape)obj); 
	}
	
	public boolean equals(Shape shape) {
		if(shape.getName().equalsIgnoreCase(this.name)) return true; 
		return false; 
	}
}
