package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5Excepciones {

    // Función que imprime un valor positivo
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("Error en imprimePositivo: El valor no puede ser negativo.");
        }
        System.out.println("Valor positivo: " + p);
    }

    // Función que imprime un valor negativo
    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("Error en imprimeNegativo: El valor no puede ser positivo o cero.");
        }
        System.out.println("Valor negativo: " + n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pruebas con valores fijos
        try {
            imprimePositivo(10);  // Correcto
            imprimeNegativo(-5);  // Correcto
            imprimePositivo(-3);  // Lanzará una excepción
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Bucle para pedir valores por teclado
        while (true) {
            try {
                System.out.print("Introduce un número (negativo para salir): ");
                int valor = scanner.nextInt();

                // Si el valor es negativo, salir del bucle
                if (valor < 0) {
                    System.out.println("Saliendo...");
                    break;
                }

                // Llamar a las funciones con el valor introducido
                imprimePositivo(valor);
                imprimeNegativo(valor); // Esto lanzará una excepción si el valor no es negativo
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                scanner.next(); // Limpiar el buffer del Scanner
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
