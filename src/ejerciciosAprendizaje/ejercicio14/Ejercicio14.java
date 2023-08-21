package ejerciciosAprendizaje.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de Euros que desea convertir: ");
        float euros = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("\nIngrese la moneda de conversión: ");
        String moneda = scanner.nextLine();

        conversionMoneda(euros, moneda);
    }

    public static void conversionMoneda(float euros, String moneda) {

        double conversion;
        switch (moneda) {
            case "dólares", "dolares", "Dólares", "Dolares"  -> {
                conversion = 1.28611 * euros;
                System.out.println(euros + " Euros" + " = " + conversion + " " + moneda);
            }
            case "yenes", "Yenes" -> {
                conversion = 129.852 * euros;
                System.out.println(euros + " Euros" + " = " + conversion + " " + moneda);
            }
            case "libras", "Libras" -> {
                conversion = 0.86 * euros;
                System.out.println(euros + " Euros" + " = " + conversion + " " + moneda);
            }
            default -> System.err.println("\nNo se reconoce la divisa...");
        }
    }
}