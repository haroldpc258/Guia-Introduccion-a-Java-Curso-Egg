package ejerciciosAprendizaje.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        if (frase.charAt(0) == 'A') {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }

        /*if (frase.substring(0, 1).equals("A")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }*/

    }
}
