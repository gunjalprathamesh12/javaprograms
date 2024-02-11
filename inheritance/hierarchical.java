package inheritance;

import java.util.*;

class student {
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

class marks extends student {
    int per;

    void getper() {
        System.out.println(" enter per=");
        per = sc.nextInt();
    }

    void putper() {
        System.out.println(per);
    }
}

class hierarchical extends student {
    int id;

    void getid() {
        System.out.println("id");
        id = sc.nextInt();
    }

    void putid() {
        System.out.println(id);
    }

    public static void main(String[] args) {
        marks m = new marks();
        hierarchical h = new hierarchical();
        m.getroll();
        m.getper();
        h.getid();
        m.putroll();
        m.putper();
        h.putid();

    }
}