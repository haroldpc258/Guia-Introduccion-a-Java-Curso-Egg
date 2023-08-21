package ejerciciosAprendizaje.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        while (frase.length() != 8) {
            System.out.print("Incorrecto, vuelva a introducir una frase: ");
            frase = scanner.nextLine();
            if (frase.length() == 8)
                break;
        }

        System.out.println("Correcto!");
    }
}
