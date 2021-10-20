import java.util.*;
class gadgets
{
    static void display()throws InterruptedException
    {
        try
        {
        System.out.print("\f");
        Thread.sleep(500);
        Scanner s=new Scanner(System.in);
        System.out.println("\t \t \t \t\t Welcome to Gadgets world");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("1.Mobiles");
        System.out.println("2.Computers");
        System.out.println("3.Tabs");
        System.out.println("4.Laptops");
        System.out.println("5.Smart Watch");
        System.out.println("6.Exit");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            mobile.display();
            break;
            case 2:
            comp.display();break;
            case 3:
            tab.display();break;
            case 4:
            lap.display();break;
            case 5:
            smart.display();break;
            case 6:
            shopping.display();
        }
    }
    catch(Exception e)
    {
    gadgets.display();
}
}
}

           
        
    

