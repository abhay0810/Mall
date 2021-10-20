import java.util.*;
class clothing
{
    static void display()throws InterruptedException
    {
        try
        {
        System.out.print("\f");
        Thread.sleep(500);
        Scanner s=new Scanner(System.in);
        System.out.println("\t \t \t \t\t Welcome to clothing world");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("1.Men");
        System.out.println("2.Women");
        System.out.println("3.Children");
        System.out.println("4.Exit");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            men.display();
            break;
            case 2:
            women.display();break;
            case 3:
            child.display();break;
            case 4:
            shopping.display();
        }
    }
    catch(Exception e)
    {
    clothing.display();
}
}
}

           
        
    

