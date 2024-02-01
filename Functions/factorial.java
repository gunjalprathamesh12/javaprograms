import java.util.*;
public class factorial {
    public  static int facto(int fact)
    {
        System.out.println("FACTORIAL OF NO="+fact);
        return fact;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER NO=");
         int number=sc.nextInt();
         int fact=1;
         for(int i=1;i<=number;i++)
         {
            fact=fact*i;
         }
         facto(fact);      
         sc.close();
    }
    
}
