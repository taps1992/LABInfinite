package LAB.props;

import java.awt.geom.AffineTransform;

import LAB.shapes.Circle;
import LAB.shapes.Shape;

public interface Prop {
	public static final double defaultXAxis = 0;

	public static final double defaultYAxis = 0;

	public static final double defaultZAxis = 1;

	public static final double defaultXAxisTurnMod = 0;

	public static final double defaultYAxisTurnMod = 0;

	public static final double defaultZAxisTurnMod = 0;

	public static final double defaultAngle = 0;

	public static final double defaultAngleIncrement = Math.PI / 125;

	public static final double defaultAngleModifier = 0;

	public static final double defaultCircleAngle = 0;

	public static final double defaultCircleAngleIncrement = Math.PI / 125;

	public static final double defaultCircleAngleModifier = 0;

	public static final double defaultSpeed = 1;

	public static final double defaultHandSpeed = 1;

	public static final double defaultX = 248;

	public static final double defaultY = 350;

	public static final double defaultXadj = 248;

	public static final double defaultYadj = 350;

	public static final double defaultCircleModifier = 1;

	public static final double defaultCircleTurnAngle = 0;

	public static final double defaultLength = 205;

	public static final double defaultHeight = 9;

	public static final double defaultDirection = 1;

	public static final double defaultHandDirection = 1;

	public static final boolean defaultTrails = false;

	public static final Shape defaultShape = new Circle();

	public static final double defaultStaffChange = 0;

	public static final double defaultPathChange = 0;

	public static final double defaultPathRotation = 0;

	

	
	
	public abstract Prop copy(AbstractProp p);

	public abstract void reset();

	public abstract void sync(AbstractProp s);

	public abstract void stop();

	public abstract void go();

	public abstract void update();

	public abstract void updateBy(double increment);

	public abstract double getX();

	public abstract void setX(double x);

	public abstract double getY();

	public abstract void setY(double y);

	public abstract String createTextPatternVerbose();

	public abstract String createTextPattern();

	public abstract void parsePropText(String phrase);

	public abstract AffineTransform getAffineTransform();

	public abstract void setHeight(int height);

	public abstract void setLength(int width);

	public abstract double getAngle();

	public abstract void setAngle(double angle);

	public abstract void setCircleAngle(double circleAngle);

	public abstract double getLength();

	public abstract double getHeight();

	public abstract double getYadj();

	public abstract double getXadj();

	public abstract void setYadj(double i);

	public abstract void setXadj(double i);

	public abstract void setCircleAngleModifier(double pi);

	public abstract void setCircleAngleIncrement(double d);

	public abstract void setAngleIncrement(double d);

}