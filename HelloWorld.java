/**
 * HelloWorld.java
 *
 * Simple hello world program to test development environment.
 *
 * @author Pandelis Kriadis <pkriadis@fas.harvard.edu>
 * @version 1.0
 */
public class HelloWorld {
  public static void main(String [] args) {
    if(args.length == 0)
      System.err.print("Must specify name on command line!");
    else if(args.length != 1 )
      System.err.println("Must only specify one name on command line");
    else
      System.out.println("Hello, " + args[0] + "!");
  }
}
