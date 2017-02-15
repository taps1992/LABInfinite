package LAB.meta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import LAB.PropControl;

public class Patterns {
	public static final int MIRROR_ANTI_SPIN_SPLIT_TIME = 0; 
	public static final int MIRROR_ANTI_SPIN_SAME_TIME = 1; 
	public static final int PARALLEL_ANTI_SPIN_SPLIT_TIME = 2; 
	public static final int PARALLEL_ANTI_SPIN_SAME_TIME = 3; 
	
	public static final int MIRROR_HYBRID_SPLIT_TIME = 4; 
	public static final int MIRROR_HYBRID_SAME_TIME = 5; 
	public static final int PARALLEL_HYBRID_SPLIT_TIME = 6;
	public static final int PARALLEL_HYBRID_SAME_TIME = 7; 
	
	public static final int MIRROR_ISOLATION_SPLIT_TIME = 8;
	public static final int MIRROR_ISOLATION_SAME_TIME = 9; 
	public static final int PARALLEL_ISOLATION_SPLIT_TIME = 10; 
	public static final int PARALLEL_ISOLATION_SAME_TIME = 11; 
	
	public static final int QUARTER_TIME_MIRROR_ISOLATION = 12; 
	public static final int QUARTER_TIME_PARALLEL_ISOLATION = 13; 
	public static final int QUARTER_TIME_MIRROR_ANTI_SPIN = 14; 
	public static final int QUARTER_TIME_PARALLEL_ANTI_SPIN = 15; 
	public static final int QUARTER_TIME_MIRROR_HYBRID = 16; 
	public static final int QUARTER_TIME_PARALLEL_HYBRID = 17; 
	
	public static final int POSITION_0 = 18; 
	public static final int POSITION_1 = 19; 
	
	public static List<Pattern> basicPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> basic12Patterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> userPatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> startingPositions = new ArrayList<Pattern>(); 
	
	public static List<Pattern> extraBeatPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> extraBeat2Patterns = new ArrayList<Pattern>(); 
	public static List<Pattern> extraBeat3Patterns = new ArrayList<Pattern>(); 
	public static List<Pattern> extraBeat4Patterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> perpendicularPatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> pointPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> pointHybridPatterns = new ArrayList<Pattern>(); 	
	public static List<Pattern> pointHybridPerpPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> pointHybridPerpInsidePatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> pointHybridPerpOutsidePatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> squarePatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> quarterSquarePatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> extraBeatTrammelPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> verticalLinePatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> superspinPatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> halfCirclePatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> dirChangePatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> dirChangeVerticalPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> dirChangeHybridPatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> superspinTrammelPatterns = new ArrayList<Pattern>(); 
	
	public static List<Pattern> pausedCirclePatterns = new ArrayList<Pattern>();
	public static List<Pattern> pausedHalfCirclePatterns = new ArrayList<Pattern>();
	public static List<Pattern> pausedQuartersPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> translatedCirclesPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> translatedQuarterPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> threeQuarterPatterns = new ArrayList<Pattern>();
	public static List<Pattern> threeQuarterHybridPatterns = new ArrayList<Pattern>();
	
	public static List<Pattern> underArmourHPatterns = new ArrayList<Pattern>(); 
	public static List<Pattern> lineHPatterns = new ArrayList<Pattern>(); 
	
	static {
		
		String lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		String righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p = new Pattern(lefty, righty, "Mirror Isolation Split-Time");
		basicPatterns.add(p);
		basic12Patterns.add(p);
		
		lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p1 = new Pattern(lefty, righty, "Mirror Isolation Same-Time");
		basicPatterns.add(p1);
		basic12Patterns.add(p1);
	
		lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern p2 = new Pattern(lefty, righty, "Parallel Isolation Same-Time");
		basicPatterns.add(p2);
		basic12Patterns.add(p2);
		
		lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern p3 = new Pattern(lefty, righty, "Parallel Isolation Split-Time");
		basicPatterns.add(p3);
		basic12Patterns.add(p3);
		
		
		lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern p4 = new Pattern(lefty, righty, "Mirror Anti-Spin Split-Time"); 
		basicPatterns.add(p4);
		basic12Patterns.add(p4);
		
		lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern p5 = new Pattern(lefty, righty, "Mirror Anti-Spin Same-Time");
		basicPatterns.add(p5);
		basic12Patterns.add(p5);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern p6 = new Pattern(lefty, righty, "Parallel Anti-Spin Split-Time");
		basicPatterns.add(p6);
		basic12Patterns.add(p6);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		Pattern p7 = new Pattern(lefty, righty, "Parallel Anti-Spin Same-Time");
		basicPatterns.add(p7);
		basic12Patterns.add(p7);
		
		
		// point basics
		
		lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern po = new Pattern(lefty, righty, "Mirror-Time on Point"); 
		pointPatterns.add(po);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern po2 = new Pattern(lefty, righty, "Parallel-Time on Point");
		pointPatterns.add(po2);
		
		
		lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern po1 = new Pattern(lefty, righty, "Mirror Quarter-Time on Point");
		pointPatterns.add(po1);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		Pattern po3 = new Pattern(lefty, righty, "Parallel Quarter-Time on Point");
		pointPatterns.add(po3);
		
		// close
		
		lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern poh = new Pattern(lefty, righty, "Mirror-Time Close Points"); 
		pointPatterns.add(poh);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern poh2 = new Pattern(lefty, righty, "Parallel-Time Close Points");
		pointPatterns.add(poh2);
		
		
		lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern poh1 = new Pattern(lefty, righty, "Mirror Quarter-Time Close Points");
		pointPatterns.add(poh1);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		Pattern poh3 = new Pattern(lefty, righty, "Parallel Quarter-Time Close Points");
		pointPatterns.add(poh3);

		// full
		
		lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0,";
		Pattern pof = new Pattern(lefty, righty, "Mirror-Time Unit Circle Distance"); 
		pointPatterns.add(pof);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0,";
		Pattern pof2 = new Pattern(lefty, righty, "Parallel-Time Unit Circle Distance");
		pointPatterns.add(pof2);
		
		
		lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0,";
		Pattern pof1 = new Pattern(lefty, righty, "Mirror Quarter-Time Unit Circle Distance");
		pointPatterns.add(pof1);
		
		lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,345.0,"; 
		righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,345.0,"; 
		Pattern pof3 = new Pattern(lefty, righty, "Parallel Quarter-Time Unit Circle Distance");
		pointPatterns.add(pof3);
		
	    //**/
		
		
		lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p8 = new Pattern(lefty, righty, "Mirror Hybrid Split-Time");
		basicPatterns.add(p8);
		basic12Patterns.add(p8);
		
		lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p9 = new Pattern(lefty, righty, "Mirror Hybrid Same-Time");
		basicPatterns.add(p9);
		basic12Patterns.add(p9);
	
		lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p10 = new Pattern(lefty, righty, "Parallel Hybrid Split-Time");
		basicPatterns.add(p10);
		basic12Patterns.add(p10);
		
		lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p11 = new Pattern(lefty, righty, "Parallel Hybrid Same-Time");
		basicPatterns.add(p11);
		basic12Patterns.add(p11);
		
		//
		
		
		
		
		
		lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p12 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Isolation");
		basicPatterns.add(p12);
		
		lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p13 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Isolation");
		basicPatterns.add(p13);
		
		lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p14 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Anti-Spin");
		basicPatterns.add(p14);
		
		lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern p15 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Anti-Spin");
		basicPatterns.add(p15);
		
		lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
		Pattern p16 = new Pattern(lefty, righty, "Quarter-Time Crossing (Mirror) Hybrid");
		basicPatterns.add(p16);
		
		lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
		righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
		Pattern p17 = new Pattern(lefty, righty, "Quarter-Time Follow (Parallel) Hybrid");
		basicPatterns.add(p17);
		
		
		
		lefty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern s0 = new Pattern(lefty, righty, "Starting Position - Together - Right"); 
		basicPatterns.add(s0);
		
		lefty =  "0,0.0,3.141592653589793,0,0.0,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,3.141592653589793,0,0.0,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern s01 = new Pattern(lefty, righty, "Starting Position - Together - Left"); 
		basicPatterns.add(s01);
		
		lefty =  "0,0.0,4.71238898038469,0,0.0,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,4.71238898038469,0,0.0,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern s02 = new Pattern(lefty, righty, "Starting Position - Together - Top"); 
		basicPatterns.add(s02);
		
		lefty =  "0,0.0,1.5707963267948966,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,1.5707963267948966,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern s03 = new Pattern(lefty, righty, "Starting Position - Together - Bottom"); 
		basicPatterns.add(s03);
		
		lefty =  "0,0.0,3.141592653589793,0,0.0,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern s1 = new Pattern(lefty, righty, "Starting Position - Split Horizontal"); 
		basicPatterns.add(s1);
		
		lefty =  "0,0.0,4.71238898038469,0,0.0,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,0.0,";
		righty = "0,0.0,1.5707963267948966,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,0.0,";
		Pattern s2 = new Pattern(lefty, righty, "Starting Position - Split Vertical"); 
		basicPatterns.add(s2);
		
		lefty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,1.5707963267948966,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern q0 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Right"); 
		basicPatterns.add(q0);
		
		lefty = "0,0.0,3.141592653589793,0,0.0,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,1.5707963267948966,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern q1 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Bottom Left"); 
		basicPatterns.add(q1);
		
