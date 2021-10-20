import java.util.*;
class sandwich
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plate of veg.sandwich is Rs.83");
        System.out.println("Enter number of plates of veg.sandwich");
        int d=s.nextInt();
        int c=d*83;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        sandwich.display();
    }
}
}
    
