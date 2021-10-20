import java.util.*;
class sam
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("1.Grand prime");
        System.out.println("2.samsung galaxy");
        System.out.println("3.samsung j2");
        System.out.println("4.samsung Z3");
        System.out.println("5.samsung j6");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            prime.display();break;
            case 2:
            galaxy.display();break;
            case 3:
            j2.display();break;
            case 4:
            Z3.display();break;
            case 5:
            j6.display();break;
            case 6:
            gadgets.display();
        }
    }
    catch(Exception e)
    {
    sam.display();
}
}
}
       
