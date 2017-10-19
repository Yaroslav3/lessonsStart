package method;

import java.util.Scanner;

/**
 * Created by Ярик on 19.10.2017.
 */
public class stringMethod {
    public static void main(String[] args) {

        //System.out.println(isFirstLastCharsEquals("travel"));
        methodStringEquals();


    }

    private static boolean isFirstLastCharsEquals(String s) {
        boolean bool = false;
        if (s.charAt(0) == s.charAt(4)) {
            bool = true;
        }
        return bool;
    }


    private static void methodStringEquals() {

        System.out.println("написать  одно слово и подстроку этого слова что-бы было true");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String s1 = scn.next();

        System.out.println(boolString(s,s1));

        scn.close();
    }

    private static boolean boolString(String s, String s1) {

        return s.contains(s1);
    }

}
