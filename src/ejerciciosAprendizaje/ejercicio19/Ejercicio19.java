package ejerciciosAprendizaje.ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBienvenido!\nIngrese el número de filas para su matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para su matriz: ");
        int columnas = scanner.nextInt();

        int [][] matriz = new int [filas][columnas];
        int [][] traspuesta = new int[filas][columnas];
        String [][] matrizAuxGUI = new String [filas][columnas];

        matrizGUI(scanner, filas, columnas, matriz, matrizAuxGUI);

        traspuesta = trasponerMatriz(filas, columnas, matriz, traspuesta);

        comprobarAntisimetrica(filas, columnas, matriz, traspuesta);
    }

    public static void comprobarAntisimetrica(int filas, int columnas, int [][] matriz, int [][] traspuesta) {

        boolean antisimetrica = true;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -(traspuesta[i][j])) {
                    antisimetrica = false;
                    break;
                }
            }
        }

        if (antisimetrica) {
            System.out.println("La matriz es Antisimétrica!!!");
        } else {
            System.out.println("No es Antisimétrica :c");
        }
    }

    public  static int [][] trasponerMatriz(int filas, int columnas, int [][] matriz, int [][] traspuesta) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }

        return traspuesta;
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
