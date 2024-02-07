package thiskeyword;

public class thi_s {
    int roll;
    String name;

    thi_s(int r, String n) {
        this.roll = r;
        this.name = n;
    }

    void display() {
        System.out.println(name + roll);
    }

    public static void main(String[] args) {
        thi_s t1 = new thi_s(1, "ravi");
        thi_s t2 = new thi_s(2, "sham");
        t1.display();
        t2.display();
    }

}
