/**
 * Class Einstein's Equation
* This program calculates energy 
* using Einstein's equation.
* @author  Linh Ho
* @version 1.0
* @since   2020-09-15 
*/

// import 
import java.util.Scanner;

public class EinsteinEquation {
  public static void main(String[] args) {
    
    // Declare variables
    double mass;
    double speedOfLight = 2.998 * Math.pow(10,8);
    double energy;
    
    // Allow the user to put an input
		Scanner userInput = new Scanner(System.in);
		
    // Ask the user for the mass
    System.out.println("What is the mass of the object?");
    
    // Set the mass to user's input
    mass = userInput.nextDouble();
    
    // Calculate the energy
    energy = mass * Math.pow(speedOfLight, 2);
    
    // Display the energy
    System.out.println("The energy of the object is: " + energy);
  }
}