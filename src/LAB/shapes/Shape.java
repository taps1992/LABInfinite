package LAB.shapes;

import LAB.util.Point;

public interface Shape {
	public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier);

	public double getPeriod();
	
	public String getName();
	
	public double getPathRotation(); 
	
	public boolean equals(Shape shape);
	
	public boolean equals(Object obj);
}
