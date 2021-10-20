import java.util.*;
class western
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("\t \t \t \t  Welcome to Western  Restaurant");
        System.out.println("\n \n \n \n");
        System.out.println("1.Veg.Burger");
        System.out.println("2.Veg.pizza");
        System.out.println("3.Veg.pasta");
        System.out.println("4.veg.sandwich");
        System.out.println("5.French fries");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int d=s.nextInt();
        switch(d)
        {
           case 1:
           burger.display();break;
           case 2:
           pizza.display();break;
           case 3:
           pasta.display();break;
           case 4:
           sandwich.display();break;
           case 5:
           french.display();break;
           case 6:
           Restaurants.display();break;
        }
    }
    catch(Exception e)
    {
        western.display();
    }
}
}
       
    
    
    
