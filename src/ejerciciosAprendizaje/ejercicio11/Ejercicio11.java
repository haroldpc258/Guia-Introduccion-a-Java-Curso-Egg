package ejerciciosAprendizaje.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido!");

        System.out.print("Ingrese el primer número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        float num2 = scanner.nextFloat();

        float resultado = 0;

        menu: do {
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> {
                    if (num2 == 0) {
                        System.err.println("No se puede dividir por cero...");
                    } else {
                        resultado = num1 / num2;
                    }
                }
                case 5 -> {
                    do {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        String salida = scanner.nextLine();

                        if (salida.equals("S"))
                            break menu;
                        else if (salida.equals("N"))
                            continue menu;

                    } while (true);

                }
                default -> {
                    System.err.println("La opción no es válida.");
                    continue;
                }
            }

            System.out.println("El resultado de la operación es: " + resultado);
        } while (true);
    }
}
