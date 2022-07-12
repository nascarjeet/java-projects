/*Name : Jeet Naskar
  Class : IX
  Section : C
  Roll No. : 29*/
import java.util.Scanner;
public class Mobike {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int charge = 0;
    System.out.println("Enter the bike number: "); // Asking for input.
    String bn = sc.nextLine();
    System.out.println("Enter Customer name: "); // Asking for input.
    String cn = sc.nextLine();
    System.out.println("Enter the number of days the bike is taken for: "); // Asking for input.
    int d = sc.nextInt();
    if(d <= 5)
      charge = d * 500; // Charge 500 for all the days.
    if(d > 5 && d <= 10)
      charge = (5 * 500) + ((d - 5) * 400); // Charge 500 for first 5 days, then 400.
    if(d > 10)
      // Charge 500 for first 5 days, 400 for next 5, and 200 for the remaining days.
      charge = (5 * 500) + (5 * 400) + ((d - 10) * 200);
    
    String bnw = "Bike no.", cnw = "Customer Name", ndw = "Number of days", cw = "Charge";
    int bnwl = bnw.length(),
      cnwl = cnw.length(),
      ndwl = ndw.length(),
      cwl = cw.length();
    int bnvl = bn.length(),
      cnvl = cn.length(),
      ndvl = Integer.toString(d).length(), 
      cvl = Integer.toString(charge).length();

    int bnml = Math.max(bnwl, bnvl) + 4,
      cnml = Math.max(cnwl, cnvl) + 4,
      ndml = Math.max(ndwl, ndvl) + 4,
      cml = Math.max(cwl, cvl) + 4;
    
    System.out.println(
      bnw + spc(bnml - bnwl) +
      cnw + spc(cnml - cnwl) +
      ndw + spc(ndml - ndwl) +
      cw + spc(cml - cwl)
    );

    System.out.println(
      bn + spc(bnml - bnvl) +
      cn + spc(cnml - cnvl) +
      d + spc(ndml - ndvl) +
      charge + spc(cml - cvl)
    );

    // System.out.println("Bike no.      Customer Name       No.of days      Charge");
    // System.out.println(bn + "         " + cn +"            " + d + "            " + charge);
    sc.close();
  }

  public static void d(int val) {
    System.out.println(val);
  }

  public static String spc(int width) {
    String spc = "";
    for (int i = 0; i < width; i++)
      spc += " ";
    return spc;
  }
}
