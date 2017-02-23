package LAB.props;

import java.awt.Point;

public class Staff extends AbstractProp implements Prop, ShapeConstants{
	
	public String designation = "Staff"; 
	
	public Point centerOfRotation = new Point(103, 3); 
	public Point HandPosition = centerOfRotation; 
	
	public Staff copy() {
		Prop p = super.copy(this);
		Staff copy = (Staff)p;
		//Staff copy = new Staff(); 
		
		return copy; 
	}

	
}
