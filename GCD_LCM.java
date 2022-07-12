
/*Name : Jeet Naskar
  Class : IX
  Section : C
  Roll No. : 29*/
import java.util.Scanner;

public class GCD_LCM {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter the first number: ");
    a = sc.nextInt(); // Accepting the input.
    System.out.println("Enter the second number: ");
    b = sc.nextInt(); // Accepting the input.
    int lcm, small, big, rem = 1, gcd = 0; // Intializing the variables.
    small = Math.min(a, b); // Storing the smaller number.
    big = Math.max(a, b); // Storing the bigger number.
    while (rem != 0) {
      rem = big % small;
      if (rem == 0)
        gcd = small;
      big = small;
      small = rem;
    } 
    System.out.println("The GCD of the two numbers: " + gcd);
    lcm = (a * b) / gcd; // Calculating the LCM.
    System.out.println("The LCM of the two numbers is: " + lcm);
    sc.close();
  }
}