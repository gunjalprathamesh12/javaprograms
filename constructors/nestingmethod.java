package constructors;

public class nestingmethod {
    int m, n;

    nestingmethod(int x, int y) {
        m = x;
        n = y;
    }

    int largest() {
        if (m > n) {
            return (m);
        } else if (n > m) {
            return (n);
        } else {
            System.out.println("equal");
            return 0;
        }
    }

    void display() {
        int large = largest();
        System.out.println("largest no=" + large);
    }

    public static void main(String[] args) {
        nestingmethod nest1 = new nestingmethod(60, 70);
        nest1.display();
    }

}
