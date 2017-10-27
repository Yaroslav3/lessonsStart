package lesson6;


import java.io.FileWriter;
import java.io.IOException;

public class Service {
    public static void main(String[] args) throws IOException {
        Myself myself = new Myself("Yaroslav", 35, "Klmashevskiy");
        methodFileWriter(myself);
        Myself myself1 = new Myself("Vitaliy", 35, "Klmashevskiy");
        methodFileWriter(myself1);
        Myself myself2 = new Myself("Pavel", 28, "Klmashevskiy");
        methodFileWriter(myself2);
        System.out.println(myself);

    }

    private static boolean method(String myself) {
        String s = "Vertex";
        if (s.equals(myself)) {
        } else
            System.out.println("not Vertex");
        return true;
    }

    private static void methodFileWriter(Myself m) throws IOException {
        int i =1;
        String n = "name    : ";
        String a = "age     : ";
        String s1 = "surname : ";
        String nameFile = "src\\resources\\file.txt";
        FileWriter fileWriter = new FileWriter(nameFile,true);

        fileWriter.write(m.toString());


            fileWriter.close();
    }
}

