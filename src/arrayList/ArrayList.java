package arrayList;
import java.util.*;

/**
 * Created by Ярик on 26.10.2017.
 */
public class ArrayList {

    public static void main(String[] args) {
        arrayListStart();
    }

    private static void arrayListStart() {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        int attempt;
        System.out.println("Enter number array :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int random = scn.nextInt();
            System.out.println("Enter number range " + "form [ 0-" + random + "]");
            int b = scn.nextInt();
            System.out.println("output number duplicates : " + b);
            for (int i = 0; i < random; i++) {
                int r = (int) (Math.random() * random);
                list.add(r);
            }
            methodPrint(list, list.size(), b);
            list.sort(Integer::compareTo);
            System.out.println(list);
        } else System.out.println("Exception_01");
        System.out.println("Enter 1 continue \n" +
                           "      2 exit");
        attempt = scn.nextInt();
        if (attempt == 1){
        arrayListStart();
        } else if (attempt == 2){
          System.exit(1);
        }else System.out.println("Exception_02");
        scn.close();
    }

    private static void methodPrint(java.util.ArrayList<Integer> list, int size, int b) {
        int a = 0;
        System.out.println("----- size arrays " + "[" + size + "]");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == b) {
                a++;
            }
        }
            if (a == 0) {
                System.out.println("no item " + b);
            }
            System.out.print("\n reiteration  : [" + a + "]\n ");

    }
}
