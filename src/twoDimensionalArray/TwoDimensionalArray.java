package twoDimensionalArray;

import java.util.Arrays;

/**
 * Created by Ярик on 22.10.2017.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {

        //array();
        //arrayDoublingPartTwo();
        arrayDoublingPart();
    }


    public static void array() {
        int[][] mas = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 10) + 30;
            }
        }
        printArray(mas);
        System.out.println();
        printArrayDoubling(mas);
    }

    private static void printArray(int[][] mas) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    private static void printArrayDoubling(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] *= 2;
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }

    private static void arrayDoublingPartTwo() {

        int[][] mas = new int[4][4];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = (i+1+j)+(i+i+i);
            }
        }
        arrayPrint(mas);
    }

    private static void arrayPrint(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }



    private static void arrayDoublingPart() {
        int length = 4;

        int[][] mas = new int[length][length];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = length;

        for (int i = 0; i < length * length; i++) {
            mas[row][col] = i + 1;
            if (--visits == 0) {
                visits = length * (dirChanges % 2) +
                        length * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
            }

        arrayPrintTwo(mas);
    }

    private static void arrayPrintTwo(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print( mas[i][j] +" \t");
            }
            System.out.println(" ");
        }
    }
}


