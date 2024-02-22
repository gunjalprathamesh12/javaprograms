package array_s;

import java.util.*;

import strings.fromuserstr;

class names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[3];// declare
        for (int i = 0; i < 3; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("names");
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i]);
        }
        sc.close();
    }

}
