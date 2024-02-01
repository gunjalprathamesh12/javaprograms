package loops;

public class whileloop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            if(i%2==0)
            {
                System.out.println("even no ="+i);
                
            }
            else
            {
                System.out.println("odd no="+i);
            }
            i++;
            
        }
    }
    
}
