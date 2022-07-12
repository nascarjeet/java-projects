package archive;
import java.util.Scanner;
public class Numbers1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    long n = sc.nextLong();
    long d;
    do {
      d=n%10;
      if (d%2==0)
        System.out.println(d+" : The digit even");
      else 
        System.out.println(d+" : The digit is odd");
      n=n/10;
    }while (n>0);
    sc.close();
  }
}
