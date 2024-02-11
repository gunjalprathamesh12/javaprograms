package inheritance;

import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);
    int roll_no;

    void getroll() {
        System.out.println("enter roll_no");
        roll_no = sc.nextInt();
    }

    void displayroll() {
        System.out.println(roll_no);
    }
}

class marks extends student {
    int marks;

    void getmarks() {
        System.out.println("enter mraks=");
        marks = sc.nextInt();
    }

    void displaymarks() {
        System.out.println(marks);
    }

    public static void main(String[] args) {
        marks m1 = new marks();
        marks m2 = new marks();
        m1.getroll();
        m2.getroll();
        m1.getmarks();
        m2.getmarks();
        m1.displayroll();
        m2.displaymarks();
        m1.displaymarks();
        m2.displayroll();

    }
}



