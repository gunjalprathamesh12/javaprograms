package PATTERNS;
//print the pattern
//    *
//   **
//  ***
// ****
//*****
public class star7 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)//for rows
        {
            for(j=1;j<=5-i;j++)//for spaces
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
