package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {

        //Pedimos la cantidad de dinero en euros a convertir\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor en euros a convertir a dólares (EEUU)");
        double euros = scanner.nextDouble();

        //Calculamos la conversión)
        double dolares = euros*1.08;

        //Mostramos el resultado\\
        System.out.println(dolares+" dólares.");

        scanner.close();

    }
    }
