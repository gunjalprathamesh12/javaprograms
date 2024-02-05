package thiskeyword;

public class thisexample {
    int roll;
    String name;

    thisexample(int roll,String name)
    {
        this.roll=roll;
     this.   name=name;
    }
    void display()
    {
        System.out.println(roll+" "+name);
    }
    public static void main(String[] args) {
        thisexample t=new thisexample(1,"raj");
        thisexample t1=new thisexample(2,"rahul");
        t.display();
        t1.display();
    }
    
}
