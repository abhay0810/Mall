import java.util.*;
class butter
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one Butterscotch is Rs.50");
        System.out.println("Enter number of butterscotch");
        int d=s.nextInt();
        int c=d*50;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        butter.display();
    }
}
}
    
