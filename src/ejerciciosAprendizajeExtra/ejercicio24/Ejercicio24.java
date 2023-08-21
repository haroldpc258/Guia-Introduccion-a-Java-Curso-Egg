package ejerciciosAprendizajeExtra.ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBienvenido!");
        System.out.print("\nIngrese el valor hasta el que desea calcular la serie de Fibonacci: ");
        int n = scanner.nextInt();

        int[] vectorFibonacci = new int[n+1];
        fibonacci(vectorFibonacci);
        mostrarVector(vectorFibonacci);


        /*for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + ", ");
        }
        System.out.print(fibonacciRecursivo(n));*/

    }

    public static int[] fibonacci(int [] vectorFibonacci) {

        vectorFibonacci[0] = 0;
        vectorFibonacci[1] = 1;
        vectorFibonacci[2] = 1;
        for (int i = 3; i < vectorFibonacci.length; i++) {
                vectorFibonacci[i] = vectorFibonacci[i-1] + vectorFibonacci[i-2];
        }

        return vectorFibonacci;
    }

    public static int fibonacciRecursivo(int n) {

        if (n <= 1) {
            return n;
        } else {
            return (fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2));
        }
    }

    public static void mostrarVector(int [] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length - 1; i++) {
            System.out.print(vector[i] + ", ");
        }
        System.out.print(vector[vector.length - 1] + " ]");
    }
}
