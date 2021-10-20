import java.util.*;
class building
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\t\t\t ________________________________________");
        Thread.sleep(500);
        System.out.println("\t\t\t |           AVR'S MALL                 |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |                                      |");
        Thread.sleep(500);
        System.out.println("\t\t\t |        _______________               |");
        Thread.sleep(500);
        System.out.println("\t\t\t |        |             |               |");
        Thread.sleep(500);
        System.out.println("\t\t\t |        |    Entry    |               |");
        Thread.sleep(500);
        System.out.println("\t\t\t |        |             |               |");
        Thread.sleep(500);
        System.out.println("\t\t\t ________________________________________");
        System.out.println("Please enter 1 for entry");
        System.out.println("Please enter 0 for exit");
        int a=s.nextInt();
        if(a==1)
        parking.display();
        else if(a==0)
        System.exit(0);
    }
    catch(Exception e)
    {
        System.out.println("\f");
        building.display();
    }
}
}
    
    


        