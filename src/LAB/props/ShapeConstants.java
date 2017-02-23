package LAB.props;

import java.util.ArrayList;
import java.util.List;

import LAB.directionchanges.positions.*;
import LAB.shapes.*;

public interface ShapeConstants {
	
	public static final Shape CIRCLE = new Circle();
	public static final Shape OVAL = new Oval();
	public static final Shape SQUARE = new Square();
	
	public static final Shape VERTICAL_LINE = new Line((Math.PI / 2));  
	public static final Shape HORIZONTAL_LINE = new Line();
	public static final Shape PAUSED_VERTICAL_LINE = new LinePoints((Math.PI / 2));  
	public static final Shape PAUSED_HORIZONTAL_LINE = new LinePoints();
	
	public static final Shape H_LINE = new HLine();
	public static final Shape H_UNDERARMOUR = new HUnderArmour();
	
	public static final Shape PAUSED_CIRCLE = new PausedCircle();
	public static final Shape PAUSED_ONE_CIRCLE = new PauseOneCircle();
	public static final Shape PAUSED_HALF_CIRCLE = new PausedHalfCircle();
	public static final Shape PAUSED_QUARTER = new PausedQuarters();
	
	public static final Shape PAUSED_FOUR_ISOPOP = new PausedFourIsoPOP();
	public static final Shape PAUSED_TWO_ISOPOP = new PausedTwoIsoPOP();
	public static final Shape PAUSED_ONE_ISOPOP = new PausedOneIsoPOP();
	
	public static final Shape DIAGONAL_LINE_45_RIGHT = new Line((Math.PI / 4));  
	public static final Shape DIAGONAL_LINE_45_LEFT = new Line((Math.PI + (Math.PI / 4))); 
	public static final Shape HYPOCYLCOID = new Hypocycloid();
	public static final Shape HYPOCYLCOID_45 = new Hypocycloid((Math.PI / 4)); 
	public static final Shape HYPOCYLCOID_FAKE = new HypocycloidFake();
	
	public static final Shape HALF_CIRCLE_HORIZONTAL_TOP = new HalfCircleHorizontalTop();
	public static final Shape HALF_CIRCLE_HORIZONTAL_BOTTOM = new HalfCircleHorizontalBottom();
	public static final Shape HALF_CIRCLE_VERTICAL_LEFT = new HalfCircleVerticalLeft();
	public static final Shape HALF_CIRCLE_VERTICAL_RIGHT = new HalfCircleVerticalRight();
	
	public static final Shape QUARTERS_TOP_LEFT = new QuarterCircleTopLeft();
	public static final Shape QUARTERS_TOP_RIGHT = new QuarterCircleTopRight();
	public static final Shape QUARTERS_BOTTOM_LEFT = new QuarterCircleBottomLeft();
	public static final Shape QUARTERS_BOTTOM_RIGHT = new QuarterCircleBottomRight();
	
	public static final Shape THREE_BY_QUARTERS = new QuartersByThree();
	public static final Shape QUARTERS_DOUBLE = new QuartersDouble();
	public static final Shape STEPPED_CIRCLE = new PausedCircle();
	
	public static final Shape TRANSLATED_CIRCLE = new TranslatedCircle();
	public static final Shape TRANSLATED_QUARTER = new TranslatedQuarters();
	
	public static final Shape REAL_HYPOCYCLOID = new Hypocycloid();
	public static final Shape HYPOCYCLOID = new HypocycloidFake();
	
	public static final Shape FIGURE_OF_EIGHT = new FigureOfEight();
	public static final Shape FIGURE_OF_EIGHT_VERTICAL = new FigureOfEight((Math.PI / 2)); 
	public static final Shape DIR_CHANGE_FIGURE_OF_EIGHT = new FigureOfEightDirChange(); 
	public static final Shape FIGURE_SQUARE = new FigureSquare(); 
	public static final Shape FIGURE_SQUARE_REVERSE = new FigureSquareReverse();
	public static final Shape DIR_CHANGE_FIGURE_SQUARE = new FigureSquareDirChange(); 
	public static final Shape FIGURE_SQUARE_SHORT = new FigureSquareShort(); 
	
	public static final Shape FIGURE_OF_EIGHT_BOX = new BoxFigureOfEight();
	public static final Shape FIGURE_OF_EIGHT_FAKE_BOX = new BoxFakeFigureOfEight();
	public static final Shape FIGURE_SQUARE_BOX = new BoxFigureSquare();
	
	public static final Shape LISSAJOUS_FIGURE = new LissajousCurve();
	public static final Shape LISSAJOUS_FIGURE_HORIZONTAL = new LissajousCurve((Math.PI / 2));   
	
	public static final Position GRID_SWAP_EW = new GridSwapEastWest();
	public static final Position GRID_SWAP_NS = new GridSwapNorthSouth();
	public static final Position GRID_SWAP_SQUARE = new GridSwapSquare();
	
	public static final Shape PINGPONG = new PingPong();
	
	public static final double DOUBLE_CHANGE = Math.PI * 4;
	public static final double FULL_CHANGE = Math.PI * 2;
	public static final double THREE_QUARTER_CHANGE = Math.PI + (Math.PI / 2);
	public static final double HALF_CHANGE = Math.PI;
	public static final double QUARTER_CHANGE = Math.PI / 2;
	public static final double EIGHTH_CHANGE = Math.PI / 4;
	public static final double NO_CHANGE = 0;
	
	public static final List<Shape> shapes = new ArrayList<Shape>() {
	{
		add(CIRCLE);
		add(OVAL);
		add(SQUARE);
		
		add(HORIZONTAL_LINE);
		add(PAUSED_HORIZONTAL_LINE);
		
		add(H_UNDERARMOUR);
		add(H_LINE);
		
		add(PAUSED_CIRCLE);
		add(PAUSED_ONE_CIRCLE);
		add(PAUSED_HALF_CIRCLE);
		add(PAUSED_QUARTER);
		
		add(PAUSED_FOUR_ISOPOP);
		add(PAUSED_TWO_ISOPOP);
		add(PAUSED_ONE_ISOPOP);
		
		add(HYPOCYLCOID);
		add(HYPOCYLCOID_FAKE);
		add(REAL_HYPOCYCLOID);
		
		add(HALF_CIRCLE_HORIZONTAL_TOP);
		add(HALF_CIRCLE_HORIZONTAL_BOTTOM);
		add(HALF_CIRCLE_VERTICAL_LEFT);
		add(HALF_CIRCLE_VERTICAL_RIGHT);
		
		add(QUARTERS_TOP_LEFT);
		add(QUARTERS_TOP_RIGHT);
		add(QUARTERS_BOTTOM_LEFT);
		add(QUARTERS_BOTTOM_RIGHT);
		
		add(THREE_BY_QUARTERS);
		add(QUARTERS_DOUBLE);
		add(STEPPED_CIRCLE);
		
		add(TRANSLATED_CIRCLE);
		add(TRANSLATED_QUARTER);
		
		add(FIGURE_OF_EIGHT);
		add(DIR_CHANGE_FIGURE_OF_EIGHT);
		add(FIGURE_SQUARE);
		add(FIGURE_SQUARE_REVERSE);
		add(FIGURE_SQUARE_SHORT);
		add(DIR_CHANGE_FIGURE_SQUARE);
		add(FIGURE_OF_EIGHT_BOX);
		add(FIGURE_OF_EIGHT_FAKE_BOX);
		add(FIGURE_SQUARE_BOX);
		
		add(LISSAJOUS_FIGURE);
		
		add(PINGPONG);
		
	}};
	
}