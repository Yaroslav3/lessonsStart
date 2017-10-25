package exampleScanner;

import java.util.Scanner;

/**
 * Created by Ярик on 11.10.2017.
 */
public class scannerSwitch {
    public static void main(String[] args) {
        //number();                     // 1 вывод чисел от 10 - 2
       // outputOnDisplay();            // 2
        //scannerFor();                 // 3
        // scannerForStar();            // 4
        starRectangle();
    }

    public static void number() {
        int a = 10;
        while (a >= 2) {
            System.out.print(a + " ");
            a--;
        }
    }

    public static void outputOnDisplay() {
        System.out.println("Enter numbers 1 :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int value = scn.nextInt();
            System.out.println("Enter numbers 2 :");
            int value2 = scn.nextInt();
            output(value, value2);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void output(int value, int value2) {
        if (value > value2) {
            while (value != value2) {
                System.out.print(value + " ");
                value--;
            }
        } else if (value2 > value) {
            while (value != value2) {
                System.out.print(value + " ");
                ++value;
            }
        }
    }

    public static void scannerFor() {
        System.out.println("Enter numbers 1 :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int value = scn.nextInt();
            System.out.println("Enter numbers 2 :");
            int value2 = scn.nextInt();
            outputFor(value, value2);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void outputFor(int value, int value2) {
        if (value > value2) {
            for (int i = value2; i < value; i++) {
                System.out.print(i + " ");
            }
        } else if (value < value2) {
            for (int i = value2; i > value; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public static void scannerForStar() {
        System.out.println("Enter numbers 1 :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int value = scn.nextInt();
            outputForStar(value);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void outputForStar(int value) {
        for (int i = 0; i < value; i++) {
            System.out.print("*");
        }
    }

    private static void starRectangle() {
        System.out.println("Enter width  1 :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int width = scn.nextInt();
            System.out.println("Enter height 2 :");
            int height = scn.nextInt();
            rectangle(width, height);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void rectangle(int width, int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0) || (i == height - 1) || (j == 0) || (j == width - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}




