import java.util.*;
class masala
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one masala doosa is Rs.42");
        System.out.println("Enter number of masala doosa");
        int d=s.nextInt();
        int c=d*42;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        masala.display();
    }
}
}
    
