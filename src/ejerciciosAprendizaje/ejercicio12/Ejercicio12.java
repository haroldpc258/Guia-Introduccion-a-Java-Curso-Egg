package ejerciciosAprendizaje.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String FDE = "";
        int lecturasCorrectas = 0, lecturasIncorrectas = 0;

        System.out.println("\nBienvenido al sistema RS232...");

        while (!FDE.equals("&&&&&")) {

            System.out.print("\nIngrese la cadena: ");
            String cadenaActual = scanner.nextLine();
            FDE = cadenaActual;
            int longitudCadena = cadenaActual.length();

            if (FDE.equals("&&&&&")) {
                break;
            }

            if (longitudCadena == 5) {
                if(cadenaActual.substring(0, 1).equals("X") && cadenaActual.substring(longitudCadena-1, longitudCadena).equals("O")) {
                    System.out.println("Lectura Correcta...");
                    lecturasCorrectas++;
                } else {
                    System.out.println("Lectura Incorrecta...");
                    lecturasIncorrectas++;
                }
            } else {
                System.out.println("Lectura Incorrecta...");
                lecturasIncorrectas++;
            }
        }

        System.out.println("\nHa finalizado la lectura de cadenas...");
        System.out.println("\nLa cantidad de lecturas correctas fue: " + lecturasCorrectas);
        System.out.println("La cantidad de lecturas incorrectas fue: " + lecturasIncorrectas);
    }
}
