// import 
import java.util.Scanner;

/**
 * Class Einstein's Equation
* This program calculates energy 
* using Einstein's equation.

* @author  Linh Ho
* @version 1.0
* @since   2020-09-15 
*/

public class EinsteinEquation {
  
  /**
   * Required javadoc.
  */
  
  public static void main(String[] args) {
    
    // Allow the user to put an input
    Scanner userInput = new Scanner(System.in);
    
    // Declare variables
    double mass;
    double speedOfLight = 2.998 * Math.pow(10, 8);
    double energy;
    String massString;
    
    // Ask the user for the mass
    System.out.println("What is the mass of the object?");
    
    // string to input
    massString = userInput.nextLine();
    
    // error checking
    if (massString.length() == 0) {
      // print error
      System.out.println("Error");
    }
    
    // Set the mass to user's input
    mass = userInput.nextDouble();
    
    // Calculate the energy
    energy = mass * Math.pow(speedOfLight, 2);
    
    // Display the energy
    System.out.println("The energy of the object is: " + energy);
  }
}