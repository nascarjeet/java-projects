import java.util.Scanner;

public class Fruit_Juice {
  int product_code, pack_size, product_price;
  String flavor, pack_type;
  Fruit_Juice(){
    product_code = 0;
    pack_size = 0;
    product_price = 0;
    flavor = " ";
    pack_type = " ";
  }
  void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the product code : ");
    product_code = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the flavour of the fruit juice : ");
    flavor = sc.nextLine();
    System.out.print("Enter the type of packaging : ");
    pack_type = sc.nextLine();
    System.out.print("Enter the pack size : ");
    pack_size = sc.nextInt();
    System.out.print("Enter the product price : ");
    product_price = sc.nextInt();
    sc.close();
  }
  void discount (){
    product_price -= 10;
  }
  void display(){
    System.out.println("The product code : "+ product_code);
    System.out.println("The product flavour : "+ flavor);
    System.out.println("The packaging type : "+ pack_type);
    System.out.println("The product pack size : "+ pack_size);
    System.out.println("The product price : "+ product_price);
  }
  public static void main(String[] args) {
    Fruit_Juice ob = new Fruit_Juice();
    ob.input();
    ob.discount();
    ob.display();
  }
}
