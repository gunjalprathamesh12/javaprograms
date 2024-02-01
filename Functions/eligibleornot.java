import java.util.*;
public class eligibleornot {
    public static void getage(int age)
    {
        if(age>=18)
        {
            System.out.println("ELIGIBLE FOR VOTING");
        }
        else
        {
            System.out.println("NOT ELIGIBLE FOR VOATING");
        }
        return;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Your age=");
       int age=sc.nextInt();
       getage(age);
       sc.close();
    }
    
}
