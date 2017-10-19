package exampleScanner.scanneeSwitchCase;

import java.util.Arrays;
import java.util.Scanner;

public class lessons2 {

    public static void main(String[] args) {
        // arrayMas();
        // oddEven();
        // tracer();
        // arrayMasForWhile();
        // count();
        // searchScanner();
        // comparison();
        // array();
        // scanner();
        // scannerArray();

    }


    public static void arrayMas() {
        int[] mas = new int[11];
        for (int i = 1; i < mas.length; i++) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
        }
    }

    public static void oddEven() {
        int[] mas = new int[100];
        for (int i = 1; i < mas.length; i++) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0) {
                System.out.println("even" + " ");
            } else if (mas[i] % 2 == 1) {
                System.out.println("add" + " ");
            }
        }
    }

    public static void tracer() {
        String s = "trecer";
        for (int i = 0; i < 10; i++) {
            System.out.print(s + " ,");
        }
        System.out.println(" ");
        int i = 0;

        while (i < 10) {
            System.out.print(s + " " + i + " ");
            i++;
        }
    }

    private static void arrayMasForWhile() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int i = 9;
        while (i >= 0) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
            i--;
        }
    }

    private static void count() {
        int[] mas = new int[11];
        int count2 = 0;
        int count = 10;
        while (count >= 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println(" ");
        while (count2 < 11) {
            mas[count2] = count2;
            System.out.print(count2 + " ");
            count2++;
        }
    }

    private static void searchScanner() {
        System.out.println("Enter value  from 0 - 9 :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int value = scn.nextInt();
            search(value);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void search(int value) {

        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9);
            System.out.print(mas[i] + " ");
            if (mas[i] == value) {
                System.out.println("number it is here");
            } else
                System.out.println("not value");
        }
    }

    private static void comparison(int value) {
        int[] mas = new int[(int) (Math.random() * 10)];
        int[] mas2 = new int[(int) (Math.random() * 10)];
        System.out.println(mas.length + " Array 1");
        System.out.println(mas2.length + " Array 2");

        if (mas.length > mas2.length) {
            System.out.println("Array 1 > Array 2");
        } else if (mas.length < mas2.length) {
            System.out.println("Array 2 > Array 1");
        } else if (mas.length == mas2.length) {
            System.out.println("Array 2 == Array 1 ");
        }
    }

    private static void array() {
        int[] mas = new int[11];
        for (int i = 1; i < mas.length; i++) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
            if (mas[i] == 1 || mas[i] == 2 || mas[i] == 3 || mas[i] == 4 || mas[i] == 5) {
                mas[1] = 12;
                mas[2] = 12;
                mas[3] = 12;
                mas[4] = 12;
                mas[5] = 12;
            }
        }
        System.out.println();
        for (int j = 1; j < mas.length; j++) {
            System.out.print(mas[j] + " ");
        }
    }
    public static void scanner() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter please size array : ");
        if (scn.hasNextInt()) {
            int value = scn.nextInt();
            pairedNumbers(value);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void pairedNumbers(int value) {
        int[] mas = new int[value];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        System.out.println("even array ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
               sortBubble(mas);
            }
        }
        System.out.println();
        System.out.println("add array ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 1) {
                sort(mas);
            }
        }
    }

    private static void sortBubble(int[] mas) {
        for (int i = mas.length-1; i >=2 ; i--) {
            for (int j = 0; j<i; j++){
                if (mas[j]> mas[j+1]) {
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }


    private static void sort(int[] mas) {
        for (int b = 0; b < mas.length; b++) {
            int min = mas[b];
            int index = b;
            for (int j = b + 1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    index = j;
                }
            }
            if (b != index) {
                int tape = mas[b];
                mas[b] = mas[index];
                mas[index] = tape;
            }
        }
        show(mas);
    }
    private static void show(int[] mas) {
        System.out.println("after sort " + " ( вставками )  ");
        System.out.print(Arrays.toString(mas) );

    }
    private static void scannerArray() {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        scanner.close();
    }
}