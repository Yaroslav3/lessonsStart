package method;

import java.util.Arrays;
import java.util.Scanner;



/**
 * Created by Ярик on 16.10.2017.
 */
public class methodExampleTwo {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // methodRandom();
        // methodZero();
        // methodVector();   // не доделал (((( -----
        getArrayInt(10);

    }

    private static void methodRandom() {
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        randomShow(mas);
        System.out.println("Select a number in the range " + " [" + mas.length + "] " + " for  output array");
        int a = scn.nextInt();
        int b = scn.nextInt();
        setValue(a, b, mas);
    }

    private static void randomShow(int[] mas) {

        System.out.println(Arrays.toString(mas));
    }

    private static void setValue(int value, int value2, int[] mas) {

        if (value > value2) {
            getArray(value, value2, mas);

        } else if (value2 > value) {
            getArray(value2, value, mas);
        }

    }

    private static int[] getArray(int value, int value2, int[] mas) {
        int[] res = new int[mas.length];
        if (value2 >= mas.length - value2) {
            for (int i = value2; i >= mas.length - value2; i++) {
                for (int j = i; j <= value; j++) {
                    res[j] = mas[j];
                }
            }
        } else if (value2 <= mas.length - value2) {
            for (int i = value2; i <= mas.length - value2; i++) {
                for (int j = i; j <= value; j++) {
                    res[j] = mas[j];

                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    /********************************************************************/
    //                                                                    //

    /********************************************************************/
    private static void methodZero() {
        System.out.println("Output odd numbers in an array");
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;

        }
        System.out.println(Arrays.toString(mas));
        methodArrayOdd(mas);
        methodArrayEven(mas);


    }

    private static int[] methodArrayOdd(int[] mas) {
        int[] res = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 1) {
                res[i] = mas[i];
            }
        }
        showOdd(res);
        return res;
    }


    private static int[] methodArrayEven(int[] mas) {
        int[] res = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                res[i] = mas[i];
            }
        }
        showEven(res);
        return res;
    }


    private static void showOdd(int[] mas) {

        System.out.println(Arrays.toString(mas));
    }

    /********************************************************************/
    /**
     * метод принемающий массив vector и возвращает массив четных чисел                                                                 //
     * /
     ********************************************************************/
    private static void methodVector() {
        System.out.println("Method return array even numbers :");
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;

        }
        vector(mas);
    }

    private static int[] vector(int[] mas) {
        int[] res = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            res[i] = mas[i];


        }
        showEven(res);

        return res;
    }

    private static int[] showEven(int[] mas) {
        System.out.println(Arrays.toString(mas));
        int[] masEven = new int[0];
        int a = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 != 1) {
                masEven = new int[a+1];
                System.out.print(mas[i] +" ");
                for (int j = 0; j < masEven.length ; j++) {
                    masEven[j] = mas[i];
                }
                a++;
            }
        }
        System.out.println();
        System.out.println(a + " проходы ");
        System.out.println(Arrays.toString(masEven) +" arrays");
     return masEven;
    }

    public static int[] getArrayInt (int k){
     int[] res = new int[k];
        for (int i = 0, b =2; i < res.length; i++, b++) {
            res[i] = i+b;
        }

        printVector(res);
        return res;
    }

    private static void printVector(int[] res) {
        System.out.println(Arrays.toString(res));

    }

}