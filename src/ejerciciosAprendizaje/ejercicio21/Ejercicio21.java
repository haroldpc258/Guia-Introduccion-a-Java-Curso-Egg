package ejerciciosAprendizaje.ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ladoM = 10;
        int ladoP = 3;

        int [][] matrizM = new int [ladoM][ladoM];
        int [][] matrizP = new int [ladoP][ladoP];
        String [][] matrizAuxGUI = new String [ladoP][ladoP];

        System.out.println("\nÉsta es tu Matriz M:");
        matrizM = matrizRandom(ladoM, ladoM, matrizM);
        mostrarMatriz(ladoM, ladoM, matrizM);

        System.out.println("\nIngrese los valores para la matriz P:");
        matrizGUI(scanner, ladoP, ladoP, matrizP, matrizAuxGUI);

        buscarMatrizP(ladoP, ladoM, matrizM, matrizP);
    }

    public static void buscarMatrizP(int ladoP, int ladoM, int [][] matrizM, int [][] matrizP) {

        boolean encontrado = false;
        int [] posicionEsta = new int[2];

        comprobarM: for (int i = 0; i < ladoM; i++) {
            for (int j = 0; j < ladoM; j++) {

                if (matrizM[i][j] == matrizP[0][0]) {
                    if ((j + ladoP) <= ladoM && (i + ladoP) <= ladoM) {

                        encontrado = true;

                        comprobarP: for (int k = 0; k < ladoP; k++) {
                            for (int l = 0; l < ladoP; l++) {

                                if (matrizM[k+i][l+j] != matrizP[k][l]) {
                                    encontrado = false;
                                    break comprobarP;
                                }
                                if (encontrado && k == 2 && l == 2) {
                                    posicionEsta[0] = i;
                                    posicionEsta[1] = j;
                                    break comprobarM;
                                }
                            }
                        }
                    }
                }
            }
        }

        mostrarMatriz(ladoM, ladoM, matrizM);
        if (encontrado) {
            System.out.println("\nEfectivamente la MatrizP está contenida dentro de la matriM!!!");
            System.out.println("\nLo puedes encontrar buscando en la posición: [" + posicionEsta[0] + ", " + posicionEsta[1] + "]");
        } else {
            System.out.println("\nNo está :c");
        }
    }
    public static int [][] matrizRandom(int filas, int columnas, int [][] matriz) {

        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int filas, int columnas, int [][] matriz) {

        System.out.println();
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print(" [0" + matriz[i][j] + "] ");
                } else if (matriz[i][j] < 100) {
                    System.out.print(" [" + matriz[i][j] + "] ");
                }
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
