package exampleScanner.scanneeSwitchCase;

import java.util.Arrays;

/**
 * Created by Ярик on 17.10.2017.
 */
public class lesson3 {
    public static void main(String[] args) {
        // random();
        // printText();
        // showVoid();
        //showTruFalse();
        //showTwo(2);
        //System.out.println(trueFalse(2));



    }

    private static boolean trueFalse(int a) {
        return a == 3;
    }

    private static void showTwo(int a) {
        System.out.println(a);
    }


    private static void showTruFalse() {
        boolean  value = true;
        boolean  value2 = false;
        showBool(value, value2);
    }

    private static void showBool(boolean value, boolean value2) {
        System.out.println(value);
        System.out.println(value2);
    }



    private static void showVoid() {
        int a = 5;
        int b = 5;
        System.out.println(intenerShow(a,b));

    }

    private static int intenerShow(int value, int value2) {
        int sum  = value+value2;
        return sum;
    }

    private static void random() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * mas.length);
        }
        showRandom(mas);
        showRandomInt(mas);
        showLengthArray(mas);
    }

    private static void showRandom(int[] mas) {
        System.out.println(Arrays.toString(mas));
    }
    private static void showRandomInt(int[] mas){
        int[] mas2 = new int[10];
        for (int i = 0; i <mas2.length ; i++) {
            mas2[i] = mas[(int) (Math.random()* mas.length)];
        }
        System.out.println(Arrays.toString(mas2));
    }

    private static void showLengthArray(int[] mas) {
        int[] mas3 = new int[mas.length];
        for (int i = 0; i <mas.length ; i++) {

        }
        System.out.println(Arrays.toString(mas3));
    }

    private static void printText(){
        System.out.println("text");
    }

}

