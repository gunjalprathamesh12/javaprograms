package thiskeyword;

public class thisex {
    int roll;
    String name;

    thisex(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll + "   " + name);
    }

    public static void main(String[] args) {
        thisex t1 = new thisex(1, "rahul");
        thisex t2 = new thisex(2, "abdul");
        t1.display();
        t2.display();

    }

}
