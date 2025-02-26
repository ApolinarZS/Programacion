package Tema5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7Excepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>(); // ArrayList para almacenar gatos

        System.out.println("Introduce los datos de 5 gatos:");

        while (gatos.size() < 5) { // Repetir hasta tener 5 gatos válidos
            try {
                // Solicitar nombre
                System.out.print("Nombre del gato " + (gatos.size() + 1) + ": ");
                String nombre = scanner.nextLine();

                // Solicitar edad
                System.out.print("Edad del gato " + (gatos.size() + 1) + ": ");
                int edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del Scanner

                // Crear el objeto Gato y añadirlo al ArrayList
                Gato gato = new Gato(nombre, edad);
                gatos.add(gato);
                System.out.println("Gato añadido correctamente.");
            } catch (InputMismatchException e) {
                System.out.println("Error: La edad debe ser un número entero.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
            } catch (Exception e) {
                System.out.println(e.getMessage()); // Mostrar mensaje de error
            }
        }

        // Imprimir la información de los gatos almacenados
        System.out.println("Información de los gatos:");
        for (Gato gato : gatos) {
            gato.imprimir();
        }

        // Cerrar el Scanner
        scanner.close();
    }
}