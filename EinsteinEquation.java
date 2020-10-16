// import 
import java.io.*;
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
    
    try {
    
    // Allow the user to put an input
    Scanner userInput = new Scanner(System.in);
    
    // create to write files
    FileWriter myWriter = new FileWriter("EinsteinEquation.txt");
    
    // Declare variables
    double mass;
    double speedOfLight = 2.998 * Math.pow(10, 8);
    double energy;
    
    // Ask the user for the mass
    System.out.println("What is the mass of the object?");
    
    // string to input
    mass = userInput.nextDouble();
    
    // Calculate the energy
    energy = mass * Math.pow(speedOfLight, 2);
    
    // Display the energy
    System.out.println("The energy of the object is: " + energy);
    
    // write to text solutions
    myWriter.write("Energy is: " + energy);
    
    // close the write 
    myWriter.close();
    
    } catch (IOException e) {
      // print error
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}