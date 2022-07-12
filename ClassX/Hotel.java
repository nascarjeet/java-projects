import java.util.Scanner;

public class Hotel {
  String name;
  long mno;
  double bill, gst, st, total;
  void accept(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name : ");
    name = sc.nextLine();
    System.out.print("Enter your mobile number : ");
    mno = sc.nextLong();
    System.out.print("Enter the bill amount : ");
    bill = sc.nextDouble();
    sc.close();
  }
  void calculate(){
    gst = (18.0/100)*bill;
    st = (12.5/100)*bill;
    total = bill + gst + st;
  }
  void display(){
    System.out.println("Customer's name : "+name);
    System.out.println("Customer's mobile number : "+mno);
    System.out.println("GST to be paid : "+gst);
    System.out.println("Service tax to be paid : "+st);
    System.out.println("Total amount to be paid : "+total);
  }
  public static void main(String[] args) {
    Hotel ob = new Hotel();
    ob.accept();
    ob.calculate();
    ob.display();
  }
}
