import java.util.*;

public class coffee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=120,b=80,c=150;
        System.out.println("-----------------------------");
        System.out.println("   Bakery Billing       ");
        System.out.println("-----------------------------");
        System.out.println("Menu");
        System.out.println("1.Coffee-Rs.120");
        System.out.println("2.Tea-Rs.80");
        System.out.println("3.Sandwich-Rs.150");
        
        
        System.out.println("Enter your choice:");
        String ch=sc.nextLine();
    
       
        
        System.out.println("Enter Quantity:");
        int qu=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Applying offer day:");
        String ans=sc.nextLine();
        if(ans.equalsIgnoreCase("yes")&&ch.equalsIgnoreCase("coffee"))
        {
            int ta=(a*qu)/2;

            System.out.println("Total before discount:"+(a*qu));
            System.out.println("Discount applied:"+ta);
            System.out.println("Final Bill:"+ta);
            System.out.println("Enjoy your Coffee !");        
        }
        else if(ans.equalsIgnoreCase("yes")&&ch.equalsIgnoreCase("tea"))
        {
            int ta=(qu*b)/2;
            System.out.println("Total before discount:"+(b*qu));
            System.out.println("Discount applied:"+ta);
            System.out.println("Final Bill:"+ta);
            System.out.println("Enjoy your Tea !");        
        }
        else if(ans.equalsIgnoreCase("yes")&&ch.equalsIgnoreCase("sandwich"))
        {
            int ta=(qu*c)/2;
            System.out.println("Total before discount:"+(c*qu));
            System.out.println("Discount applied:"+ta);
            System.out.println("Final Bill:"+ta);
            System.out.println("Enjoy your Sandwich !");        
        }
          
        else if(ans.equalsIgnoreCase("no")&&ch.equalsIgnoreCase("coffee"))
        {
            System.out.println("Total Bill:"+(a*qu));
            System.out.println("No Discount Applied");
            System.out.println("Final Bill:"+a);
            System.out.println("Enjoy Your Coffee!");

        }
        
        else if(ans.equalsIgnoreCase("no")&&ch.equalsIgnoreCase("tea"))
        {
            System.out.println("Total Bill:"+(b*qu));
            System.out.println("No Discount Applied");
            System.out.println("Final Bill:"+b);
            System.out.println("Enjoy Your Tea!");

        }
         else
        {
            System.out.println("Total Bill:"+(c*qu));
            System.out.println("No Discount Applied");
            System.out.println("Final Bill:"+c);
            System.out.println("Enjoy Your Sandwich!");

        }
        sc.close();
        
        
        
        





    }
    
}
