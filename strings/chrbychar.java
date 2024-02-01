package strings;

import java.util.*;

//Here we are going to print each character of full name enter by the user character by character using charat ()
public class chrbychar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name=");
        String fullname = sc.nextLine();// Here nextlin()/ keyword will take all the input (name)from the user, which
                                        // consists of _ (means spaces)also. like=prathamesh gunjal
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
        sc.close();
    }

}
