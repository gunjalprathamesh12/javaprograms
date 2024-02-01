import java.util.*;

public class average {
    public static int Avg(int d) {
        System.out.println("AVERAGE IS=" + d);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NO=");
        int a = sc.nextInt();
        System.out.print("ENTER SECOND NUMBER=");
        int b = sc.nextInt();
        System.out.print("ENTER THIRD NO");
        int c = sc.nextInt();
        int d = (a + b + c) / 3;
        Avg(d);
       sc.close();
    }
}
