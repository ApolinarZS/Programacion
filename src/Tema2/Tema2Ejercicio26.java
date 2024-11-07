package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pido los números al usuario\\
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        //Compruebo que son válidos y si lo son, compruebo si son\\
        if (numero <= 0) {
            System.out.println("Por favor introduce un número válido");
        } else {
            int divisores = 2;
            //empezamos por 2\\
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 1) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }
        scanner.close();
    }

}
