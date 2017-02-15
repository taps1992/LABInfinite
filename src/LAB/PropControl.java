package LAB;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import LAB.meta.Positions;
import LAB.props.AbstractProp;
import LAB.props.Prop;
import LAB.props.Staff;
import LAB.props.ShapeConstants;
import LAB.shapes.Circle;
import LAB.shapes.Line;
import LAB.speeds.Speed;
import LAB.speeds.SpeedChangeProcess;
import LAB.util.Rotate;

public class PropControl {

	private AbstractProp controlled;
	private ButtonGroup shapegroup = new ButtonGroup();
	private ButtonGroup changegroup = new ButtonGroup();
	
	private JCheckBox angle1 = new JCheckBox("90"); 
	private JCheckBox angle22 = new JCheckBox("-45"); 
	private JCheckBox angle2 = new JCheckBox("45"); 
	private JCheckBox angle3 = new JCheckBox("0"); 
	private JCheckBox angle4 = new JCheckBox("Spin"); 
	
	JCheckBox circle = new JCheckBox("circle"); 
	JCheckBox square = new JCheckBox("square"); 
	JCheckBox vertline = new JCheckBox("line |"); 
	JCheckBox horizline = new JCheckBox("line -"); 
	JCheckBox dot = new JCheckBox("point ."); 
	
	JCheckBox pingpong = new JCheckBox("pingpong"); 
	
	JCheckBox quarters = new JCheckBox("Quarters"); 
	JCheckBox stepped = new JCheckBox("Stepped"); 
	JCheckBox translated = new JCheckBox("Translated"); 
	JCheckBox figureeight = new JCheckBox("Fig8 -"); 
	JCheckBox lissajous = new JCheckBox("Lissajous |"); 
	JCheckBox realhypo = new JCheckBox("Hypocycloid"); 
	
	JCheckBox pausevertline = new JCheckBox("pause |"); 
	JCheckBox pausehorizline = new JCheckBox("pause -"); 
	JCheckBox translatedcircle = new JCheckBox("trans o");
	JCheckBox quarterdouble = new JCheckBox("2 quarters"); 
	JCheckBox pausedcircle = new JCheckBox("pause 1/2"); 
	JCheckBox pausedquarters = new JCheckBox("pause 1/4"); 
	JCheckBox pauseonecircle = new JCheckBox("pause 1"); 
	JCheckBox translatedquarters = new JCheckBox("trans 1/4"); 
	
	JCheckBox dirchangefig8 = new JCheckBox("dir-ch fig 8"); 
	JCheckBox figuresquare = new JCheckBox("figure square"); 
	JCheckBox figuresquarereverse = new JCheckBox("figure square reverse"); 
	JCheckBox dcfiguresquare = new JCheckBox("dir-ch figure square"); 
	JCheckBox figuresquareshort = new JCheckBox("figure square short"); 
	
	JCheckBox fig8box = new JCheckBox("Figure of 8 BOX"); 
	JCheckBox fakehypo = new JCheckBox("FAKE Hypo"); 
	JCheckBox fig8fbox = new JCheckBox("Figure of 8 FAKE BOX"); 
	JCheckBox figsquarebox = new JCheckBox("Figure Square BOX"); 
	JCheckBox figsquareboxfake = new JCheckBox("Figure Square FAKE BOX"); 
	
	JCheckBox hline = new JCheckBox("line H"); 
	JCheckBox hunderarmour = new JCheckBox("circle H"); 
	JCheckBox pausedhalfcircle = new JCheckBox("pause d"); 
	
	JCheckBox antiiso1 = new JCheckBox("H 1/2 T");  
	JCheckBox antiiso2 = new JCheckBox("H 1/2 B");  
	JCheckBox antiiso3 = new JCheckBox("V 1/2 L");  
	JCheckBox antiiso4 = new JCheckBox("V 1/2 R");  
	
	JCheckBox antiiso5 = new JCheckBox("top left");  
	JCheckBox antiiso6 = new JCheckBox("top right");  
	JCheckBox antiiso7 = new JCheckBox("bot left");  
	JCheckBox antiiso8 = new JCheckBox("bot right");  
	
	JCheckBox doubled = new JCheckBox("2");
	JCheckBox full = new JCheckBox("1");
	JCheckBox threequarter = new JCheckBox("3/4");
	JCheckBox half = new JCheckBox("1/2");
	JCheckBox quarter = new JCheckBox("1/4");
	JCheckBox eighth = new JCheckBox("1/8");
	JCheckBox none = new JCheckBox("0");
	
	JCheckBox clockwise = new JCheckBox("clockwise"); 
	JCheckBox counterclockwise = new JCheckBox("anti-clockwise"); 
	
	JCheckBox handclockwise = new JCheckBox("clockwise"); 
	JCheckBox handcounterclockwise = new JCheckBox("anti-clockwise"); 
	
	JSlider handSpeedSlide;
	JSlider staffSpeedSlide; 
	JSlider circleSizer; 
	
	Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
	
	ButtonGroup positions = new ButtonGroup();
	
	JRadioButton circle1 = new JRadioButton(); 
	JRadioButton circle2 = new JRadioButton(); 
	JRadioButton circle3 = new JRadioButton(); 
	JRadioButton circle4 = new JRadioButton(); 
	
	JRadioButton circleout1 = new JRadioButton(); 
	JRadioButton circleout2 = new JRadioButton(); 
	JRadioButton circleout3 = new JRadioButton(); 
	JRadioButton circleout4 = new JRadioButton(); 
	
	JRadioButton cross1 = new JRadioButton(); 
	JRadioButton cross2 = new JRadioButton(); 
	JRadioButton cross3 = new JRadioButton(); 
	JRadioButton cross4 = new JRadioButton(); 
	JRadioButton cross5 = new JRadioButton(); 
	
	JRadioButton smallcross1 = new JRadioButton(); 
	JRadioButton smallcross2 = new JRadioButton(); 
	JRadioButton smallcross3 = new JRadioButton(); 
	JRadioButton smallcross4 = new JRadioButton(); 
	
	
	public boolean changeProp(AbstractProp p) {
		controlled = p; 
		return true; 
	}
	
	public PropControl(Prop left) {
		controlled = (AbstractProp)left;  
	}
	
