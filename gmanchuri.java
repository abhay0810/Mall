import java.util.*;
class gmanchuri
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plate of Gobi manchuri is Rs.122");
        System.out.println("Enter number of plates of Gobi manchuri");
        int d=s.nextInt();
        int c=d*122;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        gmanchuri.display();
    }
}
}
    
