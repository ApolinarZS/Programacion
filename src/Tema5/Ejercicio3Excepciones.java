package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3Excepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[5]; // Crear un vector de tamaño 5
        int indice = 0; // Índice para recorrer el vector

        System.out.println("Introduce 5 valores decimales para llenar el vector:");

        while (indice < vector.length) {
            try {
                // Solicitar al usuario un valor decimal
                System.out.print("Introduce el valor " + (indice + 1) + ": ");
                double valor = scanner.nextDouble();

                // Almacenar el valor en el vector
                vector[indice] = valor;
                indice++; // Incrementar el índice solo si el valor es válido
            } catch (InputMismatchException e) {
                // Capturar la excepción si no se introduce un número válido
                System.out.println("Error: Debes introducir un número decimal válido.");
                scanner.next(); // Limpiar el buffer del Scanner para evitar un bucle infinito
            }
        }

        // Mostrar el vector lleno
        System.out.println("El vector introducido es:");
        for (double valor : vector) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }
}
