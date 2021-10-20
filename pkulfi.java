import java.util.*;
class pkulfi
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one Pista kulfi is Rs.40");
        System.out.println("Enter number of Pista kulfi");
        int d=s.nextInt();
        int c=d*40;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        pkulfi.display();
    }
}
}
    
