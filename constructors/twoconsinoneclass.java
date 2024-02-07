package constructors;

public class twoconsinoneclass {
    int roll;
    String name;

    twoconsinoneclass() {
        roll = 1;
        name = "ravi";
    }

    twoconsinoneclass(int r, String n) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("name =" + name);
        System.out.println("roll=" + roll);
    }

    public static void main(String[] args) {
        twoconsinoneclass t1 = new twoconsinoneclass();
        twoconsinoneclass t2 = new twoconsinoneclass(1, "ram");
        t1.display();
        t2.display();
    }

}
