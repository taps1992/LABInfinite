package LAB;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import LAB.gui.LABStatusBar;
import LAB.props.AbstractProp;
import LAB.props.Prop;
import LAB.props.Staff;



public class LABCanvas extends JPanel{
	

	private static final long serialVersionUID = -7408624679627703103L;
	BufferedImage staff;
 	BufferedImage grid;
 	BufferedImage wick;
 	
 	BufferedImage staff1;
 	
 	BufferedImage grid1;
 	BufferedImage grid2;
 	BufferedImage grid3;
 	BufferedImage gridl;
 	
 	BufferedImage wick1;
 	BufferedImage iso;
 	BufferedImage anti;
 	BufferedImage wicksnight;
 	BufferedImage wickstriple;
 	BufferedImage isostick;
 	BufferedImage isostickblack;
 	BufferedImage isostickwhite;
 	BufferedImage poi;
 	BufferedImage poilong;
 	BufferedImage fatstick;
 	BufferedImage hands;
 	BufferedImage hoops;
 	BufferedImage isohoops;
 	BufferedImage sstaffs;
 	BufferedImage club;
 	BufferedImage smallclub;
 	
 	BufferedImage smallcorner;
 	BufferedImage corner;
 	BufferedImage linkage;
 	
 	BufferedImage square; 
 	BufferedImage triangle;
 	BufferedImage eight;
 	BufferedImage fan;
 	BufferedImage firefan;
 	BufferedImage firepoi;
 	
 	BufferedImage halfhoop;
 	BufferedImage eighthoop;
 	BufferedImage angledhoop;
 	BufferedImage innerhoop;
 	BufferedImage firehoop;
 	BufferedImage fireisohoop;
 	
 	AffineTransform leftStaff;
 	AffineTransform rightStaff;
 	
 	List<AffineTransform> allStaffsAffine = new ArrayList<AffineTransform>(); 
 	
