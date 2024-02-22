package loops;

import java.util.*;

public class switchcase {
       public static void main(String args[]) {
              int a = 10;
              int b = 20;
              Scanner sc = new Scanner(System.in); // Create a Scanner object
              while (true) {

                     System.out.print(
                                   "Enter your choice (1 for addition, 2 for subtraction, 3 for division, 4 for multiplication): ");
                     int ch = sc.nextInt(); // Read the user's choice

                     sc.close();
                     switch (ch) {
                            case 1:
                                   // c=a+b;
                                   System.out.println("ADDITION IS=" + (a + b));
                                   break;
                            case 2:
                                   // c=a-b;
                                   System.out.println("SUBSTRACTION IS=" + (a - b));
                                   break;
                            case 3:
                                   // c=a/b;
                                   System.out.println("DIVISION IS=" + (a / b));
                                   break;
                            case 4:
                                   // c=a*b;
                                   System.out.println("MULTIPLICATION IS=" + (a * b));
                                   break;
                            default:
                                   System.out.println("Oops! That's not a valid option. Please try again.");
                                   continue;
                     }

              }
       }
}
