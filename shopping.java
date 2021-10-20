import java.util.*;
class shopping
{
    static int a;
    static void display()throws InterruptedException
    {
        Scanner s=new Scanner(System.in);
        try
        {
        System.out.print("\f");
        System.out.println("1.Gadgets");
        Thread.sleep(500);
        System.out.println("2.Clothing");
        Thread.sleep(500);
        System.out.println("3.Restaurants");
        Thread.sleep(500);
        System.out.println("4.Theatre");
        Thread.sleep(500);
        System.out.println("5.To exit");
        System.out.println("Enter your option");
        a=s.nextInt();
        switch(a)
        {
            case 1:
            lift.display();
            break;
            case 2:
            lift.display();
            break;
            case 3:
            lift.display();
            break;
            case 4:
            lift.display();
            break;
            case 5:
            System.exit(0);
            break;
            default:
            shopping.display();
        }
    }
    catch(Exception e)
    {
        shopping.display();
    }
}
}

   
       