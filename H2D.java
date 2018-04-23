
/*
 * Nicholas Keen
 * CIS 356
 * 9/14/2015
 *
 * Assignment 01
 * File: H2D.java
 *
 */

public class H2D {

    public static int h2d(String h) {
	      // return the int d whose Hexadecimal representation
        // is given by the String h
    	  int d = 0;
    	  String s = h.toUpperCase();
    	  int len = s.length();
    	  for(int i =0; i <= len-1; i++){
    		    char c = s.charAt(i);
    		    if(c >= 48 && c < 58){
    			      d = (d*16)+(int) ((c - 48));
    		    }else
    	          d = (d*16) + (Math.abs('A' - c)+10);
    	  }
	      return d; // dummy return
    }

    public static void main(String [] args) {
	   for (String s : args) {
	       int x = h2d(s);
	       System.out.println(s + ": " + x);
        }
    }
}
