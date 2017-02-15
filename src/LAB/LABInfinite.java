package LAB;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import LAB.props.*;
import LAB.util.*;
import LAB.gui.*;

public class LABInfinite extends JFrame {
	
	private static final long serialVersionUID = 5963272828244291572L;
	
	LABCanvas canvas;
	
	Prop left; 
	Prop right; 
	PropControl leftControl;
	PropControl rightControl;
	
	ArrayList<Prop> props = new ArrayList<Prop>(); 
	ArrayList<PropControl> controls = new ArrayList<PropControl>(); 
	
	LABInfinite LAB = this; 
	
	JTabbedPane tabbedControls = new JTabbedPane(); 
	JTabbedPane canvasPane;
	JScrollPane canvasScroll;
	JScrollPane canvas3DScroll;
	
	boolean multimode = false; 
	
	int speed = 1000/60; 
	int increment = 125; 
	boolean fixedRate = false; 
	
	JPanel transitionGUI;
	java.util.Timer timer;
	LABStatusBar status = new LABStatusBar(); 
	
	public static void main(String[] args) {
		GraphicsEnvironment graphEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice graphDevice = graphEnv.getDefaultScreenDevice();
		GraphicsConfiguration graphicConf = graphDevice.getDefaultConfiguration();
		
		LABInfinite frame = new LABInfinite(graphicConf); 
		frame.setPreferredSize(new Dimension(1200, 750));
		frame.setFocusTraversalKeysEnabled(false);

		
		frame.setTitle("LAB INFINITE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); 
		frame.setVisible(true);
	}
	
	public LABInfinite(GraphicsConfiguration graphicConf) {
		//super(graphicConf); 
		initGUI(); 
		init(); 
	}
	
	public LABInfinite() {
		super(); 
		initGUI(); 
		init(); 
	}
	
	public void initGUI() {
		this.setPreferredSize(new Dimension(1200, 750));
		BorderLayout biff = new BorderLayout();
		this.setLayout(biff);
		
		canvas = new LABCanvas(); 
		left = canvas.left;
		right = canvas.right;
		
		leftControl = new PropControl(left); 
		rightControl = new PropControl(right);
		
		JPanel both = new JPanel(); 
		both.setLayout(new GridLayout(1,2));
		
		JTabbedPane leftPanel = leftControl.createGui();
		JTabbedPane rightPanel = rightControl.createGui();
		
		leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "LEFT"));
		rightPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "RIGHT"));
		
		both.add(leftPanel); 
		both.add(rightPanel);
		
		tabbedControls.addTab("Props 1", null, both, "1");
		
		canvas.setPreferredSize(new Dimension(710, 720));
		canvas.setBackground(Color.WHITE);
		canvas.setForeground(Color.WHITE);
		
		canvasScroll = new JScrollPane(canvas, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		canvasScroll.setPreferredSize(new Dimension(740, 750));
		
		
		
		canvasPane = new JTabbedPane(); 
		canvasPane.addTab("LAB 2D", null, canvasScroll, "2D");
		
		this.getContentPane().add(tabbedControls, BorderLayout.EAST);
			
		this.getContentPane().add(canvasPane, BorderLayout.WEST); 
		
		this.getContentPane().add(status, BorderLayout.SOUTH); 
		
		LABMenuBar menuBar = new LABMenuBar(this); 
		JMenuBar menubar = menuBar.createMenubar();
		
		this.setJMenuBar(menubar);

		status.one.setText("Initialised.");
		canvas.status = status; 
		
		
	}

	public void init() {
		props.add(left);
		props.add(right);
		controls.add(leftControl);
		controls.add(rightControl); 
		
		timer = new java.util.Timer(); 
		timer.schedule(new RepaintTimerTask(canvas), 100, speed);
	}

	public void removeControls() {
		tabbedControls.setVisible(false);
		canvas.setPreferredSize(new Dimension(1150, 700));
		canvasScroll.setPreferredSize(new Dimension(1170, 750));
		canvas3DScroll.setPreferredSize(new Dimension(1170, 750));
		canvas.setSize(1150, 700);
		canvasScroll.setSize(1170, 750);
		canvas3DScroll.setSize(1170, 750);
	}
	
	public void returnControls() {
		tabbedControls.setVisible(true);
		canvas.setPreferredSize(new Dimension(700, 700));
		canvasScroll.setPreferredSize(new Dimension(720, 750));
		canvas3DScroll.setPreferredSize(new Dimension(720, 750));
		canvas.setSize(700, 700);
		canvasScroll.setSize(720, 750);
		canvas3DScroll.setSize(720, 750);
	}

}
