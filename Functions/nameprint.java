import java.util.*;

/**
 * nameprint
 */
public class nameprint {
    public static void myname(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME=");
        String name=sc.next();        
        myname(name);
        sc.close();
    }
}