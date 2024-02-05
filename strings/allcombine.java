package strings;

import java.util.*;

public class allcombine {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Your Name=");
        String name = ip.nextLine();
        System.out.println("Name=" + name);
        System.out.println("LENGTH OF ENTERED NAME IS =");
        System.out.println(+name.length());
        System.out.println("after char by char");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(+name.charAt(i));
        }
        ip.close();

    }

}
