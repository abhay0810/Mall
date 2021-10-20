import java.util.*;
class vada
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one vada is Rs.15");
        System.out.println("Enter number of vada");
        int d=s.nextInt();
        int c=d*15;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        vada.display();
    }
    }
}