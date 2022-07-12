/*
 Write a program in Java to display all the Non-Fibonacci Numbers from 1 to 200.
Non-Fibonacci Numbers: 4, 6, 9, 10, 11, 12, 14 ..................
[Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21 ......................]
*/

public class Non_Fibonacci {
  public static void main(String[] args) {
    int sum = 0,a = 0,b = 1,c = 0;
    System.out.print("Non-Fibonacci Numbers : ");
    while(c < 200){
      sum = a + b;
      int i = 1;
      c = a + i;
      while( c < b ){
        System.out.print(c + ", ");
        c += i;
        if (c>200)
          break;
      }
      a = b;
      b = sum;
    }
  }
}
