/*
Design a class Overload to overload a function display (.....) as follows:
Choice 1: void display (int num) : To calculate & display the product of
Odd digits of the number
Choice 2: int display (int num, int d) : to count & display the frequency of
the digit ‘d’ in the number.
Write a main ( ) method to call the above display (...) method using an object as per
user’s choice. 
*/
import java.util.Scanner;

public class Overload {
  void display (int num){
    int rem = num, product = 1, digit;
    while(rem != 0){
      digit = rem % 10;
      if(digit % 2 != 0){
        product = product * digit;
      }
      rem = rem/10;
    }
    System.out.println("The product of the odd digits of the number : " + product);
  }
  int display (int num, int d){
    int count = 0, rem = num, digit;
    while (rem != 0){
      digit = rem % 10;
      if (digit == d)
        count ++;
      rem = rem / 10;
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Overload ob = new Overload();
    System.out.println(" Choice 1: To calculate & display the product of Odd digits of a number ");
    System.out.println(" Choice 2: to count & display the frequency of a digit in the number.");
    System.out.print("Enter your choice : ");
    int choice = sc.nextInt();
    switch(choice){
      case 1:
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        ob.display(num);
      case 2:
        System.out.println("Enter a number : ");
        int num2 = sc.nextInt();
        System.out.println("Provide the didgit to check its frequency in the number : ");
        int d = sc.nextInt(); 
        System.out.println("The digit " + d + " comes " + ob.display(num2, d) + " times in the number");
    }
    sc.close();
  }
}
