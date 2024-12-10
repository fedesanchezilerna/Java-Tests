package array;

import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del array: ");
        int size = sc.nextInt();

        int[] arrayEnteros = new int[size];

        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.printf("Ingresa el valor en la posición %d: ", i);
            arrayEnteros[i] = sc.nextInt();
        }

        System.out.print("Ingresa el valor a buscar: ");
        int valorBusqueda = sc.nextInt();
        System.out.println("Lineal Search: El valor buscado se encuentra en la posición = " + linealSearch(arrayEnteros, valorBusqueda));

        System.out.println("Binary Search: El valor buscado se encuentra en la posición = " + binarySearch(arrayEnteros, valorBusqueda));
    }

    public static int linealSearch(int[] x, int a) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == a) {
                return i;
            }
        }
        //Si llegamos a esta línea significa que no se ha encontrado el valor
        return -1;
    }

    public static int binarySearch(int[] x, int a) {

        int max = x.length - 1;
        int min = 0;
        int centre = min + (max - min) / 2; // par 0 .. 13 centro = 6
        // impar 0 .. 14 centro = 7
        while (min <= max) {
            if (x[centre] == a) {
                return centre;
            } else if (x[centre] < a) {
                min = centre + 1;
            } else {
                max = centre - 1;
            }
            centre = min + (max - min) / 2;
        }
        // Si hemos llegado aqui significa que no hemos encontrado el valor
        return -1;
    }
}
