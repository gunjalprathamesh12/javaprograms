package PATTERNS;

public class binarypattern {
//print the pattern
//1
//01
//101
//0101
//10101
    public static void main(String[] args) {
        int i,j;
    
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0)//even
                {
                    
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
