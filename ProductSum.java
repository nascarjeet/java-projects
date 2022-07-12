
/*Name : Jeet Naskar
  Class : IX
  Section : C
  Roll No. : 29*/
import java.util.Scanner;

public class ProductSum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    // Asking for input.
    // Saving the number to compare later.
    int n = sc.nextInt(), pro = 1, dig, temp1 = n, newnum = 0;
    // Multiplying the digits only if the number is even.
    while (n > 0 && temp1 % 2 == 0) {
      dig = n % 10; // Extracting the digit at the unit place.
      pro = pro * dig;
      n = n / 10; // Removing the digit at the unit place
    }
    // Reversing the number only if the number is odd.
    while (n > 0 && temp1 % 2 != 0) {
      dig = n % 10;
      newnum = (newnum * 10) + dig;
      n /= 10;
    }
    if (temp1 % 2 == 0)
      System.out.println("The number is even so, the product of the digits is : " + pro);
    if (temp1 % 2 != 0)
      System.out.println("The number is odd so, the number in reversed order is : " + newnum);
    sc.close();
  }
}
