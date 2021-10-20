import java.util.*;
class tab
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("\t \t \t \t  Welcome to Tab world");
        System.out.println("\n \n \n \n \n");
        System.out.println("1.apple");
        System.out.println("2.samsung");
        System.out.println("3.Hp");
        System.out.println("4.Lenovo");
        System.out.println("5.LG");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            apple2.display();break;
            case 2:
            sam1.display();break;
            case 3:
            hp1.display();break;
            case 4:
            len2.display();break;
            case 5:
            lg1.display();break;
            case 6:
            gadgets.display();break;
        }
    }
    catch(Exception e)
    {
    tab.display();
}
}
}
       
