package twodarray;

import java.util.*;

//QUESTION IS+ Searching for an element x in a matrix.
public class searchintwodarray {
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
            // for column
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("ENTER ELEMENT YOU WNAT TO SEARCH=");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("element is found at pos=" + i + "," + j);
                }
            }
        }
        sc.close();

    }

}
