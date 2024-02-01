package array_s;

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY YOU WANT =");
        int size = sc.nextInt();
        int i;
        System.out.println("INSERT ELEMENTS IN ATTAY=");
        int[] number = new int[size];
        for (i = 0; i <= size; i++) {
            number[i] = sc.nextInt();
            sc.close();
        }
        
        System.out.println("ELEMENTS ARE");
        for (i = 0; i <= size; i++) {
            System.out.println(number[i]);
        }
    }
}

