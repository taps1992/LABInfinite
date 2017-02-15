package LAB;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
//import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

import LAB.gui.PatternDialog;
import LAB.meta.Pattern;
import LAB.meta.Patterns;
import LAB.props.Prop;
import LAB.props.Staff;
import LAB.util.RepaintTimerTask;

public class LABMenuBar {
	private static LABMenuBarPatterns LABMenuBarPatterns1 = null;

	LABInfinite lab; 
	
	LABCanvas canvas; 
	
	
 	BufferedImage small_grid1;
 	BufferedImage small_grid2;
 	BufferedImage small_grid3;
 	BufferedImage small_gridl;
 	
 	BufferedImage small_hoops;
 	BufferedImage small_sstaffs;
 	
 	BufferedImage small_square; 
 	BufferedImage small_triangle;
 	BufferedImage small_eight;
 	BufferedImage small_fan;
 	BufferedImage small_firefan;
 	
 	BufferedImage small_corner;
 	BufferedImage small_smallcorner;
 	BufferedImage small_linkage;
 	
 	BufferedImage small_halfhoop;
 	BufferedImage small_eighthoop;
 	BufferedImage small_angledhoop;
 	BufferedImage small_innerhoop;
 	BufferedImage small_firehoop;
 	BufferedImage small_fireisohoop;
 	BufferedImage small_isohoop;
	
	
	public LABMenuBar(LABInfinite l){
		lab = l; 
		canvas = lab.canvas; 
		
		LABMenuBarPatterns1 = new LABMenuBarPatterns(lab, canvas); 
		
		try {
			small_grid1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/grid copy.jpg"));
			small_grid2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/grid2 copy.jpg"));
			small_grid3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/grid11 copy.jpg"));
			small_gridl = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/ladder-small.png"));
			
			small_hoops = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/hoop1 copy.jpg"));
			small_sstaffs = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/s-staff1 copy.jpg"));
			
			small_square = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/square copy.jpg"));
			small_triangle = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/triangle copy.jpg"));
			small_eight = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/eight-small copy.jpg"));
			small_fan = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/fan1 copy.jpg"));
			small_firefan = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/fan-fire copy.jpg"));
			
			small_corner = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/corner-small.png"));
			small_smallcorner = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/corner-small.png"));
			small_linkage = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/linkage.png"));
			
			small_halfhoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/furet-hoop-2 copy.jpg"));
			small_eighthoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/furet-hoop-4 copy.jpg"));
			small_angledhoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/furet-hoop-3 copy.jpg"));
			small_innerhoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/furet-hoop-1 copy.jpg"));
			small_firehoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/fire-hoop-fire copy.jpg"));
			small_fireisohoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/fire-hoop-iso copy.jpg"));
			small_isohoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("small/iso-hoop copy.jpg"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public JMenuBar createMenubar() {
		JMenuBar menubar = new JMenuBar();
		
		JMenu presets = LABMenuBarPatterns1.createPresetsMenu();
		
		JMenu speedy = createSpeedMenu();
		
		JMenu images = createTrailsMenu();
		
		//JMenu patterns = loadPatternMenu();

		JMenu specials = createSpecialMenu();

		JMenu UI = createUIMenu(); 
		
		JMenu record = createRecordMenu(); 
		
		menubar.add(presets);
		menubar.add(speedy);
		menubar.add(images); 
		menubar.add(record); 		
		//menubar.add(patterns); 
		menubar.add(specials); 
		menubar.add(UI);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(lab);
		lab.pack();
		
		return menubar;
	}
	
	private JMenu createUIMenu() {
		JMenu UI = new JMenu("LAB Infinite"); 
		
		JMenuItem LF1 = new JMenuItem("Windows UI-LF");
		JMenuItem LF2 = new JMenuItem("Motif UI-LF");
		JMenuItem LF3 = new JMenuItem("Metal UI-LF");
		JMenuItem about = new JMenuItem("About");
		JMenuItem help = new JMenuItem("Help"); 
		
		
		about.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			JOptionPane.showMessageDialog(canvas,
				    "Created by MCP, http://firestaff-tutorials.co.uk", 
				    "About Lab Infinite", 1, null);
		} } );
		
		LF1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
			SwingUtilities.updateComponentTreeUI(lab);
			lab.pack();
		} } );
		
		LF2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
			SwingUtilities.updateComponentTreeUI(lab);
			lab.pack();
		} } );
		
		LF3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
			SwingUtilities.updateComponentTreeUI(lab);
			lab.pack();
		} } );

		
		UI.add(help);
		UI.add(about); 
		UI.add(new JSeparator()); 
		UI.add(LF1); 
		UI.add(LF2); 
		UI.add(LF3); 
		
		return UI; 
	}

	

	private JMenu createSpeedMenu() {
		JMenu speedy = new JMenu("Speed"); 
		
		JCheckBox checkbox = new JCheckBox(" - Fixed Rate"); 
		checkbox.setSelected(false);
		
		JMenuItem fastest = new JMenuItem("Fastest - 200fps");
		JMenuItem vfast = new JMenuItem("Very Fast - 120fps");
		JMenuItem faster = new JMenuItem("Faster - 100fps");
		JMenuItem fast = new JMenuItem("Fast - 60fps (default)");
		JMenuItem medium = new JMenuItem("Medium - 30fps");
		JMenuItem slow = new JMenuItem("Slow - 15fps");
		JMenuItem slower = new JMenuItem("Slower - 5fps");
		JSeparator j = new JSeparator(); 
		JMenuItem label = new JMenuItem("Circle Increments:"); 
		JMenuItem standard0 = new JMenuItem("360");
		JMenuItem standard1 = new JMenuItem("216");
		JMenuItem standard2 = new JMenuItem("144");
		JMenuItem standard3 = new JMenuItem("125 (default)");
		JMenuItem standard4 = new JMenuItem("108");
		JMenuItem standard5 = new JMenuItem("72");
		JMenuItem standard6 = new JMenuItem("50");
		JMenuItem standard7 = new JMenuItem("36");
		
		speedy.add(checkbox); 
		speedy.add(new JSeparator());
		speedy.add(fastest); 
		speedy.add(vfast); 
		speedy.add(faster); 
		speedy.add(fast); 
		speedy.add(medium); 
		speedy.add(slow); 
		speedy.add(slower); 
		speedy.add(j);
		speedy.add(label); 
		speedy.add(standard0);
		speedy.add(standard1);
		speedy.add(standard2);
		speedy.add(standard3);
		speedy.add(standard4);
		speedy.add(standard5);
		speedy.add(standard6);
		speedy.add(standard7);
		
		checkbox.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			if(lab.fixedRate) lab.fixedRate = false; 
			else lab.fixedRate = true; 
			changeSpeed(lab.speed); 
		} } );
		
		standard0.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(360);
		} } );
		standard1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(216);
		} } );
		standard2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(144);
		} } );
		standard3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(125);
		} } );
		standard4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(108);
		} } );
		standard5.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(72);
		} } );
		standard6.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(50);
		} } );
		standard6.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setIncrement(36);
		} } );
		
		fastest.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.speed = 1000/200;
			setIncrement(125);
			changeSpeed(lab.speed); 
		} } );
		vfast.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.speed = 1000/120;
			setIncrement(125);
			changeSpeed(lab.speed); 
		} } );
		
		faster.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.speed = 1000/100;
			setIncrement(125);
			changeSpeed(lab.speed); 
		} } );
		fast.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.speed = 1000/60;
			setIncrement(125);
			changeSpeed(lab.speed); 
		} } );
		medium.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.speed = 1000/30;
			setIncrement(125);
			changeSpeed(lab.speed); 
		} } );
		slow.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.speed = 1000/15;
			setIncrement(125);
			changeSpeed(lab.speed); 
		} } );
		slower.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.speed = 1000/5;
			setIncrement(125);
			changeSpeed(lab.speed); 
		} } );
		return speedy;
	}
	
	private JMenu createTrailsMenu() {
		JMenu images = new JMenu("Trails"); 
		
		JMenu sticks = new JMenu("Stick Images"); 
		JMenu pois = new JMenu("Poi Images"); 
		JMenu other = new JMenu("Other Props"); 
		JMenu trailsoptions = new JMenu("Trails Options"); 
		JMenu gridoptions = new JMenu("Grid Options"); 
		
		JMenuItem trails = new JMenuItem("Trails");
		JMenuItem notrails = new JMenuItem("No Trails");
		JMenuItem grid = new JMenuItem("Grid");
		JMenuItem nogrid = new JMenuItem("No Grid");
		JMenuItem helpers = new JMenuItem("Helpers");
		JMenuItem nohelpers = new JMenuItem("No Helpers");
		JMenuItem wicktrails = new JMenuItem("Full Trails");
		JMenuItem nowicktrails = new JMenuItem("No Full Trails");
		JMenuItem day = new JMenuItem("Day");
		JMenuItem night = new JMenuItem("Night");
		
		JMenuItem firewicks = new JMenuItem("Fire Wicks", new ImageIcon(canvas.wicksnight)); 
		JMenuItem firewickstriple = new JMenuItem("Fire Triple Wicks", new ImageIcon(canvas.wickstriple)); 
		JMenuItem colouredends = new JMenuItem("Coloured Wicks", new ImageIcon(canvas.wick1)); 
		JMenuItem isostick = new JMenuItem("Iso Stick", new ImageIcon(canvas.isostick)); 
		JMenuItem isostickblack = new JMenuItem("Iso Stick Black", new ImageIcon(canvas.isostickblack)); 
		JMenuItem isostickwhite = new JMenuItem("Iso Stick White", new ImageIcon(canvas.isostickwhite)); 
		JMenuItem normalstick = new JMenuItem("Normal Stick", new ImageIcon(canvas.staff1)); 
		JMenuItem fatstick = new JMenuItem("Fat Stick", new ImageIcon(canvas.fatstick)); 
		JMenuItem poi = new JMenuItem("Poi", new ImageIcon(canvas.poi)); 
		JMenuItem poilong = new JMenuItem("Poi Long", new ImageIcon(canvas.poilong)); 
		JMenuItem hands = new JMenuItem("Hands", new ImageIcon(canvas.hands)); 
		JMenuItem hoops = new JMenuItem("Hoops", new ImageIcon(small_hoops)); 
		JMenuItem isohoops = new JMenuItem("Iso Hoops", new ImageIcon(small_isohoop)); 
		JMenuItem sstaffs = new JMenuItem("S-Staffs", new ImageIcon(small_sstaffs)); 
		
		JMenuItem corner = new JMenuItem("Corner", new ImageIcon(small_corner)); 
		JMenuItem smallcorner = new JMenuItem("Small-Corner", new ImageIcon(small_smallcorner)); 
		JMenuItem linkage = new JMenuItem("Linkage", new ImageIcon(small_linkage)); 
		
		 
		JMenuItem fakearms = new JMenuItem("Fake Arms"); 
		JMenuItem nofakearms = new JMenuItem("No Fake Arms"); 
		
		JMenuItem firepreset = new JMenuItem("Fire Preset");
		JMenuItem cleanpreset = new JMenuItem("Clean Preset");
		JMenuItem defaultpreset = new JMenuItem("Default Preset");
		JMenuItem drawpreset = new JMenuItem("Draw Preset");
		JMenuItem armspreset = new JMenuItem("Arms Preset");
		
		JMenuItem handpathpreset = new JMenuItem("Hand Path Preset");
		JMenuItem firedrawpreset = new JMenuItem("Fire Draw Preset");
		
		JMenuItem grid1 = new JMenuItem("Default Grid", new ImageIcon(small_grid1));
		JMenuItem grid2 = new JMenuItem("Simple Grid", new ImageIcon(small_grid2));
		JMenuItem grid3 = new JMenuItem("Circles Grid", new ImageIcon(small_grid3));
		JMenuItem gridl = new JMenuItem("Ladder Grid", new ImageIcon(small_gridl));
		
		JMenu RDL = new JMenu("RDL"); 
		
		JMenuItem square = new JMenuItem("Square", new ImageIcon(small_square));
		JMenuItem triangle = new JMenuItem("Triangle", new ImageIcon(small_triangle));
		JMenuItem eight = new JMenuItem("Eight", new ImageIcon(small_eight));
		JMenuItem firepoi = new JMenuItem("Fire Poi", new ImageIcon(canvas.firepoi));
		JMenuItem firefan = new JMenuItem("Fire Fan", new ImageIcon(small_firefan));
		JMenuItem fan = new JMenuItem("Fan", new ImageIcon(small_fan));
		
		JMenu furet = new JMenu("Furet");
		
		JMenuItem halfhoop = new JMenuItem("half hoop", new ImageIcon(small_halfhoop));
		JMenuItem eighthoop = new JMenuItem("eight hoop", new ImageIcon(small_eighthoop));
		JMenuItem innerhoop = new JMenuItem("inner hoop", new ImageIcon(small_innerhoop));
		JMenuItem angledhoop = new JMenuItem("angled hoop", new ImageIcon(small_angledhoop));
		JMenuItem firehoop = new JMenuItem("fire hoop", new ImageIcon(small_firehoop));
		JMenuItem firehoopiso = new JMenuItem("fire hoop iso", new ImageIcon(small_fireisohoop));
		
		JMenuItem club = new JMenuItem("Club", new ImageIcon(canvas.club));
		JMenuItem smallclub = new JMenuItem("Small Club", new ImageIcon(canvas.smallclub));
		
		images.add(firepreset);
		images.add(cleanpreset);
		images.add(drawpreset);
		images.add(defaultpreset);
		images.add(armspreset);
		images.add(new JSeparator()); 
		images.add(handpathpreset);
		images.add(firedrawpreset);
		images.add(new JSeparator()); 
		images.add(day); 
		images.add(night);
		images.add(new JSeparator()); 
		images.add(trailsoptions); 
			trailsoptions.add(trails); 
			trailsoptions.add(notrails);
			trailsoptions.add(wicktrails);
			trailsoptions.add(nowicktrails);
			trailsoptions.add(helpers);
			trailsoptions.add(nohelpers);
		images.add(new JSeparator()); 
		images.add(fakearms);
		images.add(nofakearms);
		images.add(new JSeparator());
		images.add(gridoptions);
			gridoptions.add(grid);
			gridoptions.add(nogrid);
			gridoptions.add(new JSeparator());
			gridoptions.add(grid1);
			gridoptions.add(grid2);
			gridoptions.add(grid3);
			gridoptions.add(gridl);
		images.add(new JSeparator()); 
		images.add(sticks); 
			sticks.add(firewicks);
			sticks.add(firewickstriple);
			sticks.add(colouredends);
			sticks.add(isostick);
			sticks.add(isostickblack);
			sticks.add(isostickwhite);
			sticks.add(normalstick);
			sticks.add(fatstick);
			sticks.add(linkage);
			sticks.add(corner);
			sticks.add(smallcorner);
		images.add(pois); 
			pois.add(poi);
			pois.add(poilong);
			pois.add(firepoi); 
		images.add(other); 
			other.add(hands);
			other.add(hoops);
			other.add(isohoops);
			other.add(sstaffs);
			other.add(fan);
			other.add(firefan); 
			other.add(club);
			other.add(smallclub); 
		images.add(RDL);
			RDL.add(square); 
			RDL.add(triangle); 
			RDL.add(eight); 
		images.add(furet); 
			furet.add(halfhoop);
			furet.add(eighthoop); 
			furet.add(innerhoop); 
			furet.add(angledhoop); 
			furet.add(firehoop); 
			furet.add(firehoopiso); 
		
		
		firepreset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.wicksnight);
			canvas.day = false; 
			canvas.background = Color.black; 
			canvas.gridon = false; 
			canvas.clear = true; 
			canvas.trails = true; 
			canvas.helpers = false; 
			canvas.fakearms = false; 
			canvas.wicktrails = false; 
		} } );	
		
		cleanpreset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.staff1);
			canvas.day = true; 
			canvas.background = Color.white; 
			canvas.gridon = false; 
			canvas.clear = true; 
			canvas.trails = false; 
			canvas.helpers = false; 
			canvas.fakearms = false; 
			canvas.wicktrails = false; 
		} } );	
		
		drawpreset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.wick1);
			canvas.day = true; 
			canvas.background = Color.white; 
			canvas.gridon = false; 
			canvas.clear = true; 
			canvas.trails = false; 
			canvas.helpers = false; 
			canvas.fakearms = false; 
			canvas.wicktrails = true; 
		} } );	
			
		defaultpreset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.staff1);
			canvas.day = true; 
			canvas.background = Color.white; 
			canvas.gridon = true; 
			canvas.clear = true; 
			canvas.trails = false; 
			canvas.helpers = false; 
			canvas.fakearms = false; 
			canvas.wicktrails = false; 
		} } );	
		
		armspreset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.hands);
			canvas.day = true; 
			canvas.background = Color.white; 
			canvas.gridon = false; 
			canvas.clear = true; 
			canvas.trails = false; 
			canvas.helpers = false; 
			canvas.fakearms = true; 
			canvas.wicktrails = false; 
		} } );	
			
		handpathpreset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.hands);
			canvas.day = true; 
			canvas.background = Color.white; 
			canvas.gridon = false; 
			canvas.clear = true; 
			canvas.trails = false; 
			canvas.helpers = false; 
			canvas.fakearms = false; 
			canvas.wicktrails = true; 
		} } );	
		
		firedrawpreset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.wicksnight);
			canvas.day = false; 
			canvas.background = Color.black; 
			canvas.gridon = false; 
			canvas.clear = true; 
			canvas.trails = true; 
			canvas.helpers = false; 
			canvas.fakearms = false; 
			canvas.wicktrails = true; 
		} } );	
		
		grid1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.grid = canvas.grid1;
			canvas.updateBuffer();
		} } );
		grid2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.grid = canvas.grid2;
			canvas.updateBuffer();
		} } );
		grid3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.grid = canvas.grid3;
			canvas.updateBuffer();
		} } );
		gridl.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.grid = canvas.gridl;
			canvas.updateBuffer();
		} } );
		
		club.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.club);
		} } );
		smallclub.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.smallclub);
		} } );
		
		firewicks.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.wicksnight);
		} } );
		firewickstriple.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.wickstriple);
		} } );
		colouredends.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.wick1);
		} } );
		isostick.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.isostick);
		} } );
		isostickblack.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.isostickblack);
		} } );
		isostickwhite.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.isostickwhite);
		} } );
		normalstick.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.staff1);
		} } );
		fatstick.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.fatstick);
		} } );
		poi.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.poi);
		} } );
		poilong.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.poilong);
		} } );
		hands.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.hands);
		} } );
		hoops.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.hoops);
		} } );
		isohoops.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.isohoops, true);
		} } );
		sstaffs.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.sstaffs);
		} } );
		
		corner.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.corner);
		} } );
		smallcorner.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.smallcorner);
		} } );
		linkage.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.linkage);
		} } );
		
		square.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.square);
		} } );
		triangle.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.triangle);
		} } );
		eight.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.eight); 
		} } );
		fan.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.fan);
			/*Fan f = new Fan(); 
			f.sync((AbstractProp)lab.left);
			f.length = canvas.fan.getWidth();
			f.height = canvas.fan.getHeight();
			lab.leftControl.changeProp(f);
			
			Fan fr = new Fan(); 
			//fr.sync((AbstractProp)lab.right);
			fr.length = canvas.fan.getWidth();
			fr.height = canvas.fan.getHeight();
			lab.rightControl.changeProp(fr);
			setPropImage(canvas.fan);/**/
			
		} } );
		firefan.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.firefan);
		} } );
		firepoi.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.firepoi);
		} } );
		
		
		
		firehoop.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.firehoop);
		} } );
		firehoopiso.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.fireisohoop);
		} } );
		halfhoop.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.halfhoop);
		} } );
		innerhoop.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.innerhoop);
		} } );
		angledhoop.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.angledhoop);
		} } );
		eighthoop.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			setPropImage(canvas.eighthoop);
		} } );
		
		
		
		day.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.day = true; 
			canvas.background = Color.white; 
			canvas.clear = true; 
		} } );
		night.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.day = false; 
			canvas.background = Color.black; 
			canvas.gridon = false; 
			canvas.clear = true; 
		} } );
		
		trails.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.trails = true; 
		} } );
		notrails.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.trails = false; 
		} } );
		grid.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.gridon = true; 
		} } );
		nogrid.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.gridon = false; 
		} } );
		helpers.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.helpers = true; 
		} } );
		nohelpers.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.helpers = false; 
		} } );
		wicktrails.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.wicktrails = true; 
			canvas.gridon = false; 
		} } );
		nowicktrails.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.wicktrails = false; 
		} } );
		fakearms.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.fakearms = true; 
		}});
		nofakearms.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.fakearms = false; 
		}});
		
		return images;
	}


	
	private JMenu createRecordMenu() {
		JMenu record = new JMenu("Record");

		JMenuItem saveImage = new JMenuItem("Save Image");
		
		record.add(saveImage); 
		
		/*
		saveImage.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			JFileChooser options = new JFileChooser("./"); 
			options.setName("Save Image");
			options.setFileFilter(new ImageFileFilter());
			int value = options.showSaveDialog(canvas);
			if (value == JFileChooser.APPROVE_OPTION) {
	            File file = options.getSelectedFile();
	            canvas.saveImageTo = file; 
	            canvas.createImage = true; 
			}
			else {
				JOptionPane.showMessageDialog(canvas, new JLabel("You are a dumbass - Saving Canceled"));
			}
			
		} } ); /**/
	
		
		return record; 
	}
	
	private JMenu createSpecialMenu() {
		JMenu specials = new JMenu("Special");
		
		JMenuItem normalise = new JMenuItem("Normalise");
		JMenuItem clear = new JMenuItem("Clear Screen");
		JMenuItem four = new JMenuItem("FOUR 1234"); 
		JMenuItem six = new JMenuItem("SIX 123456"); 
		JMenuItem nofour = new JMenuItem("NO MORE FOUR"); 
		JMenuItem fullReset = new JMenuItem("Full RESET"); 
		JMenuItem removeControls = new JMenuItem("Remove Controls"); 
		JMenuItem returnControls = new JMenuItem("Return Controls"); 
		
		specials.add(normalise); 
		specials.add(new JSeparator()); 
		specials.add(clear);
		specials.add(new JSeparator()); 
		//specials.add(switch3d);
		specials.add(four); 
		specials.add(six); 
		specials.add(nofour); 
		specials.add(new JSeparator()); 
		specials.add(fullReset); 
		specials.add(new JSeparator());
		specials.add(new JSeparator());
		specials.add(removeControls);
		specials.add(returnControls);
		
		removeControls.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.removeControls();
		} } );
		
		returnControls.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.returnControls();
		} } );
		
		fullReset.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			lab.left.reset();
			lab.right.reset();
			lab.canvas.left.reset();
			lab.canvas.right.reset(); // TODO reset ALL
		} } );
		
		
		normalise.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			
			if(lab.multimode) {
				for(PropControl control: lab.controls) {
					control.normalise();
				}
			} else {
				lab.leftControl.normalise();
				lab.rightControl.normalise();
			}
			
		} } );

		four.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			switchToFourAction();
		} } );
		six.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			switchToSixAction();
		} } );
		nofour.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			switchToFourActionReverse();
		} } );


		clear.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			canvas.clear = true; 
		} } );
		
		return specials;
	}
	
	private JMenu loadPatternMenu() {
		final JMenu patterns = new JMenu("Patterns");
		JMenuItem save = new JMenuItem("Save Pattern");
		JMenuItem show = new JMenuItem("Show Pattern");
		JMenuItem show2 = new JMenuItem("Show Verbose Pattern");
		JMenuItem analysis = new JMenuItem("Analyse Pattern"); 
		JMenuItem organise = new JMenuItem("Organise Patterns");
		
		
		JMenu addingto = patterns; 
		
		patterns.add(save); 
		patterns.add(show); 
		patterns.add(show2); 
		patterns.add(analysis); 
		patterns.add(organise);
		patterns.add(new JSeparator());
		
		organise.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			PatternDialog dialog = new PatternDialog(lab, "Organise Patterns", null);
			dialog.setVisible(true);
		} } );
		show.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String left1 = lab.left.createTextPattern();
			String right1 = lab.right.createTextPattern();
			JPanel p = new JPanel();
			JTextArea h = new JTextArea("PATTERN: " + "\nLeft: " + left1 + "\nRight: " + right1); 
			JScrollPane pane = new JScrollPane(h); 
			p.add(pane); 
			JOptionPane.showMessageDialog(lab.getRootPane(), p);
		} } );
		
		File file = new File("./patterns.txt");
		if(!file.isFile()) return patterns; 
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			while(in.ready()) {
				String name = in.readLine();
				if(name.equals("")) continue; 
				if(name.equals(" ")) continue; 
				if(name.equals("\n")) continue; 
				
				//System.out.println("Name: " + name); 
				
				if(name.length() > 12 && name.substring(0, 13).equals("folder start:")) {
					String foldername = name.substring(13, name.length()).trim();
					//System.out.println("\t\tfoldername: " + foldername);
					JMenu newMenu = new JMenu(foldername); 
					addingto = newMenu; 
					continue; 
				}
				
				if(name.length() > 10 && name.substring(0, 11).equals("folder end:")) {
					//System.out.println("\t\tfolder end: ");
					patterns.add(addingto); 
					addingto = patterns; 
					continue; 
				}
				
				String left = in.readLine();
				if(left.equals("")) left = in.readLine();
				String right = in.readLine();
				if(right.equals("")) right = in.readLine();
				
				name = name.substring(5, name.length());
				left = left.substring(5, left.length());
				right = right.substring(6, right.length());
				
				Patterns.userPatterns.add(new Pattern(left, right, name));
				
				JMenuItem item1 = createPatternItem(name, left, right);
				addingto.add(item1);
				
				save.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
					savePattern(patterns); 
				}});
			}
			in.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		return patterns; 
	}

	
	private JMenuItem createPatternItem(String s, final String left,
			final String right) {
		// generate new menu item
		JMenuItem item1 = new JMenuItem(s);
		item1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			if(lab.multimode) {
				lab.controls.get(0).parseStaffText(left);
				lab.controls.get(1).parseStaffText(right);
				lab.controls.get(2).parseStaffText(left);
				lab.controls.get(3).parseStaffText(right);
			} else {
				lab.leftControl.parseStaffText(left);
				lab.rightControl.parseStaffText(right);
			}
		} } );
		return item1;
	}
	
	private void switchToFourAction() {
		Staff left2 = new Staff();
		Staff right2 = new Staff(); 
		
		left2.designation = "l2";
		right2.designation = "r2";
		
		PropControl left2Control = new PropControl(left2); 
		PropControl right2Control = new PropControl(right2); 
		
		lab.multimode = true;
		
		lab.controls.add(left2Control);
		lab.controls.add(right2Control);
		lab.props.add(left2);
		lab.props.add(right2);
		
		canvas.allProps.add(left2);
		canvas.allProps.add(right2);
		
		canvas.update();
		
		canvas.morethantwo = true; 
		
		JPanel both = new JPanel(); 
		both.setLayout(new GridLayout(1,2));
		
		JTabbedPane left2Panel = left2Control.createGui();
		JTabbedPane right2Panel = right2Control.createGui();
		
		left2Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "LEFT2"));
		right2Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "RIGHT2"));
		
		both.add(left2Panel); 
		both.add(right2Panel);
		
		lab.tabbedControls.addTab("Prop 2", null, both, "2");
		canvas.showDesignations = true; 
	}
	
	private void switchToSixAction() {
		Staff left2 = new Staff();
		Staff right2 = new Staff(); 
		
		left2.designation = "l2";
		right2.designation = "r2";
		
		PropControl left2Control = new PropControl(left2); 
		PropControl right2Control = new PropControl(right2); 
		
		lab.multimode = true;
		
		lab.controls.add(left2Control);
		lab.controls.add(right2Control);
		lab.props.add(left2);
		lab.props.add(right2);
		
		canvas.allProps.add(left2);
		canvas.allProps.add(right2);
		
		canvas.update();
		
		canvas.morethantwo = true; 
		
		JPanel both = new JPanel(); 
		both.setLayout(new GridLayout(1,3));
		
		JTabbedPane left2Panel = left2Control.createGui();
		JTabbedPane right2Panel = right2Control.createGui();
		
		left2Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "LEFT2"));
		right2Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "RIGHT2"));
		
		both.add(left2Panel); 
		both.add(right2Panel);
		
		lab.tabbedControls.addTab("Prop 2", null, both, "2");
		
		Staff left3 = new Staff();
		Staff right3 = new Staff(); 
		
		left2.designation = "l3";
		right2.designation = "r3";
		
		PropControl left3Control = new PropControl(left3); 
		PropControl right3Control = new PropControl(right3); 
		
		lab.controls.add(left3Control);
		lab.controls.add(right3Control);
		lab.props.add(left3);
		lab.props.add(right3);
		
		canvas.allProps.add(left3);
		canvas.allProps.add(right3);
		
		canvas.update();
		
		JPanel both2 = new JPanel(); 
		both2.setLayout(new GridLayout(1,3));
		
		JTabbedPane left3Panel = left3Control.createGui();
		JTabbedPane right3Panel = right3Control.createGui();
		
		left3Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "LEFT3"));
		right3Panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "RIGHT3"));
		
		both2.add(left3Panel); 
		both2.add(right3Panel);
		
		
		lab.tabbedControls.addTab("Prop 3", null, both2, "3");
		
		canvas.showDesignations = true; 
	}
	
	private void switchToFourActionReverse() {

		lab.multimode = false;
		
		lab.controls.remove(2);
		lab.controls.remove(2);
		lab.props.remove(2);
		lab.props.remove(2);
		
		canvas.allProps.remove(2);
		canvas.allProps.remove(2);
		
		canvas.update();
		
		canvas.morethantwo = false; 
		
		lab.tabbedControls.remove(1);
		canvas.showDesignations = false; 
	}

	private void changeSpeed(int speed) {
		lab.speed = speed;
		lab.timer.cancel();
		lab.timer = new java.util.Timer(); 
		if(lab.fixedRate)
			lab.timer.schedule(new RepaintTimerTask(canvas), 100, speed);
		else lab.timer.scheduleAtFixedRate(new RepaintTimerTask(canvas), 100, speed);
	}

	private void setIncrement(int divisor) {
		lab.increment = divisor; 
		
		for(Prop s : lab.props) {
				s.setAngleIncrement(Math.PI / divisor); 
				s.setCircleAngleIncrement(Math.PI / divisor); 
		}
	}
	
	protected void savePattern(final JMenu patterns) {
		String s = (String)JOptionPane.showInputDialog(
		        canvas,
		        "Name For your pattern: ",
		        "Pattern Name",
		        JOptionPane.PLAIN_MESSAGE,
		        null,
		        null,
		        "");
		
		if(s == null || s.equals("")) {
			JOptionPane.showMessageDialog(canvas, new JLabel("You are a dumbass - Saving Canceled"));
			return;
		}
		
		final String left1 = lab.left.createTextPattern(); 
		final String right1 = lab.right.createTextPattern(); 
		
		File file = new File("./patterns.txt");
		try {
			FileWriter fw = new FileWriter( file, true );
			fw.write("\n\n" + "name:" + s + "\n");
			fw.write("left:" + left1 + "\n");
			fw.write("right:" + right1 + "\n");
			fw.flush(); 
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

		JMenuItem item1 = createPatternItem(s, left1, right1);
		
		patterns.add(item1);
	}

	private void setPropImage(BufferedImage prop) {
		canvas.staff = prop;
		canvas.right.setHeight(prop.getHeight());
		canvas.left.setHeight(prop.getHeight());
		canvas.right.setLength(prop.getWidth());
		canvas.left.setLength(prop.getWidth());
		if(lab.multimode) { 
			canvas.staffgrey = canvas.greyscale.filter(prop, null);
			canvas.staffcmyk = canvas.cmyk.filter(prop, null);
		}
	}
	private void setPropImage(BufferedImage prop, boolean isHoop) {
		canvas.staff = prop;
		canvas.right.setHeight(prop.getHeight());
		canvas.left.setHeight(prop.getHeight());
		canvas.right.setLength(prop.getWidth()/2);
		canvas.left.setLength(prop.getWidth()/2);
		if(lab.multimode) { 
			canvas.staffgrey = canvas.greyscale.filter(prop, null);
			canvas.staffcmyk = canvas.cmyk.filter(prop, null);
		}
	}

	
}
