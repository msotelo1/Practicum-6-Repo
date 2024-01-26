// Practicum 6 (Using a Debugger) Solution
// ----------------------------------------------------------
// This program will convert Celsius to Fahrenheit
// ----------------------------------------------------------

// CHANGE: Need to add the following line
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // init
    // CHANGE: Need to declare variable cel_temp
    int cel_temp;
    Scanner input = new Scanner(System.in);
    
    // program greeting
    System.out.println(
      "\nConverts temperatures in Celsius to Fahrenheit\n");

    // prompt for input
    System.out.println("Enter temperature (in Celsius): ");
    // CHANGE: Need to change next() to nextInt()
    cel_temp = input.nextInt();

    // display results
    System.out.println(cel_temp + " Celsius = " + 
                       convertToFahrenheit(cel_temp) +
                       " degrees Fahrenheit");
  
  }

  public static double convertToFahrenheit(int c) {
    // CHANGE: Need to change integer division 9/5 to real div
    return (9/5.0 * c) + 32;
  }
  
}
