public class oneshot {
    public static void main(String[] args) {
        // Create an empty StringBuilder
        StringBuilder sb = new StringBuilder();

        // Append strings
        sb.append("Hello, ");
        sb.append("world!");

        // Insert at a specific position
        sb.insert(5, " Java");

        // Replace a substring
        sb.replace(7, 12, "universe");

        // Delete characters
        sb.delete(0, 5);

        // Reverse the string
        sb.reverse();

        System.out.println("Modified string: " + sb.toString());
    }
}
