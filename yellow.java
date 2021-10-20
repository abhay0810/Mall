import java.util.*;
class yellow
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("One plate Ghee Rice is Rs.135");
        System.out.println("Enter number of Plates of Ghee rice");
        int d=s.nextInt();
        int e=d*135;
        System.out.println("Bill = Rs."+e);
        System.out.println("1.Exit");
        int a=s.nextInt();
        if(a==1)
        north.display();
    }
    catch(Exception e)
    {
        yellow.display();
    }
}
}
