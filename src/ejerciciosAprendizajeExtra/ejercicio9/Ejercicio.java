package ejerciciosAprendizajeExtra.ejercicio9;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBienvenido!");

        solicitarNumeros(scanner);

    }

    public static void solicitarNumeros(Scanner scanner) {

        System.out.print("\nIngrese el dividendo: ");
        int dividendo = scanner.nextInt();

        while (dividendo <= 1) {
            System.out.print("\nEl dividendo tiene que ser mayor que 1. Inténtelo de nuevo: ");
            dividendo = scanner.nextInt();
        }

        System.out.print("\nIngrese el divisor: ");
        int divisor = scanner.nextInt();

        while (divisor <= 1) {
            System.out.print("\nEl divisor tiene que ser mayor que 1. Inténtelo de nuevo: ");
            divisor = scanner.nextInt();
        }

        dividir(dividendo, divisor);
    }

    public static void dividir(int dividendo, int divisor) {

        int cociente = 0, residuo;

        residuo = dividendo - divisor;
        cociente ++;

        while (divisor < residuo) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println("\nEl cociente de la división es: " + cociente);
        System.out.println("El residuo de la operación es: " + residuo);
    }
}
