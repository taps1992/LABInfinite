package LAB.props;

import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.util.StringTokenizer;

import LAB.directionchanges.Change;
import LAB.directionchanges.PositionChange;
import LAB.directionchanges.positions.Position;
import LAB.shapes.Circle;
import LAB.shapes.Shape;
import LAB.speeds.SpeedChangeProcess;
import LAB.util.Rotate;

public abstract class AbstractProp implements Prop {
	
	public double angle = 0;
	public double angleIncrement = Math.PI / 125;
	public double angleModifier = 0;
	public double pathAngle = 0;
	public double pathAngleIncrement = Math.PI / 125;
	public double pathAngleModifier = 0;
	public double speed = 1;
	public double pathSpeed = 1;
	public double x = 248;
	public double y = 350;
	public double xadj = 248;
	public double yadj = 350;
	public double length = 205;
	public double height = 9;
	public double staffChange = 0;
	public double pathModifier = 1;
	public double pathTurnAngle = 0;
	public double angleSpeedChangeMod = 0;
	public double angleSpeedChangeMod2 = 0;
	public double direction = 1;
	public double pathDirection = 1;
	public boolean trails = false;
	public Shape shape = new Circle();
	public double pathChange = 0;
	public double pathRotation = 0;
	public double xAxis = 0;
	public double yAxis = 0;
	public double zAxis = 1;
	public double xAxisTurnMod = 0;
	public double yAxisTurnMod = 0;
	public double zAxisTurnMod = 0;
	public boolean stopped = false;
	
	public boolean useSpeedChange = false;
	
	public boolean usePositionChange = false;
	public Position positionChange = null; 
	
	public double xNew = 0;
	public double yNew = 0;
	
	public String designation = "Prop"; 
	
	public Point centerOfRotation = new Point(103, 3); 
	public Point HandPosition = centerOfRotation; 

	//public BufferedImage image; 
	public boolean TwoD = true; 
	
	public BufferedImage defaultImage;
	public int speedChangeType;

