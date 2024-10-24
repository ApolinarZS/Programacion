package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {

        //Pedimos la cantidad de dinero en dólares a convertir\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor en euros a convertir a dólares (EEUU)");
        double dolares = scanner.nextDouble();

        //Calculamos la conversión)
        double euros = dolares * 0.93;

        //Mostramos el resultado\\
        System.out.println(euros + " euros.");

        scanner.close();

    }
}

