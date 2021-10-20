import java.util.*;
class french
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plate of french fries is Rs.100");
        System.out.println("Enter number of plates of french fries");
        int d=s.nextInt();
        int c=d*100;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        french.display();
    }
}
}
    
