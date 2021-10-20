import java.util.*;
class delhi
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("One plate Rajma Rice is Rs.145");
        System.out.println("Enter number of Plates of Rajma rice");
        int d=s.nextInt();
        int e=d*145;
        System.out.println("Bill = Rs."+e);
        System.out.println("1.Exit");
        int a=s.nextInt();
        if(a==1)
        north.display();
    }
    catch(Exception e)
    {
        delhi.display();
    }
}
}
