import java.util.Scanner;

public class Prime {
  boolean is_prime (int n){
    if (n <= 1){
      return false;
    }
    for (int i = 2; i < n; i++){
      if (n % i == 0 )
        return false;
    }
    return true;
  }
  void display(boolean prime){
    if (prime){
      System.out.println("is prime");
    }else{
      System.out.println("not prime");
    }
  }
  public static void main(String[] args) {
    Prime ob = new Prime();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
    boolean c = ob.is_prime(a);
    ob.display(c);
    sc.close();
  }
}
