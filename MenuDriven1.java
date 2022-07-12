
/*Name : Jeet Naskar     
  Class : IX
  Section : C
  Roll No. : 29*/
import java.util.Scanner;

public class MenuDriven1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choice A: 2 + 5 + 10 + 17 + ................ up to ‘n’ terms.");
    System.out.println("Choice B: 2 – 4 + 6 – 8 + 10 – 12 +.................up to 100.");
    System.out.println("Enter your choice: ");
    String c = sc.nextLine(); // Accepting user choice.
    switch (c) {
    case ("A"):
      int s1 = 0; // Intializing the variable.
      System.out.println("Enter the number of terms: ");
      int n = sc.nextInt();
      for (double i = 1; i <= n; i++) {
        s1 += (int) Math.pow(i, 2) + 1; // Term(i) = i^2 + 1.
      }
      System.out.println("The sum of the series is : " + s1);
      break;
    case ("B"):
      int s2 = 0, a = 2;
      System.out.println("Enter the number of terms: ");
      for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0)
          s2 -= a; // Subtracting the even positions.
        else
          s2 += a; // Adding the odd positions.
        a += 2;
      }
      System.out.println("The sum of the series is : " + s2);
      break;
    default:
      System.out.println("E benter the correct character (capitalized)");
      break;
    }
    sc.close();
  }
}
