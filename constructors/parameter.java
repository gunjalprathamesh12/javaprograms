package constructors;

public class parameter {
    public static void main(String[] args) {
        student s = new student(5, "ravi");
        s.display();

    }

}

class student {
    int s_roll;
    String s_name;

    student(int r, String n) {
        s_roll = r;
        s_name = n;

    }

    void display() {
        System.out.println("Student Roll no=" + s_roll);
        System.out.println("Student name =" + s_name);
    }

}