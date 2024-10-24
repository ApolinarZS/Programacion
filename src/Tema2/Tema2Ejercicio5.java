package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {

        //Pedimos los 3 números al usuario\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del primer número");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el valor del segundo número");
        int num2 = scanner.nextInt();
        System.out.println("Introduce el valor del tercer número");
        int num3 = scanner.nextInt();

        //calculamos la media\\
        int media = (num1 + num2 + num3)/3;
        double mediaDe = (double) (num1 + num2 + num3)/ 3;

        //Mostramos los resultados\\
        System.out.println("La media sin decimales  de los tres números introducidos es: " +media+".");
        System.out.println("La media con decimales  de los tres números introducidos es: " +mediaDe+".");

        scanner.close();
    }
}
