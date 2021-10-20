import java.util.*;
class north
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("\t \t \t \t  Welcome to North Indian  Restaurant");
        System.out.println("\n \n \n \n \n");
        System.out.println("1.Aloo paratha");
        System.out.println("2.Gobi paratha");
        System.out.println("3.paneer paratha");
        System.out.println("4.Ghee Rice");
        System.out.println("5.Rajma Rice");
        System.out.println("6.Exit");
        System.out.println("Enter your type of food");
        int e=s.nextInt();
        switch(e)
        {
            case 1:
            sultan.display();break;
            case 2:
            mast.display();break;
            case 3:
            treat.display();break;
            case 4:
            yellow.display();break;
            case 5:
            delhi.display();break;
            case 6:
            Restaurants.display();
        }
    }
    catch(Exception e)
    {
    north.display();
}
}
}
       
