package LAB.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class LABStatusBar extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5315920386545424734L;
	JPanel onep = new JPanel(); 
	JPanel twop = new JPanel(); 
	JPanel threep = new JPanel(); 
	
	public JLabel one = new JLabel(""); 
	public JLabel two = new JLabel(""); 
	public JLabel three = new JLabel(""); 
	
	public LABStatusBar() {
		super();
		
		onep.add(one); 
		twop.add(two); 
		threep.add(three); 
		
		onep.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		twop.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		threep.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		
		this.setLayout(new BorderLayout());
		this.add(onep, BorderLayout.WEST); 
		this.add(twop, BorderLayout.CENTER); 
		this.add(threep, BorderLayout.EAST); 
		
		this.setMaximumSize(new Dimension(1024, 25));
		this.setPreferredSize(new Dimension(1024, 25));
	}
}
