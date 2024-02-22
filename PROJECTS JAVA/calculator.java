import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int ch;
        System.out.println("Enter first no=");
        a = sc.nextInt();
        System.out.println("Enter second number="); 
        b = sc.nextInt();
        while (true) {

            System.out.println(
                    "Enter Which Operation You Want to Perform/n(1= ADDITION /2= SUBSTRACTION /3= MULTIPLIATION /4= DIVISION");
            System.out.println("ENTER YOUR CHOICE=");
            ch = sc.nextInt();
            sc.close();
            switch (ch) {
                case 1:
                    System.out.println("ADDITION OF TWO NO's is =" + (a + b));

                    break;
                case 2:
                    System.out.println("sunstraction of two no's=" + (a - b));
                    break;
                case 3:
                    System.out.println("MUltiplication of two nos is=" + (a * b));
                    break;
                case 4:
                    System.out.println("DIVISION OF ENTERED TWO NO's is=" + (a / b));
                    break;
                default:
                    System.out.println("WORNG CHOICE!!!\n Please enter a correct choice ");
                    continue;

            }
        }

    }

}
