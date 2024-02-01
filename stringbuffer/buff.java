package stringbuffer;
import java.util.*;

public class buff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two name=");
        String name=sc.nextLine();
    System.out.println("enter last name=");
    String name2=sc.nextLine();
    sc.close();
    System.out.println("length of entered name="+name.length());
    System.out.println("after concat="+name+" "+name2);
    }

}

