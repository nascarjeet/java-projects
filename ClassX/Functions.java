import java.util.Scanner;

public class Functions {
  void check(int n){
    String ck = (n>10)?((n%2 == 0)?"a 2 digit even number":"a 2 digit odd number"):"is not a 2 digit number";
    System.out.println("The number "+n+" is "+ck);
  }
  void check(int a, int b){
    boolean is_true = (b%a == 0)? true:false;
    boolean is_true3 = (a%b == 0)? true:false;
    if(is_true){
      System.out.println("The number "+a+" is a factor of "+b);
    }else{
      System.out.println("The number "+a+" is a not factor of "+b);
    }
    if(is_true3){
      System.out.println("The number "+b+" is a factor of "+a);
    }else{
      System.out.println("The number "+b+" is a not factor of "+a);
    }
  }
  void check(char x){
    int c = (int)x;
    boolean is_true1 = (c>=65 && c<=90)?true:false;
    boolean is_true2 = (c>=97 && c<=112)?true:false;
    if (is_true1 || is_true2){
      System.out.println("Your input is a letter");
    }else{
      System.out.println("Your input is not a letter");
    }
  }
  public static void main(String[] args) {
    Functions ob = new Functions();  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to be checked whether it is a two digit odd or even number : ");
    int c = sc.nextInt();
    ob.check(c);
    System.out.println("Enter two numbers :");
    int d = sc.nextInt();
    int e = sc.nextInt();
    ob.check(d, e);
    System.out.println("Enter a character : ");
    char f = sc.next().charAt(0);
    ob.check(f);
    sc.close();
  }
}
