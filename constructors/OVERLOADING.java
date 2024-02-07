package constructors;

public class OVERLOADING {
    int roll;
    String name;

    OVERLOADING() {
        roll = 1;
        name = "rama";
    }

    OVERLOADING(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + name);
    }

    public static void main(String[] args) {
        OVERLOADING o1 = new OVERLOADING();
        OVERLOADING o2 = new OVERLOADING(1, "sharad");
        o1.display();
        o2.display();
    }

}
