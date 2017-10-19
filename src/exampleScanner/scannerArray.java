package exampleScanner;

import java.util.Scanner;

/**
 * Created by Ярик on 12.10.2017.
 */
public class scannerArray {
    public static void main(String[] args) {
        //scanner();                 // во 2-й элемент поместить сумму 2-го и 3-го элемента.
        //scannerChange();           // поменять местами первй и последний элемент.
        //scannerSequence();         // заполнение последовательностью m, m-2, m-2.
        //scannerLength();          // если количество элементов четное, то в нутри должно быть 2 нуля.


    }

    private static void scanner() {
        System.out.println("Enter the size of the array :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int number = scn.nextInt();
            array(number);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void array(int number) {
        int[] mas = new int[number];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int value = mas[2];
        int value2 = mas[3];
        int sum = value + value2;
        mas[2] = sum;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void scannerChange() {
        System.out.println("Enter the size of the array :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int number = scn.nextInt();
            change(number);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void change(int number) {
        int[] mas = new int[number];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int length = mas.length - 1;
        int oneNumber = mas[0];
        int lastNumber = mas[length];
        mas[length] = oneNumber;
        mas[0] = lastNumber;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void scannerSequence() {
        System.out.println("Enter the size of the array :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int number = scn.nextInt();
            sequence(number);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void sequence(int number) {
        int[] mas = new int[number];
        for (int m = mas.length; m >= 0; m -= 2) {
            System.out.print(m + " ");
        }
    }

    public static void scannerLength() {
        System.out.println("Enter the size of the array :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int number = scn.nextInt();
            length(number);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void length(int number) {
        int[] mas = new int[number];

        if (mas.length % 2 == 0) {
            for (int a = mas.length; a >= 0; a--) {
                System.out.print(a + " ");
            }
            for (int b = 0; b < mas.length+1; b++) {
                System.out.print(b + " ");
            }
        } else if (mas.length % 2 == 1) {
            for (int a = mas.length; a >= 0; a--) {
                System.out.print(a + " ");
            }
            for (int b = 1; b < mas.length+1; b++) {
                System.out.print(b + " ");
            }
        }
    }
}