package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        boolean bucle = true;

        System.out.println("Introduce números enteros");

        while (bucle) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                bucle = false;
                break;
            }

            suma += numero;
            contador++;
        }

        scanner.close();

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
    }
}
