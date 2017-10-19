package method;

import java.util.Scanner;

/**
 * Created by Ярик on 19.10.2017.
 */
public class qwe {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int k;
            System.out.println("Input your numeral: ");
            if (sc.hasNextInt()){
                k = sc.nextInt();
                int b = (char) k;
                System.out.println("Your input numeral or number");
                if (b > 10){
                    System.out.println("Your input numeral: " + (char) b);
                }else
                    System.out.println("Your input not numeral");
            }else
                System.out.println("Your input not numeral or number");

        }

}
