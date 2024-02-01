import java.util.*;
//package Functions;

public class posnegorzero {

    public static void ans(int number) {
        if (number > 0) {
            System.out.println("POSITIVE NUMBER=" + number);
        } else if (number < 0) {
            System.out.println("negative number=" + number);

        } else if (number == 0) {
            System.out.println("ZERO=" + number);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO=");
        int number = sc.nextInt();
        ans(number);
        sc.close();

    }

}
