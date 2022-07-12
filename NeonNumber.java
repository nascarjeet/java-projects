import java.util.Scanner;
public class NeonNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,pro = 1,sum = 0,dig;
    System.out.println("Enter the number: ");
    n = sc.nextInt();
    pro = n * n;
    do{
      dig = pro%10;
      sum = sum + dig;
      pro = pro / 10;
    }while(pro!=0);
    if(n==sum)
      System.out.println("The Number is a Neon Number");
    else
      System.out.println("The Number is not a Neon Number");
    sc.close();
  }
}