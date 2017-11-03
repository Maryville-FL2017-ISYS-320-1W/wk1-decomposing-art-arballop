/*
  	ISYS 320
  	Name(s): Paysen Arballo
  	Date: 11/02/2017
*/

// 1. Your predicted output: " Done with main."
//                           " This is message1."
//                           " This is message2."
//                           " Done with message2."
 

public class Tricky {
	 public static void main(String[] args) {
	        message1();
	        message2();
	        System.out.println("Done with main.");
	    }
	    
	    public static void message1() {
	        System.out.println("This is message1.");
	    }
	    
	    public static void message2() {
	        System.out.println("This is message2.");
	        message1();
	        System.out.println("Done with message 2.");
	    }
	}




// 3. Were you correct? Explain any differences: 
//    I was not correct, however I got to see how the loop worked after I ran it and it showed me exactly how the loop runs.
//    The differences were present because I overlooked the process and went straight through the loop reading, instead of 
//    looking at details to map out the output. I now know how to map out the output just by looking at the code. My output 
//    prediction was not accurate but I do not believe I was that far off.
 
 

