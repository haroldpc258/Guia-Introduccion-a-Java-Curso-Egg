package ejerciciosAprendizaje.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique la frase: ");
        String frase = scanner.nextLine();

        System.out.println("La frase en mayúscula es: " + frase.toUpperCase());
        System.out.println("La frase en minúscula es: " + frase.toLowerCase());
    }
}
