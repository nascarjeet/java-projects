import java.util.Scanner;
public class NivenNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,dig,sum=0;
    System.out.println("Enter the number: ");
    n = sc.nextInt();
    int p = n;
    do{
      dig = n%10;
      sum += dig;
      n = n/10;
    }while(n!=0);
    if(p%sum==0)
      System.out.println("The number is a Niven number");
    else
      System.out.println("The number is not a Niven number");

  }
}
