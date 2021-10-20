import java.util.*;
class south
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.print("\t \t \t \t Welcome to South Indiain Restaurant");
        System.out.println("\n \n \n");
        System.out.println("1.Masala Doosa");
        System.out.println("2.Plain Doosa");
        System.out.println("3.Onion Doosa");
        System.out.println("4.Vada");
        System.out.println("5.Idly");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int b=s.nextInt();
        switch(b)
        {
            case 1:
            masala.display();break;
            case 2:
            plain.display();break;
            case 3:
            onion.display();break;
            case 4:
            vada.display();break;
            case 5:
            idly.display();break;
            case 6:
            Restaurants.display();break;
        }
    }
    catch(Exception e)
    {
        south.display();
    }
}
}
            
        
    

    
