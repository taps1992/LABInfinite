package LAB.directionchanges.positions;

import LAB.util.Point;

public interface Position {
	public Point process(double length, double circleModifier, double circleAngle, double circleTurnModifier, double xadj, double yadj, double newx, double newy);

	public double getPeriod();
	
	public String getName();
	
	public double getPathRotation(); 
	
	public boolean equals(Position shape);
	
	public boolean equals(Object obj);
}