	public boolean reflect = false; 
	
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#copy()
	 */
	public Prop copy(AbstractProp copy) {
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
		copy.angleSpeedChangeMod = angleSpeedChangeMod; 
		copy.angleSpeedChangeMod2 = angleSpeedChangeMod2; 
		
		return copy; 
	}
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#reset()
	 */
	public void reset() {
		angle = defaultAngle;
		angleIncrement = defaultAngleIncrement;
		angleModifier = defaultAngleModifier; 
		pathAngle = defaultCircleAngle;
		pathAngleIncrement = defaultCircleAngleIncrement; 
		pathAngleModifier = defaultCircleAngleModifier; 
		speed = defaultSpeed;
		pathSpeed = defaultHandSpeed; 
		x = defaultX;
		y = defaultY;
		xadj = defaultXadj;
		yadj = defaultYadj;
		pathModifier = defaultCircleModifier; 
		pathTurnAngle = defaultCircleTurnAngle; 
		length = defaultLength;
		height = defaultHeight; 
		direction = defaultDirection; 
		pathDirection = defaultHandDirection; 
		trails = defaultTrails; 
		shape = defaultShape; 
		staffChange = defaultStaffChange; 
		pathChange = defaultPathChange; 
		pathRotation = defaultPathRotation; 
		angleSpeedChangeMod = 0;
		angleSpeedChangeMod2 = 0;
		
		useSpeedChange = false;
		speedChangeType = 0;
	}
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#sync(LAB.props.Prop)
	 */
	public void sync(AbstractProp s) {
		angle = s.angle;
		angleIncrement = s.angleIncrement;
		angleModifier = s.angleModifier;
		pathAngle = s.pathAngle;
		pathAngleIncrement = s.pathAngleIncrement; 
		pathAngleModifier = s.pathAngleModifier;
		speed = s.speed;
		pathSpeed = s.pathSpeed; 
		x = s.x;
		y = s.y;
		xadj = s.xadj;
		yadj = s.yadj;
		pathModifier = s.pathModifier; 
		pathTurnAngle = s.pathTurnAngle; 
		length = s.length;
		height = s.height; 
		direction = s.direction; 
		pathDirection = s.pathDirection; 
		trails = s.trails; 
		shape = s.shape; 
		staffChange = s.staffChange; 
		pathChange = s.pathChange; 
		pathRotation = s.pathRotation; 
		angleSpeedChangeMod = s.angleSpeedChangeMod;
		angleSpeedChangeMod2 = s.angleSpeedChangeMod2;
		
		useSpeedChange = s.useSpeedChange;
		speedChangeType = s.speedChangeType;
	}
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#stop()
	 */
	public void stop() {
		if(angleIncrement != 0) angleIncrement = 0; 
		else angleIncrement = defaultAngleIncrement; 
		if(pathAngleIncrement != 0) pathAngleIncrement = 0; 
		else pathAngleIncrement = defaultCircleAngleIncrement; 
		stopped = true; 
	}
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#go()
	 */
	public void go() {
		if(angleIncrement == 0) angleIncrement = defaultAngleIncrement; 
		if(pathAngleIncrement == 0) pathAngleIncrement = defaultCircleAngleIncrement; 
		stopped = false; // TODO - this should be set to a global value not the default. 
	}
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#update()
	 */
	public void update() {
		
		// update angles
		angle += ((angleIncrement * direction) * speed);
		pathAngle += (pathAngleIncrement * pathSpeed) * pathDirection; // this can be negative so the angle can decrement. 
		
		if(useSpeedChange)
		{	angle = SpeedChangeProcess.process(angle, pathAngle, angleModifier, direction, speed, speedChangeType, angleSpeedChangeMod, angleSpeedChangeMod2);
		}
		
		// check to make sure there has been no direction change for the staff
		//double dirChange = Change.checkForDirChange(angle, direction, angleModifier, staffChange, angleIncrement, speed);
		double dirChange = Change.checkForChange(pathAngle, direction, angleModifier, pathTurnAngle, staffChange, angleIncrement);
		
		if (dirChange != -10) {
			direction = direction * -1;
			angle = staffChange + angleModifier; 
		}
		else dirChange = 0;
		
		// check to make sure there has been no direction change for the hand path
		double handChange = Change.checkForChange(pathAngle, pathDirection, pathAngleModifier, pathTurnAngle, pathChange, pathAngleIncrement);
		
		if (handChange != -10)
			pathDirection = pathDirection * -1;
		else handChange = 0;
		
		// if there has been a direction change then the following hand path or staff angle need adjusting
		// for the tolerance amount. 
		//angle -= dirChange / 2 ;
		pathAngle -= handChange / 2 ;
		
		// find out where we are on the hand path
		LAB.util.Point p = shape.draw(length, pathModifier, pathAngle, pathTurnAngle);  
		
		// add adjustments to x and y to get to the right unit circle
		// TODO adjust position gradually control. 
		if(usePositionChange) {
			
			//System.out.println("name " + positionChange.getName() + "\npath " + pathModifier + "\nangle " + pathAngle);
			//System.out.println("xadj " + xadj + "\nyadj " + yadj + "\nxNew " + xNew + "\nyNew " + yNew);
			
			p = positionChange.process(length, pathModifier, pathAngle, pathTurnAngle, xadj, yadj, xNew, yNew);
			if (p == null) System.out.println("something else is wrong");
			
			// rotate that point according to the path rotation
			Rotate.rotate(p, (pathRotation + shape.getPathRotation()));
			
			x = p.x; 
		    y = p.y;
		    
		}
		else {
			// rotate that point according to the path rotation
			Rotate.rotate(p, (pathRotation + shape.getPathRotation()));
			
			// remove x and y
			x = p.x;
			y = p.y;
			
			x += xadj; 
			y += yadj;
		}
		
	}
	
	
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#updateBy(double)
	 * UNUSED
	 */
	
