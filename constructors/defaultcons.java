package constructors;

class student
{
    int roll_no;
    String name;
    student()//
    {
        roll_no=1;
        name="ravi";
    }
    void display()
    {
        System.out.println(roll_no);
        System.out.println(name);
    }

}

public class defaultcons {
    public static void main(String[] args) {
        student s=new student();
        s.display();
        
    }
    
}

