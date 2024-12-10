package array;

import java.util.Scanner;

/**
 * Crea matriz.
 * Pido tamaño de filas y de columnas
 * 1.   Recorro para pedir datos
 * 2.   Recorro para mostrar datos
 */
public class MatrixTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos
        System.out.println("Creación de la matriz mágica");
        System.out.print("Indica el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Indica el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Setear datos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce el dato en la posición [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        // Mostrar datos
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.printf(anInt + " ");
            }
            System.out.println();
        }
    }
}
