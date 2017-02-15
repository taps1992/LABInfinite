package LAB.props;

import java.awt.Point;
import java.awt.geom.AffineTransform;

public class Fan extends AbstractProp implements Prop,ShapeConstants{

	public String designation = "Fan"; 
	
	public Point centerOfRotation = new Point(0, 0); 
	public Point HandPosition = centerOfRotation; 
	
	
	public AffineTransform getAffineTransform() {
		// TODO mod this up for other shapes? or an offset center point?
		
		return AffineTransform.getRotateInstance(angle, ((length)*1), ((height)*1)); 
	} 
	
}
