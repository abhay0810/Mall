import java.util.*;
class pasta
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plate of veg.pasta is Rs.94");
        System.out.println("Enter number of plates of veg.pasta");
        int d=s.nextInt();
        int c=d*94;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        pasta.display();
    }
}
}
    
