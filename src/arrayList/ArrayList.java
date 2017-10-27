package arrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Ярик on 26.10.2017.
 */
public class ArrayList extends java.util.ArrayList {
    public static void main(String[] args) {
        arrayListStart();
    }

    private static void arrayListStart() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        int size = list.size();
        printArray(list, size);
    }

    private static void printArray(ArrayList list, int size) {
        System.out.println(size);
        int a = 0;
        ArrayList list2 = new ArrayList();
        {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 100; j += 10) {
                    if (i >= j) {
                        list2.add(j);
                        a++;
                        System.out.print("[" + a + "]" + " = " + j + "\n");
                    }
                }

            }
        }
    }
}
