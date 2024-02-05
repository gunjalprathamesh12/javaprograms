package normal;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Equal to (==) operator
        boolean isEqual = (a == b);
        System.out.println("a == b: " + isEqual);

        // Not equal to (!=) operator
        boolean isNotEqual = (a != b);
        System.out.println("a != b: " + isNotEqual);

        // Greater than (>) operator
        boolean isGreater = (a > b);
        System.out.println("a > b: " + isGreater);

        // Less than (<) operator
        boolean isLess = (a < b);
        System.out.println("a < b: " + isLess);

        // Greater than or equal to (>=) operator
        boolean isGreaterOrEqual = (a >= b);
        System.out.println("a >= b: " + isGreaterOrEqual);

        // Less than or equal to (<=) operator
        boolean isLessOrEqual = (a <= b);
        System.out.println("a <= b: " + isLessOrEqual);
    }
}
