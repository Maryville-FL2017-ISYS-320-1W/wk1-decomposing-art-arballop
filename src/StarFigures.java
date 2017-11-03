/*
  	ISYS 320
  	Name(s): Paysen Arballo
  	Date: 11/02/2017
*/

// 4. Your pseudocode algorithm for how to break down the figure:
//    Use "for" loops to determine how many *'s are produced for each line
//    Construct loops according to how many *s per line
//    Use static methods to call upon repeated code for reduction in redundancy.


public class StarFigures {

	public static void main(String[] args) {
		drawfigure1();
		drawfigure2();
		drawfigure3();
		drawfigure4();
		drawfigure5();
	}
	public static void drawfigure1() {
		int sz= 3;
		//First line "*****"
		for(int y = 1; y<sz; y++)
		System.out.println("*****");
	}
	public static void drawfigure2() {
		int sz = 3;
		//Final lines in first figure    ( " * * "2x)  ("  *  ")
		for(int y =2; y<sz; y++)
			System.out.println(" * * ");
		    System.out.println("  *  " );
		    System.out.println(" * *");
		    
	}
	public static void drawfigure4() {
		 int sz=4; 
			    for(int y = 1; y<sz; y++ )      
					System.out.println("  *  ");// Gives the beginning for next figure. 3 lines *
	}
	public static void drawfigure3() {
		System.out.println("\n");// Sets new line for next figure.
		drawfigure1();          // Calls for previously used code "*****"
		drawfigure2();         // Calls for previously used code 
		drawfigure1();        // Calls for previously used code
		System.out.println("\n");// Sets new line for next figure
		}
		public static void drawfigure5() {
			//Final Figure
		    	drawfigure1();//Calls for previously used code to complete figure
		    	drawfigure2();//Calls for previously used code to complete figure
		    	}
		    
		   private static String String(String s, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	}

