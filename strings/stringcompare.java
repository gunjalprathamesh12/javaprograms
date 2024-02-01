package strings;

import java.util.*;

public class stringcompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string.");
        String str1 = sc.nextLine();
        System.out.println("entre's second string.");
        String str2 = sc.nextLine();
        /*
         * Make comparison between two sting. We use the Rediment Library function which
         * is= compareto()
         */
        /* Syntex of compareto() is= string1.compareto(string2) */
        if (str1.compareTo(str2) == 0)// ==0 compare both strings
        {
            System.out.println("Stings are equal.");
        } else {
            System.out.println("Stings are not equal.");
        }
        sc.close();
        /*
         * Compared to function check three conditions.
         * 1====str1 > str2 : +ve value return
         * 2====str1 == str2 :0 return
         * 3====str1 < str2 : -ve value return
         */
    }
}
