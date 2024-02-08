package constructors;

public class VARIABLEARGU {
    public int sumnum(int... args) {
        System.out.println("argulength" + args.length);
        int sum = 0;
        for (int x : args) {
            sum = sum + x;

        }

        return sum;
    }
 
    public static void main(String[] args) {
        VARIABLEARGU v1 = new VARIABLEARGU();
        int sum2 = v1.sumnum(1, 2, 34);
        System.out.println(sum2);
        int sum3 = v1.sumnum(1, 2, 3, 4, 5);
        System.out.println(sum3);
    }
}
/* Variable argument allows methods to accept zero or multiple arguments. */

/*
 * Before variable arguments, we use constructor or arrange for passing
 * parameters. But it is not a good way because we have to maintain them
 */

/*
 * We don't know how many parameters we have to pass in a Method. Then we use
 * variable argument. It is better approach.
 */

/* The structure load in Roberts are overcome in variable argument. */
