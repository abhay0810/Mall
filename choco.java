import java.util.*;
class choco
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one Choco-bar is Rs.35");
        System.out.println("Enter number of Choco-bar");
        int d=s.nextInt();
        int c=d*35;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        choco.display();
    }
}
}
    
