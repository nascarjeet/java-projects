
/*Name : Jeet Naskar
  Class : IX
  Section : C
  Roll No. : 29*/
import java.util.Scanner;

public class Armstrong {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number"); // Asking the user for the input.
    int n = sc.nextInt(), n_saved = n; // Saving the number to compare later.
    double dig, sum = 0;

    int digit_count = 0, n_temp = n;
    while (n_temp > 0) {
      n_temp /= 10;
      digit_count++;
    }
    
    while (n > 0) {
      dig = n % 10; // Extracting the digit at the unit place.
      sum += (int) Math.pow(dig, digit_count); //Aggregating the cube of each digit.
      n = n / 10; // Removing the digit at the unit place.
    }
    String flag = (sum == n_saved) ? "": "not ";
    System.out.println("The given number " + n_saved + " is "+ flag + "an Armstrong number.");
    sc.close();
  }
}