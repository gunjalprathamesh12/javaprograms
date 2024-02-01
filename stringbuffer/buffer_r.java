package stringbuffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffer_r {
    public static void main(String args[]) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String name;
        name = buff.readLine();
        System.out.println(name);

    }

}
/*BufferrReader=new bufferReader(new InputStreamReader(System.in) ) */