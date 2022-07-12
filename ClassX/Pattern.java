import java.util.*;
public class Pattern
{
    public static void main(String[] args) 
    {
        int ch,x,y,z,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for 1st Pattern");
        System.out.println("2 for 2nd Pattern");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                m=1;
                for(x=9;x>=1;x-=+2)
                {
                    for(y=x;y>1;y-=2)
                    System.out.print(" ");
                    for(z=9;z>=1;z-=2)
                    {
                        if(m%2==0)
                        System.out.print(x);
                        else
                        System.out.print(z);
                    }
                    System.out.println();
                    m++;
                }
                break;
                case 2:
                    for(x=5;x>=1;x--)
                    {
                        for(y=x;y<5;y++)
                        System.out.print(" ");
                        for(z=1;z<=x;z++)
                        {
                            if(z%2==0)
                            System.out.print("*");
                            else
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                    break;
                    default:
                        System.out.println("Wrong Choice");
        }
        sc.close();
    }
}
