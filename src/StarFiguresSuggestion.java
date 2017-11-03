
public class StarFiguresSuggestion {

/*
 * Here is another thought on breaking down StarFigures like you have done.
 * 
 * The issue at question is the clarity of the program.  When someone else is reading it, it should
 * be easy to understand without jumping deeply through the code.
 */
	public static void main(String[] args) {
		System.out.println("Example 1:");
		example1();
		
		drawGap();
		System.out.println("Example 2:");

		example2();
	}

	// This example will build the figures out of smaller parts.  Note that Figure1 appears in each figure, 
	// so we take advantage of that!
	public static void example1() {
		drawFigure1();
		
		drawGap();
		
		drawFigure1();
		drawDoubleBar();
		
		drawGap();
		
		drawPost();
		drawFigure1();
	}
	
	
	// This example breaks it down futher.  It should look familiar to Example 1, but is even MORE readable.
	public static void example2() {
		drawFigure1();
		
		drawGap();
		
		drawFigure2();
		
		drawGap();
		
		drawFigure3();
	}
	
	public static void drawFigure1() {
		drawDoubleBar();
		drawX();
	}
	
	public static void drawFigure2() {
		drawFigure1();
		drawDoubleBar();
	}
	
	public static void drawFigure3() {
		drawPost();
		drawFigure1();
	}
	
	public static void drawDoubleBar() {
		System.out.println("*****\n*****");
	}
	
	public static void drawPost() {
		System.out.println("  *\n  *\n  *");
	}
	
	public static void drawX() {
		System.out.println(" * * ");
	    System.out.println("  *  " );
	    System.out.println(" * *");
	}
	
	public static void drawGap() {
		System.out.print("\n\n");  // two blank lines
	}
}