	public void updateBy(double increment) {
		
		// update angles
		angle += ((increment*direction) * speed);
		pathAngle += (increment * pathSpeed) * pathDirection; // this can be negative so the angle can decrement. 
		
		if(useSpeedChange)
		{	angle = SpeedChangeProcess.process(angle, pathAngle, angleModifier, direction, speed, speedChangeType, angleSpeedChangeMod, angleSpeedChangeMod2);
		}
		
		// check to make sure there has been no direction change for the staff
		direction = Change.checkForChange(angle, direction, angleModifier, staffChange, angleIncrement);
		
		// check to make sure there has been no direction change for the hand path
		pathDirection = Change.checkForChange(pathAngle, pathDirection, pathAngleModifier, pathTurnAngle, pathChange, pathAngleIncrement);
		
		
		
		// if there has been a direction change then the following hand path or staff angle need adjusting
		// for the tolerance amount. 
				
		double remainderHand = Change.getToleranceGap(pathAngle, pathDirection, pathAngleModifier, pathTurnAngle, pathChange, pathAngleIncrement);
				
		double remainderDirection = Change.getToleranceGap(angle, direction, angleModifier, 0, staffChange, angleIncrement);
		
		System.out.println("remainders - ");
		if (remainderHand != 0) System.out.println("remainderHand - " + remainderHand);
		if (remainderDirection != 0) System.out.println("remainderDir - " + remainderDirection);
		////
		
		
		
		// find out where we are on the hand path
		LAB.util.Point p = shape.draw(length, pathModifier, pathAngle, pathTurnAngle);  
		
		// rotate that point according to the path rotation
		Rotate.rotate(p, (pathRotation + shape.getPathRotation()));
		
		// remove x and y
		x = p.x;
		y = p.y;
		
		// add adjustments to x and y to get to the right unit circle
		x += xadj; 
		y += yadj;
	} /**/
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#getX()
	 */
	public double getX() {
		return x;
	}
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#setX(double)
	 */
	public void setX(double x) {
		this.x = x;
	}
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#getY()
	 */
	public double getY() {
		return y;
	}
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#setY(double)
	 */
	public void setY(double y) {
		this.y = y;
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
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#createTextPattern()
	 */
	public String createTextPattern() {
			String text = new String();
			text = text + "0,"; //+ controlled.angle + ",";
			text = text + angleIncrement + ",";
			text = text + angleModifier + ",";
			text = text + "0,";//circleAngle + ",";
			text = text + pathAngleIncrement + ",";
			text = text + pathAngleModifier + ",";
			text = text + pathModifier + ",";
			text = text + direction + ",";
			text = text + pathDirection + ",";
			text = text + pathSpeed + ",";
			text = text + height + ",";
			text = text + length + ",";
			text = text + shape.getName() + ",";
			text = text + speed + ",";
			text = text + "0,";//x + ",";
			text = text + xadj + ",";
			text = text + "0,";//y + ",";
			text = text + yadj + ",";
			text = text + staffChange + ",";
			text = text + pathRotation + ","; 
			text = text + pathChange + ","; 
			text = text + angleSpeedChangeMod + ","; 
			text = text + angleSpeedChangeMod2 + ","; 
			
			text = text + useSpeedChange + ","; 
			text = text + speedChangeType + ","; 
			return text;
	}
	/* (non-Javadoc)
	 * @see LAB.props.SuperProp#parsePropText(java.lang.String)
	 */
	public void parsePropText(String phrase) {
	
		StringTokenizer tokenizer = new StringTokenizer(phrase, ","); 
		// in order 
		String angle = tokenizer.nextToken();
		this.angle = Double.parseDouble(angle);
		
		String angleIncrement = tokenizer.nextToken();
		double incr1 = Double.parseDouble(angleIncrement);
		this.angleIncrement = incr1;
		//if(incr1 == 0)
		//	this.angleIncrement = Prop.defaultAngleIncrement; // TODO take from Global
		// ?? staff speed
		
		String angleModifier = tokenizer.nextToken();
		this.angleModifier = Double.parseDouble(angleModifier);
		this.angle += this.angleModifier; 
		// no control update needed
		
		String circleAngle = tokenizer.nextToken();
		this.pathAngle = Double.parseDouble(circleAngle);
		// no control update needed
		
		String circleAngleIncrement = tokenizer.nextToken();
		double incr = Double.parseDouble(circleAngleIncrement);
		this.pathAngleIncrement = incr; 
		//if(incr == 0)
		//	this.circleAngleIncrement = Prop.defaultCircleAngleIncrement; // TODO take from Global
		// ?? speed
		
		String circleAngleModifier = tokenizer.nextToken();
		this.pathAngleModifier = Double.parseDouble(circleAngleModifier);
		this.pathAngle += this.pathAngleModifier; 
		
		String circleModifier = tokenizer.nextToken();
		this.pathModifier = Double.parseDouble(circleModifier);
		
		String direction = tokenizer.nextToken();
		this.direction = Double.parseDouble(direction);
		
		String handDirection = tokenizer.nextToken();
		this.pathDirection = Double.parseDouble(handDirection);
		
		String handSpeed = tokenizer.nextToken();
		this.pathSpeed = Double.parseDouble(handSpeed);
		
		String height = tokenizer.nextToken();
		this.height = Double.parseDouble(height);
		// no control update needed
		
		String length = tokenizer.nextToken();
		this.length = Double.parseDouble(length);
		// no control update needed
		
		this.pathRotation = 0;
		
		String shape = tokenizer.nextToken();
		for (Shape s : ShapeConstants.shapes) {
			if (s.getName().equals(shape)) { 
				this.shape = s;
				break;
			}
		}
		
		if(shape.equals("VerticalLine")) { this.shape = ShapeConstants.VERTICAL_LINE; }
		else if(shape.equals("HorizontalLine")) { this.shape = ShapeConstants.HORIZONTAL_LINE; }
		else if(shape.equals("LinePoints")) { this.shape = ShapeConstants.PAUSED_HORIZONTAL_LINE; }
		else if(shape.equals("VerticalLinePoints")) { this.shape = ShapeConstants.PAUSED_VERTICAL_LINE; }
		
		else if(shape.equals("FigureOfEightVertical")) { this.shape = ShapeConstants.FIGURE_OF_EIGHT; this.pathRotation += Math.PI / 2; }
		else if(shape.equals("LissajousCurveHorizontal")) { this.shape = ShapeConstants.LISSAJOUS_FIGURE; this.pathRotation += Math.PI / 2; }
		else if(shape.equals("DiagonalLine45Left")) { this.shape = ShapeConstants.HORIZONTAL_LINE; this.pathRotation += Math.PI + (Math.PI / 4);}
		else if(shape.equals("DiagonalLine45Right")) { this.shape = ShapeConstants.HORIZONTAL_LINE; this.pathRotation += (Math.PI / 4); } 
		
		// System.out.println(" got to speed - " + tokenizer.hasMoreTokens());
		
		String speed = tokenizer.nextToken();
		this.speed = Double.parseDouble(speed);
		
		String x = tokenizer.nextToken();
		this.x = Double.parseDouble(x);
		
		String xadj = tokenizer.nextToken();
		this.xadj = Double.parseDouble(xadj);
		
		String y = tokenizer.nextToken();
		this.y = Double.parseDouble(y);
		
		String yadj = tokenizer.nextToken();
		this.yadj = Double.parseDouble(yadj);
		
		this.y += this.yadj;
		this.x += this.xadj;
		
		// System.out.println(" has more tokens - " + tokenizer.hasMoreTokens());
		
		if(tokenizer.hasMoreTokens()) {
			String change = tokenizer.nextToken();
			this.staffChange = Double.parseDouble(change); 
		}
		else {
			this.staffChange = AbstractProp.defaultStaffChange; 
		}
		
		if(tokenizer.hasMoreTokens()) {
			String rotate = tokenizer.nextToken();
			this.pathRotation = Double.parseDouble(rotate); 
			// System.out.println("pathRotation - " + this.pathRotation);
		}
		else {
			this.pathRotation = AbstractProp.defaultPathRotation; 
		}
		
		if(tokenizer.hasMoreTokens()) {
			String change = tokenizer.nextToken();
			this.pathChange = Double.parseDouble(change); 
		}
		else {
			this.pathChange = AbstractProp.defaultPathChange; 
		}
		
		if(tokenizer.hasMoreTokens()) {
			String change = tokenizer.nextToken();
			this.angleSpeedChangeMod = Double.parseDouble(change);
			//if(this.angleSpeedChangeMod == 0.0)  this.useSpeedChange = false;
		}
		else {
			//this.useSpeedChange = false;
			this.angleSpeedChangeMod = 0; 
		}
		
		if(tokenizer.hasMoreTokens()) {
			String change = tokenizer.nextToken();
			this.angleSpeedChangeMod2 = Double.parseDouble(change); 
		}
		else {
			this.angleSpeedChangeMod2 = 0; 
		}
		
		if(tokenizer.hasMoreTokens()) {
			String change = tokenizer.nextToken();
			this.useSpeedChange = Boolean.parseBoolean(change); 
			// System.out.println("speedcahnge " + change); 
		}
		else {
			this.useSpeedChange = false; 
		}
		
		if(tokenizer.hasMoreTokens()) {
			String change = tokenizer.nextToken();
			this.speedChangeType = Integer.parseInt(change); 
			// System.out.println("cahnge " + change); 
		}
		else {
			this.speedChangeType = 0; 
		}
	}
	
	
	public void setHeight(int height) {
		this.height = height; 
	}

	public void setLength(int width) {
		this.length = width; 
	}
	
	public double getHeight() {
		return height; 
	}

	public double getLength() {
		return length;
	}
	
	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getCircleAngle() {
		return pathAngle;
	}

	public void setCircleAngle(double circleAngle) {
		this.pathAngle = circleAngle;
	}

	public double getXadj() {
		return xadj;
	}

	public void setXadj(double xadj) {
		this.xadj = xadj;
	}

	public double getYadj() {
		return yadj;
	}

	public void setYadj(double yadj) {
		this.yadj = yadj;
	}

	public double getCircleAngleModifier() {
		return pathAngleModifier;
	}

	public void setCircleAngleModifier(double circleAngleModifier) {
		this.pathAngleModifier = circleAngleModifier;
	}

	public double getAngleIncrement() {
		return angleIncrement;
	}

	public void setAngleIncrement(double angleIncrement) {
		this.angleIncrement = angleIncrement;
	}

	public double getCircleAngleIncrement() {
		return pathAngleIncrement;
	}

	public void setCircleAngleIncrement(double circleAngleIncrement) {
		this.pathAngleIncrement = circleAngleIncrement;
	}

	
	public AffineTransform getAffineTransform() {
		// TODO mod this up for other shapes? or an offset center point?
		AffineTransform tx = AffineTransform.getRotateInstance(angle, this.getLength()/2, this.getHeight()/2); 
		if(reflect) {
			tx = AffineTransform.getScaleInstance(1, -1);
			tx.translate(0, -this.getHeight());
			AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
			//image = op.filter(image, null);
		}
		return tx;
		//AffineTransform.getRotateInstance(angle, this.getLength()/2, this.getHeight()/2); 
	} 
}
