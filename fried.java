import java.util.*;
class fried
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plate of Veg.fried rice is Rs.132");
        System.out.println("Enter number of plates of Veg.fried rice");
        int d=s.nextInt();
        int c=d*132;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        fried.display();
    }
}
}
    
