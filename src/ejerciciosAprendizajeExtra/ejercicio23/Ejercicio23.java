package ejerciciosAprendizajeExtra.ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBienvenido!");

        String[] palabras = new String[5];
        String[][] matriz = new String[20][20];


        palabras = solicitarPalabras(scanner, palabras);

        matriz = palabrasToMatriz(palabras, matriz);

        matriz = llenarMatriz(matriz.length, matriz[0].length, matriz);

        mostrarMatriz(matriz.length, matriz[0].length, matriz);
    }

    public static String[][] llenarMatriz(int filas, int columnas, String[][] matriz) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = "" + (int) (Math.random() * 10);
                }
            }
        }

        return matriz;
    }

    public static String[][] palabrasToMatriz(String[] palabras, String[][] matriz) {
        for (int i = 0; i < palabras.length; i++) {

            int filaRandom;
            int columnaRandom;
            while (true) {
               filaRandom = (int) (Math.random() * matriz.length);
               columnaRandom = (int) (Math.random() * matriz.length);

               if (columnaRandom + palabras[i].length() < matriz.length && matriz[filaRandom][columnaRandom] == null)
                   break;
            }

            for (int j = 0; j < palabras[i].length(); j++) {
                matriz[filaRandom][columnaRandom+j] = palabras[i].substring(j, j + 1);
            }
        }

        return matriz;
    }
    public static String[] solicitarPalabras(Scanner scanner, String [] palabras) {

        System.out.println("\nA continuación deberá ingresar 5 palabras de entre 3 y 5 caracteres.");

        for (int i = 0; i < palabras.length; i++) {
            while (true) {
                System.out.print("\nIngrese la palabra " + (i+1) + ": ");
                palabras[i] = scanner.nextLine();

                if (palabras[i].length() < 3 || palabras[i].length() > 5) {
                    System.err.println("La palabra con posee una cantidad de caracteres válida...\n");
                } else {
                    break;
                }
            }
        }

        return palabras;
    }

    public static void mostrarMatriz(int filas, int columnas, String[][] matriz) {
        System.out.println();
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
