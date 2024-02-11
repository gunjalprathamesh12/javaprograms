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

class dod extends marks {
    String grade;

    void getgrade()
    {
        System.out.println("grade=");
        grade = sc.nextLine();
    }

    void putgrade() 
    {
        System.out.println(grade);
        sc.close();
    }

    public static void main(String[] args)
     {
        dod d = new dod();
        d.getroll();
        d.getmark();
        d.getgrade();
        d.putroll();
        d.putmark();
        d.putgrade();
    }
}