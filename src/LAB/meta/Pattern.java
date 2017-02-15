package LAB.meta;

import java.awt.datatransfer.*;
import java.io.IOException;

import LAB.props.ShapeConstants;

// class to contain the transitions between patterns for the staffs. 
// could it be to contain both staffs patterns?
// greater period and such like
public class Pattern implements Transferable{
	public static final DataFlavor flavor = new DataFlavor(Pattern.class, "Pattern"); 
	
	String leftText; 
	String rightText;
	ShapeConstants left;
	ShapeConstants right; 
	
	double period;

	int objectNumber = 2; 
	
	String name; 
	
	public boolean transitionable = true;
	public boolean folder = false; 
	
	public Pattern()
	{}
	
	public Pattern(String left, String right, String name) {
		leftText = left; 
		rightText = right; 
		this.name = name; 
		objectNumber = 2; 
	}
	
	public String toString() {
		return name; 
	}
	
	public double getPeriod() {
		return period;
	}

	public void setPeriod(double period) {
		this.period = period;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeftText() {
		return leftText;
	}

	public String getRightText() {
		return rightText;
	}
	
	public boolean isDataFlavorSupported(DataFlavor flavor){
		if (flavor.equals(DataFlavor.stringFlavor)) {
            return true;
        }
		if (flavor.equals(Pattern.flavor)) {
            return true;
        }
        return false;
	}
	public DataFlavor[] getTransferDataFlavors() {
		DataFlavor[] flavors = {Pattern.flavor, DataFlavor.stringFlavor};
		return flavors;
	}
	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
		if(flavor.equals(DataFlavor.stringFlavor)) {
			return this.name;
		}
		if (flavor.equals(Pattern.flavor)) {
	        return this;
	    }	
		return null; 
	}

}