	public JTabbedPane createGui() {
		
		labelTable.put( new Integer( 0 ), new JLabel("0") );
		//labelTable.put( new Integer( 5 ), new JLabel("0.5") );
		labelTable.put( new Integer( 10 ), new JLabel("1") );
		//labelTable.put( new Integer( 15 ), new JLabel("1.5") );
		labelTable.put( new Integer( 20 ), new JLabel("2") );
		//labelTable.put( new Integer( 25 ), new JLabel("2.5") );
		labelTable.put( new Integer( 30 ), new JLabel("3") );
		//labelTable.put( new Integer( 35 ), new JLabel("3.5") );
		labelTable.put( new Integer( 40 ), new JLabel("4") );
		//labelTable.put( new Integer( 45 ), new JLabel("4.5") );
		labelTable.put( new Integer( 50 ), new JLabel("5") );
		//labelTable.put( new Integer( 55 ), new JLabel("4.5") );
		labelTable.put( new Integer( 60 ), new JLabel("6") );
		//labelTable.put( new Integer( 65 ), new JLabel("6.5") );
		labelTable.put( new Integer( 70 ), new JLabel("7") );
		//labelTable.put( new Integer( 75 ), new JLabel("7.5") );
		labelTable.put( new Integer( 80 ), new JLabel("8") );
		
		JPanel panel = new JPanel(); 
		panel.setLayout(new GridLayout(6,1));
		panel.setPreferredSize(new Dimension(200, 700));
		
		JPanel panel2 = new JPanel(); 
		panel2.setLayout(new GridLayout(5,1));
		panel2.setPreferredSize(new Dimension(200, 700));
		
		JPanel panel3 = new JPanel(); 
		panel3.setLayout(new GridLayout(6,1));
		panel3.setPreferredSize(new Dimension(200, 700));
		
		JPanel panel4 = new JPanel(); 
		panel4.setLayout(new GridLayout(6,1));
		panel4.setPreferredSize(new Dimension(200, 700));
		
		JPanel square = createPositionPanel();  
		
		JPanel startingpositions = createStartingPosition();
		
		JPanel circleS = createCircleSize(); 
		
		JPanel handSpeed = createHandSpeed();
		
		JPanel speed = createStaffSpeed(); 
		
		JPanel buttons = createButtons(); 
		
		JPanel shapes = createShapes(); 
		
		JPanel complexShapes = createChangePanel(); 
		
		JPanel antiiso = createAntiISO(); 
		
		JPanel rtypes = createRTypesButtons(); 
		
		JPanel load = createLoader(); 
		
		//JPanel handpaths = createPathModifier(); 
		
		JPanel pathRotation = createPathRotation(); 
		
		//JPanel pathChange = createModifyPanel(); 
		
		JPanel info = createInfoPanel(); 
		
		JPanel basicDirections = createBasicsPanel(); 
		
		JPanel cut = createExtraSpeedsPanel(); 
		
		JPanel speedPanel = createSpeedChangePanel(); 
		
		JPanel speedModPanel = createSpeedModifierPanel(); 
		
		JPanel moreShapes = createExtraShapesPanel();
		
		JPanel furtherShapes = createFurtherShapesPanel();
		
		JPanel figureShapes = createFigureShapesPanel();
		
		JPanel pushEvents = createPathModifier(); 
		
		/////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////
	

		
		
		
		/////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////
		
		
		
		panel.add(basicDirections);
		
		panel.add(square); 
		panel.add(startingpositions); 
		// panel.add(handpaths); 
		panel.add(pathRotation); 
		panel.add(pushEvents);
		panel.add(buttons); 
		
		panel2.add(shapes);
		panel2.add(antiiso);
		panel2.add(rtypes); 
		panel2.add(complexShapes); 
		
		panel3.add(speed); 
		panel3.add(handSpeed); 
		panel3.add(circleS);
		panel3.add(speedPanel);
		panel3.add(speedModPanel);
		//panel3.add(pathRotation); 
		//panel3.add(pathChange); 
		//panel3.add(cut); 
		//panel3.add(moreShapes);
		panel3.add(info); 
		
		//panel4.add(moreShapes);
		panel4.add(moreShapes);
		panel4.add(cut);
		panel4.add(furtherShapes);
		panel4.add(figureShapes);
		panel4.add(load); 
		
		JTabbedPane pane = new JTabbedPane(); 
		pane.addTab("Controls", panel);
		pane.addTab("Shapes", panel2);
		pane.addTab("Speeds", panel3);
		pane.addTab("Extra", panel4);
		
		return pane; 
	}

	

	private JPanel createFurtherShapesPanel() {
		JPanel shapes = new JPanel(); 
		shapes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Yet More Shapes"));
		shapes.setToolTipText("Extra hand path shapes.");
		shapes.setLayout(new GridLayout(5,1));
		 
		shapegroup.add(dirchangefig8);
		shapegroup.add(figuresquare);
		shapegroup.add(dcfiguresquare);
		shapegroup.add(figuresquarereverse);
		shapegroup.add(figuresquareshort);
		

		
		
		shapes.add(dirchangefig8);
		shapes.add(figuresquare);
		shapes.add(dcfiguresquare);
		shapes.add(figuresquarereverse);
		shapes.add(figuresquareshort);
		

		
		
		dirchangefig8.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.DIR_CHANGE_FIGURE_OF_EIGHT; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		figuresquare.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.FIGURE_SQUARE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		dcfiguresquare.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.DIR_CHANGE_FIGURE_SQUARE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		figuresquarereverse.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.FIGURE_SQUARE_REVERSE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		figuresquareshort.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.FIGURE_SQUARE_SHORT; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		

		
		return shapes;
	}
	
	private JPanel createFigureShapesPanel() {
		JPanel shapes = new JPanel(); 
		shapes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Yet More Shapes"));
		shapes.setToolTipText("Extra hand path shapes.");
		shapes.setLayout(new GridLayout(5,1));
		 
		shapegroup.add(fig8box);
		shapegroup.add(fig8fbox);
		shapegroup.add(fakehypo);
		shapegroup.add(figsquarebox);
		//shapegroup.add(fig8box);
		
		shapes.add(fig8box);
		shapes.add(fig8fbox);
		shapes.add(fakehypo);
		shapes.add(figsquarebox);
		//shapes.add(fig8box);
		
		
		fig8box.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.FIGURE_OF_EIGHT_BOX; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		fig8fbox.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.FIGURE_OF_EIGHT_FAKE_BOX; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		fakehypo.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.HYPOCYLCOID_FAKE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		figsquarebox.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.FIGURE_SQUARE_BOX; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		
		return shapes;
	}
	
