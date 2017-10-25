package fileWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ярик on 25.10.2017.
 */
public class FileWriterReader {
    private static String name = "file.txt";
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //fileWriter();
        fileWriterAddString();
    }

    private static void fileWriter() throws IOException {
        nameFile(name);
    }

    private static int nameFile(String s) throws IOException {
        FileReader fileReader = new FileReader(s);
        scn = new Scanner(fileReader);
        String s1 = null;
       int a =0;
       while (scn.hasNextLine()){
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
}

