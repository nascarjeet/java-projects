public class MenuDrivenn {
  public static void main(String[] args) {
    int j;
    for (int i = 5; i >= 1; i --) {
      for (j = 1; j < i; j++) {
        System.out.print("  ");
      }
      if (i % 2 != 0) {
        for (int k = 9; j <= 5; j++, k-= 2) {
          System.out.print(k + " ");
        }
      }else {
        for (int k = i * 2 - 1; j <= 5;j++) {
          System.out.print(k + " ");
        }
      }
      System.out.println();
    }
  }
}
