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
        // methodVector();
        // getArrayInt(10);
        // stringShow();
        // returnString();
        // halfString();
        // palindrome();

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

    private static void showEven(int[] mas) {
        System.out.println(Arrays.toString(mas));
        int a = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 != 1) {
                a++;
                System.out.print(mas[i] + " ");
            }
        }
        int[] masEven = new int[a];
        for (int i = 0; i < masEven.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[j]% 2 !=1){
                    masEven[i] = mas[j];
                    i++;
                }
            }
        }

            System.out.println();
            System.out.println(a + " проходы ");
            System.out.println(Arrays.toString(masEven) + " arrays");
        }


    private static void getArrayInt(int k) {

    int[] res = new int[k];
            for (int i = 0, b = 2; i < res.length; i++, b++) {
                res[i] = i + b;
            }

            printVector(res);

        }


    private static void printVector(int[] res) {
        System.out.println(Arrays.toString(res));

    }

    public static void stringShow(){
        System.out.println("Enter please word :");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        printStringA(s);
        scn.close();
    }

    private static void printStringA(String s) {
        int a =  s.indexOf('a');
        System.out.println(a);
    }

    public static void returnString(){
        System.out.println("Enter please word :");
       Scanner scn = new Scanner(System.in);
       String s = scn.nextLine();
        System.out.println(invert(s));
       scn.close();
    }

    private static String invert(String s) {
        int length = s.length();
        char[] arrayChar = new char[length];
        char[] invertChar = new char[length];

        for (int i = 0; i < length;i++ ) {
            arrayChar[i] = s.charAt(i);
            for (int j = 0; j < length; j++) {
                invertChar[j] = arrayChar[length-1-j];
            }
        }

        String s1 = new String(invertChar);
        return s1;
    }

    public static void halfString(){
        System.out.println("Enter please word :");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        System.out.println(half(s));
        scn.close();
    }

    private static String half(String s) {
        int length = s.length();
        int a = length/2;
        String s1 = s.substring(a,length);

        return s1;
    }

    private static void palindrome() {
        System.out.println("Enter please word : ");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        palindromeString(s);

        scn.close();
    }

    private static void palindromeString(String s) {
        int length = s.length();
        switch (length) {
            case 3:
                System.out.println(s.charAt(0) == s.charAt(2) ? "Word palindrome " : "not a palindrome");
                break;
            case 4:
                System.out.println(s.charAt(0) == s.charAt(3)
                        && s.charAt(1) == s.charAt(2) ? "Word palindrome " : "not a palindrome");
                break;
            case 5:
                System.out.println(s.charAt(0) == s.charAt(4)
                        && s.charAt(1) == s.charAt(3) ? "Word palindrome " : "not a palindrome");
                break;
            case 6:
                System.out.println(s.charAt(0) == s.charAt(5) && s.charAt(1) == s.charAt(4)
                        && s.charAt(2) == s.charAt(3) ? "Word palindrome " : "not a palindrome");
                break;
            case 7:
                System.out.println(s.charAt(0) == s.charAt(6) && s.charAt(1) == s.charAt(5)
                        && s.charAt(2) == s.charAt(4) ? "Word palindrome " : "not a palindrome");
                break;
                default:
                    System.out.println("Enter the word up to 7 letters ");
                    break;
        }
    }
}