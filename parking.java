import java.util.*;
class parking
{
    static void display()throws InterruptedException
    {
        try
        {
       Scanner s=new Scanner(System.in);
       System.out.print("\f");
       System.out.println("\t \t \t \t Welcome To AVR'S MALL parking");
       System.out.println("1.Four wheeler parking");
       System.out.println("2.Two wheeler parking");
       System.out.println("3.For shopping");
       System.out.println("Enter your choice");
       int a=s.nextInt();
       if(a==1)
           {
           double bill=100.0;
           System.out.println("Bill for parking = "+bill);
           Thread.sleep(1250);
           shopping.display();
           }
        else if(a==2)
        {
             double bill=75.0;
           System.out.println("Bill for parking = "+bill);
           Thread.sleep(1250);
           shopping.display();
        }
        else if(a==3)
        {
        shopping.display();
    }
    }
    catch(Exception e)
    {
        parking.display();
    }
}
}

           
           
           
    

    
