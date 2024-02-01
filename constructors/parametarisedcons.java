package constructors;

public class parametarisedcons {
    public static void main(String[] args) {
        parameter p=new parameter(1,"ravi");
        p.display();
        
    }
    
}
class parameter
{
    int s_roll;
    String s_name;
    parameter(int n,String s)
    {
        s_roll=n;
        s_name=s;

    }
    void display()
    {
        System.out.println(s_roll);
        System.out.println(s_name);
    }
}