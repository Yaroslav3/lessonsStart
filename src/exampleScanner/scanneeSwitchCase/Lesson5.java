package exampleScanner.scanneeSwitchCase;

import java.awt.geom.Arc2D;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ярик on 24.10.2017.
 */
public class Lesson5 {
    public static void main(String[] args) {
        // translateDoubleInt(10.4);
        // translateIntDouble(5.5);
        // translateStingInt("123");
        // translateIntString(10);
        // translateDoubleString(10.5);
        // translateDoubleIntString(10.5);
        // scannerInt();
        // gipotenuza();
        // randomNumbers();
        // gener();
        // randomWhile();
        // randomSwitch();
        // integerInt();
        randomScanner();
    }



    private static void translateDoubleInt(double d) {
        double a = (int) d;
        System.out.println(a);
    }

    private static void translateIntDouble(double i) {
        int a = (int) i;
        System.out.println(a);
    }

    private static void translateStingInt(String s) {
        int i = Integer.parseInt(s);
        System.out.println(i);
    }

    private static void translateIntString(int a) {
        int s = Integer.parseInt(String.valueOf(a));
        System.out.println(s);
    }

    private static void translateDoubleString(double v) {
        double d = Double.parseDouble(String.valueOf(v));
        System.out.println(d);
    }

    private static void translateDoubleIntString(double v) {
        double a = (int) v;
        double s = Double.parseDouble(String.valueOf(a));
        System.out.println(s);
    }

    private static void scannerInt() {
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) ;
        int a = scn.nextInt();
        method(a);
        scn.close();
    }

    private static void method(int a) {
        switch (a) {
            case 1:
                translateDoubleInt(10.4);
                break;
            case 2:
                translateIntDouble(5.5);
                break;
            case 3:
                translateStingInt("123");
                break;
            case 4:
                translateIntString(10);
                break;
            case 5:
                translateDoubleString(10.5);
                break;
            case 6:
                translateDoubleString(10.5);
                break;
            case 7:
                translateDoubleIntString(10.5);
                break;
            default:
                System.out.println("Exception");
                break;
        }
    }

    private static void gipotenuza() {
        int a = 3;
        int b = 4;
        int c = a + b;
        System.out.println("Gipotenuza " + c);
    }

    private static void randomNumbers() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(100);
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()*100)+200;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()*100)+300;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()*100)+400;
            System.out.print(a + " ");
        }
    }
    private static void gener() {
        for (int i = 0; i < 100; i++) {
            if(i<10){
                System.out.print(i+ " ");
            }
             else if(i > 40 &&  i < 50  ){
                System.out.print(i+ " ");
            }
            else if(i > 70 &&  i < 80  ){
                System.out.print(i+ " ");
            }
        }
    }

    private static void randomWhile() {
        int c = 0;
        int sum ;
        while (c < 10){
            sum = (int)(Math.random()*10);
          c++;
            System.out.print(sum + " ");
        }
    }

    private static void randomSwitch() {
        int r = (int)(Math.random()*3)+1;
        int[] mas = new int[10];
        int[] mas2 = new int[10];
        int[] mas3 = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int)(Math.random()*20);
        }
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = (int)(Math.random()*30);
        }

      switch (r){
          case 1:
              for (int i = 0; i < mas.length; i++) {
                  System.out.print(mas[i] + " ");
              }
              break;
          case 2:
              for (int i = 0; i < mas2.length; i++) {
                  System.out.print(mas2[i] + " ");
              }
              break;
          case 3:
              for (int i = 0; i < mas3.length; i++) {
                  System.out.print(mas3[i] + " ");
              }
              break;
          case 4:
              System.out.println("Exception");
              break;
      }
    }
    private static void integerInt() {
        int a = 0;
        int i = 0;
        int[] mas = new int[5];
        Scanner scn = new Scanner(System.in);
        while (a <= mas.length-1) {
            i = scn.nextInt();
            mas[a] = i;
            a++;
        }
        System.out.println(Arrays.toString(mas));
    }
    private static void randomScanner() {
        int e = 0;
        System.out.println("Enter length array :");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int[] mas = new int[a];
        System.out.println(" 1 random \n" +
                "2 fill array ");
        int d = scn.nextInt();
        System.out.println(" we fill the array");
        int c ;

        if (d == 1) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int)(Math.random()*10);
            }
        }
        else if(d == 2) {
            for (int i = 0; i < mas.length; i++) {
                c = scn.nextInt();
                mas[i] = c;
            }
        }
        System.out.println(Arrays.toString(mas));
        scn.close();
    }
}