	private JPanel createExtraShapesPanel() {
		JPanel shapes = new JPanel(); 
		shapes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Shapes..."));
		shapes.setToolTipText("Extra hand path shapes.");
		shapes.setLayout(new GridLayout(5,2));
		 
		shapegroup.add(pausevertline);
		shapegroup.add(pausehorizline);
		shapegroup.add(translatedcircle);
		shapegroup.add(quarterdouble);
		shapegroup.add(pausedcircle);
		shapegroup.add(pausedhalfcircle);
		shapegroup.add(pauseonecircle);
		
		shapegroup.add(pausedquarters);
		shapegroup.add(translatedquarters);
		
		shapegroup.add(hline);
		shapegroup.add(hunderarmour);
		
		
		shapes.add(pausevertline);
		shapes.add(pausehorizline);
		shapes.add(translatedcircle);
		shapes.add(quarterdouble);
		shapes.add(pausedcircle);
		shapes.add(pausedhalfcircle);
		shapes.add(pauseonecircle);
		shapes.add(pausedquarters);
		shapes.add(translatedquarters);
		//shapes.add(hline);
		shapes.add(hunderarmour);
		
		pausevertline.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.PAUSED_VERTICAL_LINE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		pausehorizline.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.PAUSED_HORIZONTAL_LINE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		translatedcircle.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.TRANSLATED_CIRCLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		quarterdouble.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.QUARTERS_DOUBLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		pausedcircle.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.PAUSED_CIRCLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		pausedhalfcircle.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.PAUSED_HALF_CIRCLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		pauseonecircle.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.PAUSED_ONE_CIRCLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		pausedquarters.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.PAUSED_QUARTER; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		translatedquarters.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.TRANSLATED_QUARTER; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		
		hline.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.H_LINE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		hunderarmour.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.H_UNDERARMOUR; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		return shapes;
	}

