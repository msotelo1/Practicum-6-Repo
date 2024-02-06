
public class Main {
  public static void main(String[] args) {
    
    // init
    Scanner input = new Scanner(System.in);
    
    // program greeting
    System.out.println("\nConverts temperatures in Celsius to Fahrenheit\n");

    // prompt for input
    System.out.println("Enter temperature (in Celsius): ");
    int cel_temp = input.nextInt();

    // display results
    System.out.println(cel_temp + " Celsius = " + convertToFahrenheit(cel_temp) + " degrees Fahrenheit");
  
  }

  public static double convertToFahrenheit(int c) {
    return (c * 9/5) + 32;
  }
  
}
