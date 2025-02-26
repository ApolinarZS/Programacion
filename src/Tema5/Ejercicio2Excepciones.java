package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2Excepciones{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario el primer valor entero
            System.out.print("Introduce el primer valor entero (num1): ");
            int num1 = scanner.nextInt();

            // Solicitar al usuario el segundo valor entero
            System.out.print("Introduce el segundo valor entero (num2): ");
            int num2 = scanner.nextInt();

            // Calcular y mostrar el resultado de la división
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);

        } catch (InputMismatchException e) {
            // Capturar la excepción si no se introduce un entero válido
            System.out.println("Error: Debes introducir un valor entero válido.");
            e.printStackTrace(); // Mostrar la pila de llamadas
        } catch (ArithmeticException e) {
            // Capturar la excepción si se intenta dividir por cero
            System.out.println("Error: No se puede dividir por cero.");
            e.printStackTrace(); // Mostrar la pila de llamadas
        }
    }
}
