package typecasting;
public class ImplicitTypecastingExample {
    public static void main(String[] args) {
        // Imagine these variables as boxes holding numbers:
        byte tinyBox = 12;  // Holds small numbers (range: -128 to 127)
        short smallBox = tinyBox;  // Moving to a slightly bigger box (range: -32768 to 32767)
        int mediumBox = smallBox;  // Moving to an even bigger box (range: -2147483648 to 2147483647)
        long largeBox = mediumBox;  // Moving to a really big box (range: -9223372036854775808 to 9223372036854775807)
        float decimalBox = largeBox;  // Moving to a box that can hold decimals (up to 7 digits)
        double biggerDecimalBox = decimalBox;  // Moving to an even bigger decimal box (up to 15 digits)

        // Check the values and types:
        System.out.println("tinyBox (byte): " + tinyBox);
        System.out.println("smallBox (short): " + smallBox);
        System.out.println("mediumBox (int): " + mediumBox);
        System.out.println("largeBox (long): " + largeBox);
        System.out.println("decimalBox (float): " + decimalBox);
        System.out.println("biggerDecimalBox (double): " + biggerDecimalBox);
    }
}
