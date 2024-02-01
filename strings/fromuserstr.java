package strings;
/*Here I have taken the string input from user. */
import java.util.*;

public class fromuserstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME=");
        String name = sc.nextLine(); // newline will take all the string which is entered by user weather it const
                                     // spaces
        System.out.println("NAME=" + name);
        sc.close();
    }
}
