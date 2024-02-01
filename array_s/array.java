package array_s;

public class array {

    public static void main(String[] args) {
        int[] marks = new int[5];/* SYNTAX==== type[] array_name = new type[] */
        marks[0] = 90;
        marks[1] = 89; /* array is the collection of same data type, but different data elements. */
        marks[2] = 78;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // OR
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

    }
}