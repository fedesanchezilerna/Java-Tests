package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTest {

    private static final String FILE_PATH = "src/ficheros/text.txt";

    public static void main(String[] args) {

        readAndPrintFile();

        String st = "\nHello World the impostor";
        //writeFile(st);
        //readAndPrintFile();

        String st2 = "\nHELLO WOOORLD impostor's impostor";
        //overwriteFile(st2);
        //readAndPrintFile();

        String st3 = "\nH3LL0 W0RLD Supreme Impostor";
        writeFromTo(st3, 0, 10);

        readAndPrintFile();
    }

    private static void writeFromTo(String st3, int from, int to) {
        try {
            FileWriter file = new FileWriter(FILE_PATH, true);//creates a file if it doesn't exist
            file.write(st3, from, to);

            file.close();
        } catch (IOException e) {
            //In case the file has been moved, delete, ...
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void overwriteFile(String st2) {
        try {
            FileWriter file = new FileWriter(FILE_PATH);
            file.write(st2);

            file.close();
        } catch (IOException e) {
            //In case the file has been moved, delete, ...
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void writeFile(String st) {
        System.out.println("\n[INFO] Writing file");
        try {
            FileWriter file = new FileWriter(FILE_PATH, true);
            for (int i = 0; i < st.length(); i++) {
                file.write(st.charAt(i));
            }
            file.close();
        } catch (IOException e) {
            //In case the file has been moved, delete, ...
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void readAndPrintFile() {
        System.out.println("\n[INFO] Reading file");
        List<Character> dataC = new ArrayList<>();
        try {
            FileReader file = new FileReader(FILE_PATH);
            int c = file.read();

            while (c != -1) {
                dataC.add((char) c);
                c = file.read();
            }
            System.out.println("[INFO] Printing file");

            for (Character ch : dataC) {
                System.out.print(ch);
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            //In case the file has been moved, delete, ...
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
    }
}
