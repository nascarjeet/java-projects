/*
int taxi_no - to store taxi number
String name - to store passenger's name
int km - to store number of kilometers travelled
Member Functions:
void input ( ) - to accept taxi no, passenger's name, km using an Input Statement
int calculate ( ) - to calculate & return the bill for a customer according to given 
 conditions:
Kilometers travelled (km) Rate/km
<= 1 km ₹ 25/-
1 < km <= 6 ₹ 10/-
6 < km <= 12 ₹ 15/-
12 < km <= 18 ₹ 20/-
>18 km ₹ 25/-
void display ( ) - to display the details according to the following format:
Taxi no Name Kilometers travelled Bill amount
*** *** **** ***
*/
import java.util.Scanner;
public class Taximeter {
  int km, taxi_no, cost;
  String name;
  void input(){
    Scanner b = new Scanner(System.in);
    System.out.println("Enter the taxi number : ");
    taxi_no = b.nextInt();
    System.out.println("Enter your name : ");
    b.nextLine();
    name = b.nextLine();
    System.out.println("Enter the distance you have travelled : ");
    km = b.nextInt(); 
    System.out.println(name);
    b.close();
  }
  int calculate(){
    if (km <= 1)
      cost = km*25;
    if (1 < km && km <= 6)
      cost = km*10;
    if (6 < km && km <= 12)
      cost = km*15;
    if (12 < km && km <= 18)
      cost = km*20;
    if (km > 18)
      cost = km*25;
    return cost;
  }
  void display(){
    System.out.println("Taxi no." + "\t" + "Name"+"\t"+"Kilometers travelled"+"\t"+"Bill amount");
    System.out.println(taxi_no+"\t\t"+name+"\t"+km+"\t\t\t"+cost);
  }
  public static void main(String[] args) {
    Taximeter ob = new Taximeter();
    ob.input();
    ob.calculate();
    ob.display();
  } 
}
