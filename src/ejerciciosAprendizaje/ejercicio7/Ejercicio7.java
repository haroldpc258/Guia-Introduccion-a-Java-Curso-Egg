package ejerciciosAprendizaje.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
}
