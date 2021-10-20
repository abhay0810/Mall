import java.util.*;
class kia
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("1.ASHA 501");
        System.out.println("2.ASHA 502");
        System.out.println("3.ASHA 503");
        System.out.println("4.ASHA 504");
        System.out.println("5.ASHA 505");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            asha.display();break;
            case 2:
            asha1.display();break;
            case 3:
            asha2.display();break;
            case 4:
            asha3.display();break;
            case 5:
            asha4.display();break;
            case 6:
            gadgets.display();
        }
    }
    catch(Exception e)
    {
    kia.display();
}
}
}
       
