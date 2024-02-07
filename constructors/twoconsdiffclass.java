package constructors;

public class demo {
    int roll;
    String name;

    demo() {
        roll = 1;
        name = "ram";
    }

    demo(int i, String s) {
        roll = i;
        name = s;
    }

    void display() {
        System.out.println("name = " + name);
        System.out.println("roll no= " + roll);
    }
}

public class twoconsdiffclass {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo(2, "abhi");
        d1.display();
        d2.display();
        
    }

}
