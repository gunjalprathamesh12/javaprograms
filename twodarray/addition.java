package twodarray;

import java.util.*;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        System.out.print("ENTER FIRST ARRAY ELEMENTS=");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("ENTER SECOND ARRAY ELEMENTS=");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("ADDITION IS=");
        {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(c[i][j] + " ");
                }
            }
        }
        sc.close();
    }

}
