import java.util.*;
class pizza
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Cost of one veg.pizza is Rs.56");
        System.out.println("Enter number of pizza");
        int d=s.nextInt();
        int c=d*56;
        System.out.println("Bill = Rs."+c);
        System.out.println("1.Exit");
        int e=s.nextInt();
        if(e==1)
        Restaurants.display();
    }
    catch(Exception e)
    {
        pizza.display();
    }
}
}
    
