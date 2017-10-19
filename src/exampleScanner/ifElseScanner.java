package exampleScanner;
import java.util.Scanner;

public class ifElseScanner {
    public static void main(String[] args) {
        // scannerNumber();         //удвоение числа
        // scannerNumberTwo();      //ввыод первой цифры числа
         //scannerNumberFour();     //четырезначное число
        // scannerNumberInteger();  //ракировка числа
        scannerNumberString();

    }

    public static void scannerNumber(){
        System.out.println("Enter number : ");
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextInt()){
            int value = scn.nextInt();
            doublingNumbers(value);
        }
        else System.out.println("Exception");
        scn.close();
    }

    private static void doublingNumbers(int value) {
        int i = value*value;
        System.out.println(i);
    }
    public static void scannerNumberTwo(){
        System.out.println("Enter number : ");
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextInt()){
            int value = scn.nextInt();
           numbers(value);
        }
        else System.out.println("Exception");
        scn.close();
    }

    private static void numbers(int value) {
        int i = value/10;
        System.out.println(i);
    }
    public static void scannerNumberFour(){
        System.out.println("Enter number four-digit : ");
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextInt()){
            int value = scn.nextInt();
            numbersDigit(value);
        }
        else System.out.println("Exception");
        scn.close();
    }

    private static void numbersDigit(int value) {
        int a =  value%10;
        int b = (value/10)%10;
        int c = (value/100)%10;
        int d = (value/1000)%10;
      if(d == 0){
          System.out.println("First number with zero ");
      }
       else if (b == 0){
          System.out.println("second number with zero");
      }
        else if(c == 0){
          System.out.println("the third number with zero");
      }
          else if (a == 0){
          System.out.println("fourth number with zero");
      }
      else System.out.println("No zero");
    }
    public static void scannerNumberInteger(){
        System.out.println("Enter number first : ");
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextInt()){
            int value = scn.nextInt();
            System.out.println("Enter number second : ");
            int value2 = scn.nextInt();
            variable(value,value2);
        }
        else System.out.println("Exception");
        scn.close();
    }

    private static void variable(int value ,int value2) {
        int a = value;
        int b = value2;
        value = b;
        value2 = a;
        System.out.println(value + " <-  ->"  + value2);

    }
    public static void scannerNumberString(){
        System.out.println("Enter number  from 1-10 : ");
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextInt()){
            int value = scn.nextInt();
            System.out.println(value + " ");
            text(value);
        }
        else System.out.println("Exception");
        scn.close();
    }

    private static void text(int value) {
       switch (value){
           case 0:
               System.out.println("Zero");
               break;
           case 1:
               System.out.println("One");
               break;
           case 2:
               System.out.println("Two");
               break;
           case 3:
               System.out.println("Three");
               break;
           case 4:
               System.out.println("Four");
               break;
           case 5:
               System.out.println("Five");
               break;
           case 6:
               System.out.println("Six");
               break;
           case 7:
               System.out.println("Seven");
               break;
           case 8:
               System.out.println("Eight ");
               break;
           case 9:
               System.out.println("nine");
               break;
           case 10:
               System.out.println("ten");
               break;
           default:
                   System.out.println("Nothing");
               break;
       }

    }

}
