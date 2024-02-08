package inheritance;

import java.util.*;

/**
 * multilevel
 */
class demo {
    Scanner sc = new Scanner(System.in);
    int roll;

    void getroll() {
        System.out.println("enter roll");
        roll = sc.nextInt();
    }

    void putroll() {
        System.out.println(roll);
    }
}

class marks extends demo {
    int mark;

    void getmark() {
        System.out.println("marks=");
        mark = sc.nextInt();
    }

    void putmark() {
        System.out.println(mark);
    }
}

class dod extends demo {
    public static void main(String[] args) {
        demo d = new demo();
        marks m = new marks();
        d.getroll();
        m.getmark();
        d.putroll();
        m.putmark();
    }
}