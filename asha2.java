import java.util.*;
class asha2
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one asha 503 is Rs.15000");
        System.out.println("Enter number of asha 503");
        int d=s.nextInt();
        int c=d*15000;
        System.out.println("Bill = Rs."+c);
        System.out.println("Enter 1 to continue shopping");
        System.out.println("Enter 0 to exit");
        int e=s.nextInt();
        if(e==1)
        gadgets.display();
        else if(e==0)
        System.exit(0);
    }
    catch(Exception e)
    {
        asha2.display();
    }
}
}
   