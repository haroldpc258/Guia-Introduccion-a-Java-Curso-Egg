package ejerciciosAprendizaje.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int longitud = scanner.nextInt();

        int [] vector = new int[longitud];

        vector = vectorRandom(longitud, vector);

        mostrarVector(longitud, vector);

        System.out.print("\nIngrese el número que desea buscar en el vector: ");
        int buscando = scanner.nextInt();

        buscarNumero(buscando, longitud, vector);

    }

    public static void mostrarVector(int longitud, int [] vector) {
        for (int i = 0; i < longitud - 1; i++) {
            System.out.print("[ " + vector[i] + " ], ");
        }

        System.out.print("[ " + vector[longitud - 1] + " ]");
    }
    public static int [] vectorRandom(int longitud, int [] vector) {
        for (int i = 0; i < longitud; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        return vector;
    }

    public static void buscarNumero(int buscando, int longitud, int [] vector) {

        boolean solito = true;
        for (int i = 0; i < longitud; i++) {
            if (vector[i] ==  buscando) {
                if (solito) {
                    System.out.println("El número que estás buscando se encontró en el vector.");
                    solito = false;
                }
                System.out.println("Está en la posición: " + i + " del vector.");
            }
        }
    }
}
