package exampleScanner;
import java.util.Scanner;
/**
 * Created by Ярик on 11.10.2017.
 */
public class scanner {
    public static void main(String[] args) {
        //scannerInt();
        //scannerDouble();
        //scannerDoubleMoney();     // вывод копеек в числе Double
        //scannerDoubleProduct();   // цена товара и сколько , денег
        //numberScannerInteger();   // ввести целое двузначное число. Вывести первую цифру на экран
        //numberOneDouble();         // первая цифра после запятой

    }

    public static void scannerInt() {
        System.out.println("Enter number: ");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int value = scn.nextInt();
            int value2 = scn.nextInt();
            System.out.println(value + " number one");
            System.out.println(value2 + " number two");
            System.out.println("sum of numbers");
            sumOfNumbers(value, value2);
        } else
            System.out.println("you did not enter an integer ");
        scn.close();
    }

    private static void sumOfNumbers(int i, int b) {
        System.out.println((i + b));
    }

    public static void scannerDouble() {
        System.out.println("Enter double: ");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextDouble()) {
            double value = scn.nextDouble();
            System.out.println(value);
            wholePart(value);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void wholePart(double i) {
        System.out.println((int) i);
    }

    public static void scannerDoubleMoney() {
        System.out.println("Enter a fractional number in UAN: ");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextDouble()) {
            double value = scn.nextDouble();
            pennies(value);
        } else
            System.out.println("Exception");
        scn.close();
    }

    private static void pennies(double value) {
        double d = value;
        int i = (int) d;
        double res = d - i;
        System.out.println(res);
    }

    public static void scannerDoubleProduct() {
        System.out.println("Enter sum yor money :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextDouble()) {
            double value = scn.nextDouble();
            System.out.println("Enter price of product :");
            double value2 = scn.nextDouble();
            product(value, value2);
        } else System.out.println("Exception");
        scn.close();
    }

    private static void product(double cash, double product) {
        double b = cash / product;
        double a = cash - product;
        if (a > 0) {
            System.out.println("Surrender : " + a);
        } else if (a < 0) {
            System.out.println("No many no hany " + a);
        }
        if (b > 1) {
            System.out.println(b +" " + " buy product ");
        }

    }

    public static void numberScannerInteger() {
        System.out.println("Enter integer number :");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextByte()) {
            byte number = scn.nextByte();
            number(number);
        }
        scn.close();
    }
    private static void number(byte i) {
        byte a = (byte) (i/10);
        System.out.println(a);
    }
    public static void numberOneDouble(){
        System.out.println("Enter double number : ");
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextDouble()){
            double value = scn.nextDouble();
            doublePoint(value);
        }
        else
            System.out.println("Exception");
        scn.close();
    }
    private static void doublePoint(double d) {
        double a = d%1;
        System.out.println(a);

    }
}
