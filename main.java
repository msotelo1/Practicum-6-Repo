// Practicum 6 (Use of Debugger)

// ----------------------------------------------------------
// This program will convert Celsius to Fahrenheit
// ----------------------------------------------------------
public class Main {
  public static void main(String[] args) {
    
    // init
    Scanner input = new Scanner(System.in);
    
    // program greeting
    System.out.println(
      "\nConverts temperatures in Celsius to Fahrenheit\n");

    // prompt for input
    System.out.println("Enter temperature (in Celsius): ");
    cel_temp = input.next();

    // display results
    System.out.println(cel_temp + " Celsius = " + 
                       convertToFahrenheit(cel_temp) +
                       " degrees Fahrenheit");
  
  }

  public static double convertToFahrenheit(int c) {
    return (9/5 * c) + 32;
  }
  
}
