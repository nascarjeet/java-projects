/*Name : Jeet Naskar
  Class : IX
  Section : C
  Roll No. : 29*/
public class Fibonacci { // Opening of the class
  public static void main(String args[]) { // Opening of the object
    int d1 = 0, d2 = 1, d3; //Initializing the vriables.
    System.out.println("The fibonacci series: ");
    while (d1 <= 200) {
      System.out.print(d1 + ", "); // Displaying the output.
      d3 = d1;
      d1 = d2;
      d2 = d3 + d1;
    }
    System.out.println("...........");
  } 
} // End of the class
