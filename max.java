import java.util.*;
class max
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("1.K1");
        System.out.println("2.K2");
        System.out.println("3.K3");
        System.out.println("4.K4");
        System.out.println("5.K5");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            K.display();break;
            case 2:
            K1.display();break;
            case 3:
            K2.display();break;
            case 4:
            K3.display();break;
            case 5:
            K4.display();break;
            case 6:
            gadgets.display();
        }
    }
    catch(Exception e)
    {
    max.display();
}
}
}
       
