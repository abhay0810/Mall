import java.util.*;
class mango
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one mango mist is Rs.30");
        System.out.println("Enter number of mango mist");
        int d=s.nextInt();
        int c=d*30;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
       mango.display();
    }
}
}
    
