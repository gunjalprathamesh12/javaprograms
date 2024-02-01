package twodarray;

import java.util.*;

public class twodarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array syntax= int[][] marks = new int[3][3];
        // type[][] arrayname=new typr[rows][columns];
        int[][] numbers = new int[3][5];
        System.out.print("Enter rows");
        int rows = sc.nextInt();
        System.out.print("Enter cloumns");
        int column = sc.nextInt();
        System.out.println("Enter elemenst=");
        // for rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("ELEMENTS ARE=");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println();
        sc.close();
    }

}
/*
 * 2D Arrays In Java
 * It is similar to 2D matrices that we studied in 11th and 12th class.
 * a. Creating a 2D Array - with new keyword
 * int[][] marks = new int[3][3];
 */