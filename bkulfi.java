import java.util.*;
class bkulfi
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one badam kulfi is Rs.45");
        System.out.println("Enter number of badam kulfi");
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
        bkulfi.display();
    }
}
}
    
