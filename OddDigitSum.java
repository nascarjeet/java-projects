/*Name : Jeet Naskar
  Class : IX
  Section : C
  Roll No. : 29*/
public class OddDigitSum {
  public static void main(int n) {
    int sum = 0; // Declare variable.
    System.out.println("The number = " + n);
    if (n < 10000 || n > 99999) {
      System.out.println("The given output is not a five digit number");
    } else {
      // Saving the position of the digit in pos.
      // Removing the unit digit in each iteration.
      // Decreasing the position of the digit in each iteration.
      for(int pos = 5; n > 0; n /= 10, pos--) {
        // Summing the digit only if the current position is odd.
        if (pos % 2 != 0)
          sum += n % 10;
      }
      System.out.println("The sum of 1st, 3rd and 5th digits of the number is = " + sum);
    }
  }
}
