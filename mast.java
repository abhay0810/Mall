import java.util.*;
class mast
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("One Gobi paratha is Rs.35");
        System.out.println("Enter number of Gobi paratha");
        int d=s.nextInt();
        int e=d*35;
        System.out.println("Bill = Rs."+e);
        System.out.println("1.Exit");
        int a=s.nextInt();
        if(a==1)
        north.display();
    }
    catch(Exception e)
    {
        mast.display();
    }
}
}
