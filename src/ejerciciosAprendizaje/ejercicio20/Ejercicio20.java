package ejerciciosAprendizaje.ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBienvenido!");

        int filas;
        int columnas;
        while (true) {
            System.out.print("\nIngrese el número de filas para su matriz: ");
            filas = scanner.nextInt();
            System.out.print("Ingrese el número de columnas para su matriz: ");
            columnas = scanner.nextInt();

            if (filas != columnas || filas < 2) {
                System.err.println("Ingrese valores válidos para las filas y columnas...\n");
            } else {
                break;
            }
        }

        int[][] matriz = new int[filas][columnas];
        String[][] matrizAuxGUI = new String[filas][columnas];

        matrizGUI(scanner, filas, columnas, matriz, matrizAuxGUI);

        comprobarMagica(filas, columnas, matriz);
    }

    public static void comprobarMagica(int filas, int columnas, int [][] matriz) {

        int sumaMagica = 0;
        int sumaComparar = 0;
        boolean magica = true;

        for (int j = 0; j < columnas; j++) {
            sumaMagica += matriz[0][j];
        }

        for (int i = 1; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaComparar += matriz[i][j];
            }

            if (sumaComparar != sumaMagica) {
                magica = false;
                break;
            } else {
                sumaComparar = 0;
                for (i = 0; i < columnas; i++) {
                    for (int j = 0; j < filas; j++) {
                        sumaComparar += matriz[j][i];
                    }

                    if (sumaComparar != sumaMagica) {
                        magica = false;
                        break;

                    } else {
                        sumaComparar = 0;
                        for (i = 0; i < filas; i++) {
                            sumaComparar += matriz[filas-i-1][i];
                        }

                        if (sumaComparar != sumaMagica) {
                            magica = false;
                            break;
                        } else {
                            sumaComparar = 0;
                            for (i = 0; i < filas; i++) {
                                sumaComparar += matriz[i][i];
                            }

                            if (sumaComparar != sumaMagica) {
                                magica = false;
                            }
                        }
                    }
                }
            }
        }

        if (magica) {
            System.out.println("La Matriz es Mágica!!!");
        } else {
            System.out.println("No es Mágica :c");
        }
    }

    public static void mostrarMatriz(int filas, int columnas, int [][] matriz) {
        System.out.println();
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(int filas, int columnas, String [][] matriz) {
        System.out.println();
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println();
        }
    }

    public static void matrizGUI(Scanner scanner, int filas, int columnas, int [][] matriz, String [][] matrizAuxGUI) {
        llenarMatrizAuxGUI(filas, columnas, matrizAuxGUI);
        solicitarMatrizGUI(scanner, filas, columnas, matriz, matrizAuxGUI);
    }

    public static void solicitarMatrizGUI(Scanner scanner, int filas, int columnas, int [][] matriz,  String [][] matrizAuxGUI) {

        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizAuxGUI[i][j] = "X";
                mostrarMatriz(filas, columnas, matrizAuxGUI);
                System.out.print("Ingrese el valor deseado para la posición X: ");
                matriz[i][j] = scanner.nextInt();
                matrizAuxGUI[i][j] = "" + matriz[i][j]; // De esta manera puedo convertir un número en un String
            }
            mostrarMatriz(filas, columnas, matrizAuxGUI);
        }
    }

    public static void llenarMatrizAuxGUI( int filas, int columnas, String [][] matrizAuxGUI){

        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizAuxGUI[i][j] = " ";
            }
        }
    }
}
