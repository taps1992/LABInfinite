package LAB.util;

public class Trans {
	public Pair before;
	public Pair after;
	
	public String toString() {
		String t = "Transition at [left: " + Rotate.toDegrees(before.left.pathAngle) + " (" + before.left.x + "," + before.left.y + ") right: " + Rotate.toDegrees(before.right.pathAngle) + " (" + before.left.x + "," + before.left.y + ")]";
		return t; 
	}
}
