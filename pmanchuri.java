import java.util.*;
class pmanchuri
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plate of paneer manchuri is Rs.142");
        System.out.println("Enter number of plates of paneer manchuri");
        int d=s.nextInt();
        int c=d*142;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        pmanchuri.display();
    }
}
}
    
