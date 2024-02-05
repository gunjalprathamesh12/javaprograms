package constructors;

public class para {
    String name;
    int age;

    para(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("name =" + name);
        System.out.println("age=" + age);
    }

    public static void main(String[] args) {
        para p = new para("ram", 20);
        p.display();
    }
}
