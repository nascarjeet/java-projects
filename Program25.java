/*
54321
 5432
  543
   54
    5
 */

public class Program25 {
  public static void main(String[] args) {
    int j;
    for (int i = 1; i <= 5; i++){
      for (j = 5; j > 6-i;  j--){
        System.out.print("  ");
      }
      for (int k = 5; j >= 1; j--, k--){
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }
}
