import java.util.*;
class plain
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one plain doosa is Rs.35");
        System.out.println("Enter number of plain doosa");
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
        plain.display();
    }
    }
}