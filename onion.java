import java.util.*;
class onion
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one onion doosa is Rs.45");
        System.out.println("Enter number of onion doosa");
        int d=s.nextInt();
        int c=d*45;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        onion.display();
    }
    }
}