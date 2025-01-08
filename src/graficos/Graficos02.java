package graficos;

import utils.ScannerUtils;

public class Graficos02 {

    public static void main(String[] args) {
        Graficos02 graficos = new Graficos02();

        while (true) {
            byte opcion = graficos.menu();

            if (opcion == 0) {
                System.out.println("Cerrando programa...");
                break;
            }

            byte tamanoGrafico = graficos.tamanoGrafico();

            switch (opcion) {
                case 1:
                    System.out.println(graficos.graphic1(tamanoGrafico));
                    break;
                case 2:
                    System.out.println(graficos.graphic2(tamanoGrafico));
                    break;
                case 3:
                    System.out.println(graficos.graphic3(tamanoGrafico));
                    break;
                case 4:
                    System.out.println(graficos.graphic4(tamanoGrafico));
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo\n");
            }
        }
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
        byte size;
        do {
            System.out.print("Introduce el tamaño del gráfico (entre 1 y 9): ");
            size = ScannerUtils.readByte();
            if (size < 1 || size > 9) {
                System.out.print("Error. Intente de nuevo: ");
            }
        } while (size < 1 || size > 9);
        return size;
    }

    // Triángulo Centrado
    public String graphic1(byte lines) {
        String graphic = "";
        byte num = 1;

        for (int i = 0; i < lines; i++) {
            // Bucle espacios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
            }
            // Bucle triángulo - alineación centrado
            for (int k = 0; k <= i; k++) {
                graphic += Integer.toString(num) + " ";
            }
            graphic += '\n';
            num++;
        }
        return graphic;
    }

    public String graphic2(byte lines) {
        String graphic = "";
        byte num = 1, reps = 1;

        for (int i = 0; i < lines; i++) {
            // Bucle esapcios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
            }
            // Bucle triángulo
            for (int k = 1; k <= reps; k++) {
                graphic += Integer.toString(num);
            }
            graphic += '\n';
            num++;
            reps += 2;
        }

        return graphic;
    }

    public String graphic3(byte lines) {
        String graphic = "";
        byte num = 0, reps = 1;

        for (int i = 0; i < lines; i++) {
            // Bucle esapcios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
                num = 1;
            }
            // Bucle triángulo
            for (int k = 1; k <= reps; k++) {
                graphic += Integer.toString(num % 10);
                num++;
            }
            graphic += '\n';
            reps += 2;
        }

        return graphic;
    }

    public String graphic4(byte lines) {
        String graphic = "";
        byte num = 1;

        for (int i = 0; i < lines; i++) {
            // Bucle espacios
            for (int j = 0; j < lines - i; j++) {
                graphic += " ";
                num = 1;
            }
            // Bucle triángulo izq
            for (int k = 0; k <= i; k++) {
                graphic += Integer.toString(num);
                num++;
            }
            num--;
            // Bucle triángulo der
            for (int l = 1; l <= i; l++) {
                num--;
                graphic += Integer.toString(num);
            }
            graphic += "\n";
        }

        return graphic;
    }
}