	private JPanel createSpeedChangePanel() {
		JPanel speedPanel = new JPanel(); 
		speedPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Speed Changes"));
		speedPanel.setLayout(new GridLayout(5,1));
		
		ButtonGroup speedChange = new ButtonGroup(); 
		
		JCheckBox useSpeedChange = new JCheckBox("Half Speed Change"); 
		JCheckBox useQuarterChange = new JCheckBox("Quarter Speed Change"); 
		JCheckBox useFullChange = new JCheckBox("Full Circle Speed Change"); 
		JCheckBox useComplexQuarterChange = new JCheckBox("Complex 1/4 Speed Change"); 
		JCheckBox noChange = new JCheckBox("No Change"); 

		speedPanel.add(useQuarterChange); 
		speedPanel.add(useSpeedChange);
		speedPanel.add(useFullChange); 
		speedPanel.add(useComplexQuarterChange); 
		speedPanel.add(noChange); 
		
		speedChange.add(useSpeedChange); 
		speedChange.add(useQuarterChange); 
		speedChange.add(useFullChange); 
		speedChange.add(useComplexQuarterChange); 
		speedChange.add(noChange); 
		
		noChange.setSelected(true);
		
		useSpeedChange.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{	if(controlled.useSpeedChange == false) { controlled.useSpeedChange = true; controlled.speedChangeType = SpeedChangeProcess.HALF_CIRCLE;}
    	 	else  controlled.useSpeedChange = false; 
    	} } ); 
		useQuarterChange.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{	if(controlled.useSpeedChange == false)  { controlled.useSpeedChange = true; controlled.speedChangeType = SpeedChangeProcess.QUARTER_CIRCLE;}
    	 	else  controlled.useSpeedChange = false; 
    	} } ); 
		useFullChange.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{	if(controlled.useSpeedChange == false)  { controlled.useSpeedChange = true; controlled.speedChangeType = SpeedChangeProcess.FULL_CIRCLE;}
    	 	else  controlled.useSpeedChange = false; 
    	} } ); 
		useComplexQuarterChange.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{	if(controlled.useSpeedChange == false)  { controlled.useSpeedChange = true; controlled.speedChangeType = SpeedChangeProcess.COMPLEX_QUARTER_CIRCLE;}
    	 	else  controlled.useSpeedChange = false; 
    	} } ); 
		
		noChange.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{	controlled.useSpeedChange = false; 
    	} } );
		
		return speedPanel;
	}
	
	private JPanel createSpeedModifierPanel() {
		JPanel speedPanel = new JPanel(); 
		speedPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Speed Change Mods"));
		speedPanel.setLayout(new GridLayout(5,1));
		
		JButton perpendicular = new JButton("Angle +45");
		JButton fourtyfive = new JButton("Angle +90");
		
		speedPanel.add(perpendicular); 
		speedPanel.add(fourtyfive); 
		
		perpendicular.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.angleSpeedChangeMod += (Math.PI / 4); 
    	 } } );
		fourtyfive.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			controlled.angleSpeedChangeMod += (Math.PI / 2);
		} } );
		
		return speedPanel;
	}

	private JPanel createExtraSpeedsPanel() {
		JPanel cutCircles = new JPanel(); 
		cutCircles.setLayout(new GridLayout(5,1));
		cutCircles.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Complex Speed Changes"));
		
		ButtonGroup cut = new ButtonGroup(); 
		
		JRadioButton halfcut = new JRadioButton("1/4 on 1/2 off"); 
		JRadioButton quartercut = new JRadioButton("Chuu Circle");
		JRadioButton complexquartercut = new JRadioButton("Quarter ISOPOP");
		JRadioButton complexthreecut = new JRadioButton("GO WEST"); 
		JRadioButton goeast = new JRadioButton("GO EAST"); 
		
		cut.add(halfcut); 
		cut.add(quartercut); 
		cut.add(complexquartercut); 
		cut.add(complexthreecut); 
		cut.add(goeast); 
		
		cutCircles.add(halfcut); 
		cutCircles.add(quartercut); 
		cutCircles.add(complexquartercut); 
		cutCircles.add(complexthreecut); 
		cutCircles.add(goeast);
		
		halfcut.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{ 	controlled.useSpeedChange = true;
			controlled.angleSpeedChangeMod += (Math.PI); 
		    controlled.angleSpeedChangeMod2 += (Math.PI / 2); 
    	} } ); 
		
		quartercut.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{ 	controlled.useSpeedChange = true;
			controlled.angleSpeedChangeMod += (Math.PI); 
		    controlled.speedChangeType = Speed.CHUU_CIRCLE;
    	} } ); 
		complexquartercut.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{ 	controlled.shape = ShapeConstants.PAUSED_FOUR_ISOPOP;
    	} } ); 
		
		complexthreecut.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{ 	controlled.usePositionChange = true;
		    controlled.xNew = Positions.POINT_CENTER_RIGHT.x;
		    controlled.yNew = Positions.POINT_CENTER_RIGHT.y;
    	} } ); 
		
		goeast.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{ 	controlled.positionChange = ShapeConstants.GRID_SWAP_SQUARE;
			controlled.usePositionChange = true;
			controlled.xNew = Positions.POINT_CENTER_RIGHT_HALF.x;
	    	controlled.yNew = Positions.POINT_CENTER_RIGHT_HALF.y;
	    	
    	} } ); 
		
		return cutCircles; 
	}
	
	private JPanel createBasicsPanel() {
		JLabel staffgroup = new JLabel("Staff Direction"); 
		JPanel staffpanel = createStaffDirectionGroup(staffgroup); 
		staffpanel.setToolTipText("Sets the direction of the staff's rotation.");

		JLabel handgroup = new JLabel("Hand Direction"); 
		JPanel handpanel = createHandDirectionGroup(handgroup); 
		handpanel.setToolTipText("Sets the direction of the hand path");
		
		JLabel dirchange = new JLabel ("Change");
		JButton dirbutton = new JButton ("Change both"); 
		JButton reflect = new JButton ("Reflect"); 
		JPanel dirpanel = new JPanel(); 
		dirpanel.add(dirchange);
		dirpanel.add(dirbutton); // TODO
		//dirpanel.add(reflect);
		
		dirbutton.addActionListener
		( new ActionListener() {
		     public void actionPerformed ( ActionEvent event ) {
		        controlled.pathDirection = controlled.pathDirection * -1;
		        controlled.direction = controlled.direction * -1;
		        } // end actionPerformed
		     } // end anonymous class
		);   // end addActionListener line
		
		reflect.addActionListener
		( new ActionListener() {
		     public void actionPerformed ( ActionEvent event ) {
		    	 controlled.reflect = true; 
		        } // end actionPerformed
		     } // end anonymous class
		);   // end addActionListener line
		
		
		JPanel basicDirections = new JPanel(); 
		basicDirections.setLayout(new GridLayout(2,2));
		basicDirections.add(staffpanel); 
		basicDirections.add(dirpanel);
		basicDirections.add(handpanel);
		return basicDirections;
	}

	private JPanel createInfoPanel() {
		JPanel info = new JPanel(); 
		info.setLayout(new GridLayout(5,1));
		
		JButton update = new JButton("Update");
		
		final JLabel angleMod = new JLabel("Angle Modifier: " + Rotate.toDegrees(controlled.angleModifier)); 
		final JLabel circleAngleMod = new JLabel("Path Position Mod: " + Rotate.toDegrees(controlled.pathAngleModifier)); 
		final JLabel turnMod = new JLabel("Event Position Mod: " + Rotate.toDegrees(controlled.pathTurnAngle)); 
		final JLabel pathRotation = new JLabel("Path Rotation: " + Rotate.toDegrees(controlled.pathRotation)); 
		final JLabel changeMod = new JLabel("Change Setting: " + Rotate.toDegrees(controlled.pathChange)); 
		
		info.add(angleMod); 
		info.add(circleAngleMod); 
		info.add(turnMod); 
		info.add(pathRotation); 
		//info.add(changeMod); 
		info.add(update);
		
		update.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) 
		{
    	 	angleMod.setText("Angle Modifier: " + Rotate.toDegrees(controlled.angleModifier));
    	 	circleAngleMod.setText("Path Position Mod: " + Rotate.toDegrees(controlled.pathAngleModifier)); 
    	 	turnMod.setText("Event Position Mod: " + Rotate.toDegrees(controlled.pathTurnAngle)); 
    	 	pathRotation.setText("Path Rotation: " + Rotate.toDegrees(controlled.pathRotation)); 
    	 	changeMod.setText("Change Setting: " + Rotate.toDegrees(controlled.pathChange)); 
    	} } ); 
		
		info.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Info:"));
		
		return info; 
	}
	
	private JPanel createPathRotation() {
		JPanel pathRotation = new JPanel(); 
		pathRotation.setLayout(new GridLayout(4,1));
		pathRotation.setToolTipText("Rotates the hand path; allows vertical patterns to become horizontal.");
		
		ButtonGroup rotationGroup = new ButtonGroup();
		
		JButton rotation1 = new JButton("+45");
		JButton rotation2 = new JButton("+90");   
		JButton rotation3 = new JButton("+180");   
		JButton rotation4 = new JButton("-45");   
		
		pathRotation.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Path Rotation"));
		
		rotationGroup.add(rotation1); 
		rotationGroup.add(rotation2); 
		rotationGroup.add(rotation3); 
		rotationGroup.add(rotation4); 
		
		pathRotation.add(rotation1); 
		pathRotation.add(rotation2); 
		pathRotation.add(rotation3); 
		pathRotation.add(rotation4); 
		
		rotation1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathRotation = controlled.pathRotation + (Math.PI / 4); } } ); 
		rotation2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathRotation = controlled.pathRotation + (Math.PI / 2); } } ); 
		rotation3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathRotation = controlled.pathRotation + (Math.PI); } } ); 
		rotation4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathRotation = controlled.pathRotation - (Math.PI / 4); } } );
		return pathRotation;
	}

	private JPanel createLoader() {
		JPanel load = new JPanel(); 
		load.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Load / Save"));
		load.setToolTipText("Load and Save spinning patterns.");
		load.setLayout(new GridLayout(3,1));
		
		JPanel loadsave = new JPanel(); 
		loadsave.setLayout(new GridLayout(1,2));
		
		final JTextField enter = new JTextField(); 
		JButton loader = new JButton("Load"); 
		JButton saveProps = new JButton("Save"); 
		JButton normalise = new JButton("Normalise");
		
		normalise.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			normalise();
		} } );
		
		saveProps.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String text = controlled.createTextPattern();
			enter.setText(text); 
		}});
		
		loader.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String phrase = enter.getText(); 
			parseStaffText(phrase);
		} } );
		
		loadsave.add(saveProps);
		loadsave.add(loader); 
		
		load.add(loadsave);
		load.add(normalise); 
		load.add(enter);
		return load;
	}
	
	
	public void parseStaffText(String phrase) {
		Staff newControlled = new Staff(); 
		newControlled.parsePropText(phrase);
		controlled.sync(newControlled); 
	}
	
	/*
	 * updates prop control with new loaded in state of prop. 
	 * TODO 
	 */
	public void updateControlState() {
		if(controlled.direction == 1) { clockwise.setSelected(true); counterclockwise.setSelected(false);}
		else { clockwise.setSelected(false); counterclockwise.setSelected(true);}
			
		if(controlled.pathDirection == 1) { handclockwise.setSelected(true); handcounterclockwise.setSelected(false);}
		else { handclockwise.setSelected(false); handcounterclockwise.setSelected(true);}
		
		// speed change thing
		
		// position
		if(controlled.xadj == 146.0 && controlled.yadj == 345.0) { smallcross2.setSelected(true); }
		else if(controlled.xadj == 350.0 && controlled.yadj == 345.0) { smallcross3.setSelected(true); }
		else cross3.setSelected(true); // TODO more
		
		// path shape
		if(controlled.shape.equals(new Circle())) { circle.setSelected(true); }
		else if(controlled.shape.equals(new Line())) { horizline.setSelected(true); }
		else if(controlled.shape.equals(new Line(Math.PI/2))) { vertline.setSelected(true); }
		// path size
		
		// path speed
		
		// prop speed
		
		//TODO finish
	}
	/**/

	private JPanel createRTypesButtons() {
		JPanel rtypes = new JPanel(); 
		rtypes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "R-Types"));
		rtypes.setToolTipText("Set the direction of the prop when it's not spinning.");
		rtypes.setLayout(new GridLayout(5,2));
		
		ButtonGroup anglegroup = new ButtonGroup(); 
		
		anglegroup.add(angle1); 
		anglegroup.add(angle22); 
		anglegroup.add(angle2); 
		anglegroup.add(angle3); 
		anglegroup.add(angle4); 
		
		angle4.setSelected(true);
		
		JCheckBox trans1 = new JCheckBox("H 1/2 T"); 
		JCheckBox trans2 = new JCheckBox("H 1/2 B"); 
		JCheckBox trans3 = new JCheckBox("V 1/2 R"); 
		JCheckBox trans4 = new JCheckBox("V 1/2 L"); 
		
		shapegroup.add(trans1); 
		shapegroup.add(trans2); 
		shapegroup.add(trans3); 
		shapegroup.add(trans4); 
		
		rtypes.add(angle1); 
			rtypes.add(trans1); 
		rtypes.add(angle22); 
			rtypes.add(trans2); 
		rtypes.add(angle2); 
			rtypes.add(trans3); 
		rtypes.add(angle3); 
			rtypes.add(trans4); 
		rtypes.add(angle4); 
		
		
		trans1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.TRANSLATED_CIRCLE;
    	 	controlled.pathRotation = Math.PI + (Math.PI / 2); 
		} } ); 
		trans2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.TRANSLATED_CIRCLE;
    	 	controlled.pathRotation = Math.PI / 2; 
		} } ); 
		trans3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.TRANSLATED_CIRCLE;
    	 	controlled.pathRotation = 0; 
		} } ); 
		trans4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.TRANSLATED_CIRCLE;
    	 	controlled.pathRotation = Math.PI; 
		} } ); 
		
		
		angle1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	//controlled.angleIncrement = 0.0; 
			controlled.speed = 0;
    	 	controlled.angle = (Math.PI / 2); 
    	 	controlled.angleModifier = controlled.angle = (Math.PI / 2);
		} } ); 
		angle2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			//controlled.angleIncrement = 0.0; 
			controlled.speed = 0;
			controlled.angle = (Math.PI / 4); 
			controlled.angleModifier = (Math.PI / 4);
		} } ); 
		angle22.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			//controlled.angleIncrement = 0.0; 
			controlled.speed = 0;
			controlled.angle = (Math.PI/2) + (Math.PI / 4); 
			controlled.angleModifier = (Math.PI/2) + (Math.PI / 4);
		} } ); 
		angle3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			//controlled.angleIncrement = 0.0; 
			controlled.speed = 0;
			controlled.angle = 0; 
			controlled.angleModifier = 0;
		} } );
		angle4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			//controlled.angleIncrement = Staff.defaultAngleIncrement; 
			controlled.speed = AbstractProp.defaultSpeed;
			controlled.angle = AbstractProp.defaultAngle; 
			controlled.angleModifier = AbstractProp.defaultAngleModifier;
		} } );
		return rtypes;
	}

	private JPanel createShapes() {
		JPanel shapes = new JPanel(); 
		shapes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Shapes"));
		shapes.setToolTipText("Different hand path shapes.");
		shapes.setLayout(new GridLayout(5,2));
		
		shapegroup.add(quarters); 
		shapegroup.add(stepped); 
		shapegroup.add(figureeight); 
		shapegroup.add(lissajous);
		shapegroup.add(realhypo); 
		shapegroup.add(circle); 
		shapegroup.add(pingpong); 
		shapegroup.add(vertline);
		shapegroup.add(dot);
		shapegroup.add(horizline);
		
		
		shapes.add(circle);
			shapes.add(stepped);
		shapes.add(pingpong);
			shapes.add(quarters);
		shapes.add(vertline);
			shapes.add(lissajous);
		shapes.add(horizline);
			shapes.add(realhypo);
		shapes.add(dot);
			shapes.add(figureeight);

		circle.setSelected(true);
		
		circle.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.CIRCLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
    	 	controlled.pathModifier = 1.0;
    	 	circleSizer.setValue(1);
		} } ); 
		pingpong.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.PINGPONG; 
    	 	controlled.useSpeedChange = true; controlled.speedChangeType = SpeedChangeProcess.HALF_CIRCLE;
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		vertline.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.VERTICAL_LINE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		horizline.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.HORIZONTAL_LINE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		quarters.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.THREE_BY_QUARTERS; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		stepped.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.STEPPED_CIRCLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		translated.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.TRANSLATED_CIRCLE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		figureeight.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.FIGURE_OF_EIGHT; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } ); 
		lissajous.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.LISSAJOUS_FIGURE; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		realhypo.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.HYPOCYCLOID; 
    	 	if(controlled.pathModifier == 0) controlled.pathAngleModifier = AbstractProp.defaultCircleModifier;
		} } );
		dot.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.CIRCLE; controlled.pathModifier = 0; 
    	    circleSizer.setValue(0);
		} } );
		return shapes;
	}
	
	private JPanel createChangePanel() {
		JPanel change = new JPanel(); 
		change.setLayout(new GridLayout(1,2));
		
		change.add(createComplexShapes());
		change.add(createPathChange());
		
		return change;
	}
	
	private JPanel createComplexShapes() {
		JPanel shapes = new JPanel(); 
		shapes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Direction Change"));
		shapes.setToolTipText("Control the period of direction change.");
		shapes.setLayout(new GridLayout(7,1));
		
		changegroup.add(doubled); 
		changegroup.add(full);
		changegroup.add(threequarter);
		changegroup.add(half);
		changegroup.add(quarter);
		changegroup.add(eighth);
		changegroup.add(none);
		

		shapes.add(doubled); 
		shapes.add(full); 
		shapes.add(threequarter); 
		shapes.add(half); 
		shapes.add(quarter); 
		shapes.add(eighth);
		shapes.add(none); 
		
		none.setSelected(true);
		
		doubled.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.staffChange = ShapeConstants.DOUBLE_CHANGE; } } ); 
		full.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.staffChange = ShapeConstants.FULL_CHANGE; } } ); 
		threequarter.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.staffChange = ShapeConstants.THREE_QUARTER_CHANGE; } } ); 
		half.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.staffChange = ShapeConstants.HALF_CHANGE; } } ); 
		quarter.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.staffChange = ShapeConstants.QUARTER_CHANGE; } } ); 
		eighth.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.staffChange = ShapeConstants.EIGHTH_CHANGE; } } ); 
		none.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.staffChange = ShapeConstants.NO_CHANGE; } } ); 
		
		return shapes;
	}

	private JPanel createAntiISO() {
		JPanel antiiso = new JPanel(); 
		antiiso.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Anti + Iso"));
		antiiso.setLayout(new GridLayout(2,1));
		antiiso.setToolTipText("Control the period of hand path direction changes.");
		
		JPanel one = new JPanel(); 
		JPanel two = new JPanel(); 
		
		one.setLayout(new GridLayout(2,2));
		two.setLayout(new GridLayout(2,2));
		
		antiiso.add(one); 
		antiiso.add(two); 
		
		shapegroup.add(antiiso1); 
		shapegroup.add(antiiso2); 
		shapegroup.add(antiiso3); 
		shapegroup.add(antiiso4); 
		shapegroup.add(antiiso5); 
		shapegroup.add(antiiso6); 
		shapegroup.add(antiiso7); 
		shapegroup.add(antiiso8); 
		
		one.add(antiiso1); 
		one.add(antiiso2); 
		one.add(antiiso3); 
		one.add(antiiso4); 
		
		two.add(antiiso5);
		two.add(antiiso6);
		two.add(antiiso7);
		two.add(antiiso8);
		
		antiiso1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.HALF_CIRCLE_HORIZONTAL_TOP; } } ); 
		antiiso2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.HALF_CIRCLE_HORIZONTAL_BOTTOM; } } ); 
		antiiso3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.HALF_CIRCLE_VERTICAL_LEFT; } } ); 
		antiiso4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.HALF_CIRCLE_VERTICAL_RIGHT; } } ); 
		
		antiiso5.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.QUARTERS_TOP_LEFT; } } ); 
		antiiso6.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.QUARTERS_TOP_RIGHT; } } ); 
		antiiso7.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.QUARTERS_BOTTOM_LEFT; } } ); 
		antiiso8.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.shape = ShapeConstants.QUARTERS_BOTTOM_RIGHT; } } );
		return antiiso;
	}

	private JPanel createButtons() {
		JPanel buttons = new JPanel(); 
		buttons.setToolTipText("Buttons that do useful things.");
		
		buttons.setLayout(new GridLayout(3,1));
		
		JButton sync = new JButton("SYNC"); 
		JButton reset = new JButton("RESET"); 
		

		
		JPanel underbuttons1 = new JPanel(); 
		JPanel underbuttons2 = new JPanel(); 
		JPanel underbuttons = new JPanel(); 
		
		buttons.add(underbuttons1);
		buttons.add(underbuttons2);
		buttons.add(underbuttons);
		
		underbuttons1.setLayout(new GridLayout(1,2)); 
		underbuttons2.setLayout(new GridLayout(1,2)); 
		underbuttons.setLayout(new GridLayout(1,2)); 
		
		JButton stop = new JButton("Stop");
		JButton go = new JButton("Go!");
		JButton trails = new JButton("Remove");
		JButton returner = new JButton("Return");
		
		underbuttons1.add(sync); 
		underbuttons1.add(reset); 
		underbuttons2.add(stop);
		underbuttons2.add(go);
		underbuttons.add(trails);
		underbuttons.add(returner);
		
		reset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.reset(); } } ); 
		//sync.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	// 	controlled.sync(other); } } ); 
		stop.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.stop(); } } ); 
		go.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.go(); } } ); 
		trails.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			//controlled.stop(); funnier this way
			controlled.yadj += 600;
			controlled.xadj += 600; } } );
		returner.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			//controlled.go();
			controlled.yadj -= 600;
			controlled.xadj -= 600; } } );
		return buttons;
	}

	private JPanel createHandSpeed() {
		JPanel handSpeed = new JPanel(); 

		handSpeed.setToolTipText("Control the speed of the movement along the hand path.");
		
		int MIN = 0;
		int MAX = 80;
		int INIT = 10; 
		handSpeedSlide = new JSlider(JSlider.HORIZONTAL,
                MIN, MAX, INIT); 
		handSpeedSlide.setSnapToTicks(true); 
		handSpeedSlide.setMajorTickSpacing(10);
		handSpeedSlide.setMinorTickSpacing(5);
		handSpeedSlide.setPaintTicks(true);
		handSpeedSlide.setPaintLabels(true);

		handSpeedSlide.setLabelTable( labelTable );

		handSpeed.add(handSpeedSlide); 
		handSpeed.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Hand Speed"));
		
		handSpeedSlide.addChangeListener( new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			    JSlider source = (JSlider)e.getSource();
			    if (!source.getValueIsAdjusting()) {
			        double size = (int)source.getValue();
			        size = (size / 10); 
			        controlled.pathSpeed = size; 
			    }
			}
		});
		return handSpeed;
	}

	private JPanel createStaffSpeed() {
		JPanel handSpeed = new JPanel(); 

		handSpeed.setToolTipText("Control the speed of the prop's rotation.");
		
		int MIN = 0;
		int MAX = 80;
		int INIT = 10; 
		staffSpeedSlide = new JSlider(JSlider.HORIZONTAL,
                MIN, MAX, INIT); 
		staffSpeedSlide.setSnapToTicks(true); 
		staffSpeedSlide.setMajorTickSpacing(10);
		staffSpeedSlide.setMinorTickSpacing(5);
		staffSpeedSlide.setPaintTicks(true);
		staffSpeedSlide.setPaintLabels(true);

		staffSpeedSlide.setLabelTable( labelTable );

		handSpeed.add(staffSpeedSlide); 
		handSpeed.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Rotation Speed"));
		
		staffSpeedSlide.addChangeListener( new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			    JSlider source = (JSlider)e.getSource();
			    if (!source.getValueIsAdjusting()) {
			        double size = (int)source.getValue();
			        size = (size / 10); 
			        controlled.speed = size; 
			    }
			}
		});
		return handSpeed;
	}
	
	private JPanel createCircleSize() {
		JPanel circleS = new JPanel(); 
		
		circleS.setToolTipText("Control the size of the path shape.");
		
		int MIN = 0;
		int MAX = 40;
		int INIT = 10; 
		circleSizer = new JSlider(JSlider.HORIZONTAL,
                MIN, MAX, INIT); 
		circleSizer.setSnapToTicks(true); 
		circleSizer.setMajorTickSpacing(10);
		circleSizer.setMinorTickSpacing(5);
		circleSizer.setPaintTicks(true);
		circleSizer.setPaintLabels(true);

		circleSizer.setLabelTable( labelTable );

		circleS.add(circleSizer); 
		circleS.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Path Size"));
		
		circleSizer.addChangeListener( new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			    JSlider source = (JSlider)e.getSource();
			    if (!source.getValueIsAdjusting()) {
			        double size = (int)source.getValue();
			        size = (size / 10); 
			        controlled.pathModifier = size; 
			        if(size == 1 && controlled.shape.equals(new Circle())) circle.setSelected(true);
			    }
			}
		});
		return circleS;
	}

	private JPanel createPositionPanel() {
		JPanel square = new JPanel();
		square.setToolTipText("Control the centre of the props path.");
		square.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Position"));
		
		JPanel empty1 = new JPanel();
		JPanel empty2 = new JPanel();
		JPanel empty3 = new JPanel();
		JPanel empty4 = new JPanel();
		JPanel empty5 = new JPanel();
		JPanel empty6 = new JPanel();
		JPanel empty7 = new JPanel();
		JPanel empty8 = new JPanel();
		
		square.setLayout(new GridLayout(5,5));
		
		square.add(circleout1);
		square.add(empty1); 
		square.add(cross1);
		square.add(empty2);
		square.add(circleout2);
		
		square.add(empty3); 
		square.add(circle1); 
		square.add(smallcross1);
		square.add(circle2);
		square.add(empty4); 
		
		square.add(cross2);
		square.add(smallcross2);
		square.add(cross3);
		square.add(smallcross3);
		square.add(cross4);
		
		square.add(empty5); 
		square.add(circle3); 
		square.add(smallcross4);
		square.add(circle4);
		square.add(empty6); 
		
		square.add(circleout3);
		square.add(empty7); 
		square.add(cross5);
		square.add(empty8);
		square.add(circleout4);
		
		positions.add(cross1);
		positions.add(cross2);
		positions.add(cross3);
		positions.add(cross4);
		positions.add(cross5);
		positions.add(circleout1);
		positions.add(circleout2);
		positions.add(circleout3);
		positions.add(circleout4);
		positions.add(circle1);
		positions.add(circle2);
		positions.add(circle3);
		positions.add(circle4);
		positions.add(smallcross1);
		positions.add(smallcross2);
		positions.add(smallcross3);
		positions.add(smallcross4);
		
		cross3.setSelected(true);
		
		smallcross1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	assignPoint(Positions.POINT_CENTER_UP_HALF); 
    	 	} } ); 
		smallcross2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_CENTER_LEFT_HALF); 
    	 	} } ); 
		smallcross3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_CENTER_RIGHT_HALF); 
    	 	} } ); 
		smallcross4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_CENTER_DOWN_HALF); 
			} } );
		
		cross1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	assignPoint(Positions.POINT_CENTER_UP);
    	} } ); 
		cross2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_CENTER_LEFT);
        } } );  
		// the CENTER
		cross3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_CENTER);
		} } );  
		cross4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_CENTER_RIGHT);
    	} } );  
		cross5.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_CENTER_DOWN);
    	} } );
		
		circle1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_UP_LEFT_HALF); 
    	 	} } ); 
		circle2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_UP_RIGHT_HALF); 
    	 	} } ); 
		circle3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_DOWN_LEFT_HALF); 
    	 	} } ); 
		circle4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_DOWN_RIGHT_HALF); 
    	 	} } );
		
		
		circleout1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_UP_LEFT); 
    	 	} } ); 
		circleout2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_UP_RIGHT); 
    	 	} } ); 
		circleout3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_DOWN_LEFT); 
    	 	} } ); 
		circleout4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			assignPoint(Positions.POINT_DOWN_RIGHT); 
    	 	} } );
		return square;
	}
	
	

	private void assignPoint(Point point) {
		controlled.xadj = point.x;
	 	controlled.yadj = point.y;
	}
	

	private JPanel createHandDirectionGroup(JLabel handgroup) {
		ButtonGroup handradio = new ButtonGroup(); 

		handclockwise.setSelected(true);
		handcounterclockwise.addActionListener
		( new ActionListener() {
		     public void actionPerformed ( ActionEvent event ) {
		        Object obj = event.getSource();
		        if(obj instanceof JCheckBox) {
					JCheckBox box = (JCheckBox) obj;
					String name = box.getText();
					if(name.equals("clockwise")) {
						controlled.pathDirection = 1;
					}
					else {
						controlled.pathDirection = -1; 
					}
				}
		        } // end actionPerformed
		     } // end anonymous class
		);   // end addActionListener line
		
		handclockwise.addActionListener
		( new ActionListener() {
		     public void actionPerformed ( ActionEvent event ) {
		        Object obj = event.getSource();
		        if(obj instanceof JCheckBox) {
					JCheckBox box = (JCheckBox) obj;
					String name = box.getText();
					if(name.equals("clockwise")) {
						controlled.pathDirection = 1;
					}
					else {
						controlled.pathDirection = -1; 
					}
				}
		        } // end actionPerformed
		     } // end anonymous class
		);   // end addActionListener line
		
		/////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////

		
		
		handradio.add(handclockwise);
		handradio.add(handcounterclockwise);
		
		
		
		JPanel handpanel = new JPanel(); 
		handpanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Hand Direction"));
		
		
		handpanel.setLayout(new GridLayout(2,1)); 
		handpanel.add(handclockwise);
		handpanel.add(handcounterclockwise);
		return handpanel;
	}

	private JPanel createStaffDirectionGroup(JLabel staffgroup) {
		ButtonGroup staffradio = new ButtonGroup(); 
		
		clockwise.setSelected(true);
		
		counterclockwise.addActionListener
		( new ActionListener() {
		     public void actionPerformed ( ActionEvent event ) {
		        Object obj = event.getSource();
		        if(obj instanceof JCheckBox) {
					JCheckBox box = (JCheckBox) obj;
					String name = box.getText();
					if(name.equals("clockwise")) {
						controlled.direction = 1;
					}
					else {
						controlled.direction = -1; 
					}
				}
		        } // end actionPerformed
		     } // end anonymous class
		);   // end addActionListener line
		clockwise.addActionListener
		( new ActionListener() {
		     public void actionPerformed ( ActionEvent event ) {
		        Object obj = event.getSource();
		        if(obj instanceof JCheckBox) {
					JCheckBox box = (JCheckBox) obj;
					String name = box.getText();
					if(name.equals("clockwise")) {
						controlled.direction = 1;
					}
					else {
						controlled.direction = -1; 
					}
				}
		        } // end actionPerformed
		     } // end anonymous class
		);   // end addActionListener line
		
		staffradio.add(clockwise);
		staffradio.add(counterclockwise);
		
		JPanel staffpanel = new JPanel(); 
		staffpanel.setLayout(new GridLayout(2,1)); 
		staffpanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Prop Direction"));
		
		staffpanel.add(clockwise);
		staffpanel.add(counterclockwise);
		return staffpanel;
	}
	
	private JPanel createStartingPosition() {
		JPanel startingpositions = new JPanel();
		
		startingpositions.setToolTipText("Change the position of the prop along it's path.");
		
		startingpositions.setLayout(new GridLayout(4,1));
		startingpositions.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Starting Position"));
		
		
		JButton perpendicular = new JButton("Turn Prop 90");
		JButton fourtyfive = new JButton("Turn Prop 45");
		
		perpendicular.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.angle += (Math.PI / 2); 
    	 	controlled.angleModifier += (Math.PI / 2); 
    	 } } );
		fourtyfive.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			controlled.angle += (Math.PI / 4);
			controlled.angleModifier += (Math.PI / 4);
		} } );

		
		JButton quarter1 = new JButton("Path Position: + 90");
		JButton quarter2 = new JButton("Path Position: + 45");
		
		
		quarter1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathAngle += controlled.pathDirection * (Math.PI / 2);  
    	 	controlled.pathAngleModifier += controlled.pathDirection * (Math.PI / 2);  
    	 } } );
		quarter2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathAngle += controlled.pathDirection * ( Math.PI / 4) ;  
    	 	controlled.pathAngleModifier += controlled.pathDirection * ( Math.PI / 4) ; 
    	 } } );
		
		startingpositions.add(perpendicular); 
		startingpositions.add(fourtyfive);
		
		startingpositions.add(quarter1);
		startingpositions.add(quarter2);
		
		
		return startingpositions;
	}

	private JPanel createPathModifier() {
		JPanel path = new JPanel(); 
		
		path.setToolTipText("Change the position of an event along the path.");
		
		path.setLayout(new GridLayout(4,1));
		path.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Path Event Mod"));
		
		
		JButton perpendicular = new JButton("Push Event +45");
		JButton fourtyfive = new JButton("Push Event +90");
		
		perpendicular.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathTurnAngle += (Math.PI / 4); 
    	 } } );
		fourtyfive.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			controlled.pathTurnAngle += (Math.PI / 2);
		} } );

		
		JButton quarter1 = new JButton("Push Event +180");
		JButton quarter2 = new JButton("Push Event -90");
		
		
		quarter1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathTurnAngle += (Math.PI);  
    	 } } );
		quarter2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathTurnAngle -= ( Math.PI / 2) ;  
    	 } } );
		
		path.add(perpendicular); 
		path.add(fourtyfive);
		
		path.add(quarter1);
		path.add(quarter2);
		
		
		return path;
	}

	private JPanel createPathChange() {
		
		JCheckBox doubled1 = new JCheckBox("2");
		JCheckBox full1 = new JCheckBox("1");
		JCheckBox threequarter1 = new JCheckBox("3/4");
		JCheckBox half1 = new JCheckBox("1/2");
		JCheckBox quarter1 = new JCheckBox("1/4");
		JCheckBox eighth1 = new JCheckBox("1/8");
		JCheckBox none1 = new JCheckBox("0");
		
		ButtonGroup changegroup1 = new ButtonGroup(); 
		
		changegroup1.add(doubled1); 
		changegroup1.add(full1);
		changegroup1.add(threequarter1);
		changegroup1.add(half1);
		changegroup1.add(quarter1);
		changegroup1.add(eighth1);
		changegroup1.add(none1);
		
		none1.setSelected(true);
		
		doubled1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathChange = ShapeConstants.DOUBLE_CHANGE; } } ); 
		full1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathChange = ShapeConstants.FULL_CHANGE; } } ); 
		threequarter1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathChange = ShapeConstants.THREE_QUARTER_CHANGE; } } ); 
		half1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathChange = ShapeConstants.HALF_CHANGE; } } ); 
		quarter1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathChange = ShapeConstants.QUARTER_CHANGE; } } ); 
		eighth1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathChange = ShapeConstants.EIGHTH_CHANGE; } } ); 
		none1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.pathChange = ShapeConstants.NO_CHANGE; } } ); 
		
		JPanel shapes = new JPanel(); 
		shapes.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Path Change"));
		shapes.setLayout(new GridLayout(7,1));

		circle.setSelected(true);
		

		shapes.add(doubled1); 

		shapes.add(full1); 

		shapes.add(threequarter1);
		
		shapes.add(half1); 

		shapes.add(quarter1); 

		shapes.add(eighth1);

		shapes.add(none1); 

		return shapes;
	}
	
	public void normalise() {
		parseStaffText(controlled.createTextPattern());
	}
/*
	private JPanel createModifyPanel() {
		JPanel modify = new JPanel();
		
		// TODO tooltip
		
		modify.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Modify Change"));
		modify.setLayout(new GridLayout(4,1));
		
		JButton a90 = new JButton("+90");
		JButton a45 = new JButton("+45");
		JButton b90 = new JButton("-90");
		JButton b45 = new JButton("-45");
		
		modify.add(a45); 
		modify.add(a90); 
		modify.add(b90); 
		modify.add(b45); 
		
		a90.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.circleTurnAngle += (Math.PI / 2); 
    	 } } );
		a45.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.circleTurnAngle += (Math.PI / 4); 
    	 } } );
		b90.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.circleTurnAngle -= (Math.PI / 2); 
    	 } } );
		b45.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
    	 	controlled.circleTurnAngle -= (Math.PI / 4); 
    	 } } );
		
		return modify;
	}

/**/

	public AbstractProp getControlled() {
		return controlled;
	}

}
