
/*
 * Nicholas Keen
 * CIS 356
 * 9/14/2015
 *
 * Assignment 01
 * File: D2H.java
 *
 */

public class D2H {

    public static String d2h (int d) {
	      // return the String h that is the Hexadecimal representation
        // of the given integer d
	      String h = ""; // dummy value
	      if(d == 0)
	          h = 0 + h;
	      else{
	          while(d > 0){
	   	          int num = d%16;
	   	          if(num >= 0 && num < 10)
	   	              h = num + h;
	   	          else{
	   		            char c = (char)('A' + num - 10);
	   		            h = c + h;
	   	          }
	   	          d = d/16;
	          }
	      }
	      return h;
    }

    public static void main(String [] args) {
	for (String s : args) {
	   int x = Integer.parseInt(s);
	   System.out.println(s + ": " + d2h(x));
        }
    }
}
