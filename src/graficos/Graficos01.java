package graficos;

import utils.ScannerUtils;

import java.util.Random;

public class Graficos01 {

    public static void main(String[] args) {
        Graficos01 graficos = new Graficos01();

        while (true) {
            byte opcion = graficos.menu();

            if (opcion == 0) {
                System.out.println("Cerrando programa...");
                break;
            }

            byte tamanoGrafico = graficos.tamanoGrafico();
            char charGrafico = graficos.charGrafico();

            switch (opcion) {
                case 1:
                    System.out.println(graficos.graphic1(tamanoGrafico, charGrafico));
                    break;
                case 2:
                    System.out.println(graficos.graphic2(tamanoGrafico, charGrafico));
                    break;
                case 3:
                    System.out.println(graficos.graphic3(tamanoGrafico, charGrafico));
                    break;
                case 4:
                    System.out.println(graficos.graphic4(tamanoGrafico, charGrafico));
                    break;
                case 5:
                    System.out.println(graficos.graphic5(tamanoGrafico, charGrafico));
                    break;
                case 6:
                    System.out.println(graficos.graphic6(tamanoGrafico));
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo\n");
                    break;
            }
        }

        ScannerUtils.getScanner().close();
    }

    public byte menu() {
        System.out.print("""
                MENU
                \s
                 1. Graphic 1
                 2. Graphic 2
                 3. Graphic 3
                 4. Graphic 4
                 5. Graphic 5
                 6. Graphic 6
                 0. Quit
                \s
                Choose menu option:\s""");

        return ScannerUtils.readByte();
    }

    public byte tamanoGrafico() {
        System.out.print("Introduce el tamaño del gráfico (entre 1 y 50): ");

        return ScannerUtils.readByte();
    }

    public char charGrafico() {
        System.out.print("Enter char: ");

        return ScannerUtils.getScanner().nextLine().charAt(0);
    }

    public String graphic1(byte lines, char c) {
        String graphic = "";

        for (int i = 0; i <= lines; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

        return graphic;
    }

    public String graphic2(byte lines, char c) {
        String graphic = "";

        for (int i = 0; i < lines; i++) {
            // Bucle triángulo - alineación izquierda
            for (int j = 0; j <= i; j++) {
                graphic += c;
            }
            graphic += "\n";
        }

        return graphic;
    }

    public String graphic3(byte lines, char c) {
        String graphic = "";

        for (int i = 0; i <= lines; i++) {
            // Bucle espacios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
            }
            // Bucle triángulo - alineación derecha
            for (int k = 1; k <= i; k++) {
                graphic += c;
            }
            graphic += "\n";
        }

        return graphic;
    }

    public String graphic4(byte lines, char c) {
        String graphic = "";

        for (int i = 0; i <= lines; i++) {
            // Bucle espacios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
            }
            // Bucle triángulo - intercalado
            for (int k = 0; k <= i; k++) {
                graphic += c + " ";
            }
            graphic += "\n";
        }

        return graphic;
    }

    public String graphic5(byte lines, char c) {
        String graphic = "";

        for (int i = 0; i <= lines; i++) {
            // Bucle espacios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
            }
            // Bucle triángulo - alineación derecha
            for (int k = 0; k <= i; k++) {
                graphic += c;
            }
            // Bucle triángulo - alineación izquierda
            for (int l = 1; l <= i; l++) {
                graphic += c;
            }
            graphic += "\n";
        }

        return graphic;
    }

    public String graphic6(byte lines) {
        String graphic = "";
        char[] randomChars = {'x', 'o', '~', '*', '+'};
        Random random = new Random();

        for (int i = 0; i <= lines; i++) {
            // Bucle espacios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
            }
            // Bucle triángulo - alineación derecha (random char)
            for (int k = 0; k <= i; k++) {
                graphic += randomChars[random.nextInt(randomChars.length)];
            }
            // Bucle triángulo - alineación izquierda (random char)
            for (int l = 1; l <= i; l++) {
                graphic += randomChars[random.nextInt(randomChars.length)];
            }
            graphic += "\n";
        }

        return graphic;
    }
}
