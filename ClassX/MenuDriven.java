
/*Name : Jeet Naskar
  Class : X
  Section : C
  Roll No. : 29
  */

import java.util.Scanner;

public class MenuDriven {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for 1st pattern");
    System.out.println("Enter 2 for 2nd pattern");
    System.out.print("Enter your choice : ");
    int k = 9, n = sc.nextInt();
    System.out.println("Your choice : " + n);
    switch (n) {
    case 1:
      for (int i = 1; i <= 5; i++) {
        int b = 9;
        for (int j = 5; j >= 1; j--) {
          if (i % 2 != 0) {
            if (j > i)
              System.out.print(" ");
            if (j <= i) {
              int a = b;
              System.out.print(a);
              b = a - 2;
            }
          }
          if (i % 2 == 0) {
            if (j > i)
              System.out.print(" ");
            if (j <= i) {
              System.out.print(k);
            }
          }
        }
        k = k - 2;
        System.out.println();
      }
      break;
    case 2:
      for (int i = 5; i > 0; i--) {
        for (int j = 5; j > 0; j--) {
          if (i < j)
            System.out.print("  ");
        }
        for (int l = 1; l <= i; l++) {
          if (l % 2 == 0) {
            char a = '*';
            System.out.print(a + " ");
          } else {
            char b = '#';
            System.out.print(b + " ");
          }
        }
        System.out.println();
      }
      break;
    default :
      System.out.println("\"Wrong input\"");
    }
    sc.close();
  }
}