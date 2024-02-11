package inheritance;
import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);
    int roll;

    void getroll() {
        System.out.println("enter roll_no");
        roll = sc.nextInt();
    }

    void putroll() {
        System.out.println(roll);
    }
}

class temp extends student {
    int marks;

    void getmarks() {
        System.out.println("enetr marks=");
        marks = sc.nextInt();
    }

    void putmarks() {
        System.out.println(marks);
    }

    public static void main(String[] args) {
        temp t[] = new temp[5];
        for (int i = 0; i < 5; i++) {
            t[i] = new temp();
            t[i].getroll();
            t[i].getmarks();

        }
        for (int i = 0; i < 5; i++) {
            t[i].putroll();
            t[i].putmarks();
        }

    }

}
/*
 * In for loop . while creating array of objects. the for loop start from the
 * zero and exposition. Because in array. elements are stored from zero index
 * position. to North minus one numbers
 */