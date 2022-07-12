import java.util.Scanner;

/* Write a menu driven program to do the task according to user’s choice:
Choice A: S = 2 – 5 + 10 – 17 + 26 – 37 + …. Up to 10 terms.
Choice B: S = 5 + 12 + 27 + 58 + 121 + …. Up to 500
*/
public class MenuDriven2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for 1st sum of pattern");
    System.out.println("Enter 2 for 2nd sum of pattern");
    System.out.println("Enter your choice : ");
    int n = 2, a = 3, m = sc.nextInt();
    int sum = 0,b = 2;
    System.out.println("Your choice : "+ m);
    switch (m){
      case 1:
        for (int i = 1; i<=10; i++){
          if (i % 2 != 0){
            sum += n;
          }else{
           sum -= n;
          }
          n += a;
          a += 2;
        }
        System.out.println("The sum of the numbers = "+sum); 
        break;
      case 2:
        for (int c = 1; ; c++){
          b = (b*2)+c;
          if (b>500)
          break;
          sum += b;
        }
        System.out.println("The sum of the numbers = "+sum);
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
    sc.close();
  }
}
