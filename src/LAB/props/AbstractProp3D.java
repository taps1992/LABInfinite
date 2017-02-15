package LAB.props;

import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.StringTokenizer;

import LAB.directionchanges.Change;
import LAB.shapes.Circle;
import LAB.shapes.Shape;
import LAB.speeds.SpeedChangeProcess;
import LAB.util.Rotate;

public abstract class AbstractProp3D extends AbstractProp implements Prop3D {
	
	public double angleXZ = 0;
	public double angleIncrementXZ = Math.PI / 125;
	public double angleModifierXZ = 0;
	public double circleAngleXZ = 0;
	public double circleAngleIncrementXZ = Math.PI / 125;
	public double circleAngleModifierXZ = 0;
	public double speedXZ = 1;
	public double handSpeedXZ = 1;
	
	public double angleYZ = 0;
	public double angleIncrementYZ = Math.PI / 125;
	public double angleModifierYZ = 0;
	public double circleAngleYZ = 0;
	public double circleAngleIncrementYZ = Math.PI / 125;
	public double circleAngleModifierYZ = 0;
	public double speedYZ = 1;
	public double handSpeedYZ = 1;


	public double z = 350;
	public double zadj = 350;
	public double width = 9;
	
	public double staffChangeXZ = 0;
	public double circleModifierXZ = 1;
	public double circleTurnAngleXZ = 0;
	public double angleSpeedChangeModXZ = 0;
	public double directionXZ = 1;
	public double handDirectionXZ = 1;
	public Shape shapeXZ = new Circle();
	public double pathChangeXZ = 0;
	public double pathRotationXZ = 0;
	
	public double staffChangeYZ = 0;
	public double circleModifierYZ = 1;
	public double circleTurnAngleYZ = 0;
	public double angleSpeedChangeModYZ = 0;
	public double directionYZ = 1;
	public double handDirectionYZ = 1;
	public Shape shapeYZ = new Circle();
	public double pathChangeYZ = 0;
	public double pathRotationYZ = 0;
	
	
	public double xAxis = 0;
	public double yAxis = 0;
	public double zAxis = 1;
	public double xAxisTurnMod = 0;
	public double yAxisTurnMod = 0;
	public double zAxisTurnMod = 0;

	
	public String designation = "Prop3D"; 
	
	public Point centerOfRotation = new Point(103, 3); 
	
	public boolean TwoD = true; 

	
	
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#copy()
	 */
	public Prop3D copy(AbstractProp3D copy) {
		copy.angle = angle;
		copy.angleIncrement = angleIncrement;
		copy.angleModifier = angleModifier; 
		copy.pathAngle = pathAngle;
		copy.pathAngleIncrement = pathAngleIncrement; 
		copy.pathAngleModifier = pathAngleModifier; 
		copy.speed = speed;
		copy.pathSpeed = pathSpeed; 
		copy.x = x;
		copy.y = y;
		copy.xadj = xadj;
		copy.yadj = yadj;
		copy.pathModifier = pathModifier; 
		copy.pathTurnAngle = pathTurnAngle; 
		copy.length = length;
		copy.height = height; 
		copy.direction = direction; 
		copy.pathDirection = pathDirection; 
		copy.trails = trails; 
		copy.shape = shape; 
		copy.staffChange = staffChange; 
		copy.pathChange = pathChange; 
		copy.pathRotation = pathRotation; 
		
		return copy; 
	}
	
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#getZ()
	 */
	public double getZ() {
		return z;
	}
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#setY(double)
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#createTextPatternVerbose()
	 */
	public String createTextPatternVerbose() {
			String text = new String();
			
			String direction1 = "Clockwise"; 
			String handDirection1 = "Clockwise"; 
			if(direction == -1 ) direction1 = "Anti-Clockwise"; 
			if(pathDirection == -1 ) handDirection1 = "Anti-Clockwise"; 
			
			text = text + "\nProp Speed: " + speed + "";
			text = text + "\nProp Increment: " + angleIncrement + "";
			text = text + "\nProp Angle Phase (deg): " + Rotate.toDegrees(angleModifier) + "";
			text = text + "\nProp Direction: " + direction1 + "";
			text = text + "\nDirection Change Interval: " + staffChange + "";
			text = text + "\nHand Increment: " + pathAngleIncrement + "";
			text = text + "\nHand Path Modifier (deg): " + Rotate.toDegrees(pathAngleModifier) + "";
			text = text + "\nHand Path Size (factor): " + pathModifier + "";
			text = text + "\nHand Path: " + shape.getName() + "";
			text = text + "\nHand Direction: " + handDirection1 + "";
			text = text + "\nHand Speed: " + pathSpeed + "";
			text = text + "\nHand Path Rotation (deg): " + pathRotation + "";
			text = text + "\nCenter of Spin: " + xadj + ", ";
			text = text + "" + yadj + "";
			text = text + "\nProp Height: " + height + "";
			text = text + "\nProp Length: " + length + "";
			return text;
	}
	
	public void setWidth(int height) {
		this.width = height; 
	}

	public double getWidth() {
		return width;
	}
	
	
	
	public double getYZAngle() {
		return angleYZ;
	}

	public void setYZAngle(double angle) {
		this.angleYZ = angle;
	}

	public double getYZCircleAngle() {
		return circleAngleYZ;
	}

	public void setYZCircleAngle(double circleAngle) {
		this.circleAngleYZ = circleAngle;
	}


	public double getXZAngle() {
		return angleXZ;
	}

	public void setXZAngle(double angle) {
		this.angleXZ = angle;
	}

	public double getXZCircleAngle() {
		return circleAngleXZ;
	}

	public void setXZCircleAngle(double circleAngle) {
		this.circleAngleXZ = circleAngle;
	}
	

	public double getZadj() {
		return zadj;
	}

	public void setZadj(double zadj) {
		this.zadj = zadj;
	}

	
	
	public double getYZCircleAngleModifier() {
		return circleAngleModifierYZ;
	}

	public void setYZCircleAngleModifier(double circleAngleModifier) {
		this.circleAngleModifierYZ = circleAngleModifier;
	}

	public double getYZAngleIncrement() {
		return angleIncrementYZ;
	}

	public void setYZAngleIncrement(double angleIncrement) {
		this.angleIncrementYZ = angleIncrement;
	}

	public double getYZCircleAngleIncrement() {
		return circleAngleIncrementYZ;
	}

	public void setYZCircleAngleIncrement(double circleAngleIncrement) {
		this.circleAngleIncrementYZ = circleAngleIncrement;
	}
	
	
	public double getXZCircleAngleModifier() {
		return circleAngleModifierXZ;
	}

	public void setXZCircleAngleModifier(double circleAngleModifier) {
		this.circleAngleModifierXZ = circleAngleModifier;
	}

	public double getXZAngleIncrement() {
		return angleIncrementXZ;
	}

	public void setXZAngleIncrement(double angleIncrement) {
		this.angleIncrementXZ = angleIncrement;
	}

	public double getXZCircleAngleIncrement() {
		return circleAngleIncrementXZ;
	}

	public void setXZCircleAngleIncrement(double circleAngleIncrement) {
		this.circleAngleIncrementXZ = circleAngleIncrement;
	}

	
	public AffineTransform getAffineTransform() {
		// TODO mod this up for other shapes? or an offset center point?
		
		return AffineTransform.getRotateInstance(angle, this.getLength()/2, this.getHeight()/2); 
	} 
}
