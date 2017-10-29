package fileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ярик on 25.10.2017.
 */
public class FileWriterReader {
    private final static String nameFile = "code.txt";
    private final static String name = "file.txt";
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // fileWriter();
        //fileWriterAddString();
        methodEven();
    }

    private static void fileWriter() throws IOException {
        nameFile(name);
    }

    private static int nameFile(String s) throws IOException {
        FileReader fileReader = new FileReader(s);
        scn = new Scanner(fileReader);
        String s1 = null;
        int a = 0;
        while (scn.hasNextLine()) {
            s1 = scn.nextLine();
            a++;
        }
        System.out.println(a);
        fileReader.close();
        return a;
    }


    private static void fileWriterAddString() throws IOException {
        String s = "\nHello world, i'm coming to you";
        addSrting(name, s);
    }

    private static void addSrting(String name, String s) throws IOException {
        FileWriter fileWriter = new FileWriter(name, true);
        fileWriter.write(s);
        fileWriter.close();
        nameFile(name);
    }

    private static void methodEven() throws IOException {
        FileWriter fileWriter = new FileWriter(nameFile);
        int value = 100;
        for (int i = 0; i < 100; i++) {
            i = (int) (Math.random() * 100);
            fileWriter.write(i + " \n");
        }
        methodReade(nameFile, value);
        fileWriter.close();
    }

    private static void methodReade(String name, int value) throws IOException {
        FileReader fileReader = new FileReader(name);
        scn = new Scanner(fileReader);
        while (scn.hasNextLine()) {
           int a = scn.nextInt();
            System.out.println(a + " \n");
        }
    }
}

