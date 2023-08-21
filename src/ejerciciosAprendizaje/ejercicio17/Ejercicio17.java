package ejerciciosAprendizaje.ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector: ");
        int longitud = scanner.nextInt();

        int [] vector = new int[longitud];

        vector = vectorRandom(longitud, vector);
        mostrarVector(longitud, vector);

        int numeroDigitos = 5;
        int [] digitos = new int[numeroDigitos];

        digitos = vectorCeros(digitos);
        digitos = cuentaDigitos(digitos, longitud, vector);

        System.out.println();
        for (int i = 0; i < numeroDigitos; i++) {
            System.out.println("Se encontraron " + digitos[i] + " números de " + (i + 1) + " dígitos.");
        }

    }

    public static int [] vectorRandom(int longitud, int [] vector) {
        for (int i = 0; i < longitud; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }

        return vector;
    }

    public static int [] cuentaDigitos(int [] digitos, int longitud, int [] vector) {

        for (int i = 0; i < longitud; i++) {
            float aux = vector[i];
            int veces = 0;

            do {
                aux /= 10;
                veces++;
            } while (aux >= 1);

            digitos[veces-1]++;
        }

        return digitos;
    }

    public static int [] vectorCeros(int [] digitos) {

        for (int i = 0; i < digitos.length; i++) {
            digitos[i] = 0;
        }

        return digitos;
    }

    public static void mostrarVector(int longitud, int [] vector) {
        for(int i = 0; i < longitud - 1; i++) {
            System.out.print("[ " + vector[i] + " ], ");
        }

        System.out.print("[ " + vector[longitud - 1] + " ]");
    }

}
