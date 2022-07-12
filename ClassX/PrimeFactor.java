import java.util.Scanner;

public class PrimeFactor {
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
  void factorize(int n){
    int f = 2;
    boolean is_first = true;
    System.out.print("Prime factorization of "+ n +" are : ");
    while (n > 1){
      if (is_prime(f)){
        if(n % f == 0){
          if (!is_first){
            System.out.print(", ");
          }else{
            is_first = false;
          }
          System.out.print(f);
          n /= f;
        }else{
          f += 1;
        }
      }else{
        f += 1;
      }
    }
    System.out.println();
  }
  public static void main(String[] args) {
    PrimeFactor ob = new PrimeFactor();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    ob.factorize(n);
    sc.close();
  }
}
