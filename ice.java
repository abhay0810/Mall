import java.util.*;
class ice
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("\t \t \t \t  Welcome to Ice world");
        System.out.println("\n \n \n \n");
        System.out.println("1.pista kulfi");
        System.out.println("2.badam kulfi");
        System.out.println("3.Choco-bar");
        System.out.println("4.Mango mist");
        System.out.println("5.Butterscotch");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int d=s.nextInt();
        switch(d)
        {
           case 1:
          pkulfi.display();break;
           case 2:
           bkulfi.display();break;
           case 3:
           choco.display();break;
           case 4:
           mango.display();break;
           case 5:
           butter.display();break;
           case 6:
           Restaurants.display();break;
        }
    }
    catch(Exception e)
    {
        ice.display();
    }
}
}
       
    
    
    
