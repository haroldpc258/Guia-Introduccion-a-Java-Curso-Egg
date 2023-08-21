package ejerciciosAprendizaje.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el Primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el Segundo número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de ambos número es: " + suma);
    }
}