		lefty = "0,0.0,4.71238898038469,0,0.0,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern q2 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Right"); 
		basicPatterns.add(q2);
		
		lefty = "0,0.0,4.71238898038469,0,0.0,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		righty = "0,0.0,3.141592653589793,0,0.0,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,0.0,0.0,";
		Pattern q3 = new Pattern(lefty, righty, "Starting Position - QuarterTime - Top Left"); 
		basicPatterns.add(q3);
		
		lefty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,0.0,0.0,";
		righty = "0,0.0,1.5707963267948966,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,350.0,0,248.0,0.0,0.0,0.0,";
		Pattern q4 = new Pattern(lefty, righty, "Starting Position - Cross - Together"); 
		basicPatterns.add(q4);
		
		lefty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,0.0,0.0,";
		righty = "0,0.0,4.71238898038469,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,248.0,0.0,0.0,0.0,";
		Pattern q5 = new Pattern(lefty, righty, "Starting Position - Cross - Apart"); 
		basicPatterns.add(q5);
		
		lefty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,0.0,0.0,";
		righty = "0,0.0,3.141592653589793,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,0.0,0.0,";
		Pattern q6 = new Pattern(lefty, righty, "Starting Position - Cross - Quartertime"); 
		basicPatterns.add(q6);
		
		lefty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,248.0,0.0,0.0,0.0";
		righty = "0,0.0,3.141592653589793,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,0.0,0.0,";
		Pattern q7 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Split-Time"); 
		basicPatterns.add(q7);
		
		lefty = "0,0.0,0.0,0,0.0,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,146.0,0,248.0,0.0,0.0,0.0";
		righty = "0,0.0,3.141592653589793,0,0.0,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,145.0,0.0,0.0,0.0,";
		Pattern q8 = new Pattern(lefty, righty, "Starting Position - Perpendicular - Same-Time"); 
		basicPatterns.add(q8);
		
		//32
		
		startingPositions.add(s0); 
		startingPositions.add(s01); 
		startingPositions.add(s02); 
		startingPositions.add(s03); 
		startingPositions.add(s1);
		startingPositions.add(s2);
		startingPositions.add(q0); 
		startingPositions.add(q1); 
		startingPositions.add(q2); 
		startingPositions.add(q3); 
		startingPositions.add(q4); 
		startingPositions.add(q5); 
		startingPositions.add(q6); 
		startingPositions.add(q7); 
		startingPositions.add(q8); 
		
		// basic trammel
		
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t8 = new Pattern(lefty, righty, "Mirror Split-Time Trammel");
				basicPatterns.add(t8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t9 = new Pattern(lefty, righty, "Mirror Same-Time Trammel");
				basicPatterns.add(t9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,";
				Pattern t10 = new Pattern(lefty, righty, "Parallel Same-Time Trammel");
				basicPatterns.add(t10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,";
				Pattern t11 = new Pattern(lefty, righty, "Parallel Split-Time Trammel");
				basicPatterns.add(t11);
				
				
				lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,";
				Pattern t = new Pattern(lefty, righty, "Mirror Quarter-time Trammel"); 
				basicPatterns.add(t);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,";
				Pattern t1 = new Pattern(lefty, righty, "Mirror Quarter-time Perpendicular Trammel");
				basicPatterns.add(t1);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,";
				Pattern t2 = new Pattern(lefty, righty, "Parallel Quarter-time 1 Perpendicular Trammel");
				basicPatterns.add(t2);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				Pattern t3 = new Pattern(lefty, righty, "Parallel Quarter-time Same Trammel");
				basicPatterns.add(t3);
				
				
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t4 = new Pattern(lefty, righty, "Mirror Perpendicular Split-Time Trammel");
				basicPatterns.add(t4);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t5 = new Pattern(lefty, righty, "Mirror Perpendicular Same-Time Trammel");
				basicPatterns.add(t5);
			
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t6 = new Pattern(lefty, righty, "Parallel Perpendicular Split-Time Trammel");
				basicPatterns.add(t6);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t7 = new Pattern(lefty, righty, "Parallel Perpendicular Same-Time Trammel");
				basicPatterns.add(t7);
				
				
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t20 = new Pattern(lefty, righty, "Mirror Hybrid Split-Time Trammel");
				basicPatterns.add(t20);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t21 = new Pattern(lefty, righty, "Mirror Hybrid Same-Time Trammel");
				basicPatterns.add(t21);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t22 = new Pattern(lefty, righty, "Parallel Hybrid Split-Time Trammel");
				basicPatterns.add(t22);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t23 = new Pattern(lefty, righty, "Parallel Hybrid Same-Time Trammel");
				basicPatterns.add(t23);
				
				
				lefty = "0,0.025,7.853981633974483,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t24 = new Pattern(lefty, righty, "Cross Trammel");
				basicPatterns.add(t24);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t25 = new Pattern(lefty, righty, "Parallel Hybrid Same-Time Trammel");
				basicPatterns.add(t25);
				
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t26 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(t26);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t27 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(t27);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t28 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(t28);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern t29 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(t29);
				
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t30 = new Pattern(lefty, righty, "Mirror Hybrid Perpendicular Split-Time Trammel");
				basicPatterns.add(t30);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t31 = new Pattern(lefty, righty, "Mirror Hybrid Perpendicular Same-Time Trammel");
				basicPatterns.add(t31);
			
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t32 = new Pattern(lefty, righty, "Parallel Hybrid Perpendicular Split-Time Trammel");
				basicPatterns.add(t32);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t33 = new Pattern(lefty, righty, "Parallel Hybrid c Same-Time Trammel");
				basicPatterns.add(t33);
		
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t34 = new Pattern(lefty, righty, "Mirror Hybrid 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(t34);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t35 = new Pattern(lefty, righty, "Mirror Hybrid 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(t35);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t36 = new Pattern(lefty, righty, "Parallel Hybrid 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(t36);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern t37 = new Pattern(lefty, righty, "Parallel Hybrid 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(t37);
				
				// trammel quartertime / staggered  st
				
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st8 = new Pattern(lefty, righty, "Mirror Split-Time Trammel");
				basicPatterns.add(st8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st9 = new Pattern(lefty, righty, "Mirror Same-Time Trammel");
				basicPatterns.add(st9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,";
				Pattern st10 = new Pattern(lefty, righty, "Parallel Same-Time Trammel");
				basicPatterns.add(st10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,";
				Pattern st11 = new Pattern(lefty, righty, "Parallel Split-Time Trammel");
				basicPatterns.add(st11);
				
				
				
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st4 = new Pattern(lefty, righty, "Mirror Perpendicular Split-Time Trammel");
				basicPatterns.add(st4);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st5 = new Pattern(lefty, righty, "Mirror Perpendicular Same-Time Trammel");
				basicPatterns.add(st5);
			
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st6 = new Pattern(lefty, righty, "Parallel Perpendicular Split-Time Trammel");
				basicPatterns.add(st6);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,6,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st7 = new Pattern(lefty, righty, "Parallel Perpendicular Same-Time Trammel");
				basicPatterns.add(st7);
				
				
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st20 = new Pattern(lefty, righty, "Mirror Hybrid Split-Time Trammel");
				basicPatterns.add(st20);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st21 = new Pattern(lefty, righty, "Mirror Hybrid Same-Time Trammel");
				basicPatterns.add(st21);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st22 = new Pattern(lefty, righty, "Parallel Hybrid Split-Time Trammel");
				basicPatterns.add(st22);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st23 = new Pattern(lefty, righty, "Parallel Hybrid Same-Time Trammel");
				basicPatterns.add(st23);
				
				
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st26 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(st26);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st27 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(st27);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st28 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(st28);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0";
				Pattern st29 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(st29);
				
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st30 = new Pattern(lefty, righty, "Mirror Hybrid Perpendicular Split-Time Trammel");
				basicPatterns.add(st30);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st31 = new Pattern(lefty, righty, "Mirror Hybrid Perpendicular Same-Time Trammel");
				basicPatterns.add(st31);
			
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st32 = new Pattern(lefty, righty, "Parallel Hybrid Perpendicular Split-Time Trammel");
				basicPatterns.add(st32);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st33 = new Pattern(lefty, righty, "Parallel Hybrid Perpendicular Same-Time Trammel");
				basicPatterns.add(st33);
		
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st34 = new Pattern(lefty, righty, "Mirror Hybrid 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(st34);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st35 = new Pattern(lefty, righty, "Mirror Hybrid 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(st35);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st36 = new Pattern(lefty, righty, "Parallel Hybrid 1 Perpendicular Split-Time Trammel");
				basicPatterns.add(st36);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
				Pattern st37 = new Pattern(lefty, righty, "Parallel Hybrid 1 Perpendicular Same-Time Trammel");
				basicPatterns.add(st37);
			
		// perpendicular /////////////////////////////////////////////////
				
				lefty = "0,0.025,6.283185307179586,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern pp8 = new Pattern(lefty, righty, "Mirror Isolation Same-Time");
				perpendicularPatterns.add(pp8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern pp9 = new Pattern(lefty, righty, "Mirror Isolation Split-Time");
				perpendicularPatterns.add(pp9);
			
				lefty =  "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern pp10 = new Pattern(lefty, righty, "Parallel Isolation Same-Time");
				perpendicularPatterns.add(pp10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern pp11 = new Pattern(lefty, righty, "Parallel Isolation Split-Time");
				perpendicularPatterns.add(pp11);
				
				//
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern pp = new Pattern(lefty, righty, "Mirror Anti-Spin Split-Time"); 
				perpendicularPatterns.add(pp);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern pp1 = new Pattern(lefty, righty, "Mirror Anti-Spin Same-Time");
				perpendicularPatterns.add(pp1);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern pp2 = new Pattern(lefty, righty, "Parallel Anti-Spin Split-Time");
				perpendicularPatterns.add(pp2);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				Pattern pp3 = new Pattern(lefty, righty, "Parallel Anti-Spin Same-Time");
				perpendicularPatterns.add(pp3);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern pp4 = new Pattern(lefty, righty, "Parallel Hybrid Split-Time");
				perpendicularPatterns.add(pp4);
				
				lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern pp5 = new Pattern(lefty, righty, "Parallel Hybrid Same-Time");
				perpendicularPatterns.add(pp5);
			
				lefty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern pp6 = new Pattern(lefty, righty, "Mirror Hybrid Split-Time");
				perpendicularPatterns.add(pp6);
				
				lefty = "0,0.025,0.0,0,0.025,4.7123889803846896,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern pp7 = new Pattern(lefty, righty, "Mirror Hybrid Same-Time");
				perpendicularPatterns.add(pp7);
				
				///// 
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern p1p8 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Isolation Split-Time");
				perpendicularPatterns.add(p1p8);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern p1p9 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Isolation Same-Time");
				perpendicularPatterns.add(p1p9);
			
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern p1p10 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Isolation Same-Time");
				perpendicularPatterns.add(p1p10);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern p1p11 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Isolation Split-Time");
				perpendicularPatterns.add(p1p11);
				
				//
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern p1p = new Pattern(lefty, righty, "Mirror 1 Perpendicular Anti-Spin Split-Time"); 
				perpendicularPatterns.add(p1p);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern p1p1 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Anti-Spin Same-Time");
				perpendicularPatterns.add(p1p1);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern p1p2 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Anti-Spin Split-Time");
				perpendicularPatterns.add(p1p2);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				Pattern p1p3 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Anti-Spin Same-Time");
				perpendicularPatterns.add(p1p3);
				
				//
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern p1p4 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Hybrid Split-Time");
				perpendicularPatterns.add(p1p4);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern p1p5 = new Pattern(lefty, righty, "Parallel 1 Perpendicular Hybrid Same-Time");
				perpendicularPatterns.add(p1p5);
			
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern p1p6 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Hybrid Split-Time");
				perpendicularPatterns.add(p1p6);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern p1p7 = new Pattern(lefty, righty, "Mirror 1 Perpendicular Hybrid Same-Time");
				perpendicularPatterns.add(p1p7);

				
		// extra beats    ////////////////////////////////////////////////////////////////
				
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
				Pattern ep8 = new Pattern(lefty, righty, "1 Extra Beat - Mirror Isolation Split-Time");
				extraBeatPatterns.add(ep8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
				Pattern ep9 = new Pattern(lefty, righty, "1 Extra Beat - Mirror Isolation Same-Time");
				extraBeatPatterns.add(ep9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,";
				Pattern ep10 = new Pattern(lefty, righty, "1 Extra Beat - Parallel Isolation Same-Time");
				extraBeatPatterns.add(ep10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,";
				Pattern ep11 = new Pattern(lefty, righty, "1 Extra Beat - Parallel Isolation Split-Time");
				extraBeatPatterns.add(ep11);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,";
				Pattern ep = new Pattern(lefty, righty, "1 Extra Beat - Mirror Anti-Spin Split-Time"); 
				extraBeatPatterns.add(ep);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,";
				Pattern ep1 = new Pattern(lefty, righty, "1 Extra Beat - Mirror Anti-Spin Same-Time");
				extraBeatPatterns.add(ep1);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,";
				Pattern ep2 = new Pattern(lefty, righty, "1 Extra Beat - Parallel Anti-Spin Split-Time");
				extraBeatPatterns.add(ep2);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				Pattern ep3 = new Pattern(lefty, righty, "1 Extra Beat - Parallel Anti-Spin Same-Time");
				extraBeatPatterns.add(ep3);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
				Pattern ep4 = new Pattern(lefty, righty, "1 Extra Beat - Mirror Hybrid Split-Time");
				extraBeatPatterns.add(ep4);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
				Pattern ep5 = new Pattern(lefty, righty, "1 Extra Beat - Mirror Hybrid Same-Time");
				extraBeatPatterns.add(ep5);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
				Pattern ep6 = new Pattern(lefty, righty, "1 Extra Beat - Parallel Hybrid Split-Time");
				extraBeatPatterns.add(ep6);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,2.0,0,250.0,0,345.0";
				Pattern ep7 = new Pattern(lefty, righty, "1 Extra Beat - Parallel Hybrid Same-Time");
				extraBeatPatterns.add(ep7);
				
				//
				
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
				Pattern eep8 = new Pattern(lefty, righty, "2 Extra Beats - Mirror Isolation Split-Time");
				extraBeat2Patterns.add(eep8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
				Pattern eep9 = new Pattern(lefty, righty, "2 Extra Beats - Mirror Isolation Same-Time");
				extraBeat2Patterns.add(eep9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,";
				Pattern eep10 = new Pattern(lefty, righty, "2 Extra Beats - Parallel Isolation Same-Time");
				extraBeat2Patterns.add(eep10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,";
				Pattern eep11 = new Pattern(lefty, righty, "2 Extra Beats - Parallel Isolation Split-Time");
				extraBeat2Patterns.add(eep11);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,";
				Pattern eep = new Pattern(lefty, righty, "2 Extra Beats - Mirror Anti-Spin Split-Time"); 
				extraBeat2Patterns.add(eep);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,";
				Pattern eep1 = new Pattern(lefty, righty, "2 Extra Beats - Mirror Anti-Spin Same-Time");
				extraBeat2Patterns.add(eep1);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,";
				Pattern eep2 = new Pattern(lefty, righty, "2 Extra Beats - Parallel Anti-Spin Split-Time");
				extraBeat2Patterns.add(eep2);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				Pattern eep3 = new Pattern(lefty, righty, "2 Extra Beats - Parallel Anti-Spin Same-Time");
				extraBeat2Patterns.add(eep3);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
				Pattern eep4 = new Pattern(lefty, righty, "2 Extra Beats - Mirror Hybrid Split-Time");
				extraBeat2Patterns.add(eep4);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
				Pattern eep5 = new Pattern(lefty, righty, "2 Extra Beats - Mirror Hybrid Same-Time");
				extraBeat2Patterns.add(eep5);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
				Pattern eep6 = new Pattern(lefty, righty, "2 Extra Beats - Parallel Hybrid Split-Time");
				extraBeat2Patterns.add(eep6);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,3.0,0,250.0,0,345.0";
				Pattern eep7 = new Pattern(lefty, righty, "2 Extra Beats - Parallel Hybrid Same-Time");
				extraBeat2Patterns.add(eep7);
				
//
				
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
				Pattern eeep8 = new Pattern(lefty, righty, "3 Extra Beats - Mirror Isolation Split-Time");
				extraBeat3Patterns.add(eeep8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
				Pattern eeep9 = new Pattern(lefty, righty, "3 Extra Beats - Mirror Isolation Same-Time");
				extraBeat3Patterns.add(eeep9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,";
				Pattern eeep10 = new Pattern(lefty, righty, "3 Extra Beats - Parallel Isolation Same-Time");
				extraBeat3Patterns.add(eeep10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,";
				Pattern eeep11 = new Pattern(lefty, righty, "3 Extra Beats - Parallel Isolation Split-Time");
				extraBeat3Patterns.add(eeep11);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,";
				Pattern eeep = new Pattern(lefty, righty, "3 Extra Beats - Mirror Anti-Spin Split-Time"); 
				extraBeat3Patterns.add(eeep);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,";
				Pattern eeep1 = new Pattern(lefty, righty, "3 Extra Beats - Mirror Anti-Spin Same-Time");
				extraBeat3Patterns.add(eeep1);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,";
				Pattern eeep2 = new Pattern(lefty, righty, "3 Extra Beats - Parallel Anti-Spin Split-Time");
				extraBeat3Patterns.add(eeep2);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				Pattern eeep3 = new Pattern(lefty, righty, "3 Extra Beats - Parallel Anti-Spin Same-Time");
				extraBeat3Patterns.add(eeep3);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
				Pattern eeep4 = new Pattern(lefty, righty, "3 Extra Beats - Mirror Hybrid Split-Time");
				extraBeat3Patterns.add(eeep4);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
				Pattern eeep5 = new Pattern(lefty, righty, "3 Extra Beats - Mirror Hybrid Same-Time");
				extraBeat3Patterns.add(eeep5);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
				Pattern eeep6 = new Pattern(lefty, righty, "3 Extra Beats - Parallel Hybrid Split-Time");
				extraBeat3Patterns.add(eeep6);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,4.0,0,250.0,0,345.0";
				Pattern eeep7 = new Pattern(lefty, righty, "3 Extra Beats - Parallel Hybrid Same-Time");
				extraBeat3Patterns.add(eeep7);
				
				//
				
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
				Pattern eeeep8 = new Pattern(lefty, righty, "4 Extra Beats - Mirror Isolation Split-Time");
				extraBeat4Patterns.add(eeeep8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
				Pattern eeeep9 = new Pattern(lefty, righty, "4 Extra Beats - Mirror Isolation Same-Time");
				extraBeat4Patterns.add(eeeep9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,";
				Pattern eeeep10 = new Pattern(lefty, righty, "4 Extra Beats - Parallel Isolation Same-Time");
				extraBeat4Patterns.add(eeeep10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,";
				Pattern eeeep11 = new Pattern(lefty, righty, "4 Extra Beats - Parallel Isolation Split-Time");
				extraBeat4Patterns.add(eeeep11);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,";
				Pattern eeeep = new Pattern(lefty, righty, "4 Extra Beats - Mirror Anti-Spin Split-Time"); 
				extraBeat4Patterns.add(eeeep);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,";
				Pattern eeeep1 = new Pattern(lefty, righty, "4 Extra Beats - Mirror Anti-Spin Same-Time");
				extraBeat4Patterns.add(eeeep1);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,";
				Pattern eeeep2 = new Pattern(lefty, righty, "4 Extra Beats - Parallel Anti-Spin Split-Time");
				extraBeat4Patterns.add(eeeep2);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				Pattern eeeep3 = new Pattern(lefty, righty, "4 Extra Beats - Parallel Anti-Spin Same-Time");
				extraBeat4Patterns.add(eeeep3);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
				Pattern eeeep4 = new Pattern(lefty, righty, "4 Extra Beats - Mirror Hybrid Split-Time");
				extraBeat4Patterns.add(eeeep4);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
				Pattern eeeep5 = new Pattern(lefty, righty, "4 Extra Beats - Mirror Hybrid Same-Time");
				extraBeat4Patterns.add(eeeep5);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
				Pattern eeeep6 = new Pattern(lefty, righty, "4 Extra Beats - Parallel Hybrid Split-Time");
				extraBeat4Patterns.add(eeeep6);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,5.0,0,250.0,0,345.0";
				Pattern eeeep7 = new Pattern(lefty, righty, "4 Extra Beats - Parallel Hybrid Same-Time");
				extraBeat4Patterns.add(eeeep7);
				
				
				// point hybrids
				
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph8 = new Pattern(lefty, righty, "Mirror Point-Hybrid Isolation Split");
				pointHybridPatterns.add(ph8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph9 = new Pattern(lefty, righty, "Mirror Point-Hybrid Isolation Same");
				pointHybridPatterns.add(ph9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph10 = new Pattern(lefty, righty, "Parallel Point-Hybrid Isolation Same");
				pointHybridPatterns.add(ph10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph11 = new Pattern(lefty, righty, "Parallel Point-Hybrid Isolation Split");
				pointHybridPatterns.add(ph11);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph = new Pattern(lefty, righty, "Mirror Point-Hybrid Anti-Spin Split *"); 
				pointHybridPatterns.add(ph);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph1 = new Pattern(lefty, righty, "Mirror Point-Hybrid Anti-Spin Same *");
				pointHybridPatterns.add(ph1);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph2 = new Pattern(lefty, righty, "Parallel Point-Hybrid Anti-Spin Split");
				pointHybridPatterns.add(ph2);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				Pattern ph3 = new Pattern(lefty, righty, "Parallel Point-Hybrid Anti-Spin Same");
				pointHybridPatterns.add(ph3);
				
                // point hybrids perp 
				/*
				
				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph8p = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Isolation Split");
				pointHybridPatterns.add(ph8p);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
				Pattern ph9p = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Isolation Same");
				pointHybridPatterns.add(ph9p);
			
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph10p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Isolation Same");
				pointHybridPatterns.add(ph10p);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,0.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph11p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Isolation Split");
				pointHybridPatterns.add(ph11p);
				
				//
				
				lefty = "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern php = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Anti-Spin Split *"); 
				pointHybridPatterns.add(php);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph1p = new Pattern(lefty, righty, "Mirror Perpendicular Point-Hybrid Anti-Spin Same *");
				pointHybridPatterns.add(ph1p);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,";
				Pattern ph2p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Anti-Spin Split");
				pointHybridPatterns.add(ph2p);
				
				lefty =  "0,0.025,0.0,0,0.025,0.0,0.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0,"; 
				Pattern ph3p = new Pattern(lefty, righty, "Parallel Perpendicular Point-Hybrid Anti-Spin Same");
				pointHybridPatterns.add(ph3p);
				
				/**/
				//
				
		        lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps = new Pattern(lefty, righty, "Square Mirror Isolation Split-Time"); 
				squarePatterns.add(ps);
				
				lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps1 = new Pattern(lefty, righty, "Square Mirror Isolation Same-Time");
				squarePatterns.add(ps1);
				
				lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern ps2 = new Pattern(lefty, righty, "Square Parallel Isolation Split-Time");
				squarePatterns.add(ps2);
				
				lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				Pattern ps3 = new Pattern(lefty, righty, "Square Parallel Isolation Same-Time");
				squarePatterns.add(ps3);
				
				// 
				
				lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps4 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Split-Time"); 
				squarePatterns.add(ps4);
				
				lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps5 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Same-Time");
				squarePatterns.add(ps5);
				
				lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern ps6 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Split-Time");
				squarePatterns.add(ps6);
				
				lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				Pattern ps7 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Same-Time");
				squarePatterns.add(ps7);
				
                // 
				
				lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps8 = new Pattern(lefty, righty, "Square Mirror Hybrid Split-Time"); 
				squarePatterns.add(ps8);
				
				lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps9 = new Pattern(lefty, righty, "Square Mirror Hybrid Same-Time");
				squarePatterns.add(ps9);
				
				lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern ps10 = new Pattern(lefty, righty, "Square Parallel Hybrid Split-Time");
				squarePatterns.add(ps10);
				
				lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				Pattern ps11 = new Pattern(lefty, righty, "Square Parallel Hybrid Same-Time");
				squarePatterns.add(ps11);
				
				//
				
				lefty = "0,0.025,8.63937979737193,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern psp = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Split-Time"); 
				squarePatterns.add(psp);
				
				lefty = "0,0.025,5.497787143782138,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps1p = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Same-Time");
				squarePatterns.add(ps1p);
				
				lefty =  "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern ps2p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Split-Time");
				squarePatterns.add(ps2p);
				
				lefty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				righty =  "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				Pattern ps3p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Same-Time");
				squarePatterns.add(ps3p);
				
				//
				
				lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps4p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Split-Time"); 
				squarePatterns.add(ps4p);
				
				lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps5p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Same-Time");
				squarePatterns.add(ps5p);
				
				lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern ps6p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Split-Time");
				squarePatterns.add(ps6p);
				
				lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				righty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				Pattern ps7p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Same-Time");
				squarePatterns.add(ps7p);
				
// 
				
				lefty = "0,0.025,7.0685834705770345,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps8p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Split-Time"); 
				squarePatterns.add(ps8p);
				
				lefty = "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern ps9p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Same-Time");
				squarePatterns.add(ps9p);
				
				lefty =  "0,0.025,0.7853981633974483,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern ps10p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Split-Time *");
				squarePatterns.add(ps10p);
				
				lefty =  "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				righty =  "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,"; 
				Pattern ps11p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Same-Time");
				squarePatterns.add(ps11p);
				
				
				//// extra beat trammel
				

				lefty = "0,0.025,6.283185307179586,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et8 = new Pattern(lefty, righty, "Mirror 2bt Split-Time Trammel");
				extraBeatTrammelPatterns.add(et8);
				
				lefty = "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et9 = new Pattern(lefty, righty, "Mirror 2bt Same-Time Trammel");
				extraBeatTrammelPatterns.add(et9);
			
				lefty =  "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,";
				Pattern et10 = new Pattern(lefty, righty, "Parallel 2bt Same-Time Trammel");
				extraBeatTrammelPatterns.add(et10);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,";
				Pattern et11 = new Pattern(lefty, righty, "Parallel 2bt Split-Time Trammel");
				extraBeatTrammelPatterns.add(et11);
				
				
				lefty = "0,0.025,4.71238898038469,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,";
				Pattern et = new Pattern(lefty, righty, "Mirror 2bt Quarter-time Trammel"); 
				extraBeatTrammelPatterns.add(et);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,";
				Pattern et1 = new Pattern(lefty, righty, "Mirror 2bt Quarter-time Perpendicular Trammel");
				extraBeatTrammelPatterns.add(et1);
				
				lefty =  "0,0.025,3.141592653589793,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,";
				Pattern et2 = new Pattern(lefty, righty, "Parallel 2bt Quarter-time 1 Perpendicular Trammel");
				extraBeatTrammelPatterns.add(et2);
				
				lefty =  "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty =  "0,0.025,3.141592653589793,0,0.025,-3.141592653589793,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				Pattern et3 = new Pattern(lefty, righty, "Parallel 2bt Quarter-time Same Trammel");
				extraBeatTrammelPatterns.add(et3);
				
				
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et4 = new Pattern(lefty, righty, "Mirror 2bt Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et4);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et5 = new Pattern(lefty, righty, "Mirror 2bt Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et5);
			
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et6 = new Pattern(lefty, righty, "Parallel 2bt Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et6);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et7 = new Pattern(lefty, righty, "Parallel 2bt Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et7);
				
				
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et20 = new Pattern(lefty, righty, "Mirror 2bt Hybrid Split-Time Trammel");
				extraBeatTrammelPatterns.add(et20);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et21 = new Pattern(lefty, righty, "Mirror 2bt Hybrid Same-Time Trammel");
				extraBeatTrammelPatterns.add(et21);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et22 = new Pattern(lefty, righty, "Parallel 2bt Hybrid Split-Time Trammel");
				extraBeatTrammelPatterns.add(et22);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et23 = new Pattern(lefty, righty, "Parallel 2bt Hybrid Same-Time Trammel");
				extraBeatTrammelPatterns.add(et23);
				
				///

				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et26 = new Pattern(lefty, righty, "Mirror 2bt 1 Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et26);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et27 = new Pattern(lefty, righty, "Mirror 2bt 1 Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et27);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et28 = new Pattern(lefty, righty, "Parallel 2bt 1 Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et28);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0";
				Pattern et29 = new Pattern(lefty, righty, "Parallel 2bt 1 Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et29);
				
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et30 = new Pattern(lefty, righty, "Mirror 2bt Hybrid Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et30);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et31 = new Pattern(lefty, righty, "Mirror 2bt Hybrid Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et31);
			
				lefty = "0,0.025,1.5707963267948966,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et32 = new Pattern(lefty, righty, "Parallel 2bt Hybrid Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et32);
				
				lefty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et33 = new Pattern(lefty, righty, "Parallel 2bt Hybrid Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et33);
		
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et34 = new Pattern(lefty, righty, "Mirror 2bt Hybrid 1 Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et34);
				
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,-1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0,"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et35 = new Pattern(lefty, righty, "Mirror 2bt Hybrid 1 Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et35);
			
				lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et36 = new Pattern(lefty, righty, "Parallel 2bt Hybrid 1 Perpendicular Split-Time Trammel");
				extraBeatTrammelPatterns.add(et36);
				
				lefty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Line,2.0,0,250.0,0,345.0"; 
				righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,VerticalLine,2.0,0,250.0,0,345.0";
				Pattern et37 = new Pattern(lefty, righty, "Parallel 2bt Hybrid 1 Perpendicular Same-Time Trammel");
				extraBeatTrammelPatterns.add(et37);
				
				///// quarter square
				
//
				
		        lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern qps = new Pattern(lefty, righty, "Square Mirror Isolation Quarter-Time"); 
				quarterSquarePatterns.add(qps);
				
				lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern qps2 = new Pattern(lefty, righty, "Square Parallel Isolation Quarter-Time");
				quarterSquarePatterns.add(qps2);
				
				//// 
				
				lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern qps4 = new Pattern(lefty, righty, "Square Mirror Anti-Spin Quarter-Time"); 
				quarterSquarePatterns.add(qps4);
				
				lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern qps6 = new Pattern(lefty, righty, "Square Parallel Anti-Spin Quarter-Time");
				quarterSquarePatterns.add(qps6);

                // //
				
				lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern qps8 = new Pattern(lefty, righty, "Square Mirror Hybrid Quarter-Time"); 
				quarterSquarePatterns.add(qps8);
				
				lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern qps10 = new Pattern(lefty, righty, "Square Parallel Hybrid Quarter-Time");
				quarterSquarePatterns.add(qps10);
				
				////
				
				lefty = "0,0.025,10.2101761241668266,0,0.025,1.5707963267948966,1.0,-1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern qpsp = new Pattern(lefty, righty, "Square Perpendicular Mirror Isolation Quarter-Time"); 
				quarterSquarePatterns.add(qpsp);
						
				lefty =  "0,0.025,3.9269908169872414,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,5.497787143782138,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern qps2p = new Pattern(lefty, righty, "Square Perpendicular Parallel Isolation Quarter-Time");
				quarterSquarePatterns.add(qps2p);

				////
				
				lefty = "0,0.025,8.6393797973719311,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,2.356194490192345,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern qps4p = new Pattern(lefty, righty, "Square Perpendicular Mirror Anti-Spin Quarter-Time"); 
				quarterSquarePatterns.add(qps4p);
				
				lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,3.9269908169872414,0,0.025,4.71238898038469,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern qps6p = new Pattern(lefty, righty, "Square Perpendicular Parallel Anti-Spin Quarter-Time");
				quarterSquarePatterns.add(qps6p);
				
//              //
				
				lefty = "0,0.025,2.356194490192345,0,0.025,1.5707963267948966,1.0,1.0,-1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,-0.7853981633974483,0.0,"; 
				righty = "0,0.025,0.7853981633974483,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0,";
				Pattern qps8p = new Pattern(lefty, righty, "Square Perpendicular Mirror Hybrid Quarter-Time"); 
				quarterSquarePatterns.add(qps8p);
				
				lefty =  "0,0.025,2.356194490192345,0,0.025,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0"; 
				righty = "0,0.025,2.356194490192345,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,250.0,0,345.0,0.0,0.7853981633974483,0.0";
				Pattern qps10p = new Pattern(lefty, righty, "Square Perpendicular Parallel Hybrid Quarter-Time *");
				quarterSquarePatterns.add(qps10p);
				
				// TODO add more here
	
				generateSuperspinPatterns(basic12Patterns, superspinPatterns);
				
				generatePointHybridPerpPatterns(pointHybridPatterns, pointHybridPerpPatterns);
				//generatePointHybridPerpInsidePatterns(basic12Patterns, superspinPatterns);
				//generatePointHybridPerpOutsidePatterns(basic12Patterns, superspinPatterns);
				
				generateHalfCirclePatterns(basic12Patterns, halfCirclePatterns);
				
				generateDirChangePatterns(basic12Patterns, dirChangePatterns);
				generateDirChangeVerticalPatterns(basic12Patterns, dirChangeVerticalPatterns);
				//generateDirChangeHybridPatterns(basic12Patterns, dirChangePatterns);
				
				generatePausedHalfCirclePatterns(basic12Patterns, pausedCirclePatterns);
				generatePausedCirclePatterns(basic12Patterns, pausedHalfCirclePatterns);
				generatePausedQuarterPatterns(basic12Patterns, pausedQuartersPatterns);
				generateTranslatedCirclePatterns(basic12Patterns, translatedCirclesPatterns);
				generateTranslatedQuartersPatterns(basic12Patterns, translatedQuarterPatterns);
				generateThreeQuarterPatterns(basic12Patterns, threeQuarterPatterns);
				
				generateThreeQuarterHybridPatterns(basic12Patterns, threeQuarterHybridPatterns);
				
				generateUnderArmourHPatterns(basic12Patterns, underArmourHPatterns);
				//generateUnderArmourHPatterns(basic12Patterns, underArmourHPatterns);
				
				generateVerticalLinePatterns(basic12Patterns.subList(0, 4), verticalLinePatterns);
	}
	
	private static void generateSuperspinPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("1.0,9.0", "2.0,9.0");
			right = right.replace("1.0,9.0", "2.0,9.0");
			String name = "Super-Spin " + p.getName(); 
			
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateDirChangePatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText();
			
			// 0,0.025,
			//int indl = left.lastIndexOf(",345.0");
			//String l = left.substring(indl, indl + 3);
			//String turn = "" + (Double.parseDouble(l) + Math.PI);
			left = left.replace(",345.0", ",345.0," + Math.PI);
						
			right = right.replace(",345.0", ",345.0," + Math.PI);
			
			String name = "Direction Change " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateDirChangeVerticalPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText();

			left = left.replace(",345.0", ",345.0," + Math.PI + "," + (Math.PI/2));
						
			right = right.replace(",345.0", ",345.0," + Math.PI + "," + (Math.PI/2));
			
			String l = left.substring(8,left.lastIndexOf(",0,0.025"));
			String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
			left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
						
			String r = right.substring(8,right.lastIndexOf(",0,0.025"));
			String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
			right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
			
			
			String name = "Dir-Change Vertical " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateDirChangeHybridPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText();

			left = left.replace(",345.0", ",345.0," + Math.PI + "," + (Math.PI/2));
						
			right = right.replace(",345.0", ",345.0," + Math.PI);
			
			String l = left.substring(8,left.lastIndexOf(",0,0.025"));
			String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
			left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);

			
			String name = "Dir-Change Vertical " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateHalfCirclePatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "HalfCircleVerticalLeft");
			right = right.replace("Circle", "HalfCircleVerticalRight");
			String name = "Half-Circle " + p.getName(); 
			
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateVerticalLinePatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "VerticalLine");
			right = right.replace("Circle", "VerticalLine");
			String name = "Vertical " + p.getName(); 
			
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generatePausedHalfCirclePatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "PausedHalfCircle");
			right = right.replace("Circle", "PausedHalfCircle");
			String name = "Paused Half-Circle " + p.getName(); 
			
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateUnderArmourHPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "HUnderArmour");
			right = right.replace("Circle", "HUnderArmour");
			String name = "H Under-Armour " + p.getName(); 
			
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateThreeQuarterPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "QuartersByThree");
			right = right.replace("Circle", "QuartersByThree");
			
			String l = left.substring(8,left.lastIndexOf(",0,0.025"));
			String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
			left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
						
			String r = right.substring(8,right.lastIndexOf(",0,0.025"));
			String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
			right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
			
			
			String name = "Three-Quarter " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateThreeQuarterHybridPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "QuartersByThree");
			//right = right.replace("Circle", "QuartersByThree");
			
			String l = left.substring(8,left.lastIndexOf(",0,0.025"));
			String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
			left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
						
			//String r = right.substring(8,right.lastIndexOf(",0,0.025"));
			//String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
			//right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
			
			
			String name = "Three-Quarter Hybrid " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
		
		for(Iterator<Pattern> i = (input.subList(8, input.size())).iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			//left = left.replace("Circle", "QuartersByThree");
			right = right.replace("Circle", "QuartersByThree");
			
			//String l = left.substring(8,left.lastIndexOf(",0,0.025"));
			//String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
			//left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
						
			String r = right.substring(8,right.lastIndexOf(",0,0.025"));
			String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
			right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
			
			
			String name = "Three-Quarter Hybrid " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generatePausedQuarterPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "PausedQuarter");
			right = right.replace("Circle", "PausedQuarter");
			String name = "Paused-Quarter " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateTranslatedCirclePatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "TranslatedCircle");
			right = right.replace("Circle", "TranslatedCircle");
			
			String l = left.substring(8,left.lastIndexOf(",0,0.025"));
			String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
			left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
						
			String r = right.substring(8,right.lastIndexOf(",0,0.025"));
			String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
			right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
			
			
			String name = "Translated-Circle " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generateTranslatedQuartersPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "TranslatedQuarter");
			right = right.replace("Circle", "TranslatedQuarter");
			String name = "Translated-Quarter " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	
	private static void generatePausedCirclePatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText(); 
			left = left.replace("Circle", "PausedCircle");
			right = right.replace("Circle", "PausedCircle");
			String name = "Paused-Circle " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}
	

	
	private static void generatePointHybridPerpPatterns(List<Pattern> input, List<Pattern> output){
		for(Iterator<Pattern> i = input.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			String left = p.getLeftText();
			String right = p.getRightText();
			
			// 0,0.025,
			String l = left.substring(8,left.lastIndexOf(",0,0.025"));
			String turn = "" + (Double.parseDouble(l) + 1.5707963267948966);
			left = "0,0.025," + (left.substring(8, left.length())).replaceFirst(l, turn);
						
			String r = right.substring(8,right.lastIndexOf(",0,0.025"));
			String turnr = "" + (Double.parseDouble(r) + 1.5707963267948966);
			right = "0,0.025," + (right.substring(8, right.length())).replaceFirst(r, turnr);
			
			String name = "Perpendicular " + p.getName(); 
			
			output.add(new Pattern(left, right, name));
		}
	}

	public static Pattern getPattern(String name) {
		for(Iterator<Pattern> i = basicPatterns.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			if(p.getName().equalsIgnoreCase(name)) return p; 
		}
		return null; 
	}
	
	public static Pattern getPattern(int name) {
		return basicPatterns.get(name); 
	}
	
	public static Pattern getUserPattern(String name) {
		for(Iterator<Pattern> i = userPatterns.iterator(); i.hasNext(); ){
			Pattern p = (Pattern) i.next(); 
			if(p.getName().equalsIgnoreCase(name)) return p; 
		}
		return null; 
	}
	
	public static void setPatternIn(int i, PropControl left, PropControl right) {
		Pattern p = (Pattern)basicPatterns.get(i);
		setPatternIn(p, left, right);
		
	}
	
	public static void setPatternIn(int i, List<PropControl> controls) {
		for(Iterator<PropControl> it = controls.iterator(); it.hasNext(); ) {
			PropControl left = (PropControl)it.next(); 
			PropControl right = (PropControl)it.next(); 
			setPatternIn(i, left, right); 
		}
	}
	
	public static void setPatternIn(String patternLeft, String patternRight, List<PropControl> controls) {
		for(Iterator<PropControl> it = controls.iterator(); it.hasNext(); ) {
			PropControl left = (PropControl)it.next(); 
			PropControl right = (PropControl)it.next(); 
			setPatternIn(patternLeft, patternRight, left, right); 
		}
	}
	
	public static void setPatternIn(String patternLeft, String patternRight, PropControl left, PropControl right) {
		left.parseStaffText(patternLeft);
		right.parseStaffText(patternRight);
		left.updateControlState();
		right.updateControlState();
	}
	
	public static void setPatternIn(Pattern pattern, PropControl left, PropControl right) {
		left.parseStaffText(pattern.getLeftText());
		right.parseStaffText(pattern.getRightText());
		left.updateControlState();
		right.updateControlState();
	}
	 
	public static void setPatternIn(Pattern pattern, List<PropControl> controls) {
		for(Iterator<PropControl> it = controls.iterator(); it.hasNext(); ) {
			PropControl left = (PropControl)it.next(); 
			PropControl right = (PropControl)it.next(); 
			setPatternIn(pattern, left, right); 
		}
	}
	

	public static void saveAllPatterns(List<Pattern> patterns, String fileName) {
		File file = new File("./" + fileName + ".txt");
		if(file.exists()) file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Pattern pattern : patterns) {
			saveOnePattern(pattern, file); 
		}
	}
	
	public static void saveOnePattern(Pattern one, File file) {
		final String left1 = one.leftText; 
		final String right1 = one.rightText;
		
		try {
			FileWriter fw = new FileWriter( file, true );
			fw.write("\n\n" + "name:" + one.name + "\n");
			fw.write("left:" + left1 + "\n");
			fw.write("right:" + right1 + "\n");
			fw.flush(); 
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
