import java.util.*;
class momo
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plate of Veg.momo is Rs.92");
        System.out.println("Enter number of plates of Veg.momo");
        int d=s.nextInt();
        int c=d*92;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        momo.display();
    }
}
}
    
