package Tema5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4Excepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Crear un vector de tamaño N (aleatorio entre 1 y 100)
        int N = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int[] vector = new int[N];

        // Llenar el vector con valores aleatorios entre 1 y 10
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10) + 1; // Número aleatorio entre 1 y 10
        }

        System.out.println("Se ha creado un vector de tamaño " + N + " con valores aleatorios entre 1 y 10.");

        while (true) {
            try {
                // Solicitar al usuario la posición que desea consultar
                System.out.print("Introduce la posición del vector que quieres consultar (0-" + (N - 1) + "): ");
                int posicion = scanner.nextInt();

                // Si el usuario introduce un valor negativo, salir del bucle
                if (posicion < 0) {
                    System.out.println("Has introducido un valor negativo. Saliendo...");
                    break;
                }

                // Mostrar el valor en la posición solicitada
                System.out.println("El valor en la posición " + posicion + " es: " + vector[posicion]);
            } catch (InputMismatchException e) {
                // Capturar la excepción si no se introduce un número entero
                System.out.println("Error: Debes introducir un número entero válido.");
                scanner.next(); // Limpiar el buffer del Scanner
            } catch (ArrayIndexOutOfBoundsException e) {
                // Capturar la excepción si la posición está fuera del rango del vector
                System.out.println("Error: La posición introducida está fuera del rango del vector.");
            }
        }

        scanner.close();
    }
}
