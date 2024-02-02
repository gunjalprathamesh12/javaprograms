package constructors;

public class defa {
    String name;//declare
    int age;//declare
    defa()
    {
        name="ravi";
        age=10;

    }
    void display()
    {
        System.out.println("NAME="+name);
        System.out.println("AGE="+age);
    }
    public static void main(String[] args) {
      defa d=new defa();
      d.display();
      
        
    }
    
}