 	ColorConvertOp greyscale = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY),null);
 	ColorConvertOp cmyk = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_PYCC),null);
 	BufferedImage staffgrey;
 	BufferedImage staffcmyk;
 	
 	double angle = 0.0; 
 	
 	BufferedImage scrnBuf;
 	Graphics2D sG;
 	BufferedImage scrnBufBack;
 	Graphics2D sGB;
 	BufferedImage scrnBufTrails;
 	Graphics2D sGT;
 	
 	Color background = Color.white; 
 	
 	Vector<String> images = new Vector<String>(); 
 	boolean recording = false; 
 	boolean recordBlind = false;
 	File saveto; 
 	int recordingSize = 100; 
 	boolean HQ = false; 
 	
 	File savePDFto; 
 	Vector<Image> PDFimages = new Vector<Image>(); 
 	boolean createPDF = false;
 	int counter = 0;
 	double interval = Math.PI / 4;
 	double period = Math.PI * 2;
 	int PDFloop = (int) (period / interval);
	
 	int loop = (int) (period / interval);
 	
 	boolean trails = false; 
 	boolean helpers = false; 
 	boolean gridon = true; 
 	boolean wicktrails = false; 
 	boolean clear = false; 
 	boolean day = true; 
 	boolean fakearms = false; 
 	boolean showDesignations = false; 
 	boolean legend = false; 
 	
 	public String legendText = "";
 	
 	File saveImageTo = null; 
 	boolean createImage = false; 
 	
 	
 	public Prop left = new Staff();
 	public Prop right = new Staff(); 
 	
 	public boolean morethantwo = false; 
 	
 	public boolean useRoutine = false; 

 	public List<Prop> allProps = new ArrayList<Prop>(); 
 	
 	LABStatusBar status = null; 
 	
 	GraphicsEnvironment graphEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
	GraphicsDevice graphDevice = graphEnv.getDefaultScreenDevice();
	GraphicsConfiguration graphicConf = graphDevice.getDefaultConfiguration();
	
	Font sansFont = new Font("SansSerif", Font.BOLD, 20);

 	
	public LABCanvas() {
		super(); 
		init(); 
	}
	
	public void init() {
		this.setBackground(Color.white);
		
		allProps.add(left);
		allProps.add(right);
		
		((AbstractProp)left).designation = "l1";
		((AbstractProp)right).designation = "r1";
		
		this.setFocusTraversalKeysEnabled(false);
		
		Hashtable<TextAttribute, Object> map =
            new Hashtable<TextAttribute, Object>();

		map.put(TextAttribute.FOREGROUND, Color.ORANGE);
        sansFont = sansFont.deriveFont(map);
        
		
		scrnBuf = graphicConf.createCompatibleImage(700,700);  
	 	sG = scrnBuf.createGraphics();
	 	sG.setColor(background);
	 	sG.fillRect(0,0,700,700);	
	 	sG.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	 	sG.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
	 	sG.setFont( sansFont );

	 	
	 	scrnBufBack = graphicConf.createCompatibleImage(700,700);  
	 	sGB = scrnBufBack.createGraphics();
	 	sGB.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	 	sGB.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
	 	sGB.setFont( sansFont );

	 	
	 	scrnBufTrails = graphicConf.createCompatibleImage(700,700);  
	 	sGT = scrnBufTrails.createGraphics();
	 	sGT.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0f));
	 	sGT.setColor(Color.white);
	 	sGT.fillRect(0,0,700,700);
	 	sGT.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
	 	sGT.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	 	sGT.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
	 	sGT.setFont( sansFont );

	 	this.setDoubleBuffered(true);
	 	
		try {
			staff1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("stick1.png"));
			//staff1 = ImageIO.read(new File("./images/stick1.png"));
			grid1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("grid.png"));
			grid2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("grid2.png"));
			grid3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("grid11.png"));
			gridl = ImageIO.read(getClass().getClassLoader().getResourceAsStream("ladder-grid.png"));
			wick1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("wicks.png"));
			wicksnight = ImageIO.read(getClass().getClassLoader().getResourceAsStream("wicksnight.png"));
			wickstriple = ImageIO.read(getClass().getClassLoader().getResourceAsStream("wicksnight-triple.png"));
			isostick = ImageIO.read(getClass().getClassLoader().getResourceAsStream("stickround.png"));
			isostickblack = ImageIO.read(getClass().getClassLoader().getResourceAsStream("stickblack.png"));
			isostickwhite = ImageIO.read(getClass().getClassLoader().getResourceAsStream("stickwhite.png"));
			iso = ImageIO.read(getClass().getClassLoader().getResourceAsStream("iso1.png"));
			anti = ImageIO.read(getClass().getClassLoader().getResourceAsStream("anti1.png"));
			poi = ImageIO.read(getClass().getClassLoader().getResourceAsStream("poi.png"));
			poilong =  ImageIO.read(getClass().getClassLoader().getResourceAsStream("poilong.png"));
			fatstick = ImageIO.read(getClass().getClassLoader().getResourceAsStream("stickroundbig.png"));
			hands = ImageIO.read(getClass().getClassLoader().getResourceAsStream("hand.png"));
			hoops = ImageIO.read(getClass().getClassLoader().getResourceAsStream("hoop1.png"));
			isohoops = ImageIO.read(getClass().getClassLoader().getResourceAsStream("iso-hoop.png"));
			sstaffs = ImageIO.read(getClass().getClassLoader().getResourceAsStream("s-staff1.png"));
			club = ImageIO.read(getClass().getClassLoader().getResourceAsStream("club.png"));
			smallclub = ImageIO.read(getClass().getClassLoader().getResourceAsStream("club-half.png"));
			
			smallcorner = ImageIO.read(getClass().getClassLoader().getResourceAsStream("corner-small.png"));
			corner = ImageIO.read(getClass().getClassLoader().getResourceAsStream("corner-large.png"));
			linkage = ImageIO.read(getClass().getClassLoader().getResourceAsStream("linkage.png"));
			
			square = ImageIO.read(getClass().getClassLoader().getResourceAsStream("square.png"));
			triangle = ImageIO.read(getClass().getClassLoader().getResourceAsStream("triangle.png"));
			eight = ImageIO.read(getClass().getClassLoader().getResourceAsStream("eight-small.png"));
			fan = ImageIO.read(getClass().getClassLoader().getResourceAsStream("fan1.png"));
			firefan = ImageIO.read(getClass().getClassLoader().getResourceAsStream("fan-fire.png"));
			firepoi = ImageIO.read(getClass().getClassLoader().getResourceAsStream("poilong-fire.png"));
			
			halfhoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("furet-hoop-2.png"));
		 	eighthoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("furet-hoop-4.png"));
		 	angledhoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("furet-hoop-3.png"));
		 	innerhoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("furet-hoop-1.png"));
		 	firehoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("fire-hoop-fire.png"));
		 	fireisohoop = ImageIO.read(getClass().getClassLoader().getResourceAsStream("fire-hoop-iso.png"));
			
			staff = staff1; 
			grid = grid1;
			wick = wick1;
			
			staffgrey = this.color(0.0F, 0.0F, 0.8F, staff); 
			staffcmyk = this.color(0.8F, 0.0F, 0.0F, staff); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sGB.setColor(Color.white);
		sGB.fillRect(0,0,700,700);	
		sGB.drawImage(grid, null, 0, 0);
		
		right.setCircleAngleModifier(Math.PI); 
		right.setCircleAngle(Math.PI); 
		
	 	leftStaff = left.getAffineTransform();
	 	rightStaff = right.getAffineTransform(); 
	 	allStaffsAffine.add(leftStaff);
		allStaffsAffine.add(rightStaff);

	}
	
	public void updateBuffer() {
		sGB.setColor(Color.white);
		sGB.fillRect(0,0,700,700);	
		sGB.drawImage(grid, null, 0, 0);
	}
	
	public void update() {
		
		updateStaffs();
		repaint();
	}

	private void updateStaffs() {
		allStaffsAffine.clear();
		Staff staff;
		
		for (Iterator<Prop> i = allProps.iterator(); i.hasNext(); )
		{	
			staff = (Staff) i.next(); 
			staff.update();
			allStaffsAffine.add(staff.getAffineTransform());
		}
	}
	
	public void update(Graphics g) {
		paint(g); 
	}
	
	public void recordBlind() {
		for (int i = 0; i <= recordingSize; i++) {
			System.out.println("Recording Frame: " + i);
			status.three.setText("Frame: " + images.size() + " of " + recordingSize);
			 
			Graphics2D g2 = scrnBuf.createGraphics();
			//g.setColor(Color.white);
			//g.fillRect(0,0,700,700);	
			//g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			updateStaffs(); 
			
			paint(g2);

		}
	}
	
	public void paint(Graphics g) {
		sG.setColor(background);
		sG.setBackground(background);

		if(trails)
			sG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f));

		// take this out for an interesting effect  
		if(!wicktrails) 
			sG.fill(this.getVisibleRect());
		
		
		sG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
		
		if(gridon  && !trails)
			sG.drawImage(scrnBufBack, 0 , 0 , this);
		else if(gridon && trails) 
			sG.drawImage(grid, 0, 0, this); 
		
		if(fakearms) {
			sG.setColor(Color.black);
			sG.drawOval(345, 345, 10, 10);
			sG.setColor(Color.orange);
			sG.setStroke(new BasicStroke(4f));
			sG.drawLine(340, 350, (int)(left.getX() + (left.getLength() /2)), (int)(left.getY() + (left.getHeight() / 2)));
			sG.setColor(Color.green);
			sG.drawLine(360, 350, (int)(right.getX() + (right.getLength() /2)), (int)(right.getY() + (right.getHeight() / 2)));
		}
		
		if(legend) {
			sG.drawString(legendText, 10, 25);	
		}
		
		if(helpers) {
			sG.drawImage(iso, null, (int)(left.getXadj() - 2 - (left.getLength() /2)), (int)(left.getYadj() + 2 - (left.getLength()))); 
			sG.drawImage(anti, null, (int)(right.getXadj() - 2 - (left.getLength() /2)), (int)(right.getYadj() + 2 - (right.getLength())));
		}
		
		Staff STAFF;
		int loop = 0; 
		for (Iterator<Prop> i = allProps.iterator(); i.hasNext(); )
		{	STAFF = (Staff) i.next(); 
			AffineTransform affine = null;
			try { affine = (AffineTransform) allStaffsAffine.get(loop); } catch (Exception e) {}
			if(affine != null && !STAFF.stopped) {
				
				// TODO refactor this out in a better way SPEED
				
				
				if(loop > 1 && loop <= 3) {
					if(STAFF.reflect) {
						AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
						tx.translate(0, -staff.getHeight());
						AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
						staff = op.filter(staff, null);
						STAFF.reflect = false;
						// TODO DOES BOTH MUTHREFUCKER
					}
					sG.drawImage(staffgrey, new AffineTransformOp(affine, AffineTransformOp.TYPE_BILINEAR), (int)(STAFF.getX()), (int)(STAFF.getY() - (STAFF.height/2))); 
				}
				else if(loop > 3) {
					if(STAFF.reflect) {
						AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
						tx.translate(0, -staff.getHeight());
						AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
						staff = op.filter(staff, null);
						STAFF.reflect = false;
						// TODO DOES BOTH MUTHREFUCKER
					}
					sG.drawImage(staffcmyk, new AffineTransformOp(affine, AffineTransformOp.TYPE_BILINEAR), (int)(STAFF.getX()), (int)(STAFF.getY() - (STAFF.height/2))); 
				}
				else {
					if(STAFF.reflect) {
						AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
						tx.translate(0, -staff.getHeight());
						AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
						staff = op.filter(staff, null);
						STAFF.reflect = false;
					}
					sG.drawImage(staff, new AffineTransformOp(affine, AffineTransformOp.TYPE_BILINEAR), (int)(STAFF.getX()) , (int)(STAFF.getY() - (STAFF.height/2))); 
					
				}
					
					
				//if(showDesignations) {
					//sG.setColor(Color.black); 
					//sG.drawString(STAFF.designation, (int)STAFF.getX(), (int)STAFF.getY()); 
					//sG.setColor(Color.white); 
				//}
			}
			loop ++; 
		}
		
		if(wicktrails) sG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f));
		
		if(clear) {
			sG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
			sG.setColor(background);
			sG.setBackground(background);
			sG.fillRect(0,0,700,700);
			sG.clearRect(0,0,700,700);	
			clear = false;
		}
		
		g.drawImage(scrnBuf, 0 , 0 , this);
		
		if(wicktrails) sG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
		
 	}

	/**
	 * Colors an image with specified color.
	 * @param r Red value. Between 0 and 1
	 * @param g Green value. Between 0 and 1
	 * @param b Blue value. Between 0 and 1
	 * @param src The image to color
	 * @return The colored image
	 */
	protected BufferedImage color(float r, float g, float b, BufferedImage src) {

	    // Copy image ( who made that so complicated :< )
	    BufferedImage newImage = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TRANSLUCENT);
	    Graphics2D graphics = newImage.createGraphics();
	    graphics.drawImage(src, 0, 0, null);
	    graphics.dispose();

	    // Color image
	    for (int i = 0; i < newImage.getWidth(); i++) {
	        for (int j = 0; j < newImage.getHeight(); j++) {
	            int ax = newImage.getColorModel().getAlpha(newImage.getRaster().getDataElements(i, j, null));
	            int rx = newImage.getColorModel().getRed(newImage.getRaster().getDataElements(i, j, null));
	            int gx = newImage.getColorModel().getGreen(newImage.getRaster().getDataElements(i, j, null));
	            int bx = newImage.getColorModel().getBlue(newImage.getRaster().getDataElements(i, j, null));
	            rx *= r;
	            gx *= g;
	            bx *= b;
	            newImage.setRGB(i, j, (ax << 24) | (rx << 16) | (gx << 8) | (bx << 0));
	        }
	    }
	    return newImage;
	}
}
