import java.util.*;
class burger
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one Veg.burger is Rs.65");
        System.out.println("Enter number of burger");
        int d=s.nextInt();
        int c=d*65;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        burger.display();
    }
}
}
    
