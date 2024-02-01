import java.util.*;

public class addition {
    public static int sum(int c) {
        System.out.println("Sum is =" + c);
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NO=");
        int a = sc.nextInt();
        System.out.print("ENTER SECOND NUMBER= ");
        int b = sc.nextInt();
        int c = a + b;
        sum(c);
        sc.close();

    }
}
