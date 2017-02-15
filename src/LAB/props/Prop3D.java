package LAB.props;

import LAB.shapes.Circle;
import LAB.shapes.Shape;

public interface Prop3D extends Prop{
	public static final double defaultXAxis = 0;

	public static final double defaultYAxis = 0;

	public static final double defaultZAxis = 1;

	public static final double defaultXAxisTurnMod = 0;

	public static final double defaultYAxisTurnMod = 0;

	public static final double defaultZAxisTurnMod = 0;

	
	public static final double defaultXZAngle = 0;

	public static final double defaultXZAngleIncrement = Math.PI / 125;

	public static final double defaultXZAngleModifier = 0;

	public static final double defaultXZCircleAngle = 0;

	public static final double defaultXZCircleAngleIncrement = Math.PI / 125;

	public static final double defaultXZCircleAngleModifier = 0;

	public static final double defaultXZSpeed = 1;

	public static final double defaultXZHandSpeed = 1;
	
	
	public static final double defaultYZAngle = 0;

	public static final double defaultYZAngleIncrement = Math.PI / 125;

	public static final double defaultYZAngleModifier = 0;

	public static final double defaultYZCircleAngle = 0;

	public static final double defaultYZCircleAngleIncrement = Math.PI / 125;

	public static final double defaultYZCircleAngleModifier = 0;

	public static final double defaultYZSpeed = 1;

	public static final double defaultYZHandSpeed = 1;

	
	public static final double defaultZ = 0;

	public static final double defaultZadj = 0;

	
	public static final double defaultXZCircleModifier = 1;

	public static final double defaultXZCircleTurnAngle = 0;
	
	public static final double defaultYZCircleModifier = 1;

	public static final double defaultYZCircleTurnAngle = 0;


	public static final double defaultWidth = 9;
	

	public static final double defaultXZDirection = 1;

	public static final double defaultXZHandDirection = 1;

	public static final Shape defaultXZShape = new Circle();

	public static final double defaultXZStaffChange = 0;

	public static final double defaultXZPathChange = 0;

	public static final double defaultXZPathRotation = 0;
	
	
	public static final double defaultYZDirection = 1;

	public static final double defaultYZHandDirection = 1;

	public static final Shape defaultYZShape = new Circle();

	public static final double defaultYZStaffChange = 0;

	public static final double defaultYZPathChange = 0;

	public static final double defaultYZPathRotation = 0;

	

	
	
	public abstract Prop3D copy(AbstractProp3D p);

	public abstract void update();

	public abstract double getZ();

	public abstract void setZ(double z);
	
	public abstract double getZadj();


	public abstract void setWidth(int width);
	
	public abstract double getWidth();

	public abstract void setZadj(double z);


	public abstract double getXZAngle();

	public abstract void setXZAngle(double angle);

	public abstract void setXZCircleAngle(double circleAngle);

	public abstract void setXZCircleAngleModifier(double pi);

	public abstract void setXZCircleAngleIncrement(double d);

	public abstract void setXZAngleIncrement(double d);
	
	
	public abstract double getYZAngle();

	public abstract void setYZAngle(double angle);

	public abstract void setYZCircleAngle(double circleAngle);

	public abstract void setYZCircleAngleModifier(double pi);

	public abstract void setYZCircleAngleIncrement(double d);

	public abstract void setYZAngleIncrement(double d);

}