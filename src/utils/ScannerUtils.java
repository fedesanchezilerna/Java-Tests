package utils;

import java.util.Scanner;

public class ScannerUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static byte readByte() {
        byte number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Byte.parseByte(input);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Número inválido. Intenta de nuevo: ");
            }
        }
        return number;
    }

    public static int readInt() {
        int number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Número inválido.");
            }
        }
        return number;
    }
}
