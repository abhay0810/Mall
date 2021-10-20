import java.util.*;
class len
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("1.S2");
        System.out.println("2.S3");
        System.out.println("3.S4");
        System.out.println("4.S5");
        System.out.println("5.S6");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            S2.display();break;
            case 2:
            S3.display();break;
            case 3:
            S4.display();break;
            case 4:
            S5.display();break;
            case 5:
            S6.display();break;
            case 6:
            gadgets.display();
        }
    }
    catch(Exception e)
    {
    len.display();
}
}
}
       
