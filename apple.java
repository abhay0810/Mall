import java.util.*;
class apple
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("1.Iphone");
        System.out.println("2.Iphone 2");
        System.out.println("3.Iphone 3");
        System.out.println("4.Iphone 4");
        System.out.println("5.Iphone 5");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            i.display();break;
            case 2:
            i2.display();break;
            case 3:
            i3.display();break;
            case 4:
            i4.display();break;
            case 5:
            i5.display();break;
            case 6:
            gadgets.display();
        }
    }
    catch(Exception e)
    {
    apple.display();
}
}
}
       
