package ejerciciosAprendizaje.ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {


        int filas = 4, columnas = 4;
        int [][] matriz = new int[filas][columnas];
        int [][] traspuesta = new int[filas][columnas];

        matrizRandom(filas, columnas, matriz);

        mostrarMatriz(filas, columnas, matriz);

        traspuesta = trasponer(filas, columnas, matriz, traspuesta);

        System.out.println();
        mostrarMatriz(filas, columnas, traspuesta);
    }

    public  static int [][] trasponer(int filas, int columnas, int [][] matriz, int [][] traspuesta) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }

        return traspuesta;
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
        for(int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
