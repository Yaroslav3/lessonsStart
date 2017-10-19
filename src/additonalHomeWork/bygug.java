package additonalHomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ярик on 16.10.2017.
 */
public class bygug {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter array length, Pleas.");

            int l = scanner.nextInt();
            int arr[] = new int[l];
            System.out.println("Your array is: " + l);
            int n = 0;
            while (n != 5) {

                System.out.println("Enter what you want to do with it?");
                System.out.println("PRESS 1: Enter a value;");
                System.out.println("PRESS 2: Print your array;");
                System.out.println("PRESS 3: Change some value;");
                System.out.println("PRESS 4: Say Hello!");
                System.out.println("PRESS 5: Exit");


                n = scanner.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("Install array values:");
                        for (int i = 0; i < arr.length; i++) {
                            arr[i] = scanner.nextInt();
                            n = 0;
                        }
                        break;

                    case 2:
                        System.out.println("Your array is:");
                        System.out.println(Arrays.toString(arr));
                        n = 0;
                        break;

                    case 3:
                        System.out.println("What array Index you want to change?");
                        int ind = scanner.nextInt();
                        System.out.println("What is new value?");
                        int num = scanner.nextInt();
                        arr[ind] = num;
                        n = 0;
                        break;

                    case 4:
                        System.out.println("Hello!");
                        n = 0;
                        break;

                    case 5:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("You enter wrong number");
                        n = 5;
                        break;
                }
            }
            scanner.close();
        }
    }

