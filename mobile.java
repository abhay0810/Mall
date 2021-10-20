import java.util.*;
class mobile
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("\t \t \t \t  Welcome to mobile world");
        System.out.println("\n \n \n \n \n");
        System.out.println("1.apple");
        System.out.println("2.samsung");
        System.out.println("3.nokia");
        System.out.println("4.micromax");
        System.out.println("5.lenovo");
        System.out.println("6.Exit");
        System.out.println("Enter your type of food");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            apple.display();break;
            case 2:
            sam.display();break;
            case 3:
            kia.display();break;
            case 4:
            max.display();break;
            case 5:
            len.display();break;
            case 6:
            gadgets.display();break;
        }
    }
    catch(Exception e)
    {
    mobile.display();
}
}
}
       
