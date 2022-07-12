/*Name : Jeet Naskar
  Class : IX
  Section : C
  Roll No. : 29*/
public class First2Largest {
  public static void main(int a, int b, int c) {
    int largest, smallest, second;
    // Computing the largest number.
    largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    // Computing the smallest number.
    smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    second = a;
    if (b < largest && b > smallest)
      // If b lies in between, b is the second largest.
      second = b;
    if (c < largest && c > smallest)
      // If c lies in between, c is the second largest.
      second = c;
    // Displaying the results.
    System.out.println("Provided Numbers: " + a + ", " + b + ", "+ c + ".");
    System.out.println("The maximum number: " + largest);
    System.out.println("The second maximum number: " + second);
  }
}
