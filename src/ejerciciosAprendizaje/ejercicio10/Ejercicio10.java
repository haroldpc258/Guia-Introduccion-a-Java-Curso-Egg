package ejerciciosAprendizaje.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor límite positivo: ");
        int limite = scanner.nextInt();

        int suma = 0;

        while (suma < limite) {
            System.out.print("Ingrese un número: ");
            suma = suma + scanner.nextInt();
        }
        System.out.print("La suma resultado fue: " + suma);
    }
}
