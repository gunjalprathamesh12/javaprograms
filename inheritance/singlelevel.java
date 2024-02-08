package inheritance;

import java.util.*;

class demo {
    Scanner sc = new Scanner(System.in);
    int roll;

    void getroll() {
        System.out.println("enter roll");
        roll = sc.nextInt();
    }

    void putroll() {
        System.out.println("ROLL =" + roll);
    }

}

/**
 * singlelevel
 */
public class singlelevel extends demo {
    public static void main(String[] args) {
        singlelevel s = new singlelevel();
        s.getroll();
        s.putroll();

    }
}
