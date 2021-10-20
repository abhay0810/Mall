import java.util.*;
class idly
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of idly is Rs.25");
        System.out.println("Enter number of idly");
        int d=s.nextInt();
        int c=d*25;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        idly.display();
    }
    }
}