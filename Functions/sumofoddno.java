
public class sumofoddno {
    public static int oddno(int sum) {
        System.out.println("SUM OF ODD NO'S FROM 1 TO 50"+sum);
        return sum;

    }

    public static void main(String[] args) {
        int i;
        int sum=0;
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        oddno(sum);
    }

}
