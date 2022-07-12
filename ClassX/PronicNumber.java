public class PronicNumber {
  public static void main(String[] args) {
    int a = 1,b = 2,pron;
    System.out.println("The pronic numbers from 1 to 500 are ");
    do{
      pron = a*b;
      a += 1;
      b += 1;
      if (pron>500)
        break;
      System.out.println(pron);
    }while(pron<500);
  }
}
  