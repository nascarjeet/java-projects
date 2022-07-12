package archive;
public class Pattern1 {
  public static void main(String args[]){
    int i,j,n=5;
    for (i=0;i<n;i++){
      for (j=n-i;j<=n;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
