package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1Excepciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario un valor entero
            System.out.print("Introduce un valor entero: ");
            int num = scanner.nextInt();

            // Mostrar el valor introducido
            System.out.println("Valor introducido: " + num);
        } catch (InputMismatchException e) {
            // Capturar la excepción si no se introduce un entero válido
            System.out.println("Valor introducido incorrecto.");
            e.printStackTrace(); // Mostrar la pila de llamadas
        }
    }
}