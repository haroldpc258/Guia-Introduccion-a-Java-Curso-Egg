package manosALaObra.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido!");
        System.out.print("\nIngrese una secuencia de caracteres terminada en punto: ");
        String frase = ingresoCaracteres(scanner);

        String codificada = codificacion(frase);

        System.out.print("La secuencia codificada es: " + codificada);

    }

    public static String ingresoCaracteres(Scanner scanner) {
        String frase;

        while (true) {
            frase = scanner.nextLine();

            if (frase.charAt(frase.length() - 1) == '.') {
                break;
            }

            System.out.print("La secuencia no termina en '.' \nInténtelo nuevamente: ");
        }
        return frase;
    }

    public static String codificacion(String frase) {

        /*String codificada = "";
        char caracter;

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            switch (caracter) {
                case 'a', 'A' -> codificada += '@';
                case 'e', '#' -> codificada += '#';
                case 'i', 'I' -> codificada += '$';
                case 'o', 'O' -> codificada += '%';
                case 'u', 'U' -> codificada += '*';
                default -> codificada += caracter;
            }*/

        String codificada = "";
        String caracter;

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.substring(i, i + 1);

            switch (caracter) {
                case "a", "A" -> caracter = "@";
                case "e", "E" -> caracter = "#";
                case "i", "I" -> caracter = "$";
                case "o", "O" -> caracter = "%";
                case "u", "U" -> caracter = "*";
            }

            codificada += caracter;
        }
        return  codificada;
    }
}
