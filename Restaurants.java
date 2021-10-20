import java.util.*;
class Restaurants
{
    static void display()throws InterruptedException
    {
        try
        {
        System.out.print("\f");
        Thread.sleep(500);
        Scanner s=new Scanner(System.in);
        System.out.println("\t \t \t \t\t Welcome to Food Palace");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("1.Spicy Northee");
        System.out.println("2.Dhamakedhar southee");
        System.out.println("3.Tasty Chinese");
        System.out.println("4.Salty Western");
        System.out.println("5.Ice cream");
        System.out.println("6.Exit");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            north.display();
            break;
            case 2:
            south.display();break;
            case 3:
            china.display();break;
            case 4:
            western.display();break;
            case 5:
            ice.display();break;
            case 6:
            shopping.display();
        }
    }
    catch(Exception e)
    {
    Restaurants.display();
}
}
}

           
        
    

