package exampleScanner;


import java.util.Scanner;

public class method {

    public static void main(String[] args) {
        // oneMethod();
        // twoMethod();
        // show();
        // calculator();

    }

    private static void oneMethod() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        if (scn.hasNextInt()) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            getMax(a, b);
        } else System.out.println("Exception");
        scn.close();
    }

    private static int getMax(int value, int value2) {
        int max = 0;
        if (value2 < value) {
            max = value;
        } else if (value2 > value) {
            max = value2;
        }
        System.out.println("Number " + max + " more");
        return max;
    }

    public static void twoMethod() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        if (scn.hasNextInt()) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            getMultyPly(a, b);

            System.out.println("result " + getMultyPly(a, b));
        } else
            System.out.println("Exception");
        scn.close();


    }

    private static int getMultyPly(int value, int value2) {

        return value * value2;
    }

    public static void show() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        if (scn.hasNextInt()) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            getMethodMoreLess(a, b);

        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void getMethodMoreLess(int value, int value2) {
        if (value > value2) {
            for (int i = value2; i <= value; i++) {
                if(i%2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (value2 > value) {
            for (int i = value; i <= value2; i++) {
                if(i%2 == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    private static void calculator() {
        getInt();
    }
    private static void getInt() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter  numbers : ");
        if (scn.hasNextDouble()) {
           double a = scn.nextDouble();
           double b = scn.nextDouble();
            System.out.println(" 1 this [+]" + "\n 2 this [-]" + "\n 3 this [*]" + "\n 4 this [/]");
            int   v = scn.nextInt();
            while (v > 4){
                System.out.println("Try egan ");
                v = scn.nextInt();
            }
            System.out.println(getOperation(a,b,v));
           out();

        } else
            System.out.println("Exception");
        scn.close();
    }
    private static double getOperation( double value, double value2, int value3){
       double res = 0;
      switch (value3){
          case 1:
              res = value + value2;
             break;
          case 2:
              res = value - value2;
              break;
          case 3:
              res = value * value2;
              break;
          case 4:
              res = value / value2;
              break;
              default:
                  System.out.println("Enter number for 1-4");
                  break;
      }
        return  res;
    }
    private static void out(){
        System.out.println("To EXIT the program, press      [ 1 ]" +
                         "\nTo continue the program, press  [ 2 ]");
        Scanner scanner1 = new Scanner(System.in);
        int value2 = scanner1.nextInt();
        if(value2 == 1){
            System.exit(1);
        }
        else if(value2 == 2){
            getInt();
        }
        scanner1.close();
    }
}

