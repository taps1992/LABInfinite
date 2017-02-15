package LAB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import LAB.meta.Pattern;
import LAB.meta.Patterns;

public class LABMenuBarPatterns {
	public LABInfinite lab;
	public LABCanvas canvas;

	public LABMenuBarPatterns(LABInfinite lab,  LABCanvas canvas) {
		this.lab = lab;
		this.canvas = canvas; 
	}
	
	JMenu createPresetsMenu() {
		JMenu presets = new JMenu("Presets"); 
		 
		JMenu basics = new JMenu("Basics"); 
		JMenu shapes = new JMenu("Complex"); 
		JMenu isolation = new JMenu("Isolation"); 
		JMenu antispin = new JMenu("Anti-Spin"); 
		JMenu hybrids = new JMenu("Hybrids"); 
		JMenu quartertime = new JMenu("Quarter-Time");
		JMenu trammel = new JMenu("Trammel");
		JMenu trammelS = new JMenu("Trammel Staggered");
		
		basics.add(isolation); 
		basics.add(antispin); 
		basics.add(hybrids);
		basics.add(createPointBasicsMenu());
		basics.add(createHalfCircleMenu());
		basics.add(createDirChangeMenu());
		basics.add(createMenu("Dir-Change - Vertical", Patterns.dirChangeVerticalPatterns));
		
		shapes.add(createMenu("Paused 1/2&1/2 Circle", Patterns.pausedCirclePatterns));
		shapes.add(createMenu("Paused Half Circle", Patterns.pausedHalfCirclePatterns));
		shapes.add(createMenu("Paused Quarter Circle", Patterns.pausedQuartersPatterns));
		shapes.add(createMenu("Translated Circle", Patterns.translatedCirclesPatterns));
		shapes.add(createMenu("Translated Quarters", Patterns.translatedQuarterPatterns));
		shapes.add(createMenu("Three Quarters", Patterns.threeQuarterPatterns));
		shapes.add(createMenu("3/4 Hybrids", Patterns.threeQuarterHybridPatterns));
		shapes.add(createMenu("Circle H", Patterns.underArmourHPatterns));
		
		presets.add(basics);
		presets.add(new JSeparator());
		presets.add(shapes);
		presets.add(new JSeparator());
		presets.add(trammel); 
		presets.add(new JSeparator());
		presets.add(quartertime); 
		presets.add(new JSeparator());
		presets.add(createExtraBeatsMenu());
		presets.add(new JSeparator());
		presets.add(createPerpendicularMenu()); 
		presets.add(new JSeparator());
		presets.add(createPointHybridMenu()); 
		presets.add(new JSeparator());
		presets.add(createSquareMenu()); 
		presets.add(new JSeparator());
		presets.add(createMegsMenu());
		presets.add(new JSeparator());
		presets.add(createDalesMenu());
		
		JMenuItem BFlyAntiSpinSide = new JMenuItem("Mirror Anti-Spin Split-Time");
		JMenuItem BFlyAntiSpinDown = new JMenuItem("Mirror Anti-Spin Same-Time");
		JMenuItem ParAntiSpinSide = new JMenuItem("Parallel Anti-Spin Split-Time");
		JMenuItem ParAntiSpinDown = new JMenuItem("Parallel Anti-Spin Same-Time");
		
		JMenuItem MirrorHybridSplit = new JMenuItem("Mirror Hybrid Split-Time");
		JMenuItem MirrorHybridSame = new JMenuItem("Mirror Hybrid Same-Time");
		JMenuItem ParHybridSplit = new JMenuItem("Parallel Hybrid Split-Time");
		JMenuItem ParHybridSame = new JMenuItem("Parallel Hybrid Same-Time");
		
		
		antispin.add(BFlyAntiSpinSide); 
		antispin.add(BFlyAntiSpinDown);
		antispin.add(ParAntiSpinSide); 
		antispin.add(ParAntiSpinDown);
		
		hybrids.add(MirrorHybridSplit);
		hybrids.add(MirrorHybridSame);
		hybrids.add(ParHybridSplit);
		hybrids.add(ParHybridSame);
		
		BFlyAntiSpinSide.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(4, lab.controls);
		} } );
		
		BFlyAntiSpinDown.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(5, lab.controls);
		} } );
		
		ParAntiSpinSide.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(6, lab.controls);
		} } );
		
		ParAntiSpinDown.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(7, lab.controls);
		} } );
		
		
		
		MirrorHybridSplit.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(8, lab.controls);
		} } );
		
		MirrorHybridSame.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(9, lab.controls);
		} } );
		
		ParHybridSplit.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(10, lab.controls);
		} } );
		
		ParHybridSame.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(11, lab.controls);
		} } );
		
		JMenuItem MirrorIsoSame = new JMenuItem("Mirror Isolation Split-Time");
		JMenuItem MirrorIsoSplit = new JMenuItem("Mirror Isolation Same-Time");
		JMenuItem ParIsoSame = new JMenuItem("Parallel Isolation Split-Time");
		JMenuItem ParIsoSplit = new JMenuItem("Parallel Isolation Same-Time");
		
		MirrorIsoSplit.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(0, lab.controls);
		} } );
		
		MirrorIsoSame.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(1, lab.controls);
		} } );
		
		ParIsoSplit.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(2, lab.controls);
		} } );
		
		ParIsoSame.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(3, lab.controls);
		} } );
		
		
		// trammel
		
		JMenuItem MirrorIsoSameTrammel = new JMenuItem("Mirror Split-Time Trammel");
		JMenuItem MirrorIsoSplitTrammel = new JMenuItem("Mirror Same-Time Trammel");
		JMenuItem ParIsoSameTrammel = new JMenuItem("Parallel Split-Time Trammel");
		JMenuItem ParIsoSplitTrammel = new JMenuItem("Parallel Same-Time Trammel");
		
		MirrorIsoSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(33, lab.controls);
		} } );
		
		MirrorIsoSameTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(34, lab.controls);
		} } );
		
		ParIsoSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(35, lab.controls);
		} } );
		
		ParIsoSameTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(36, lab.controls);
		} } );
		
		JMenuItem BFlyAntiSpinSideTrammel = new JMenuItem("Mirror Quarter-time Same Trammel");
		JMenuItem BFlyAntiSpinDownTrammel = new JMenuItem("Mirror Perpendicular Same Trammel");
		JMenuItem ParAntiSpinSideTrammel = new JMenuItem("Parallel 2 Perpendicular Split Trammel");
		JMenuItem ParAntiSpinDownTrammel = new JMenuItem("Parallel Quarter-time Split Trammel");
		
		JMenuItem MirrorHybridSplitTrammel = new JMenuItem("Mirror Perpendicular Split-Time Trammel");
		JMenuItem MirrorHybridSameTrammel = new JMenuItem("Mirror Perpendicular Same-Time Trammel");
		JMenuItem ParHybridSplitTrammel = new JMenuItem("Parallel Perpendicular Same-Time Trammel");
		JMenuItem ParHybridSameTrammel = new JMenuItem("Parallel Perpendicular Split-Time Trammel");
		
		
		JMenuItem MirrorPerpSplitTrammel = new JMenuItem("Mirror 1 Perpendicular Split-Time Trammel");
		JMenuItem MirrorPerpSameTrammel = new JMenuItem("Mirror 1 Perpendicular Same-Time Trammel");
		JMenuItem ParPerpSplitTrammel = new JMenuItem("Parallel 1 Perpendicular Same-Time Trammel");
		JMenuItem ParPerpSameTrammel = new JMenuItem("Parallel 1 Perpendicular Split-Time Trammel");
		
		
		BFlyAntiSpinSideTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(37, lab.controls);
		} } );
		
		BFlyAntiSpinDownTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(38, lab.controls);
		} } );
		
		ParAntiSpinSideTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(39, lab.controls);
		} } );
		
		ParAntiSpinDownTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(40, lab.controls);
		} } );
		
		
		
		MirrorHybridSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(41, lab.controls);
		} } );
		
		MirrorHybridSameTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(42, lab.controls);
		} } );
		
		ParHybridSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(43, lab.controls);
		} } );
		
		ParHybridSameTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(44, lab.controls);
		} } );
		
		
		JMenuItem MirrorHybrid1SplitTrammel = new JMenuItem("Mirror Hybrid Split-Time Trammel");
		JMenuItem ParHybrid1SplitTrammel = new JMenuItem("Parallel Hybrid Same-Time Trammel");
		
		MirrorHybrid1SplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(45, lab.controls);
		} } );
		
		ParHybrid1SplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(47, lab.controls);
		} } );
		
		
		
		MirrorPerpSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(51, lab.controls);
		} } );
		
		MirrorPerpSameTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(52, lab.controls);
		} } );
		
		ParPerpSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(53, lab.controls);
		} } );
		
		ParPerpSameTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(54, lab.controls);
		} } );
		
		
		JMenuItem MirrorHybridPerpSplitTrammel = new JMenuItem("Mirror Hybrid Perpendicular Split-Time Trammel");
		JMenuItem ParHybridPerpSplitTrammel = new JMenuItem("Parallel Hybrid Perpendicular Same-Time Trammel");
		
		MirrorHybridPerpSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(55, lab.controls);
		} } );
		
		ParHybridPerpSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(57, lab.controls);
		} } );
		
		
		
		JMenuItem MirrorHybrid1PerpSplitTrammel = new JMenuItem("Mirror Hybrid 1 Perpendicular Split-Time Trammel");
		JMenuItem ParHybrid1PerpSplitTrammel = new JMenuItem("Parallel Hybrid 1 Perpendicular Same-Time Trammel");
		
		MirrorHybrid1PerpSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(59, lab.controls);
		} } );
		
		ParHybrid1PerpSplitTrammel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(61, lab.controls);
		} } );
		
		trammel.add(trammelS); 
		trammel.add(createMenu("Vertical Trammel", Patterns.verticalLinePatterns));
		trammel.add(createExtraBeatTrammelMenu());
		trammel.add(new JSeparator());
		trammel.add(MirrorIsoSameTrammel);
		trammel.add(MirrorIsoSplitTrammel);
		trammel.add(ParIsoSameTrammel); 
		trammel.add(ParIsoSplitTrammel);
		trammel.add(new JSeparator());
		
		trammel.add(MirrorHybridSplitTrammel);
		trammel.add(MirrorHybridSameTrammel);
		trammel.add(ParHybridSplitTrammel);
		trammel.add(ParHybridSameTrammel);
		trammel.add(new JSeparator());
		
		trammel.add(MirrorPerpSplitTrammel);
		trammel.add(MirrorPerpSameTrammel);
		trammel.add(ParPerpSplitTrammel);
		trammel.add(ParPerpSameTrammel);
		
		trammel.add(new JSeparator());
		
		trammel.add(MirrorHybrid1SplitTrammel);
		trammel.add(ParHybrid1SplitTrammel);

        trammel.add(new JSeparator());
		
		trammel.add(MirrorHybridPerpSplitTrammel);
	    trammel.add(ParHybridPerpSplitTrammel);
	    
        trammel.add(new JSeparator());
		
		trammel.add(MirrorHybrid1PerpSplitTrammel);
		trammel.add(ParHybrid1PerpSplitTrammel);

		
		// trammel staggered time. 
		
		JMenuItem MirrorIsoSameTrammelS = new JMenuItem("Mirror 1 Perpendicular Staggered Trammel");
		JMenuItem ParIsoSameTrammelS = new JMenuItem("Parallel 1 Perpendicular Staggered Trammel");
		
		
		MirrorIsoSameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(64, lab.controls);
		} } );
		
		ParIsoSameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(66, lab.controls);
		} } );
		
		JMenuItem MirrorHybridSplitTrammelS = new JMenuItem("Mirror Perpendicular Staggered Trammel");
		JMenuItem ParHybridSplitTrammelS = new JMenuItem("Parallel Perpendicular Staggered Trammel");

		
		MirrorHybridSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(67, lab.controls);
		} } );
		
		
		ParHybridSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(69, lab.controls);
		} } );

		
		JMenuItem MirrorHybrid1SplitTrammelS = new JMenuItem("Mirror Hybrid 1 Perpendicular Split-Time Trammel *");
		JMenuItem MirrorHybrid1SameTrammelS = new JMenuItem("Mirror Hybrid 1 Perpendicular Same-Time Trammel *");
		JMenuItem ParHybrid1SplitTrammelS = new JMenuItem("Parallel Hybrid 1 Perpendicular Same-Time Trammel");
		JMenuItem ParHybrid1SameTrammelS = new JMenuItem("Parallel Hybrid 1 Perpendicular Split-Time Trammel *");
		
		MirrorHybrid1SplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(71, lab.controls);
		} } );
		
		MirrorHybrid1SameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(72, lab.controls);
		} } );
		
		ParHybrid1SplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(73, lab.controls);
		} } );
		
		ParHybrid1SameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(74, lab.controls);
		} } );
		
		
		JMenuItem MirrorPerpSplitTrammelS = new JMenuItem("Mirror Staggered Trammel");
		JMenuItem ParPerpSplitTrammelS = new JMenuItem("Parallel Staggered Trammel");
		
		MirrorPerpSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(75, lab.controls);
		} } );
		
		ParPerpSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(77, lab.controls);
		} } );
		
		
		JMenuItem MirrorHybridPerpSplitTrammelS = new JMenuItem("Mirror Hybrid Perpendicular Split-Time Trammel *");
		JMenuItem MirrorHybridPerpSameTrammelS = new JMenuItem("Mirror Hybrid Perpendicular Same-Time Trammel *");
		JMenuItem ParHybridPerpSplitTrammelS = new JMenuItem("Parallel Hybrid Perpendicular Same-Time Trammel");
		JMenuItem ParHybridPerpSameTrammelS = new JMenuItem("Parallel Hybrid Perpendicular Split-Time Trammel *");
		
		MirrorHybridPerpSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(79, lab.controls);
		} } );
		
		MirrorHybridPerpSameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(80, lab.controls);
		} } );
		
		ParHybridPerpSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(81, lab.controls);
		} } );
		
		ParHybridPerpSameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(82, lab.controls);
		} } );
		
		
		JMenuItem MirrorHybrid1PerpSplitTrammelS = new JMenuItem("Mirror Hybrid Split-Time Trammel *");
		JMenuItem MirrorHybrid1PerpSameTrammelS = new JMenuItem("Mirror Hybrid Same-Time Trammel *");
		JMenuItem ParHybrid1PerpSplitTrammelS = new JMenuItem("Parallel Hybrid Same-Time Trammel");
		JMenuItem ParHybrid1PerpSameTrammelS = new JMenuItem("Parallel Hybrid Split-Time Trammel *");
		
		MirrorHybrid1PerpSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(83, lab.controls);
		} } );
		
		MirrorHybrid1PerpSameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(84, lab.controls);
		} } );
		
		ParHybrid1PerpSplitTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(85, lab.controls);
		} } );
		
		ParHybrid1PerpSameTrammelS.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(86, lab.controls);
		} } );
		
		
		trammelS.add(MirrorIsoSameTrammelS);
		trammelS.add(ParIsoSameTrammelS); 
		
		trammelS.add(new JSeparator());
		
		trammelS.add(MirrorHybridSplitTrammelS);
		trammelS.add(ParHybridSplitTrammelS);
		
		trammelS.add(new JSeparator());
		
		trammelS.add(MirrorPerpSplitTrammelS);
		trammelS.add(ParPerpSplitTrammelS);
		
		trammelS.add(new JSeparator());
		
		trammelS.add(MirrorHybrid1SplitTrammelS);
		trammelS.add(MirrorHybrid1SameTrammelS);
		trammelS.add(ParHybrid1SplitTrammelS);
		trammelS.add(ParHybrid1SameTrammelS);
		
        trammelS.add(new JSeparator());
		
		trammelS.add(MirrorHybridPerpSplitTrammelS);
		trammelS.add(MirrorHybridPerpSameTrammelS);
		trammelS.add(ParHybridPerpSplitTrammelS);
		trammelS.add(ParHybridPerpSameTrammelS);
		
        trammelS.add(new JSeparator());
		
		trammelS.add(MirrorHybrid1PerpSplitTrammelS);
		trammelS.add(MirrorHybrid1PerpSameTrammelS);
		trammelS.add(ParHybrid1PerpSplitTrammelS);
		trammelS.add(ParHybrid1PerpSameTrammelS);
		
		
		// quartertime
		
		JMenuItem QuarterMirrorIso = new JMenuItem("Quarter-Time Crossing (Mirror) Isolation");
		JMenuItem QuarterParIso = new JMenuItem("Quarter-Time Follow (Parallel) Isolation");
		JMenuItem QuarterMirrorAnti = new JMenuItem("Quarter-Time Crossing (Mirror) Anti-Spin");
		JMenuItem QuarterParAnti = new JMenuItem("Quarter-Time Follow (Parallel) Anti-Spin");
		JMenuItem QuarterMirrorHybrid = new JMenuItem("Quarter-Time Crossing (Mirror) Hybrid");
		JMenuItem QuarterParHybrid = new JMenuItem("Quarter-Time Follow (Parallel) Hybrid");
		
		
		isolation.add(MirrorIsoSame); 
		isolation.add(MirrorIsoSplit);
		isolation.add(ParIsoSame); 
		isolation.add(ParIsoSplit);
		
		quartertime.add(QuarterMirrorIso); 
		quartertime.add(QuarterParIso);
		quartertime.add(QuarterMirrorAnti); 
		quartertime.add(QuarterParAnti);
		quartertime.add(QuarterMirrorHybrid); 
		quartertime.add(QuarterParHybrid);
		
		QuarterMirrorIso.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(12, lab.controls);
		} } );
		
		QuarterParIso.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(13, lab.controls);
		} } );
		
		QuarterMirrorAnti.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(14, lab.controls);
		} } );
		
		QuarterParAnti.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(15, lab.controls);
		} } );

		QuarterMirrorHybrid.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(16, lab.controls);
		} } );

		QuarterParHybrid.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.setPatternIn(17, lab.controls);
		} } );
		
		presets.add(new JSeparator()); 
		presets.add(createStartingPositionMenu()); 
		
		return presets;
	}
	
	private JMenu createPointHybridPerpMenu() {
		JMenu perpendicular = new JMenu("Point Hybrid Perpendicular"); 
		
		List<Pattern> starts = Patterns.pointHybridPerpPatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createStartingPositionMenu() {
		JMenu positions = new JMenu("Starting Positions"); 
		
		List<Pattern> starts = Patterns.startingPositions; 
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			positions.add(item);
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
		}
		
		return positions; 
	}
	
	private JMenu createPerpendicularMenu() {
		JMenu perpendicular = new JMenu("Perpendicular"); 
		
		List<Pattern> starts = Patterns.perpendicularPatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createPointHybridMenu() {
		JMenu perpendicular = new JMenu("Point Hybrids"); 
		perpendicular.add(createPointHybridPerpMenu());
		perpendicular.add(new JSeparator());
		
		List<Pattern> starts = Patterns.pointHybridPatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createSquareMenu() {
		JMenu perpendicular = new JMenu("Square / Boxes"); 
		perpendicular.add(createQuarterSquareMenu());
		perpendicular.add(new JSeparator());
		
		List<Pattern> starts = Patterns.squarePatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createHalfCircleMenu() {
		JMenu perpendicular = new JMenu("Half-Circle"); 
		
		List<Pattern> starts = Patterns.halfCirclePatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createQuarterSquareMenu() {
		JMenu perpendicular = new JMenu("Quarter-Time Boxes"); 
		
		List<Pattern> starts = Patterns.quarterSquarePatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 2) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createExtraBeatTrammelMenu() {
		JMenu perpendicular = new JMenu("Extra Beat Trammel"); 
		
		List<Pattern> starts = Patterns.extraBeatTrammelPatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createMenu(String menuName, List<Pattern> starts) {
		JMenu perpendicular = new JMenu(menuName); 
		
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createDirChangeMenu() {
		JMenu perpendicular = new JMenu("Direction Change"); 
		
		List<Pattern> starts = Patterns.dirChangePatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createSuperspinMenu() {
		JMenu perpendicular = new JMenu("Super-Spin"); 
		
		List<Pattern> starts = Patterns.superspinPatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createPointBasicsMenu() {
		JMenu perpendicular = new JMenu("Point Spins"); 
		
		List<Pattern> starts = Patterns.pointPatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			perpendicular.add(item);
			if((count % 4) == 0) perpendicular.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	/// TODO add here
	
	private JMenu createExtraBeatsMenu() {
		JMenu perpendicular = new JMenu("Extra Beats"); 
		
		JMenu one = new JMenu("1 Extra Beat"); 
		JMenu two = new JMenu("2 Extra Beats"); 
		JMenu three = new JMenu("3 Extra Beats"); 
		JMenu four = new JMenu("4 Extra Beats"); 
		
		perpendicular.add(createSuperspinMenu());
		perpendicular.add(one);
		perpendicular.add(two);
		perpendicular.add(three);
		perpendicular.add(four);
		
		List<Pattern> starts = Patterns.extraBeatPatterns; 
		int count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			one.add(item);
			if((count % 4) == 0) one.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		starts = Patterns.extraBeat2Patterns; 
		count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			two.add(item);
			if((count % 4) == 0) two.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		starts = Patterns.extraBeat3Patterns; 
		count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			three.add(item);
			if((count % 4) == 0) three.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		starts = Patterns.extraBeat4Patterns; 
		count = 1;
		
		for(final Pattern p : starts) {
			JMenuItem item = new JMenuItem(p.getName());
			
			four.add(item);
			if((count % 4) == 0) four.add(new JSeparator());  
			
			item.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
				Patterns.setPatternIn(p, lab.controls);
			} } );
			count++;
		}
		
		return perpendicular; 
	}
	
	private JMenu createMegsMenu() {
		JMenu megs = new JMenu("MCP's Faves");
		
		JMenuItem meg1 = new JMenuItem("PingPong");
		JMenuItem meg2 = new JMenuItem("MCP");
		JMenuItem meg3 = new JMenuItem("Megatron");
		JMenuItem meg4 = new JMenuItem("Moisty");
		
		JMenuItem pingpong = new JMenuItem("PingPong");
		JMenuItem wideboxes = new JMenuItem("Wideboxes");
		
		
		megs.add(pingpong);
		megs.add(wideboxes);
		megs.add(meg2);
		megs.add(meg3);
		megs.add(meg4);
		
		
		
		pingpong.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,1.5707963267948966,0,0.025132741228718346,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,PingPong,1.0,0,248.0,0,350.0,6.283185307179586,4.71238898038469,0.0,0.0,0.0,true,2"; 
			String righty = "0,0.025132741228718346,1.5707963267948966,0,0.025132741228718346,3.141592653589793,1.0,-1.0,1.0,1.0,9.0,205.0,PingPong,1.0,0,248.0,0,350.0,6.283185307179586,1.5707963267948966,0.0,0.0,0.0,true,2";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		wideboxes.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025,1.5707963267948966,0,0.025,1.5707963267948966,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,350.0,0,248.0,0.0,1.5707963267948966,0.0,0.0,0.0,false,0,"; 
			String righty = "0,0.025,4.71238898038469,0,0.025,4.71238898038469,1.0,1.0,1.0,1.0,9.0,205.0,Hypocycloid,1.0,0,146.0,0,248.0,0.0,1.5707963267948966,0.0,0.0,0.0,false,0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0"; 
			String righty = "0,0.025,0.0,0,0.025,1.5707963267948966,1.0,-1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,250.0,0,345.0";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.0,0.0,0,0.025,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,250.0,0,345.0"; 
			String righty = "0,0.025,1.5707963267948966,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,VerticalLine,1.0,0,250.0,0,345.0";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025,0.0,0,0.025,0.0,1.0,-1.0,1.0,1.0,9.0,205.0,FigureOfEight,1.0,0,248.0,0,350.0,6.283185307179586"; 
			String righty = "0,0.025,0.0,0,0.025,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,FigureOfEight,1.0,0,248.0,0,350.0,6.283185307179586";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025,0.0,0,0.025,6.283185307179586,1.0,-1.0,1.0,1.0,9.0,205.0,HalfCircleVerticalRight,1.0,0,248.0,0,350.0,3.141592653589793,0.0"; 
			String righty = "0,0.025,0.0,0,0.025,0.0,1.0,1.0,1.0,1.0,9.0,205.0,HalfCircleVerticalLeft,1.0,0,248.0,0,350.0,3.141592653589793,0.0";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		return megs;
	}

	private JMenu createDalesMenu() {
		JMenu megs = new JMenu("Dales Discoveries");
		
		JMenuItem meg1 = new JMenuItem("D1 - Mirror Hybrid Trammel Hand-Isolation");
		JMenuItem meg2 = new JMenuItem("D2 - Parallel Hybrid Trammel Hand-Isolation");
		JMenuItem meg3 = new JMenuItem("D3 - Mirror Anti-Spin Vertical Trammel");
		JMenuItem meg4 = new JMenuItem("D4 - Expanded Trammel Up-Down Mirror Anti-Spin");
		JMenuItem meg5 = new JMenuItem("D5 - D1 Expanded Vertically");
		JMenuItem meg6 = new JMenuItem("D6 - Circular Mirror Isolation");
		JMenuItem meg7 = new JMenuItem("D7 - Expanded Parallel Hybrid");
		JMenuItem meg8 = new JMenuItem("D8 - Compressed Parallel Hybrid");
		JMenuItem meg9 = new JMenuItem("D9 - Spin / Trammel Parallel Hybrid");
		
		megs.add(meg1);
		megs.add(meg2);
		megs.add(meg3);
		megs.add(meg4);
		megs.add(meg5);
		megs.add(meg6);
		megs.add(meg7);
		megs.add(meg8);
		megs.add(meg9);
		
		meg1.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,-17.278759594743867,1.0,-1.0,-1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,0.0,0.0,"; 
			String righty = "0,0.025132741228718346,1.5707963267948966,0,0.025132741228718346,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg2.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,-17.278759594743867,1.0,1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,0.0,0.0,"; 
			String righty = "0,0.025132741228718346,1.5707963267948966,0,0.025132741228718346,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg3.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,-12.566370614359178,1.0,-1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,"; 
			String righty = "0,0.025132741228718346,1.5707963267948966,0,0.025132741228718346,3.141592653589793,1.0,1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg4.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,-12.566370614359178,2.0,-1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,"; 
			String righty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,0.0,2.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		meg5.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,-12.566370614359178,2.0,-1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,"; 
			String righty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,0.0,1.0,1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		meg6.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,-12.566370614359178,2.0,-1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,"; 
			String righty = "0,0.025132741228718346,7.853981633974483,0,0.025132741228718346,6.283185307179586,2.0,1.0,1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		meg7.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,4.71238898038469,0,0.025132741228718346,-12.566370614359178,2.0,-1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,"; 
			String righty = "0,0.025132741228718346,7.853981633974483,0,0.025132741228718346,3.141592653589793,2.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		meg8.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,6.283185307179586,0,0.025132741228718346,-12.566370614359178,1.0,-1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,0.0,0.0"; 
			String righty = "0,0.025132741228718346,9.42477796076938,0,0.025132741228718346,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		meg9.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			String lefty = "0,0.025132741228718346,6.283185307179586,0,0.025132741228718346,-12.566370614359178,2.0,-1.0,1.0,1.0,9.0,205.0,HorizontalLine,1.0,0,248.0,0,350.0,0.0,0.0,0.0,"; 
			String righty = "0,0.025132741228718346,9.42477796076938,0,0.025132741228718346,3.141592653589793,0.0,-1.0,-1.0,1.0,9.0,205.0,Circle,1.0,0,248.0,0,350.0,0.0,1.5707963267948966,0.0,";
			
			Patterns.setPatternIn(lefty, righty, lab.controls); 
		} } );
		
		return megs;
	}
}