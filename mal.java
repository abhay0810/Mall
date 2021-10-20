import java.util.*;
class mal
{
    static void display()throws InterruptedException
    {
        try
        {
        Scanner s=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("\n \n \n");
        System.out.println("1.Kavi udeshichatu?");
        System.out.println("2.Pulimurugan");
        System.out.println("3.Exit");
        System.out.println("Enter your movie");
        int a=s.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("1.Gold");
            System.out.println("2.Sofa");
            System.out.println("Enter your type of seat");
            int b=s.nextInt();
            if(b==1)
            {
                System.out.println("One seat cost is Rs.180");
                System.out.println("Enter number of seats");
                int d=s.nextInt();
                int g=d*180;
                System.out.println("Bill = Rs."+g);
                System.out.println("1.Exit");
                int c=s.nextInt();
                if(c==1)
                {
                    theatre.display();
                }
            }
            else if(b==2)
            {
                System.out.println("One seat cost is Rs.250");
                System.out.println("Enter number of seats");
                int d=s.nextInt();
                int g=d*250;
                System.out.println("Bill = Rs."+g);
                System.out.println("1.Exit");
                int c=s.nextInt();
                if(c==1)
                {
                    theatre.display();
                }
            }
            break;
            case 2:
            System.out.println("1.Gold");
            System.out.println("2.Sofa");
            System.out.println("Enter your type of seat");
            int v=s.nextInt();
            if(v==1)
            {
                System.out.println("One seat cost is Rs.180");
                System.out.println("Enter number of seats");
                int d=s.nextInt();
                int g=d*180;
                System.out.println("Bill = Rs."+g);
                System.out.println("1.Exit");
                int c=s.nextInt();
                if(c==1)
                {
                    theatre.display();
                }
            }
            else if(v==2)
            {
                System.out.println("One seat cost is Rs.250");
                System.out.println("Enter number of seats");
                int d=s.nextInt();
                int g=d*250;
                System.out.println("Bill = Rs."+g);
                System.out.println("1.Exit");
                int c=s.nextInt();
                if(c==1)
                {
                    theatre.display();
                }
            }
            break;
        
            case 3:
            theatre.display();break;
        }
    }
        
   
       catch(Exception e)
    {
        mal.display();
    }
}
}
            
            