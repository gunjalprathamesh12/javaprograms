package projects;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
        }

        if (result != 0) {
            System.out.println("Result: " + result);
        }
        input.close();
    }
}
