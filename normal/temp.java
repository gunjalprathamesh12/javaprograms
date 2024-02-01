package normal;
import java.util.*;
public class temp 
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER MONTH");
        int month=sc.nextInt();
        if (month==1)
        {
            System.out.println("jan"); 
        }
        else if (month == 2)
        {
            System.out.println("feb");    
        }
        else
        {
            System.out.println("DEFAULT");
        }
        sc.close();
        
        
        
        
        
    }
}