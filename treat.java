import java.util.*;
class treat
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("One paneer paratha is Rs.55");
        System.out.println("Enter number of paneer paratha");
        int d=s.nextInt();
        int e=d*55;
        System.out.println("Bill = Rs."+e);
        System.out.println("1.Exit");
        int a=s.nextInt();
        if(a==1)
        north.display();
    }
    catch(Exception e)
    {
        treat.display();
    }
}
}
