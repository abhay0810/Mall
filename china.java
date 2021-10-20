import java.util.*;
class china
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("\t \t \t \t  Welcome to Chinese  Restaurant");
        System.out.println("\n \n \n \n");
        System.out.println("1.Paneer manchuri");
        System.out.println("2.Gobi manchuri");
        System.out.println("3.Veg noodles");
        System.out.println("4.Veg fried rice");
        System.out.println("5.Veg momos");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int d=s.nextInt();
        switch(d)
        {
           case 1:
           pmanchuri.display();break;
           case 2:
           gmanchuri.display();break;
           case 3:
           noodles.display();break;
           case 4:
           fried.display();break;
           case 5:
           momo.display();break;
           case 6:
           Restaurants.display();break;
        }
    }
    catch(Exception e)
    {
        china.display();
    }
}
}
       
    
    
    
