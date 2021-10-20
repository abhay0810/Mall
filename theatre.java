import java.util.*;
class theatre
{
    static void display()throws InterruptedException
    {
        try
        {
        System.out.print("\f");
        Thread.sleep(500);
        Scanner s=new Scanner(System.in);
        System.out.println("\t \t \t \t\t Welcome to Movie world");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("1.English");
        System.out.println("2.Hindi");
        System.out.println("3.Malayalam");
        System.out.println("4.Kannada");
        System.out.println("5.Exit");
        System.out.println("Enter your type of language");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            english.display();
            break;
            case 2:
            hindi.display();break;
            case 3:
            mal.display();break;
            case 4:
            kan.display();break;
            case 5:
            shopping.display();
        }
    }
    catch(Exception e)
    {
    theatre.display();
}
}
}

           
        
    

