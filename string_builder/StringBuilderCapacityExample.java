public class StringBuilderCapacityExample {
    public static void main(String[] args) {
        // Create a StringBuilder with initial capacity
        StringBuilder sb = new StringBuilder(20);
        System.out.println("initial capacity of StringBuilder =" + sb.capacity());

        // Append some content
        sb.append("This is a long string that requires more capacity.");

        /*
         * When you use a StringBuilder in Java and append more than its initial
         * capacity (which is typically 16 characters), the StringBuilder automatically
         * increases its capacity to accommodate the additional characters.
         * 
         */

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Final string: " + sb.toString());
    }
}
