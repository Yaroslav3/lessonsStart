package arrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Ярик on 26.10.2017.
 */
public class ArrayList extends java.util.ArrayList {
    public static void main(String[] args){
        arrayListStart();
    }

    private static void arrayListStart() {
        ArrayList listOdd = new ArrayList();
        ArrayList listEven = new ArrayList();
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 1) {
                listOdd.add(i);
            }else if (i%2 != 0){
                listEven.add(i);
            }
        }
        prinArray(listOdd, listOdd.size());
        prinArray(listEven, listEven.size());
    }
    private static void prinArray(ArrayList list, int size) {
        System.out.print(list + "   \n" +"["+ size + "]");
        System.out.println(" ");
        System.out.println();
    }
}
